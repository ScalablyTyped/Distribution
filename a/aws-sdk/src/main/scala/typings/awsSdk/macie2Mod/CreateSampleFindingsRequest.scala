package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSampleFindingsRequest extends StObject {
  
  /**
    * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only supported value is Policy:IAMUser/S3BucketEncryptionDisabled. 
    */
  var findingTypes: js.UndefOr[listOfFindingType] = js.undefined
}
object CreateSampleFindingsRequest {
  
  @scala.inline
  def apply(): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  
  @scala.inline
  implicit class CreateSampleFindingsRequestMutableBuilder[Self <: CreateSampleFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingTypes(value: listOfFindingType): Self = StObject.set(x, "findingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTypesUndefined: Self = StObject.set(x, "findingTypes", js.undefined)
    
    @scala.inline
    def setFindingTypesVarargs(value: FindingType*): Self = StObject.set(x, "findingTypes", js.Array(value :_*))
  }
}
