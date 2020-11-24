package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutionConfiguration extends js.Object {
  
  /**
    * True if account cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var accountsCleanup: js.UndefOr[AccountsCleanup] = js.native
  
  /**
    * True if app package cleanup is enabled at the beginning of the test. Otherwise, false.
    */
  var appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.native
  
  /**
    * The number of minutes a test run executes before it times out.
    */
  var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  
  /**
    * Set to true to enable video capture. Otherwise, set to false. The default is true.
    */
  var videoCapture: js.UndefOr[VideoCapture] = js.native
}
object ExecutionConfiguration {
  
  @scala.inline
  def apply(): ExecutionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionConfiguration]
  }
  
  @scala.inline
  implicit class ExecutionConfigurationOps[Self <: ExecutionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountsCleanup(value: AccountsCleanup): Self = this.set("accountsCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountsCleanup: Self = this.set("accountsCleanup", js.undefined)
    
    @scala.inline
    def setAppPackagesCleanup(value: AppPackagesCleanup): Self = this.set("appPackagesCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPackagesCleanup: Self = this.set("appPackagesCleanup", js.undefined)
    
    @scala.inline
    def setJobTimeoutMinutes(value: JobTimeoutMinutes): Self = this.set("jobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTimeoutMinutes: Self = this.set("jobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = this.set("skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAppResign: Self = this.set("skipAppResign", js.undefined)
    
    @scala.inline
    def setVideoCapture(value: VideoCapture): Self = this.set("videoCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCapture: Self = this.set("videoCapture", js.undefined)
  }
}
