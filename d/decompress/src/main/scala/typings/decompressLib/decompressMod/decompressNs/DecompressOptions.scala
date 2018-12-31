package typings
package decompressLib.decompressMod.decompressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecompressOptions extends js.Object {
  /**
    * Filter out files before extracting
    */
  var filter: js.UndefOr[js.Function1[/* file */ File, scala.Boolean]] = js.undefined
  /**
    * Map files before extracting
    */
  var map: js.UndefOr[js.Function1[/* file */ File, File]] = js.undefined
  /**
    * Array of plugins to use.
    * Default: [decompressTar(), decompressTarbz2(), decompressTargz(), decompressUnzip()]
    */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Remove leading directory components from extracted files.
    * Default: 0
    */
  var strip: js.UndefOr[scala.Double] = js.undefined
}

