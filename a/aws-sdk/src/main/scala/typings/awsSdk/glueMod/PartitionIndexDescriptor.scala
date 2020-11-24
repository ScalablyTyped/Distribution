package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionIndexDescriptor extends js.Object {
  
  /**
    * The name of the partition index.
    */
  var IndexName: NameString = js.native
  
  /**
    * The status of the partition index. 
    */
  var IndexStatus: PartitionIndexStatus = js.native
  
  /**
    * A list of one or more keys, as KeySchemaElement structures, for the partition index.
    */
  var Keys: KeySchemaElementList = js.native
}
object PartitionIndexDescriptor {
  
  @scala.inline
  def apply(IndexName: NameString, IndexStatus: PartitionIndexStatus, Keys: KeySchemaElementList): PartitionIndexDescriptor = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], IndexStatus = IndexStatus.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionIndexDescriptor]
  }
  
  @scala.inline
  implicit class PartitionIndexDescriptorOps[Self <: PartitionIndexDescriptor] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: NameString): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexStatus(value: PartitionIndexStatus): Self = this.set("IndexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: KeySchemaElement*): Self = this.set("Keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: KeySchemaElementList): Self = this.set("Keys", value.asInstanceOf[js.Any])
  }
}
