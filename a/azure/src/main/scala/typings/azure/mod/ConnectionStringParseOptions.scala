package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStringParseOptions extends StObject {
  
  var skipLowerCase: Boolean
}
object ConnectionStringParseOptions {
  
  inline def apply(skipLowerCase: Boolean): ConnectionStringParseOptions = {
    val __obj = js.Dynamic.literal(skipLowerCase = skipLowerCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStringParseOptions]
  }
  
  extension [Self <: ConnectionStringParseOptions](x: Self) {
    
    inline def setSkipLowerCase(value: Boolean): Self = StObject.set(x, "skipLowerCase", value.asInstanceOf[js.Any])
  }
}
