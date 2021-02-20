package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionIndexDescriptor extends StObject {
  
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
  implicit class PartitionIndexDescriptorMutableBuilder[Self <: PartitionIndexDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: NameString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexStatus(value: PartitionIndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: KeySchemaElementList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: KeySchemaElement*): Self = StObject.set(x, "Keys", js.Array(value :_*))
  }
}
