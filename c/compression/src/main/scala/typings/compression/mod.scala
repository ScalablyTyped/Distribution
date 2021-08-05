package typings.compression

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns the compression middleware using the given `options`. The middleware will attempt to compress response bodies
    * for all request that traverse through the middleware, based on the given `options`.
    *
    * This middleware will never compress responses that include a `Cache-Control` header with the `no-transform` directive,
    * as compressing will transform the body.
    *
    * @see {@link https://github.com/expressjs/compression#compressionoptions|`compression([options]) documentation`}
    */
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: CompressionOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("compression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default `filter` function. This is used to construct a custom filter function that is an extension of the default function.
    *
    * ```js
    * var compression = require('compression')
    * var express = require('express')
    *
    * var app = express()
    * app.use(compression({ filter: shouldCompress }))
    *
    * function shouldCompress (req, res) {
    *   if (req.headers['x-no-compression']) {
    *     // don't compress responses with this request header
    *     return false
    *   }
    *
    *   // fallback to standard filter function
    *   return compression.filter(req, res)
    * }
    * ```
    *
    * @see {@link https://github.com/expressjs/compression#filter-1|`.filter` documentation}
    */
  inline def filter(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * A function to decide if the response should be considered for compression.
    */
  type CompressionFilter = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    Boolean
  ]
  
  /**
    * compression() accepts these properties in the options object.
    * In addition to those listed below, `zlib` options may be passed in to the options object.
    */
  trait CompressionOptions
    extends StObject
       with /**
    * In addition , `zlib` options may be passed in to the options object.
    */
  /* property */ StringDictionary[js.Any] {
    
    /**
      * @default zlib.constants.Z_DEFAULT_CHUNK or 16384
      * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning| Node.js documentation}
      * @see {@link https://github.com/expressjs/compression#chunksize|chunkSize documentation}
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * A function to decide if the response should be considered for compression. This function is called as
      * `filter(req, res)` and is expected to return `true` to consider the response for compression, or `false` to
      * not compress the response.
      *
      * The default filter function uses the `compressible` module to determine if `res.getHeader('Content-Type')`
      * is compressible.
      *
      * @see {@link https://github.com/expressjs/compression#filter|`filter` documentation}
      * @see {@link https://www.npmjs.com/package/compressible|compressible module}
      */
    var filter: js.UndefOr[CompressionFilter] = js.undefined
    
    /**
      * The level of zlib compression to apply to responses. A higher level will result in better compression, but
      * will take longer to complete. A lower level will result in less compression, but will be much faster.
      *
      * This is an integer in the range of `0` (no compression) to `9` (maximum compression). The special value `-1`
      * can be used to mean the "default compression level", which is a default compromise between speed and
      * compression (currently equivalent to level 6).
      *
      * - `-1` Default compression level (also `zlib.constants.Z_DEFAULT_COMPRESSION`).
      * - `0` No compression (also `zlib.constants.Z_NO_COMPRESSION`).
      * - `1` Fastest compression (also `zlib.constants.Z_BEST_SPEED`).
      * - `2`
      * - `3`
      * - `4`
      * - `5`
      * - `6` (currently what `zlib.constants.Z_DEFAULT_COMPRESSION` points to).
      * - `7`
      * - `8`
      * - `9` Best compression (also `zlib.constants.Z_BEST_COMPRESSION`).
      *
      * **Note** in the list above, `zlib` is from `zlib = require('zlib')`.
      *
      * @default zlib.constants.DEFAULT_COMPRESSION or -1
      * @see {@link https://github.com/expressjs/compression#level|`level` documentation}
      */
    var level: js.UndefOr[Double] = js.undefined
    
    /**
      * This specifies how much memory should be allocated for the internal compression state and is an integer in
      * the range of `1` (minimum level) and `9` (maximum level).
      *
      * @default zlib.constants.DEFAULT_MEMLEVEL or 8
      * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
      * @see {@link https://github.com/expressjs/compression#memlevel|`memLevel` documentation}
      */
    var memLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * This is used to tune the compression algorithm. This value only affects the compression ratio, not the
      * correctness of the compressed output, even if it is not set appropriately.
      *
      * - `zlib.constants.Z_DEFAULT_STRATEGY` Use for normal data.
      * - `zlib.constants.Z_FILTERED` Use for data produced by a filter (or predictor). Filtered data consists mostly of small
      *   values with a somewhat random distribution. In this case, the compression algorithm is tuned to compress
      *   them better. The effect is to force more Huffman coding and less string matching; it is somewhat intermediate
      *   between `zlib.constants.Z_DEFAULT_STRATEGY` and `zlib.constants.Z_HUFFMAN_ONLY`.
      * - `zlib.constants.Z_FIXED` Use to prevent the use of dynamic Huffman codes, allowing for a simpler decoder for special applications.
      * - `zlib.constants.Z_HUFFMAN_ONLY` Use to force Huffman encoding only (no string match).
      * - `zlib.constants.Z_RLE` Use to limit match distances to one (run-length encoding). This is designed to be almost as
      *    fast as `zlib.constants.Z_HUFFMAN_ONLY`, but give better compression for PNG image data.
      *
      * **Note** in the list above, `zlib` is from `zlib = require('zlib')`.
      */
    var strategy: js.UndefOr[Double] = js.undefined
    
    /**
      * The byte threshold for the response body size before compression is considered for the response, defaults to
      * 1kb. This is a number of bytes or any string accepted by the bytes module.
      *
      * **Note** this is only an advisory setting; if the response size cannot be determined at the time the response
      * headers are written, then it is assumed the response is *over* the threshold. To guarantee the response size
      * can be determined, be sure set a `Content-Length` response header.
      *
      * @see {@link https://www.npmjs.com/package/bytes|`bytes` module}
      * @see {@link https://github.com/expressjs/compression#threshold|`threshold` documentation}
      */
    var threshold: js.UndefOr[Double | String] = js.undefined
    
    /**
      * @default zlib.constants.Z_DEFAULT_WINDOWBITS or 15.
      * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
      */
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object CompressionOptions {
    
    inline def apply(): CompressionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressionOptions]
    }
    
    extension [Self <: CompressionOptions](x: Self) {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setFilter(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setThreshold(value: Double | String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
  
  // This module adds a res.flush() method to force the partially-compressed response to be flushed to the client.
  object global {
    
    object Express {
      
      trait Response extends StObject {
        
        /**
          * Forces the partially-compressed response to be flushed to the client.
          */
        def flush(): Unit
      }
      object Response {
        
        inline def apply(flush: () => Unit): Response = {
          val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
          __obj.asInstanceOf[Response]
        }
        
        extension [Self <: Response](x: Self) {
          
          inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
        }
      }
    }
  }
}
