package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudComponentStatus extends StObject {
  
  /**
    * The state of the component version.
    */
  var componentState: js.UndefOr[CloudComponentState] = js.undefined
  
  /**
    * A dictionary of errors that communicate why the component version is in an error state. For example, if IoT Greengrass can't access an artifact for the component version, then errors contains the artifact's URI as a key, and the error message as the value for that key.
    */
  var errors: js.UndefOr[StringMap] = js.undefined
  
  /**
    * A message that communicates details, such as errors, about the status of the component version.
    */
  var message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The vendor guidance state for the component version. This state indicates whether the component version has any issues that you should consider before you deploy it. The vendor guidance state can be:    ACTIVE – This component version is available and recommended for use.    DISCONTINUED – This component version has been discontinued by its publisher. You can deploy this component version, but we recommend that you use a different version of this component.    DELETED – This component version has been deleted by its publisher, so you can't deploy it. If you have any existing deployments that specify this component version, those deployments will fail.  
    */
  var vendorGuidance: js.UndefOr[VendorGuidance] = js.undefined
  
  /**
    * A message that communicates details about the vendor guidance state of the component version. This message communicates why a component version is discontinued or deleted.
    */
  var vendorGuidanceMessage: js.UndefOr[NonEmptyString] = js.undefined
}
object CloudComponentStatus {
  
  inline def apply(): CloudComponentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudComponentStatus]
  }
  
  extension [Self <: CloudComponentStatus](x: Self) {
    
    inline def setComponentState(value: CloudComponentState): Self = StObject.set(x, "componentState", value.asInstanceOf[js.Any])
    
    inline def setComponentStateUndefined: Self = StObject.set(x, "componentState", js.undefined)
    
    inline def setErrors(value: StringMap): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setVendorGuidance(value: VendorGuidance): Self = StObject.set(x, "vendorGuidance", value.asInstanceOf[js.Any])
    
    inline def setVendorGuidanceMessage(value: NonEmptyString): Self = StObject.set(x, "vendorGuidanceMessage", value.asInstanceOf[js.Any])
    
    inline def setVendorGuidanceMessageUndefined: Self = StObject.set(x, "vendorGuidanceMessage", js.undefined)
    
    inline def setVendorGuidanceUndefined: Self = StObject.set(x, "vendorGuidance", js.undefined)
  }
}
