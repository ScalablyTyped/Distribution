package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseConversionTasksResponse extends StObject {
  
  /**
    * Information about the license configuration tasks for your account.
    */
  var LicenseConversionTasks: js.UndefOr[typings.awsSdk.licensemanagerMod.LicenseConversionTasks] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLicenseConversionTasksResponse {
  
  inline def apply(): ListLicenseConversionTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseConversionTasksResponse]
  }
  
  extension [Self <: ListLicenseConversionTasksResponse](x: Self) {
    
    inline def setLicenseConversionTasks(value: LicenseConversionTasks): Self = StObject.set(x, "LicenseConversionTasks", value.asInstanceOf[js.Any])
    
    inline def setLicenseConversionTasksUndefined: Self = StObject.set(x, "LicenseConversionTasks", js.undefined)
    
    inline def setLicenseConversionTasksVarargs(value: LicenseConversionTask*): Self = StObject.set(x, "LicenseConversionTasks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
