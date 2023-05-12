package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRDepthSensingOptions extends StObject {
  
  /**
    * The desired depth sensing data format for the session
    */
  var dataFormatPreference: js.Array[WebXRDepthDataFormat]
  
  /**
    *  The desired depth sensing usage for the session
    */
  var usagePreference: js.Array[WebXRDepthUsage]
}
object IWebXRDepthSensingOptions {
  
  inline def apply(dataFormatPreference: js.Array[WebXRDepthDataFormat], usagePreference: js.Array[WebXRDepthUsage]): IWebXRDepthSensingOptions = {
    val __obj = js.Dynamic.literal(dataFormatPreference = dataFormatPreference.asInstanceOf[js.Any], usagePreference = usagePreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRDepthSensingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRDepthSensingOptions] (val x: Self) extends AnyVal {
    
    inline def setDataFormatPreference(value: js.Array[WebXRDepthDataFormat]): Self = StObject.set(x, "dataFormatPreference", value.asInstanceOf[js.Any])
    
    inline def setDataFormatPreferenceVarargs(value: WebXRDepthDataFormat*): Self = StObject.set(x, "dataFormatPreference", js.Array(value*))
    
    inline def setUsagePreference(value: js.Array[WebXRDepthUsage]): Self = StObject.set(x, "usagePreference", value.asInstanceOf[js.Any])
    
    inline def setUsagePreferenceVarargs(value: WebXRDepthUsage*): Self = StObject.set(x, "usagePreference", js.Array(value*))
  }
}
