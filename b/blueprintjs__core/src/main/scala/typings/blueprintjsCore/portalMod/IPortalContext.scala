package typings.blueprintjsCore.portalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPortalContext extends js.Object {
  /** Additional CSS classes to add to all `Portal` elements in this React context. */
  var blueprintPortalClassName: js.UndefOr[String] = js.native
}

object IPortalContext {
  @scala.inline
  def apply(): IPortalContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPortalContext]
  }
  @scala.inline
  implicit class IPortalContextOps[Self <: IPortalContext] (val x: Self) extends AnyVal {
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
    def setBlueprintPortalClassName(value: String): Self = this.set("blueprintPortalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintPortalClassName: Self = this.set("blueprintPortalClassName", js.undefined)
  }
  
}

