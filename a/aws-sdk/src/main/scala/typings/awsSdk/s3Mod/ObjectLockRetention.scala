package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLockRetention extends js.Object {
  
  /**
    * Indicates the Retention mode for the specified object.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  
  /**
    * The date on which this Object Lock Retention will expire.
    */
  var RetainUntilDate: js.UndefOr[Date] = js.native
}
object ObjectLockRetention {
  
  @scala.inline
  def apply(): ObjectLockRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRetention]
  }
  
  @scala.inline
  implicit class ObjectLockRetentionOps[Self <: ObjectLockRetention] (val x: Self) extends AnyVal {
    
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
    def setMode(value: ObjectLockRetentionMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setRetainUntilDate(value: Date): Self = this.set("RetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainUntilDate: Self = this.set("RetainUntilDate", js.undefined)
  }
}
