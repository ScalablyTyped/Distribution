package typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.UnmarshalledEndpointDemographic
import typings.awsSdkClientPinpointBrowser.typesEndpointLocationMod.UnmarshalledEndpointLocation
import typings.awsSdkClientPinpointBrowser.typesEndpointUserMod.UnmarshalledEndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPublicEndpoint extends PublicEndpoint {
  /**
    * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create a segment.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledPublicEndpoint: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  /**
    * The endpoint demographic attributes.
    */
  @JSName("Demographic")
  var Demographic_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointDemographic] = js.native
  /**
    * The endpoint location attributes.
    */
  @JSName("Location")
  var Location_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointLocation] = js.native
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledPublicEndpoint: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  @JSName("User")
  var User_UnmarshalledPublicEndpoint: js.UndefOr[UnmarshalledEndpointUser] = js.native
}

object UnmarshalledPublicEndpoint {
  @scala.inline
  def apply(): UnmarshalledPublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPublicEndpoint]
  }
  @scala.inline
  implicit class UnmarshalledPublicEndpointOps[Self <: UnmarshalledPublicEndpoint] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[js.Array[String]]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setDemographic(value: UnmarshalledEndpointDemographic): Self = this.set("Demographic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDemographic: Self = this.set("Demographic", js.undefined)
    @scala.inline
    def setLocation(value: UnmarshalledEndpointLocation): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setMetrics(value: StringDictionary[Double]): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setUser(value: UnmarshalledEndpointUser): Self = this.set("User", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("User", js.undefined)
  }
  
}

