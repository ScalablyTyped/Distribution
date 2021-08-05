package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var headers: XContentfulVersion
}
object Headers {
  
  inline def apply(headers: XContentfulVersion): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setHeaders(value: XContentfulVersion): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
