package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkgroupResponse extends StObject {
  
  /**
    * The updated workgroup object.
    */
  var workgroup: Workgroup
}
object UpdateWorkgroupResponse {
  
  inline def apply(workgroup: Workgroup): UpdateWorkgroupResponse = {
    val __obj = js.Dynamic.literal(workgroup = workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkgroupResponse]
  }
  
  extension [Self <: UpdateWorkgroupResponse](x: Self) {
    
    inline def setWorkgroup(value: Workgroup): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
  }
}
