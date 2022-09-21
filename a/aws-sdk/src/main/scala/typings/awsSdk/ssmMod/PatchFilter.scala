package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchFilter extends StObject {
  
  /**
    * The key for the filter. Run the DescribePatchProperties command to view lists of valid keys for each operating system type.
    */
  var Key: PatchFilterKey
  
  /**
    * The value for the filter key. Run the DescribePatchProperties command to view lists of valid values for each key based on operating system type.
    */
  var Values: PatchFilterValueList
}
object PatchFilter {
  
  inline def apply(Key: PatchFilterKey, Values: PatchFilterValueList): PatchFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilter]
  }
  
  extension [Self <: PatchFilter](x: Self) {
    
    inline def setKey(value: PatchFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: PatchFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: PatchFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
