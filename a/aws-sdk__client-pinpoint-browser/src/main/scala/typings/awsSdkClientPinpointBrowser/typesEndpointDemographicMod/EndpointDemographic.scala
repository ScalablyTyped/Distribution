package typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDemographic extends js.Object {
  /**
    * The version of the application associated with the endpoint.
    */
  var AppVersion: js.UndefOr[String] = js.native
  /**
    * The endpoint locale in the following format: The ISO 639-1 alpha-2 code, followed by an underscore, followed by an ISO 3166-1 alpha-2 value.
    *
    */
  var Locale: js.UndefOr[String] = js.native
  /**
    * The manufacturer of the endpoint device, such as Apple or Samsung.
    */
  var Make: js.UndefOr[String] = js.native
  /**
    * The model name or number of the endpoint device, such as iPhone.
    */
  var Model: js.UndefOr[String] = js.native
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * The platform of the endpoint device, such as iOS or Android.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * The timezone of the endpoint. Specified as a tz database value, such as Americas/Los_Angeles.
    */
  var Timezone: js.UndefOr[String] = js.native
}

object EndpointDemographic {
  @scala.inline
  def apply(): EndpointDemographic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDemographic]
  }
  @scala.inline
  implicit class EndpointDemographicOps[Self <: EndpointDemographic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppVersion(value: String): Self = this.set("AppVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("AppVersion", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    @scala.inline
    def setMake(value: String): Self = this.set("Make", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMake: Self = this.set("Make", js.undefined)
    @scala.inline
    def setModel(value: String): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    @scala.inline
    def setModelVersion(value: String): Self = this.set("ModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersion: Self = this.set("ModelVersion", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("PlatformVersion", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
  }
  
}

