package typings.cypress.Cypress

import typings.cypress.cypressStrings.file
import typings.cypress.cypressStrings.http
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteState extends StObject {
  
  var auth: js.UndefOr[Auth] = js.undefined
  
  var domainName: String
  
  var fileServer: String | Null
  
  var origin: String
  
  var props: Record[String, Any]
  
  var strategy: file | http
  
  var visiting: String
}
object RemoteState {
  
  inline def apply(
    domainName: String,
    origin: String,
    props: Record[String, Any],
    strategy: file | http,
    visiting: String
  ): RemoteState = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], visiting = visiting.asInstanceOf[js.Any], fileServer = null)
    __obj.asInstanceOf[RemoteState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteState] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setFileServer(value: String): Self = StObject.set(x, "fileServer", value.asInstanceOf[js.Any])
    
    inline def setFileServerNull: Self = StObject.set(x, "fileServer", null)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: file | http): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setVisiting(value: String): Self = StObject.set(x, "visiting", value.asInstanceOf[js.Any])
  }
}
