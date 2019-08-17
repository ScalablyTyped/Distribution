package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHttpMod._Http
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._ServiceId
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceUserMod._TraceUser
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreValueWithServiceIdsMod._ValueWithServiceIds
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TraceSummary extends js.Object {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  var Annotations: js.UndefOr[
    (StringDictionary[js.Array[_ValueWithServiceIds] | Iterable[_ValueWithServiceIds]]) | (Iterable[
      js.Tuple2[String, js.Array[_ValueWithServiceIds] | Iterable[_ValueWithServiceIds]]
    ])
  ] = js.undefined
  /**
    * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
    */
  var Duration: js.UndefOr[Double] = js.undefined
  /**
    * <p>One or more of the segment documents has a 400 series error.</p>
    */
  var HasError: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>One or more of the segment documents has a 500 series error.</p>
    */
  var HasFault: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>One or more of the segment documents has a 429 throttling error.</p>
    */
  var HasThrottle: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  var Http: js.UndefOr[_Http] = js.undefined
  /**
    * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * <p>One or more of the segment documents is in progress.</p>
    */
  var IsPartial: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.</p>
    */
  var ResponseTime: js.UndefOr[Double] = js.undefined
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[_ServiceId] | Iterable[_ServiceId]] = js.undefined
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  var Users: js.UndefOr[js.Array[_TraceUser] | Iterable[_TraceUser]] = js.undefined
}

object _TraceSummary {
  @scala.inline
  def apply(
    Annotations: (StringDictionary[js.Array[_ValueWithServiceIds] | Iterable[_ValueWithServiceIds]]) | (Iterable[
      js.Tuple2[String, js.Array[_ValueWithServiceIds] | Iterable[_ValueWithServiceIds]]
    ]) = null,
    Duration: Int | Double = null,
    HasError: js.UndefOr[Boolean] = js.undefined,
    HasFault: js.UndefOr[Boolean] = js.undefined,
    HasThrottle: js.UndefOr[Boolean] = js.undefined,
    Http: _Http = null,
    Id: String = null,
    IsPartial: js.UndefOr[Boolean] = js.undefined,
    ResponseTime: Int | Double = null,
    ServiceIds: js.Array[_ServiceId] | Iterable[_ServiceId] = null,
    Users: js.Array[_TraceUser] | Iterable[_TraceUser] = null
  ): _TraceSummary = {
    val __obj = js.Dynamic.literal()
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (!js.isUndefined(HasError)) __obj.updateDynamic("HasError")(HasError)
    if (!js.isUndefined(HasFault)) __obj.updateDynamic("HasFault")(HasFault)
    if (!js.isUndefined(HasThrottle)) __obj.updateDynamic("HasThrottle")(HasThrottle)
    if (Http != null) __obj.updateDynamic("Http")(Http)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsPartial)) __obj.updateDynamic("IsPartial")(IsPartial)
    if (ResponseTime != null) __obj.updateDynamic("ResponseTime")(ResponseTime.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[_TraceSummary]
  }
}

