package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceRequestStatusOutput extends StObject {
  
  /**
    * Represents the current status of the resource operation request.
    */
  var ProgressEvent: js.UndefOr[typings.awsSdk.cloudcontrolMod.ProgressEvent] = js.undefined
}
object GetResourceRequestStatusOutput {
  
  inline def apply(): GetResourceRequestStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceRequestStatusOutput]
  }
  
  extension [Self <: GetResourceRequestStatusOutput](x: Self) {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}
