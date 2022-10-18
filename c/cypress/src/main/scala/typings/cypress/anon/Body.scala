package typings.cypress.anon

import typings.cypress.Cypress.ObjectLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: String | ObjectLike
  
  var headers: ObjectLike
}
object Body {
  
  inline def apply(body: String | ObjectLike, headers: ObjectLike): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: String | ObjectLike): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: ObjectLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
