package typings.cassandraDriver.anon

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureConnectBundle extends StObject {
  
  var secureConnectBundle: String | URL_ = js.native
}
object SecureConnectBundle {
  
  @scala.inline
  def apply(secureConnectBundle: String | URL_): SecureConnectBundle = {
    val __obj = js.Dynamic.literal(secureConnectBundle = secureConnectBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureConnectBundle]
  }
  
  @scala.inline
  implicit class SecureConnectBundleMutableBuilder[Self <: SecureConnectBundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecureConnectBundle(value: String | URL_): Self = StObject.set(x, "secureConnectBundle", value.asInstanceOf[js.Any])
  }
}
