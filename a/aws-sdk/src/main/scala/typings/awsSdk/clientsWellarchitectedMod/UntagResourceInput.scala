package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * A list of tag keys. Existing tags of the resource whose keys are members of this list are removed from the resource.
    */
  var TagKeys: TagKeyList
  
  var WorkloadArn: typings.awsSdk.clientsWellarchitectedMod.WorkloadArn
}
object UntagResourceInput {
  
  inline def apply(TagKeys: TagKeyList, WorkloadArn: WorkloadArn): UntagResourceInput = {
    val __obj = js.Dynamic.literal(TagKeys = TagKeys.asInstanceOf[js.Any], WorkloadArn = WorkloadArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
  }
}
