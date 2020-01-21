package typings.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientXrayNode.typesHttpMod.Http
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.awsSdkClientXrayNode.typesTraceUserMod.TraceUser
import typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod.ValueWithServiceIds
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceSummary extends js.Object {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  var Annotations: js.UndefOr[
    (StringDictionary[js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]) | (Iterable[js.Tuple2[String, js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]])
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
  var Http: js.UndefOr[typings.awsSdkClientXrayNode.typesHttpMod.Http] = js.undefined
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
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.undefined
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  var Users: js.UndefOr[js.Array[TraceUser] | Iterable[TraceUser]] = js.undefined
}

object TraceSummary {
  @scala.inline
  def apply(
    Annotations: (StringDictionary[js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]) | (Iterable[js.Tuple2[String, js.Array[ValueWithServiceIds] | Iterable[ValueWithServiceIds]]]) = null,
    Duration: Int | Double = null,
    HasError: js.UndefOr[Boolean] = js.undefined,
    HasFault: js.UndefOr[Boolean] = js.undefined,
    HasThrottle: js.UndefOr[Boolean] = js.undefined,
    Http: Http = null,
    Id: String = null,
    IsPartial: js.UndefOr[Boolean] = js.undefined,
    ResponseTime: Int | Double = null,
    ServiceIds: js.Array[ServiceId] | Iterable[ServiceId] = null,
    Users: js.Array[TraceUser] | Iterable[TraceUser] = null
  ): TraceSummary = {
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
    __obj.asInstanceOf[TraceSummary]
  }
}

