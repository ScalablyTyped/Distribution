package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHttpMod._UnmarshalledHttp
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._UnmarshalledServiceId
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceUserMod._UnmarshalledTraceUser
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreValueWithServiceIdsMod._UnmarshalledValueWithServiceIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTraceSummary extends _TraceSummary {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  @JSName("Annotations")
  var Annotations__UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[_UnmarshalledValueWithServiceIds]]] = js.undefined
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  @JSName("Http")
  var Http__UnmarshalledTraceSummary: js.UndefOr[_UnmarshalledHttp] = js.undefined
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds__UnmarshalledTraceSummary: js.UndefOr[js.Array[_UnmarshalledServiceId]] = js.undefined
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  @JSName("Users")
  var Users__UnmarshalledTraceSummary: js.UndefOr[js.Array[_UnmarshalledTraceUser]] = js.undefined
}

object _UnmarshalledTraceSummary {
  @scala.inline
  def apply(
    Annotations: StringDictionary[js.Array[_UnmarshalledValueWithServiceIds]] = null,
    Duration: Int | Double = null,
    HasError: js.UndefOr[Boolean] = js.undefined,
    HasFault: js.UndefOr[Boolean] = js.undefined,
    HasThrottle: js.UndefOr[Boolean] = js.undefined,
    Http: _UnmarshalledHttp = null,
    Id: String = null,
    IsPartial: js.UndefOr[Boolean] = js.undefined,
    ResponseTime: Int | Double = null,
    ServiceIds: js.Array[_UnmarshalledServiceId] = null,
    Users: js.Array[_UnmarshalledTraceUser] = null
  ): _UnmarshalledTraceSummary = {
    val __obj = js.Dynamic.literal()
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (!js.isUndefined(HasError)) __obj.updateDynamic("HasError")(HasError.asInstanceOf[js.Any])
    if (!js.isUndefined(HasFault)) __obj.updateDynamic("HasFault")(HasFault.asInstanceOf[js.Any])
    if (!js.isUndefined(HasThrottle)) __obj.updateDynamic("HasThrottle")(HasThrottle.asInstanceOf[js.Any])
    if (Http != null) __obj.updateDynamic("Http")(Http.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPartial)) __obj.updateDynamic("IsPartial")(IsPartial.asInstanceOf[js.Any])
    if (ResponseTime != null) __obj.updateDynamic("ResponseTime")(ResponseTime.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTraceSummary]
  }
}

