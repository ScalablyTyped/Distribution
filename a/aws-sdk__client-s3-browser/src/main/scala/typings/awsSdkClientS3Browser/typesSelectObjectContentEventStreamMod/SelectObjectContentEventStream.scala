package typings.awsSdkClientS3Browser.typesSelectObjectContentEventStreamMod

import typings.awsSdkClientS3Browser.typesContinuationEventMod.ContinuationEvent
import typings.awsSdkClientS3Browser.typesEndEventMod.EndEvent
import typings.awsSdkClientS3Browser.typesProgressEventMod.ProgressEvent
import typings.awsSdkClientS3Browser.typesRecordsEventMod.RecordsEvent
import typings.awsSdkClientS3Browser.typesStatsEventMod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectObjectContentEventStream extends js.Object {
  
  /**
    * <p>The Continuation Event.</p>
    */
  var Cont: js.UndefOr[ContinuationEvent] = js.native
  
  /**
    * <p>The End Event.</p>
    */
  var End: js.UndefOr[EndEvent] = js.native
  
  /**
    * <p>The Progress Event.</p>
    */
  var Progress: js.UndefOr[ProgressEvent] = js.native
  
  /**
    * <p>The Records Event.</p>
    */
  var Records: js.UndefOr[RecordsEvent] = js.native
  
  /**
    * <p>The Stats Event.</p>
    */
  var Stats: js.UndefOr[StatsEvent] = js.native
}
object SelectObjectContentEventStream {
  
  @scala.inline
  def apply(): SelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentEventStream]
  }
  
  @scala.inline
  implicit class SelectObjectContentEventStreamOps[Self <: SelectObjectContentEventStream] (val x: Self) extends AnyVal {
    
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
    def setCont(value: ContinuationEvent): Self = this.set("Cont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCont: Self = this.set("Cont", js.undefined)
    
    @scala.inline
    def setEnd(value: EndEvent): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    
    @scala.inline
    def setProgress(value: ProgressEvent): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    
    @scala.inline
    def setRecords(value: RecordsEvent): Self = this.set("Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("Records", js.undefined)
    
    @scala.inline
    def setStats(value: StatsEvent): Self = this.set("Stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("Stats", js.undefined)
  }
}
