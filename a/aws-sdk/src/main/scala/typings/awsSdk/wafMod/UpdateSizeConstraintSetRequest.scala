package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSizeConstraintSetRequest extends js.Object {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken = js.native
  
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to update. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
  
  /**
    * An array of SizeConstraintSetUpdate objects that you want to insert into or delete from a SizeConstraintSet. For more information, see the applicable data types:    SizeConstraintSetUpdate: Contains Action and SizeConstraint     SizeConstraint: Contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var Updates: SizeConstraintSetUpdates = js.native
}
object UpdateSizeConstraintSetRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId, Updates: SizeConstraintSetUpdates): UpdateSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSizeConstraintSetRequest]
  }
  
  @scala.inline
  implicit class UpdateSizeConstraintSetRequestOps[Self <: UpdateSizeConstraintSetRequest] (val x: Self) extends AnyVal {
    
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintSetId(value: ResourceId): Self = this.set("SizeConstraintSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesVarargs(value: SizeConstraintSetUpdate*): Self = this.set("Updates", js.Array(value :_*))
    
    @scala.inline
    def setUpdates(value: SizeConstraintSetUpdates): Self = this.set("Updates", value.asInstanceOf[js.Any])
  }
}
