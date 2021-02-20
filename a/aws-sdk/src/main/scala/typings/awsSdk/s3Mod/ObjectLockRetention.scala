package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectLockRetention extends StObject {
  
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
  implicit class ObjectLockRetentionMutableBuilder[Self <: ObjectLockRetention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: ObjectLockRetentionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setRetainUntilDate(value: Date): Self = StObject.set(x, "RetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainUntilDateUndefined: Self = StObject.set(x, "RetainUntilDate", js.undefined)
  }
}
