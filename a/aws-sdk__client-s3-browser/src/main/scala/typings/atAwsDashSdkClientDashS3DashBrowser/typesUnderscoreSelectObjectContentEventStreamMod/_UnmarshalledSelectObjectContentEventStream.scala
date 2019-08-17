package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSelectObjectContentEventStreamMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreContinuationEventMod._UnmarshalledContinuationEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreEndEventMod._UnmarshalledEndEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressEventMod._UnmarshalledProgressEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRecordsEventMod._UnmarshalledRecordsEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStatsEventMod._UnmarshalledStatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSelectObjectContentEventStream extends _SelectObjectContentEventStream {
  /**
    * <p>The Continuation Event.</p>
    */
  @JSName("Cont")
  var Cont__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledContinuationEvent] = js.undefined
  /**
    * <p>The End Event.</p>
    */
  @JSName("End")
  var End__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledEndEvent] = js.undefined
  /**
    * <p>The Progress Event.</p>
    */
  @JSName("Progress")
  var Progress__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledProgressEvent] = js.undefined
  /**
    * <p>The Records Event.</p>
    */
  @JSName("Records")
  var Records__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledRecordsEvent] = js.undefined
  /**
    * <p>The Stats Event.</p>
    */
  @JSName("Stats")
  var Stats__UnmarshalledSelectObjectContentEventStream: js.UndefOr[_UnmarshalledStatsEvent] = js.undefined
}

object _UnmarshalledSelectObjectContentEventStream {
  @scala.inline
  def apply(
    Cont: _UnmarshalledContinuationEvent = null,
    End: _UnmarshalledEndEvent = null,
    Progress: _UnmarshalledProgressEvent = null,
    Records: _UnmarshalledRecordsEvent = null,
    Stats: _UnmarshalledStatsEvent = null
  ): _UnmarshalledSelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (Records != null) __obj.updateDynamic("Records")(Records)
    if (Stats != null) __obj.updateDynamic("Stats")(Stats)
    __obj.asInstanceOf[_UnmarshalledSelectObjectContentEventStream]
  }
}

