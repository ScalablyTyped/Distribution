package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSearchSearchOptions extends StObject {
  
  var customData: Any
  
  var forceLocal: Boolean
}
object LocalSearchSearchOptions {
  
  inline def apply(customData: Any, forceLocal: Boolean): LocalSearchSearchOptions = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], forceLocal = forceLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSearchSearchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalSearchSearchOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomData(value: Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setForceLocal(value: Boolean): Self = StObject.set(x, "forceLocal", value.asInstanceOf[js.Any])
  }
}
