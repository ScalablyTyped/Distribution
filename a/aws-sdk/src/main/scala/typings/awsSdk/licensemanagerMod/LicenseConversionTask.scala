package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConversionTask extends StObject {
  
  /**
    * Information about the license type this conversion task converted to.
    */
  var DestinationLicenseContext: js.UndefOr[LicenseConversionContext] = js.undefined
  
  /**
    * The time the conversion task was completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the license type conversion task.
    */
  var LicenseConversionTaskId: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConversionTaskId] = js.undefined
  
  /**
    * The time the usage operation value of the resource was changed.
    */
  var LicenseConversionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the license type this conversion task converted from.
    */
  var SourceLicenseContext: js.UndefOr[LicenseConversionContext] = js.undefined
  
  /**
    * The time the conversion task was started at.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the conversion task.
    */
  var Status: js.UndefOr[LicenseConversionTaskStatus] = js.undefined
  
  /**
    * The status message for the conversion task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object LicenseConversionTask {
  
  inline def apply(): LicenseConversionTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConversionTask]
  }
  
  extension [Self <: LicenseConversionTask](x: Self) {
    
    inline def setDestinationLicenseContext(value: LicenseConversionContext): Self = StObject.set(x, "DestinationLicenseContext", value.asInstanceOf[js.Any])
    
    inline def setDestinationLicenseContextUndefined: Self = StObject.set(x, "DestinationLicenseContext", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setLicenseConversionTaskId(value: LicenseConversionTaskId): Self = StObject.set(x, "LicenseConversionTaskId", value.asInstanceOf[js.Any])
    
    inline def setLicenseConversionTaskIdUndefined: Self = StObject.set(x, "LicenseConversionTaskId", js.undefined)
    
    inline def setLicenseConversionTime(value: js.Date): Self = StObject.set(x, "LicenseConversionTime", value.asInstanceOf[js.Any])
    
    inline def setLicenseConversionTimeUndefined: Self = StObject.set(x, "LicenseConversionTime", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSourceLicenseContext(value: LicenseConversionContext): Self = StObject.set(x, "SourceLicenseContext", value.asInstanceOf[js.Any])
    
    inline def setSourceLicenseContextUndefined: Self = StObject.set(x, "SourceLicenseContext", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: LicenseConversionTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
