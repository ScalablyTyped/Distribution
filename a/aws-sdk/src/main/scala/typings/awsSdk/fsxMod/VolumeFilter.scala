package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeFilter extends StObject {
  
  /**
    * The name for this filter.
    */
  var Name: js.UndefOr[VolumeFilterName] = js.undefined
  
  /**
    * The values of the filter. These are all the values for any of the applied filters.
    */
  var Values: js.UndefOr[VolumeFilterValues] = js.undefined
}
object VolumeFilter {
  
  inline def apply(): VolumeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFilter]
  }
  
  extension [Self <: VolumeFilter](x: Self) {
    
    inline def setName(value: VolumeFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: VolumeFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: VolumeFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
