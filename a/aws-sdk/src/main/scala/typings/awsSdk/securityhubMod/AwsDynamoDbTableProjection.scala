package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableProjection extends StObject {
  
  /**
    * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
    */
  var NonKeyAttributes: js.UndefOr[StringList] = js.undefined
  
  /**
    * The types of attributes that are projected into the index. Valid values are as follows:    ALL     INCLUDE     KEYS_ONLY   
    */
  var ProjectionType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableProjection {
  
  inline def apply(): AwsDynamoDbTableProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProjection]
  }
  
  extension [Self <: AwsDynamoDbTableProjection](x: Self) {
    
    inline def setNonKeyAttributes(value: StringList): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
    
    inline def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
    
    inline def setNonKeyAttributesVarargs(value: NonEmptyString*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value*))
    
    inline def setProjectionType(value: NonEmptyString): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
    
    inline def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
  }
}
