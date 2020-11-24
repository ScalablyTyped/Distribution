package typings.blazy

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlazyOptions extends js.Object {
  
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[js.Function2[/* ele */ Element | HTMLElement, /* msg */ String, Unit]] = js.native
  
  var errorClass: js.UndefOr[String] = js.native
  
  var loadInvisible: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var saveViewportOffsetDelay: js.UndefOr[Double] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function1[/* ele */ Element | HTMLElement, Unit]] = js.native
  
  var successClass: js.UndefOr[String] = js.native
  
  var validateDelay: js.UndefOr[Double] = js.native
}
object BlazyOptions {
  
  @scala.inline
  def apply(): BlazyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlazyOptions]
  }
  
  @scala.inline
  implicit class BlazyOptionsOps[Self <: BlazyOptions] (val x: Self) extends AnyVal {
    
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
    def setBreakpointsVarargs(value: Breakpoint*): Self = this.set("breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setBreakpoints(value: js.Array[Breakpoint]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setError(value: (/* ele */ Element | HTMLElement, /* msg */ String) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorClass(value: String): Self = this.set("errorClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorClass: Self = this.set("errorClass", js.undefined)
    
    @scala.inline
    def setLoadInvisible(value: Boolean): Self = this.set("loadInvisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadInvisible: Self = this.set("loadInvisible", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSaveViewportOffsetDelay(value: Double): Self = this.set("saveViewportOffsetDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveViewportOffsetDelay: Self = this.set("saveViewportOffsetDelay", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* ele */ Element | HTMLElement => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setSuccessClass(value: String): Self = this.set("successClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessClass: Self = this.set("successClass", js.undefined)
    
    @scala.inline
    def setValidateDelay(value: Double): Self = this.set("validateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateDelay: Self = this.set("validateDelay", js.undefined)
  }
}
