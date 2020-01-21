package typings.builderUtil.fsMod

import typings.fsExtra.mod.Stats
import typings.node.Buffer
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
    filter: (/* file */ String, /* stat */ Stats) => Boolean = null,
    isUseHardLink: /* file */ String => Boolean = null,
    transformer: /* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer = null
  ): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (isUseHardLink != null) __obj.updateDynamic("isUseHardLink")(js.Any.fromFunction1(isUseHardLink))
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1(transformer))
    __obj.asInstanceOf[CopyDirOptions]
  }
}

