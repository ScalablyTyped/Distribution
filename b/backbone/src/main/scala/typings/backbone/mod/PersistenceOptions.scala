package typings.backbone.mod

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenceOptions extends js.Object {
  
  var beforeSend: js.UndefOr[js.Function1[/* jqxhr */ JQueryXHR, Unit]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var emulateHTTP: js.UndefOr[Boolean] = js.native
  
  var emulateJSON: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  // TODO: copy all parameters from JQueryAjaxSettings except success/error callbacks?
  var success: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PersistenceOptions {
  
  @scala.inline
  def apply(): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceOptions]
  }
  
  @scala.inline
  implicit class PersistenceOptionsOps[Self <: PersistenceOptions] (val x: Self) extends AnyVal {
    
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
    def setBeforeSend(value: /* jqxhr */ JQueryXHR => Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEmulateHTTP(value: Boolean): Self = this.set("emulateHTTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulateHTTP: Self = this.set("emulateHTTP", js.undefined)
    
    @scala.inline
    def setEmulateJSON(value: Boolean): Self = this.set("emulateJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulateJSON: Self = this.set("emulateJSON", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSuccess(
      value: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
