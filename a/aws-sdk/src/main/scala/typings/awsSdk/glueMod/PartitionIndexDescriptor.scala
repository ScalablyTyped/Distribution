package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionIndexDescriptor extends StObject {
  
  /**
    * The name of the partition index.
    */
  var IndexName: NameString
  
  /**
    * The status of the partition index. 
    */
  var IndexStatus: PartitionIndexStatus
  
  /**
    * A list of one or more keys, as KeySchemaElement structures, for the partition index.
    */
  var Keys: KeySchemaElementList
}
object PartitionIndexDescriptor {
  
  inline def apply(IndexName: NameString, IndexStatus: PartitionIndexStatus, Keys: KeySchemaElementList): PartitionIndexDescriptor = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], IndexStatus = IndexStatus.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionIndexDescriptor]
  }
  
  extension [Self <: PartitionIndexDescriptor](x: Self) {
    
    inline def setIndexName(value: NameString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexStatus(value: PartitionIndexStatus): Self = StObject.set(x, "IndexStatus", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: KeySchemaElementList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: KeySchemaElement*): Self = StObject.set(x, "Keys", js.Array(value :_*))
  }
}
