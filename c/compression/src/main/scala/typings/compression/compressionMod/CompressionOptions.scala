package typings.compression.compressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressionOptions extends js.Object {
  /**
    * @default zlib.Z_DEFAULT_CHUNK or 16384
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
    * @default zlib.Z_FINISH
    * @see {@link https://nodejs.org/api/zlib.html#zlib_class_options|Zlib class options}
    */
  var finishFlush: js.UndefOr[Double] = js.undefined
  /**
    * @default zlib.Z_NO_FLUSH
    * @see {@link https://nodejs.org/api/zlib.html#zlib_class_options|Zlib class options}
    */
  var flush: js.UndefOr[Double] = js.undefined
  /**
    * The level of zlib compression to apply to responses. A higher level will result in better compression, but
    * will take longer to complete. A lower level will result in less compression, but will be much faster.
    *
    * This is an integer in the range of `0` (no compression) to `9` (maximum compression). The special value `-1`
    * can be used to mean the "default compression level", which is a default compromise between speed and
    * compression (currently equivalent to level 6).
    *
    * - `-1` Default compression level (also `zlib.Z_DEFAULT_COMPRESSION`).
    * - `0` No compression (also `zlib.Z_NO_COMPRESSION`).
    * - `1` Fastest compression (also `zlib.Z_BEST_SPEED`).
    * - `2`
    * - `3`
    * - `4`
    * - `5`
    * - `6` (currently what `zlib.Z_DEFAULT_COMPRESSION` points to).
    * - `7`
    * - `8`
    * - `9` Best compression (also `zlib.Z_BEST_COMPRESSION`).
    *
    * **Note** in the list above, `zlib` is from `zlib = require('zlib')`.
    *
    * @default zlib.DEFAULT_COMPRESSION or -1
    * @see {@link https://github.com/expressjs/compression#level|`level` documentation}
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * This specifies how much memory should be allocated for the internal compression state and is an integer in
    * the range of `1` (minimum level) and `9` (maximum level).
    *
    * @default zlib.DEFAULT_MEMLEVEL or 8
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    * @see {@link https://github.com/expressjs/compression#memlevel|`memLevel` documentation}
    */
  var memLevel: js.UndefOr[Double] = js.undefined
  /**
    * This is used to tune the compression algorithm. This value only affects the compression ratio, not the
    * correctness of the compressed output, even if it is not set appropriately.
    *
    * - `zlib.Z_DEFAULT_STRATEGY` Use for normal data.
    * - `zlib.Z_FILTERED` Use for data produced by a filter (or predictor). Filtered data consists mostly of small
    *   values with a somewhat random distribution. In this case, the compression algorithm is tuned to compress
    *   them better. The effect is to force more Huffman coding and less string matching; it is somewhat intermediate
    *   between `zlib.Z_DEFAULT_STRATEGY` and `zlib.Z_HUFFMAN_ONLY`.
    * - `zlib.Z_FIXED` Use to prevent the use of dynamic Huffman codes, allowing for a simpler decoder for special applications.
    * - `zlib.Z_HUFFMAN_ONLY` Use to force Huffman encoding only (no string match).
    * - `zlib.Z_RLE` Use to limit match distances to one (run-length encoding). This is designed to be almost as
    *    fast as `zlib.Z_HUFFMAN_ONLY`, but give better compression for PNG image data.
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
    * @default zlib.Z_DEFAULT_WINDOWBITS or 15.
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    */
  var windowBits: js.UndefOr[Double] = js.undefined
}

object CompressionOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    filter: CompressionFilter = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    threshold: Double | String = null,
    windowBits: Int | Double = null
  ): CompressionOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressionOptions]
  }
}

