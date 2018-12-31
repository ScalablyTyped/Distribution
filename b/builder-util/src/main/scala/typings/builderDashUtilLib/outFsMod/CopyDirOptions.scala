package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDirOptions extends js.Object {
  var filter: js.UndefOr[Filter | scala.Null] = js.undefined
  var isUseHardLink: js.UndefOr[(js.Function1[/* file */ java.lang.String, scala.Boolean]) | scala.Null] = js.undefined
  var transformer: js.UndefOr[FileTransformer | scala.Null] = js.undefined
}

