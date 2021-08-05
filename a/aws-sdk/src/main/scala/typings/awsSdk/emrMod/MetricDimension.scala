package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDimension extends StObject {
  
  /**
    * The dimension name.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The dimension value.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object MetricDimension {
  
  inline def apply(): MetricDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDimension]
  }
  
  extension [Self <: MetricDimension](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
