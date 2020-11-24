package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterSnapshotAttribute extends js.Object {
  
  /**
    * The name of the manual cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual cluster snapshot.
    */
  var AttributeName: js.UndefOr[String] = js.native
  
  /**
    * The values for the manual cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual cluster snapshot. If a value of all is in the list, then the manual cluster snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}
object DBClusterSnapshotAttribute {
  
  @scala.inline
  def apply(): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
  
  @scala.inline
  implicit class DBClusterSnapshotAttributeOps[Self <: DBClusterSnapshotAttribute] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeValuesVarargs(value: String*): Self = this.set("AttributeValues", js.Array(value :_*))
    
    @scala.inline
    def setAttributeValues(value: AttributeValueList): Self = this.set("AttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeValues: Self = this.set("AttributeValues", js.undefined)
  }
}
