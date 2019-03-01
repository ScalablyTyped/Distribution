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

object CopyDirOptions {
  @scala.inline
  def apply(
    filter: Filter = null,
    isUseHardLink: js.Function1[/* file */ java.lang.String, scala.Boolean] = null,
    transformer: FileTransformer = null
  ): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (isUseHardLink != null) __obj.updateDynamic("isUseHardLink")(isUseHardLink)
    if (transformer != null) __obj.updateDynamic("transformer")(transformer)
    __obj.asInstanceOf[CopyDirOptions]
  }
}

