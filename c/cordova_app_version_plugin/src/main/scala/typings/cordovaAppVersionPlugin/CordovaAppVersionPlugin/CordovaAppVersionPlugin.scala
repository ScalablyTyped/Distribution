package typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaAppVersionPlugin extends js.Object {
  
  /**
    * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
    * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
    */
  def getAppVersion(): String = js.native
}
object CordovaAppVersionPlugin {
  
  @scala.inline
  def apply(getAppVersion: () => String): CordovaAppVersionPlugin = {
    val __obj = js.Dynamic.literal(getAppVersion = js.Any.fromFunction0(getAppVersion))
    __obj.asInstanceOf[CordovaAppVersionPlugin]
  }
  
  @scala.inline
  implicit class CordovaAppVersionPluginOps[Self <: typings.cordovaAppVersionPlugin.CordovaAppVersionPlugin.CordovaAppVersionPlugin] (val x: Self) extends AnyVal {
    
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
    def setGetAppVersion(value: () => String): Self = this.set("getAppVersion", js.Any.fromFunction0(value))
  }
}
