package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAssociationBatchResult extends js.Object {
  
  /**
    * Information about the associations that failed.
    */
  var Failed: js.UndefOr[FailedCreateAssociationList] = js.native
  
  /**
    * Information about the associations that succeeded.
    */
  var Successful: js.UndefOr[AssociationDescriptionList] = js.native
}
object CreateAssociationBatchResult {
  
  @scala.inline
  def apply(): CreateAssociationBatchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAssociationBatchResult]
  }
  
  @scala.inline
  implicit class CreateAssociationBatchResultOps[Self <: CreateAssociationBatchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailedVarargs(value: FailedCreateAssociation*): Self = this.set("Failed", js.Array(value :_*))
    
    @scala.inline
    def setFailed(value: FailedCreateAssociationList): Self = this.set("Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailed: Self = this.set("Failed", js.undefined)
    
    @scala.inline
    def setSuccessfulVarargs(value: AssociationDescription*): Self = this.set("Successful", js.Array(value :_*))
    
    @scala.inline
    def setSuccessful(value: AssociationDescriptionList): Self = this.set("Successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessful: Self = this.set("Successful", js.undefined)
  }
}
