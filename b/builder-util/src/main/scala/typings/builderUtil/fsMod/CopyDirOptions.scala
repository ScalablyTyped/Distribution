package typings.builderUtil.fsMod

import typings.fsExtra.mod.Stats
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDirOptions extends js.Object {
  var filter: js.UndefOr[Filter | Null] = js.native
  var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.native
  var transformer: js.UndefOr[FileTransformer | Null] = js.native
}

object CopyDirOptions {
  @scala.inline
  def apply(): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDirOptions]
  }
  @scala.inline
  implicit class CopyDirOptionsOps[Self <: CopyDirOptions] (val x: Self) extends AnyVal {
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
    def setFilter(value: (/* file */ String, /* stat */ Stats) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
    @scala.inline
    def setIsUseHardLink(value: /* file */ String => Boolean): Self = this.set("isUseHardLink", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsUseHardLink: Self = this.set("isUseHardLink", js.undefined)
    @scala.inline
    def setIsUseHardLinkNull: Self = this.set("isUseHardLink", null)
    @scala.inline
    def setTransformer(
      value: /* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
    ): Self = this.set("transformer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransformer: Self = this.set("transformer", js.undefined)
    @scala.inline
    def setTransformerNull: Self = this.set("transformer", null)
  }
  
}

