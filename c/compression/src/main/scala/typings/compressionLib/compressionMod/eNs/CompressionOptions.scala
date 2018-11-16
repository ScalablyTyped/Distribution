package typings
package compressionLib.compressionMod.eNs

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

