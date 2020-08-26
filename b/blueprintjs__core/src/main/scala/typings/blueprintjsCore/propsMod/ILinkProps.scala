package typings.blueprintjsCore.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinkProps extends js.Object {
  /** Link URL. */
  var href: js.UndefOr[String] = js.native
  /** Link target attribute. Use `"_blank"` to open in a new window. */
  var target: js.UndefOr[String] = js.native
}

object ILinkProps {
  @scala.inline
  def apply(): ILinkProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILinkProps]
  }
  @scala.inline
  implicit class ILinkPropsOps[Self <: ILinkProps] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

