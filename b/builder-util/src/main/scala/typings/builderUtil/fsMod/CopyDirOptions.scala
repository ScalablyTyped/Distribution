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
    filter: js.UndefOr[Null | ((/* file */ String, /* stat */ Stats) => Boolean)] = js.undefined,
    isUseHardLink: js.UndefOr[Null | (/* file */ String => Boolean)] = js.undefined,
    transformer: js.UndefOr[
      Null | (/* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer)
    ] = js.undefined
  ): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(if (filter != null) js.Any.fromFunction2(filter.asInstanceOf[(/* file */ String, /* stat */ Stats) => Boolean]) else null)
    if (!js.isUndefined(isUseHardLink)) __obj.updateDynamic("isUseHardLink")(if (isUseHardLink != null) js.Any.fromFunction1(isUseHardLink.asInstanceOf[/* file */ String => Boolean]) else null)
    if (!js.isUndefined(transformer)) __obj.updateDynamic("transformer")(if (transformer != null) js.Any.fromFunction1(transformer.asInstanceOf[/* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer]) else null)
    __obj.asInstanceOf[CopyDirOptions]
  }
}

