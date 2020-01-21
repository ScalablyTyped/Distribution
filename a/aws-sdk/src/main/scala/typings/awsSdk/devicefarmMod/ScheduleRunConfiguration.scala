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
  def apply(
    auxiliaryApps: AmazonResourceNames = null,
    billingMethod: BillingMethod = null,
    customerArtifactPaths: CustomerArtifactPaths = null,
    extraDataPackageArn: AmazonResourceName = null,
    locale: String = null,
    location: Location = null,
    networkProfileArn: AmazonResourceName = null,
    radios: Radios = null,
    vpceConfigurationArns: AmazonResourceNames = null
  ): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryApps != null) __obj.updateDynamic("auxiliaryApps")(auxiliaryApps.asInstanceOf[js.Any])
    if (billingMethod != null) __obj.updateDynamic("billingMethod")(billingMethod.asInstanceOf[js.Any])
    if (customerArtifactPaths != null) __obj.updateDynamic("customerArtifactPaths")(customerArtifactPaths.asInstanceOf[js.Any])
    if (extraDataPackageArn != null) __obj.updateDynamic("extraDataPackageArn")(extraDataPackageArn.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (networkProfileArn != null) __obj.updateDynamic("networkProfileArn")(networkProfileArn.asInstanceOf[js.Any])
    if (radios != null) __obj.updateDynamic("radios")(radios.asInstanceOf[js.Any])
    if (vpceConfigurationArns != null) __obj.updateDynamic("vpceConfigurationArns")(vpceConfigurationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
}

