package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockLegalHold extends StObject {
  
  /**
    * Indicates whether the specified object has a Legal Hold in place.
    */
  var Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
}
object ObjectLockLegalHold {
  
  @scala.inline
  def apply(): ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockLegalHold]
  }
  
  @scala.inline
  implicit class ObjectLockLegalHoldMutableBuilder[Self <: ObjectLockLegalHold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
