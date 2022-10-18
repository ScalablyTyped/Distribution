package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The tags for the resource.
    */
  var Tags: TagMap
  
  var WorkloadArn: typings.awsSdk.clientsWellarchitectedMod.WorkloadArn
}
object TagResourceInput {
  
  inline def apply(Tags: TagMap, WorkloadArn: WorkloadArn): TagResourceInput = {
    val __obj = js.Dynamic.literal(Tags = Tags.asInstanceOf[js.Any], WorkloadArn = WorkloadArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  extension [Self <: TagResourceInput](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
  }
}
