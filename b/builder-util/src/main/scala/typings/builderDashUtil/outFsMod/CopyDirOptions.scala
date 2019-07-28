package typings.builderDashUtil.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDirOptions extends js.Object {
  var filter: js.UndefOr[Filter | Null] = js.undefined
  var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.undefined
  var transformer: js.UndefOr[FileTransformer | Null] = js.undefined
}

object CopyDirOptions {
  @scala.inline
  def apply(
    filter: Filter = null,
    isUseHardLink: /* file */ String => Boolean = null,
    transformer: FileTransformer = null
  ): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (isUseHardLink != null) __obj.updateDynamic("isUseHardLink")(js.Any.fromFunction1(isUseHardLink))
    if (transformer != null) __obj.updateDynamic("transformer")(transformer)
    __obj.asInstanceOf[CopyDirOptions]
  }
}

