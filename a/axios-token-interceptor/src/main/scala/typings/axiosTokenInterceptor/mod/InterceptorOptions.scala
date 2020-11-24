package typings.axiosTokenInterceptor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interfaces
@js.native
trait InterceptorOptions extends js.Object {
  
  var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.native
  
  var token: js.UndefOr[String] = js.native
}
object InterceptorOptions {
  
  @scala.inline
  def apply(): InterceptorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptorOptions]
  }
  
  @scala.inline
  implicit class InterceptorOptionsOps[Self <: InterceptorOptions] (val x: Self) extends AnyVal {
    
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
    def setGetToken(value: () => String | js.Promise[String]): Self = this.set("getToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetToken: Self = this.set("getToken", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderFormatter(value: /* token */ String => String): Self = this.set("headerFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHeaderFormatter: Self = this.set("headerFormatter", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
