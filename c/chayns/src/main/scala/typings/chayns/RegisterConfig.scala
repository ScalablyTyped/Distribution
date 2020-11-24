package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Getting Started
  * chayns
  * interfaces
  */
// chayns.register()
@js.native
trait RegisterConfig extends js.Object {
  
  var appName: js.UndefOr[String] = js.native
  
  var autoResize: js.UndefOr[Boolean] = js.native
  
  var callbackPrefix: js.UndefOr[String] = js.native
  
  var cssPrefix: js.UndefOr[String] = js.native
  
  var initialHeight: js.UndefOr[Double] = js.native
  
  var strictMode: js.UndefOr[Boolean] = js.native
}
object RegisterConfig {
  
  @scala.inline
  def apply(): RegisterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterConfig]
  }
  
  @scala.inline
  implicit class RegisterConfigOps[Self <: RegisterConfig] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
    
    @scala.inline
    def setCallbackPrefix(value: String): Self = this.set("callbackPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackPrefix: Self = this.set("callbackPrefix", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = this.set("cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssPrefix: Self = this.set("cssPrefix", js.undefined)
    
    @scala.inline
    def setInitialHeight(value: Double): Self = this.set("initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHeight: Self = this.set("initialHeight", js.undefined)
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
  }
}
