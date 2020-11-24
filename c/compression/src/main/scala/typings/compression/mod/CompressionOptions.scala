package typings.compression.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * compression() accepts these properties in the options object.
  * In addition to those listed below, `zlib` options may be passed in to the options object.
  */
@js.native
trait CompressionOptions
  extends /**
  * In addition , `zlib` options may be passed in to the options object.
  */
/* property */ StringDictionary[js.Any] {
  
  /**
    * @default zlib.constants.Z_DEFAULT_CHUNK or 16384
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning| Node.js documentation}
    * @see {@link https://github.com/expressjs/compression#chunksize|chunkSize documentation}
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
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
  var filter: js.UndefOr[CompressionFilter] = js.native
  
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
  var level: js.UndefOr[Double] = js.native
  
  /**
    * This specifies how much memory should be allocated for the internal compression state and is an integer in
    * the range of `1` (minimum level) and `9` (maximum level).
    *
    * @default zlib.constants.DEFAULT_MEMLEVEL or 8
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    * @see {@link https://github.com/expressjs/compression#memlevel|`memLevel` documentation}
    */
  var memLevel: js.UndefOr[Double] = js.native
  
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
  var strategy: js.UndefOr[Double] = js.native
  
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
  var threshold: js.UndefOr[Double | String] = js.native
  
  /**
    * @default zlib.constants.Z_DEFAULT_WINDOWBITS or 15.
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    */
  var windowBits: js.UndefOr[Double] = js.native
}
object CompressionOptions {
  
  @scala.inline
  def apply(): CompressionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressionOptions]
  }
  
  @scala.inline
  implicit class CompressionOptionsOps[Self <: CompressionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double | String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
}
