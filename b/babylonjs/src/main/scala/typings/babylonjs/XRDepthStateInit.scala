package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDepthStateInit extends StObject {
  
  val dataFormatPreference: js.Array[XRDepthDataFormat]
  
  val usagePreference: js.Array[XRDepthUsage]
}
object XRDepthStateInit {
  
  inline def apply(dataFormatPreference: js.Array[XRDepthDataFormat], usagePreference: js.Array[XRDepthUsage]): XRDepthStateInit = {
    val __obj = js.Dynamic.literal(dataFormatPreference = dataFormatPreference.asInstanceOf[js.Any], usagePreference = usagePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRDepthStateInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRDepthStateInit] (val x: Self) extends AnyVal {
    
    inline def setDataFormatPreference(value: js.Array[XRDepthDataFormat]): Self = StObject.set(x, "dataFormatPreference", value.asInstanceOf[js.Any])
    
    inline def setDataFormatPreferenceVarargs(value: XRDepthDataFormat*): Self = StObject.set(x, "dataFormatPreference", js.Array(value*))
    
    inline def setUsagePreference(value: js.Array[XRDepthUsage]): Self = StObject.set(x, "usagePreference", value.asInstanceOf[js.Any])
    
    inline def setUsagePreferenceVarargs(value: XRDepthUsage*): Self = StObject.set(x, "usagePreference", js.Array(value*))
  }
}
