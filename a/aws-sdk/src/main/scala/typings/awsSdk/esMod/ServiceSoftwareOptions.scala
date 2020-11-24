package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSoftwareOptions extends js.Object {
  
  /**
    * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
    */
  var AutomatedUpdateDate: js.UndefOr[DeploymentCloseDateTimeStamp] = js.native
  
  /**
    * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
    */
  var Cancellable: js.UndefOr[Boolean] = js.native
  
  /**
    * The current service software version that is present on the domain.
    */
  var CurrentVersion: js.UndefOr[String] = js.native
  
  /**
    * The description of the UpdateStatus.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The new service software version if one is available.
    */
  var NewVersion: js.UndefOr[String] = js.native
  
  /**
    * True if a service software is never automatically updated. False if a service software is automatically updated after AutomatedUpdateDate. 
    */
  var OptionalDeployment: js.UndefOr[Boolean] = js.native
  
  /**
    * True if you are able to update you service software version. False if you are not able to update your service software version. 
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
    */
  var UpdateStatus: js.UndefOr[DeploymentStatus] = js.native
}
object ServiceSoftwareOptions {
  
  @scala.inline
  def apply(): ServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSoftwareOptions]
  }
  
  @scala.inline
  implicit class ServiceSoftwareOptionsOps[Self <: ServiceSoftwareOptions] (val x: Self) extends AnyVal {
    
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
    def setAutomatedUpdateDate(value: DeploymentCloseDateTimeStamp): Self = this.set("AutomatedUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomatedUpdateDate: Self = this.set("AutomatedUpdateDate", js.undefined)
    
    @scala.inline
    def setCancellable(value: Boolean): Self = this.set("Cancellable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellable: Self = this.set("Cancellable", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: String): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("CurrentVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setNewVersion(value: String): Self = this.set("NewVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewVersion: Self = this.set("NewVersion", js.undefined)
    
    @scala.inline
    def setOptionalDeployment(value: Boolean): Self = this.set("OptionalDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalDeployment: Self = this.set("OptionalDeployment", js.undefined)
    
    @scala.inline
    def setUpdateAvailable(value: Boolean): Self = this.set("UpdateAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAvailable: Self = this.set("UpdateAvailable", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: DeploymentStatus): Self = this.set("UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateStatus: Self = this.set("UpdateStatus", js.undefined)
  }
}
