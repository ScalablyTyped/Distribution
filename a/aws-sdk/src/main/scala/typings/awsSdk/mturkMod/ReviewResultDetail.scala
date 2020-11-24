package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewResultDetail extends js.Object {
  
  /**
    *  A unique identifier of the Review action result. 
    */
  var ActionId: js.UndefOr[EntityId] = js.native
  
  /**
    *  Key identifies the particular piece of reviewed information. 
    */
  var Key: js.UndefOr[String] = js.native
  
  /**
    *  Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT. 
    */
  var QuestionId: js.UndefOr[EntityId] = js.native
  
  /**
    * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit results about the Assignment itself. 
    */
  var SubjectId: js.UndefOr[EntityId] = js.native
  
  /**
    *  The type of the object from the SubjectId field.
    */
  var SubjectType: js.UndefOr[String] = js.native
  
  /**
    *  The values of Key provided by the review policies you have selected. 
    */
  var Value: js.UndefOr[String] = js.native
}
object ReviewResultDetail {
  
  @scala.inline
  def apply(): ReviewResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewResultDetail]
  }
  
  @scala.inline
  implicit class ReviewResultDetailOps[Self <: ReviewResultDetail] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: EntityId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("ActionId", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setQuestionId(value: EntityId): Self = this.set("QuestionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuestionId: Self = this.set("QuestionId", js.undefined)
    
    @scala.inline
    def setSubjectId(value: EntityId): Self = this.set("SubjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectId: Self = this.set("SubjectId", js.undefined)
    
    @scala.inline
    def setSubjectType(value: String): Self = this.set("SubjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectType: Self = this.set("SubjectType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
