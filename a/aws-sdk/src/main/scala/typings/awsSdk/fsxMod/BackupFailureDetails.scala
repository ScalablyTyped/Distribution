package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupFailureDetails extends StObject {
  
  /**
    * A message describing the backup creation failure.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object BackupFailureDetails {
  
  @scala.inline
  def apply(): BackupFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupFailureDetails]
  }
  
  @scala.inline
  implicit class BackupFailureDetailsMutableBuilder[Self <: BackupFailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
