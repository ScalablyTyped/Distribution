package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionConfiguration extends StObject {
  
  /**
    * True if account cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var accountsCleanup: js.UndefOr[AccountsCleanup] = js.undefined
  
  /**
    * True if app package cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.undefined
  
  /**
    * The number of minutes a test run executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  
  /**
    * Set to true to enable video capture. Otherwise, set to false. The default is true.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.undefined
}
object ExecutionConfiguration {
  
  inline def apply(): ExecutionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionConfiguration]
  }
  
  extension [Self <: ExecutionConfiguration](x: Self) {
    
    inline def setAccountsCleanup(value: AccountsCleanup): Self = StObject.set(x, "accountsCleanup", value.asInstanceOf[js.Any])
    
    inline def setAccountsCleanupUndefined: Self = StObject.set(x, "accountsCleanup", js.undefined)
    
    inline def setAppPackagesCleanup(value: AppPackagesCleanup): Self = StObject.set(x, "appPackagesCleanup", value.asInstanceOf[js.Any])
    
    inline def setAppPackagesCleanupUndefined: Self = StObject.set(x, "appPackagesCleanup", js.undefined)
    
    inline def setJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "jobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setJobTimeoutMinutesUndefined: Self = StObject.set(x, "jobTimeoutMinutes", js.undefined)
    
    inline def setSkipAppResign(value: SkipAppResign): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    inline def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    inline def setVideoCapture(value: VideoCapture): Self = StObject.set(x, "videoCapture", value.asInstanceOf[js.Any])
    
    inline def setVideoCaptureUndefined: Self = StObject.set(x, "videoCapture", js.undefined)
  }
}
