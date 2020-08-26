package typings.blueprintjsCore.breadcrumbMod

import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.ILinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbProps
  extends IActionProps
     with ILinkProps {
  /** Whether this breadcrumb is the current breadcrumb. */
  var current: js.UndefOr[Boolean] = js.native
}

object IBreadcrumbProps {
  @scala.inline
  def apply(): IBreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBreadcrumbProps]
  }
  @scala.inline
  implicit class IBreadcrumbPropsOps[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
  }
  
}

