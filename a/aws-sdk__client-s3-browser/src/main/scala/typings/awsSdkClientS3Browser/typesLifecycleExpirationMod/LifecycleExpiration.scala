package typings.awsSdkClientS3Browser.typesLifecycleExpirationMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleExpiration extends js.Object {
  
  /**
    * <p>Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.</p>
    */
  var Date: js.UndefOr[typings.std.Date | String | Double] = js.native
  
  /**
    * <p>Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.</p>
    */
  var Days: js.UndefOr[Double] = js.native
  
  /**
    * <p>Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.</p>
    */
  var ExpiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
}
object LifecycleExpiration {
  
  @scala.inline
  def apply(): LifecycleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleExpiration]
  }
  
  @scala.inline
  implicit class LifecycleExpirationOps[Self <: LifecycleExpiration] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date | String | Double): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("Date", js.undefined)
    
    @scala.inline
    def setDays(value: Double): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("Days", js.undefined)
    
    @scala.inline
    def setExpiredObjectDeleteMarker(value: Boolean): Self = this.set("ExpiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiredObjectDeleteMarker: Self = this.set("ExpiredObjectDeleteMarker", js.undefined)
  }
}
