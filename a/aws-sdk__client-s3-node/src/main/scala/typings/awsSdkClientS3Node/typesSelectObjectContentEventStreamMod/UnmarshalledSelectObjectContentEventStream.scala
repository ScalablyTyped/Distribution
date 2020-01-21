package typings.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod

import typings.awsSdkClientS3Node.typesContinuationEventMod.UnmarshalledContinuationEvent
import typings.awsSdkClientS3Node.typesEndEventMod.UnmarshalledEndEvent
import typings.awsSdkClientS3Node.typesProgressEventMod.UnmarshalledProgressEvent
import typings.awsSdkClientS3Node.typesRecordsEventMod.UnmarshalledRecordsEvent
import typings.awsSdkClientS3Node.typesStatsEventMod.UnmarshalledStatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSelectObjectContentEventStream extends SelectObjectContentEventStream {
  /**
    * <p>The Continuation Event.</p>
    */
  @JSName("Cont")
  var Cont_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledContinuationEvent] = js.undefined
  /**
    * <p>The End Event.</p>
    */
  @JSName("End")
  var End_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledEndEvent] = js.undefined
  /**
    * <p>The Progress Event.</p>
    */
  @JSName("Progress")
  var Progress_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledProgressEvent] = js.undefined
  /**
    * <p>The Records Event.</p>
    */
  @JSName("Records")
  var Records_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledRecordsEvent] = js.undefined
  /**
    * <p>The Stats Event.</p>
    */
  @JSName("Stats")
  var Stats_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledStatsEvent] = js.undefined
}

object UnmarshalledSelectObjectContentEventStream {
  @scala.inline
  def apply(
    Cont: UnmarshalledContinuationEvent = null,
    End: UnmarshalledEndEvent = null,
    Progress: UnmarshalledProgressEvent = null,
    Records: UnmarshalledRecordsEvent = null,
    Stats: UnmarshalledStatsEvent = null
  ): UnmarshalledSelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    if (Stats != null) __obj.updateDynamic("Stats")(Stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSelectObjectContentEventStream]
  }
}

