package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceOutput extends StObject {
  
  /**
    * Represents the current status of the resource update request. Use the RequestToken of the ProgressEvent with GetResourceRequestStatus to return the current status of a resource operation request.
    */
  var ProgressEvent: js.UndefOr[typings.awsSdk.cloudcontrolMod.ProgressEvent] = js.undefined
}
object UpdateResourceOutput {
  
  inline def apply(): UpdateResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResourceOutput]
  }
  
  extension [Self <: UpdateResourceOutput](x: Self) {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}
