package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSampleFindingsRequest extends js.Object {
  
  /**
    * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only supported value is Policy:IAMUser/S3BucketEncryptionDisabled. 
    */
  var findingTypes: js.UndefOr[listOfFindingType] = js.native
}
object CreateSampleFindingsRequest {
  
  @scala.inline
  def apply(): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  
  @scala.inline
  implicit class CreateSampleFindingsRequestOps[Self <: CreateSampleFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFindingTypesVarargs(value: FindingType*): Self = this.set("findingTypes", js.Array(value :_*))
    
    @scala.inline
    def setFindingTypes(value: listOfFindingType): Self = this.set("findingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingTypes: Self = this.set("findingTypes", js.undefined)
  }
}
