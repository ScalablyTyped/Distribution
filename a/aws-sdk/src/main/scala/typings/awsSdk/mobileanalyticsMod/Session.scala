package typings.awsSdk.mobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  /**
    * The duration of the session.
    */
  var duration: js.UndefOr[Long] = js.native
  
  /**
    * A unique identifier for the session
    */
  var id: js.UndefOr[String50Chars] = js.native
  
  /**
    * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
  
  /**
    * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
}
object Session {
  
  @scala.inline
  def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: Long): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setId(value: String50Chars): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setStartTimestamp(value: ISO8601Timestamp): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
    
    @scala.inline
    def setStopTimestamp(value: ISO8601Timestamp): Self = this.set("stopTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTimestamp: Self = this.set("stopTimestamp", js.undefined)
  }
}
