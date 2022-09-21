package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingResponse extends StObject {
  
  /**
    * Configuration information about the auto-merging process.
    */
  var AutoMerging: js.UndefOr[typings.awsSdk.customerprofilesMod.AutoMerging] = js.undefined
  
  /**
    * The flag that enables the matching process of duplicate profiles.
    */
  var Enabled: js.UndefOr[optionalBoolean] = js.undefined
  
  /**
    * Configuration information for exporting Identity Resolution results, for example, to an S3 bucket.
    */
  var ExportingConfig: js.UndefOr[typings.awsSdk.customerprofilesMod.ExportingConfig] = js.undefined
  
  /**
    * The day and time when do you want to start the Identity Resolution Job every week.
    */
  var JobSchedule: js.UndefOr[typings.awsSdk.customerprofilesMod.JobSchedule] = js.undefined
}
object MatchingResponse {
  
  inline def apply(): MatchingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchingResponse]
  }
  
  extension [Self <: MatchingResponse](x: Self) {
    
    inline def setAutoMerging(value: AutoMerging): Self = StObject.set(x, "AutoMerging", value.asInstanceOf[js.Any])
    
    inline def setAutoMergingUndefined: Self = StObject.set(x, "AutoMerging", js.undefined)
    
    inline def setEnabled(value: optionalBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setExportingConfig(value: ExportingConfig): Self = StObject.set(x, "ExportingConfig", value.asInstanceOf[js.Any])
    
    inline def setExportingConfigUndefined: Self = StObject.set(x, "ExportingConfig", js.undefined)
    
    inline def setJobSchedule(value: JobSchedule): Self = StObject.set(x, "JobSchedule", value.asInstanceOf[js.Any])
    
    inline def setJobScheduleUndefined: Self = StObject.set(x, "JobSchedule", js.undefined)
  }
}
