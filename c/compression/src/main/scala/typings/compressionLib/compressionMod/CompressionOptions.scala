package typings
package compressionLib.compressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressionOptions extends js.Object {
  /**
    * See https://github.com/expressjs/compression#chunksize regarding the usage.
    */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://github.com/expressjs/compression#filter regarding the usage.
    */
  var filter: js.UndefOr[CompressionFilter] = js.undefined
  /**
    * See https://nodejs.org/api/zlib.html#zlib_class_options regarding the usage.
    */
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://nodejs.org/api/zlib.html#zlib_class_options regarding the usage.
    */
  var flush: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://github.com/expressjs/compression#level regarding the usage.
    */
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://github.com/expressjs/compression#memlevel regarding the usage.
    */
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://github.com/expressjs/compression#strategy regarding the usage.
    */
  var strategy: js.UndefOr[scala.Double] = js.undefined
  /**
    * See https://github.com/expressjs/compression#threshold regarding the usage.
    */
  var threshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * See https://github.com/expressjs/compression#windowbits regarding the usage.
    */
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object CompressionOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    filter: CompressionFilter = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    threshold: scala.Double | java.lang.String = null,
    windowBits: scala.Int | scala.Double = null
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

