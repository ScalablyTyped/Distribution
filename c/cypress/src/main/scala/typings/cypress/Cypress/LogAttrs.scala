package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogAttrs extends StObject {
  
  var consoleProps: ObjectLike
  
  var url: String
}
object LogAttrs {
  
  inline def apply(consoleProps: ObjectLike, url: String): LogAttrs = {
    val __obj = js.Dynamic.literal(consoleProps = consoleProps.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAttrs]
  }
  
  extension [Self <: LogAttrs](x: Self) {
    
    inline def setConsoleProps(value: ObjectLike): Self = StObject.set(x, "consoleProps", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
