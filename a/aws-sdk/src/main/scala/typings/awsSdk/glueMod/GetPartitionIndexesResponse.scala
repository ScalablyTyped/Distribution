package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartitionIndexesResponse extends js.Object {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of index descriptors.
    */
  var PartitionIndexDescriptorList: js.UndefOr[typings.awsSdk.glueMod.PartitionIndexDescriptorList] = js.native
}
object GetPartitionIndexesResponse {
  
  @scala.inline
  def apply(): GetPartitionIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionIndexesResponse]
  }
  
  @scala.inline
  implicit class GetPartitionIndexesResponseOps[Self <: GetPartitionIndexesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPartitionIndexDescriptorListVarargs(value: PartitionIndexDescriptor*): Self = this.set("PartitionIndexDescriptorList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionIndexDescriptorList(value: PartitionIndexDescriptorList): Self = this.set("PartitionIndexDescriptorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionIndexDescriptorList: Self = this.set("PartitionIndexDescriptorList", js.undefined)
  }
}
