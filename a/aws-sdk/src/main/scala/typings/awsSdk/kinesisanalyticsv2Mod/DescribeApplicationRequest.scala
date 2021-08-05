package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationRequest extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
    */
  var IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.undefined
}
object DescribeApplicationRequest {
  
  inline def apply(ApplicationName: ApplicationName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
  
  extension [Self <: DescribeApplicationRequest](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setIncludeAdditionalDetails(value: BooleanObject): Self = StObject.set(x, "IncludeAdditionalDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeAdditionalDetailsUndefined: Self = StObject.set(x, "IncludeAdditionalDetails", js.undefined)
  }
}
