package typings.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod

import typings.awsSdkClientS3Node.typesContinuationEventMod.UnmarshalledContinuationEvent
import typings.awsSdkClientS3Node.typesEndEventMod.UnmarshalledEndEvent
import typings.awsSdkClientS3Node.typesProgressEventMod.UnmarshalledProgressEvent
import typings.awsSdkClientS3Node.typesRecordsEventMod.UnmarshalledRecordsEvent
import typings.awsSdkClientS3Node.typesStatsEventMod.UnmarshalledStatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSelectObjectContentEventStream extends SelectObjectContentEventStream {
  /**
    * <p>The Continuation Event.</p>
    */
  @JSName("Cont")
  var Cont_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledContinuationEvent] = js.native
  /**
    * <p>The End Event.</p>
    */
  @JSName("End")
  var End_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledEndEvent] = js.native
  /**
    * <p>The Progress Event.</p>
    */
  @JSName("Progress")
  var Progress_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledProgressEvent] = js.native
  /**
    * <p>The Records Event.</p>
    */
  @JSName("Records")
  var Records_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledRecordsEvent] = js.native
  /**
    * <p>The Stats Event.</p>
    */
  @JSName("Stats")
  var Stats_UnmarshalledSelectObjectContentEventStream: js.UndefOr[UnmarshalledStatsEvent] = js.native
}

object UnmarshalledSelectObjectContentEventStream {
  @scala.inline
  def apply(): UnmarshalledSelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSelectObjectContentEventStream]
  }
  @scala.inline
  implicit class UnmarshalledSelectObjectContentEventStreamOps[Self <: UnmarshalledSelectObjectContentEventStream] (val x: Self) extends AnyVal {
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
    def setCont(value: UnmarshalledContinuationEvent): Self = this.set("Cont", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCont: Self = this.set("Cont", js.undefined)
    @scala.inline
    def setEnd(value: UnmarshalledEndEvent): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setProgress(value: UnmarshalledProgressEvent): Self = this.set("Progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    @scala.inline
    def setRecords(value: UnmarshalledRecordsEvent): Self = this.set("Records", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
    @scala.inline
    def setStats(value: UnmarshalledStatsEvent): Self = this.set("Stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("Stats", js.undefined)
  }
  
}

