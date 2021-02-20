package typings.cordovaPluginAppVersion

import typings.cordovaPluginAppVersion.anon.GetAppName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cordova extends StObject {
  
  var getAppVersion: GetAppName = js.native
}
object Cordova {
  
  @scala.inline
  def apply(getAppVersion: GetAppName): Cordova = {
    val __obj = js.Dynamic.literal(getAppVersion = getAppVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cordova]
  }
  
  @scala.inline
  implicit class CordovaMutableBuilder[Self <: Cordova] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAppVersion(value: GetAppName): Self = StObject.set(x, "getAppVersion", value.asInstanceOf[js.Any])
  }
}
