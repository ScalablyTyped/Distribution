package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkgroupRequest extends StObject {
  
  /**
    * The name of the workgroup to return information for.
    */
  var workgroupName: WorkgroupName
}
object GetWorkgroupRequest {
  
  inline def apply(workgroupName: WorkgroupName): GetWorkgroupRequest = {
    val __obj = js.Dynamic.literal(workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkgroupRequest]
  }
  
  extension [Self <: GetWorkgroupRequest](x: Self) {
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
