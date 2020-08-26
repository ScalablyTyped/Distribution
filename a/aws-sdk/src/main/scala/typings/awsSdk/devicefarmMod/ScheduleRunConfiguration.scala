package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunConfiguration extends js.Object {
  /**
    * A list of upload ARNs for app packages to be installed with your app.
    */
  var auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.native
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have purchased unmetered device slots, you must set this parameter to unmetered to make use of them. Otherwise, your run counts against your metered time. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * Input CustomerArtifactPaths object for the scheduled run configuration.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.native
  /**
    * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm extracts to external data for Android or the app's sandbox for iOS.
    */
  var extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * Reserved for internal use.
    */
  var networkProfileArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.native
  /**
    * An array of ARNs for your VPC endpoint configurations.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}

object ScheduleRunConfiguration {
  @scala.inline
  def apply(): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
  @scala.inline
  implicit class ScheduleRunConfigurationOps[Self <: ScheduleRunConfiguration] (val x: Self) extends AnyVal {
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
    def setAuxiliaryAppsVarargs(value: AmazonResourceName*): Self = this.set("auxiliaryApps", js.Array(value :_*))
    @scala.inline
    def setAuxiliaryApps(value: AmazonResourceNames): Self = this.set("auxiliaryApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryApps: Self = this.set("auxiliaryApps", js.undefined)
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = this.set("billingMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingMethod: Self = this.set("billingMethod", js.undefined)
    @scala.inline
    def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = this.set("customerArtifactPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerArtifactPaths: Self = this.set("customerArtifactPaths", js.undefined)
    @scala.inline
    def setExtraDataPackageArn(value: AmazonResourceName): Self = this.set("extraDataPackageArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraDataPackageArn: Self = this.set("extraDataPackageArn", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNetworkProfileArn(value: AmazonResourceName): Self = this.set("networkProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkProfileArn: Self = this.set("networkProfileArn", js.undefined)
    @scala.inline
    def setRadios(value: Radios): Self = this.set("radios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadios: Self = this.set("radios", js.undefined)
    @scala.inline
    def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = this.set("vpceConfigurationArns", js.Array(value :_*))
    @scala.inline
    def setVpceConfigurationArns(value: AmazonResourceNames): Self = this.set("vpceConfigurationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpceConfigurationArns: Self = this.set("vpceConfigurationArns", js.undefined)
  }
  
}

