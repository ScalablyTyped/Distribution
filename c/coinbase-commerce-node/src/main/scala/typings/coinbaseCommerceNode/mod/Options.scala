package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.anon.Dictkey
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELETE
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GET
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.POST
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var body: String = js.native
  
  var headers: Dictkey = js.native
  
  var method: GET | POST | DELETE | PUT = js.native
  
  var timeout: Double = js.native
  
  var url: String = js.native
}
object Options {
  
  @scala.inline
  def apply(body: String, headers: Dictkey, method: GET | POST | DELETE | PUT, timeout: Double, url: String): Options = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET | POST | DELETE | PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
