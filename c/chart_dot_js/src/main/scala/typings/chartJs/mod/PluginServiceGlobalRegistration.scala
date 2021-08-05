package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginServiceGlobalRegistration extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object PluginServiceGlobalRegistration {
  
  inline def apply(): PluginServiceGlobalRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginServiceGlobalRegistration]
  }
  
  extension [Self <: PluginServiceGlobalRegistration](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
