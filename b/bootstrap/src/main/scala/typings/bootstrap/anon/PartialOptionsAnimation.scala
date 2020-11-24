package typings.bootstrap.anon

import typings.bootstrap.bootstrapBooleans.`false`
import typings.bootstrap.bootstrapStrings.auto
import typings.bootstrap.bootstrapStrings.bottom
import typings.bootstrap.bootstrapStrings.click
import typings.bootstrap.bootstrapStrings.focus
import typings.bootstrap.bootstrapStrings.hover
import typings.bootstrap.bootstrapStrings.left
import typings.bootstrap.bootstrapStrings.manual
import typings.bootstrap.bootstrapStrings.right
import typings.bootstrap.bootstrapStrings.scrollParent
import typings.bootstrap.bootstrapStrings.top
import typings.bootstrap.bootstrapStrings.viewport
import typings.bootstrap.bootstrapStrings.window
import typings.popperJs.mod.Behavior
import typings.popperJs.mod.PopperOptions
import typings.popperJs.mod.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<bootstrap.bootstrap/js/dist/popover.Popover.Options> */
@js.native
trait PartialOptionsAnimation extends js.Object {
  
  var animation: js.UndefOr[Boolean] = js.native
  
  var boundary: js.UndefOr[viewport | window | scrollParent | Element] = js.native
  
  var container: js.UndefOr[String | Element | `false`] = js.native
  
  var content: js.UndefOr[String | Element | js.Function0[Unit]] = js.native
  
  var delay: js.UndefOr[Double | Hide] = js.native
  
  var fallbackPlacement: js.UndefOr[Behavior | js.Array[Position]] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double | String] = js.native
  
  var placement: js.UndefOr[auto | top | bottom | left | right | js.Function0[Unit]] = js.native
  
  var popperConfig: js.UndefOr[PopperOptions | Null] = js.native
  
  var sanitize: js.UndefOr[Boolean] = js.native
  
  var sanitizeFn: js.UndefOr[js.Function0[Unit | Null]] = js.native
  
  var selector: js.UndefOr[String | `false`] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String | Element | js.Function0[Unit]] = js.native
  
  var trigger: js.UndefOr[click | hover | focus | manual] = js.native
  
  var whiteList: js.UndefOr[RecordkeyofHTMLElementTag] = js.native
}
object PartialOptionsAnimation {
  
  @scala.inline
  def apply(): PartialOptionsAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsAnimation]
  }
  
  @scala.inline
  implicit class PartialOptionsAnimationOps[Self <: PartialOptionsAnimation] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setBoundary(value: viewport | window | scrollParent | Element): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Element | `false`): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContentFunction0(value: () => Unit): Self = this.set("content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContent(value: String | Element | js.Function0[Unit]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setFallbackPlacementVarargs(value: Position*): Self = this.set("fallbackPlacement", js.Array(value :_*))
    
    @scala.inline
    def setFallbackPlacement(value: Behavior | js.Array[Position]): Self = this.set("fallbackPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackPlacement: Self = this.set("fallbackPlacement", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPlacementFunction0(value: () => Unit): Self = this.set("placement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: auto | top | bottom | left | right | js.Function0[Unit]): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPopperConfig(value: PopperOptions): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    
    @scala.inline
    def setPopperConfigNull: Self = this.set("popperConfig", null)
    
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    
    @scala.inline
    def setSanitizeFn(value: () => Unit | Null): Self = this.set("sanitizeFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSanitizeFn: Self = this.set("sanitizeFn", js.undefined)
    
    @scala.inline
    def setSelector(value: String | `false`): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTitleFunction0(value: () => Unit): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String | Element | js.Function0[Unit]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrigger(value: click | hover | focus | manual): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setWhiteList(value: RecordkeyofHTMLElementTag): Self = this.set("whiteList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteList: Self = this.set("whiteList", js.undefined)
  }
}
