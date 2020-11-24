package typings.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod

import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledReplicationRuleAndOperator extends ReplicationRuleAndOperator {
  
  /**
    * _TagSet shape
    */
  @JSName("Tags")
  var Tags_UnmarshalledReplicationRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.native
}
object UnmarshalledReplicationRuleAndOperator {
  
  @scala.inline
  def apply(): UnmarshalledReplicationRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledReplicationRuleAndOperator]
  }
  
  @scala.inline
  implicit class UnmarshalledReplicationRuleAndOperatorOps[Self <: UnmarshalledReplicationRuleAndOperator] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: UnmarshalledTag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[UnmarshalledTag]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
