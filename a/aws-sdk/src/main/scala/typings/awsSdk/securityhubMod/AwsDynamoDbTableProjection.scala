package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableProjection extends StObject {
  
  /**
    * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
    */
  var NonKeyAttributes: js.UndefOr[StringList] = js.native
  
  /**
    * The types of attributes that are projected into the index.
    */
  var ProjectionType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableProjection {
  
  @scala.inline
  def apply(): AwsDynamoDbTableProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProjection]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableProjectionMutableBuilder[Self <: AwsDynamoDbTableProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonKeyAttributes(value: StringList): Self = StObject.set(x, "NonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonKeyAttributesUndefined: Self = StObject.set(x, "NonKeyAttributes", js.undefined)
    
    @scala.inline
    def setNonKeyAttributesVarargs(value: NonEmptyString*): Self = StObject.set(x, "NonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setProjectionType(value: NonEmptyString): Self = StObject.set(x, "ProjectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionTypeUndefined: Self = StObject.set(x, "ProjectionType", js.undefined)
  }
}
