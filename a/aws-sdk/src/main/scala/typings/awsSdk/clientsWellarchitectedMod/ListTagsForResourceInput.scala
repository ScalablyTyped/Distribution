package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  var WorkloadArn: typings.awsSdk.clientsWellarchitectedMod.WorkloadArn
}
object ListTagsForResourceInput {
  
  inline def apply(WorkloadArn: WorkloadArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(WorkloadArn = WorkloadArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setWorkloadArn(value: WorkloadArn): Self = StObject.set(x, "WorkloadArn", value.asInstanceOf[js.Any])
  }
}
