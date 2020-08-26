package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDemographic extends js.Object {
  /**
    * The version of the app that's associated with the endpoint.
    */
  var AppVersion: js.UndefOr[string] = js.native
  /**
    * The locale of the endpoint, in the following format: the ISO 639-1 alpha-2 code, followed by an underscore (_), followed by an ISO 3166-1 alpha-2 value.
    */
  var Locale: js.UndefOr[string] = js.native
  /**
    * The manufacturer of the endpoint device, such as apple or samsung.
    */
  var Make: js.UndefOr[string] = js.native
  /**
    * The model name or number of the endpoint device, such as iPhone or SM-G900F.
    */
  var Model: js.UndefOr[string] = js.native
  /**
    * The model version of the endpoint device.
    */
  var ModelVersion: js.UndefOr[string] = js.native
  /**
    * The platform of the endpoint device, such as ios.
    */
  var Platform: js.UndefOr[string] = js.native
  /**
    * The platform version of the endpoint device.
    */
  var PlatformVersion: js.UndefOr[string] = js.native
  /**
    * The time zone of the endpoint, specified as a tz database name value, such as America/Los_Angeles.
    */
  var Timezone: js.UndefOr[string] = js.native
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
    def setAppVersion(value: string): Self = this.set("AppVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppVersion: Self = this.set("AppVersion", js.undefined)
    @scala.inline
    def setLocale(value: string): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    @scala.inline
    def setMake(value: string): Self = this.set("Make", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMake: Self = this.set("Make", js.undefined)
    @scala.inline
    def setModel(value: string): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("Model", js.undefined)
    @scala.inline
    def setModelVersion(value: string): Self = this.set("ModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersion: Self = this.set("ModelVersion", js.undefined)
    @scala.inline
    def setPlatform(value: string): Self = this.set("Platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    @scala.inline
    def setPlatformVersion(value: string): Self = this.set("PlatformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("PlatformVersion", js.undefined)
    @scala.inline
    def setTimezone(value: string): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
  }
  
}

