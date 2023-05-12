package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockRetention extends StObject {
  
  /**
    * Indicates the Retention mode for the specified object.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined
  
  /**
    * The date on which this Object Lock Retention will expire.
    */
  var RetainUntilDate: js.UndefOr[js.Date] = js.undefined
}
object ObjectLockRetention {
  
  inline def apply(): ObjectLockRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRetention]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLockRetention] (val x: Self) extends AnyVal {
    
    inline def setMode(value: ObjectLockRetentionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setRetainUntilDate(value: js.Date): Self = StObject.set(x, "RetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setRetainUntilDateUndefined: Self = StObject.set(x, "RetainUntilDate", js.undefined)
  }
}
