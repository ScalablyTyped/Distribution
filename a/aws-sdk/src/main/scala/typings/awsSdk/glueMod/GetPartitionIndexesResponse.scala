package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPartitionIndexesResponse extends StObject {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of index descriptors.
    */
  var PartitionIndexDescriptorList: js.UndefOr[typings.awsSdk.glueMod.PartitionIndexDescriptorList] = js.undefined
}
object GetPartitionIndexesResponse {
  
  inline def apply(): GetPartitionIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionIndexesResponse]
  }
  
  extension [Self <: GetPartitionIndexesResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPartitionIndexDescriptorList(value: PartitionIndexDescriptorList): Self = StObject.set(x, "PartitionIndexDescriptorList", value.asInstanceOf[js.Any])
    
    inline def setPartitionIndexDescriptorListUndefined: Self = StObject.set(x, "PartitionIndexDescriptorList", js.undefined)
    
    inline def setPartitionIndexDescriptorListVarargs(value: PartitionIndexDescriptor*): Self = StObject.set(x, "PartitionIndexDescriptorList", js.Array(value :_*))
  }
}
