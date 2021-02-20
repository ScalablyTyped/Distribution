package typings.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppId extends StObject {
  
  /*小程序 appId     */
  var appId: String = js.native
}
object AppId {
  
  @scala.inline
  def apply(appId: String): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  
  @scala.inline
  implicit class AppIdMutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
  }
}
