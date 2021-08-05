package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInfo extends StObject {
  
  var options: StringDictionary[js.Any]
}
object ConnectionInfo {
  
  inline def apply(options: StringDictionary[js.Any]): ConnectionInfo = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  
  extension [Self <: ConnectionInfo](x: Self) {
    
    inline def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
