package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthChallenger extends StObject {
  
  var host: String = js.native
  
  var port: integer = js.native
}
object WebAuthChallenger {
  
  @scala.inline
  def apply(host: String, port: integer): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthChallenger]
  }
  
  @scala.inline
  implicit class WebAuthChallengerMutableBuilder[Self <: WebAuthChallenger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
