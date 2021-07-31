package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewResultDetail extends StObject {
  
  /**
    *  A unique identifier of the Review action result. 
    */
  var ActionId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  Key identifies the particular piece of reviewed information. 
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT. 
    */
  var QuestionId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit results about the Assignment itself. 
    */
  var SubjectId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The type of the object from the SubjectId field.
    */
  var SubjectType: js.UndefOr[String] = js.undefined
  
  /**
    *  The values of Key provided by the review policies you have selected. 
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ReviewResultDetail {
  
  @scala.inline
  def apply(): ReviewResultDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewResultDetail]
  }
  
  @scala.inline
  implicit class ReviewResultDetailMutableBuilder[Self <: ReviewResultDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: EntityId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setQuestionId(value: EntityId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    @scala.inline
    def setSubjectId(value: EntityId): Self = StObject.set(x, "SubjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectIdUndefined: Self = StObject.set(x, "SubjectId", js.undefined)
    
    @scala.inline
    def setSubjectType(value: String): Self = StObject.set(x, "SubjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectTypeUndefined: Self = StObject.set(x, "SubjectType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
