package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  /**
    * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
    */
  var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.undefined
  
  /**
    * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.  
    */
  var ProjectionType: js.UndefOr[typings.awsSdk.dynamodbMod.ProjectionType] = js.undefined
}
object Projection {
  
  inline def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  
  extension [Self <: Projection](x: Self) {
    
    inline def setNonKeyAttributes(value: NonKeyAttributeNameList): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
    
    inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
    
    inline def setNonKeyAttributesVarargs(value: NonKeyAttributeName*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
    
    inline def setProjectionType(value: ProjectionType): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
  }
}
