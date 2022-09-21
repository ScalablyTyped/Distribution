package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceOutput extends StObject {
  
  /**
    * Represents the current status of the resource deletion request. After you have initiated a resource deletion request, you can monitor the progress of your request by calling GetResourceRequestStatus using the RequestToken of the ProgressEvent returned by DeleteResource.
    */
  var ProgressEvent: js.UndefOr[typings.awsSdk.cloudcontrolMod.ProgressEvent] = js.undefined
}
object DeleteResourceOutput {
  
  inline def apply(): DeleteResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourceOutput]
  }
  
  extension [Self <: DeleteResourceOutput](x: Self) {
    
    inline def setProgressEvent(value: ProgressEvent): Self = StObject.set(x, "ProgressEvent", value.asInstanceOf[js.Any])
    
    inline def setProgressEventUndefined: Self = StObject.set(x, "ProgressEvent", js.undefined)
  }
}
