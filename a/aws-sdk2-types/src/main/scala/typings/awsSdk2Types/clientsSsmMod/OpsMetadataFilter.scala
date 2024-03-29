package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsMetadataFilter extends StObject {
  
  /**
    * A filter key.
    */
  var Key: OpsMetadataFilterKey
  
  /**
    * A filter value.
    */
  var Values: OpsMetadataFilterValueList
}
object OpsMetadataFilter {
  
  inline def apply(Key: OpsMetadataFilterKey, Values: OpsMetadataFilterValueList): OpsMetadataFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsMetadataFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsMetadataFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: OpsMetadataFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: OpsMetadataFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: OpsMetadataFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
