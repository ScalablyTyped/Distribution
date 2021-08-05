package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkforceRequest extends StObject {
  
  /**
    * The name of the workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
}
object DeleteWorkforceRequest {
  
  inline def apply(WorkforceName: WorkforceName): DeleteWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkforceRequest]
  }
  
  extension [Self <: DeleteWorkforceRequest](x: Self) {
    
    inline def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
