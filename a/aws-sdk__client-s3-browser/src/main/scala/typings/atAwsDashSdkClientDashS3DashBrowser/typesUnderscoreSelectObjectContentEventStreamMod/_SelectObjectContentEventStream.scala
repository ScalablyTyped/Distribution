package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSelectObjectContentEventStreamMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreContinuationEventMod._ContinuationEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreEndEventMod._EndEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreProgressEventMod._ProgressEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRecordsEventMod._RecordsEvent
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStatsEventMod._StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SelectObjectContentEventStream extends js.Object {
  /**
    * <p>The Continuation Event.</p>
    */
  var Cont: js.UndefOr[_ContinuationEvent] = js.undefined
  /**
    * <p>The End Event.</p>
    */
  var End: js.UndefOr[_EndEvent] = js.undefined
  /**
    * <p>The Progress Event.</p>
    */
  var Progress: js.UndefOr[_ProgressEvent] = js.undefined
  /**
    * <p>The Records Event.</p>
    */
  var Records: js.UndefOr[_RecordsEvent] = js.undefined
  /**
    * <p>The Stats Event.</p>
    */
  var Stats: js.UndefOr[_StatsEvent] = js.undefined
}

object _SelectObjectContentEventStream {
  @scala.inline
  def apply(
    Cont: _ContinuationEvent = null,
    End: _EndEvent = null,
    Progress: _ProgressEvent = null,
    Records: _RecordsEvent = null,
    Stats: _StatsEvent = null
  ): _SelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (Records != null) __obj.updateDynamic("Records")(Records)
    if (Stats != null) __obj.updateDynamic("Stats")(Stats)
    __obj.asInstanceOf[_SelectObjectContentEventStream]
  }
}

