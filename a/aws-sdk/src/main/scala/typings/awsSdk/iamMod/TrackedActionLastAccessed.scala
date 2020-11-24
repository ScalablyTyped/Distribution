package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackedActionLastAccessed extends js.Object {
  
  /**
    * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to IAM.
    */
  var ActionName: js.UndefOr[stringType] = js.native
  
  var LastAccessedEntity: js.UndefOr[arnType] = js.native
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedRegion: js.UndefOr[stringType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the tracked service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedTime: js.UndefOr[dateType] = js.native
}
object TrackedActionLastAccessed {
  
  @scala.inline
  def apply(): TrackedActionLastAccessed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackedActionLastAccessed]
  }
  
  @scala.inline
  implicit class TrackedActionLastAccessedOps[Self <: TrackedActionLastAccessed] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: stringType): Self = this.set("ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("ActionName", js.undefined)
    
    @scala.inline
    def setLastAccessedEntity(value: arnType): Self = this.set("LastAccessedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedEntity: Self = this.set("LastAccessedEntity", js.undefined)
    
    @scala.inline
    def setLastAccessedRegion(value: stringType): Self = this.set("LastAccessedRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedRegion: Self = this.set("LastAccessedRegion", js.undefined)
    
    @scala.inline
    def setLastAccessedTime(value: dateType): Self = this.set("LastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedTime: Self = this.set("LastAccessedTime", js.undefined)
  }
}
