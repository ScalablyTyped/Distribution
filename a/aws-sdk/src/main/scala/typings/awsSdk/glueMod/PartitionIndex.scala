package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionIndex extends StObject {
  
  /**
    * The name of the partition index.
    */
  var IndexName: NameString
  
  /**
    * The keys for the partition index.
    */
  var Keys: KeyList
}
object PartitionIndex {
  
  @scala.inline
  def apply(IndexName: NameString, Keys: KeyList): PartitionIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionIndex]
  }
  
  @scala.inline
  implicit class PartitionIndexMutableBuilder[Self <: PartitionIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: NameString): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: KeyList): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: NameString*): Self = StObject.set(x, "Keys", js.Array(value :_*))
  }
}
