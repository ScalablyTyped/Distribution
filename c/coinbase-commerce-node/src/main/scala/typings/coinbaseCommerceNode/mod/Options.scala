package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.anon.Dictkey
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELETE
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GET
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.POST
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var body: String
  
  var headers: Dictkey
  
  var method: GET | POST | DELETE | PUT
  
  var timeout: Double
  
  var url: String
}
object Options {
  
  inline def apply(body: String, headers: Dictkey, method: GET | POST | DELETE | PUT, timeout: Double, url: String): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET | POST | DELETE | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
