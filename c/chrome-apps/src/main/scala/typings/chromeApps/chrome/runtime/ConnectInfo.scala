package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectInfo extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ConnectInfo {
  
  @scala.inline
  def apply(): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectInfo]
  }
  
  @scala.inline
  implicit class ConnectInfoMutableBuilder[Self <: ConnectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
