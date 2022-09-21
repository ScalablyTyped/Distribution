package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneStatus extends StObject {
  
  /**
    * The timestamp of the Auto-Tune options creation date.
    */
  var CreationDate: js.Date
  
  /**
    * The error message while enabling or disabling Auto-Tune.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The AutoTuneState for the domain. 
    */
  var State: AutoTuneState
  
  /**
    * The timestamp of when the Auto-Tune options were last updated.
    */
  var UpdateDate: js.Date
  
  /**
    * The latest version of the Auto-Tune options.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
}
object AutoTuneStatus {
  
  inline def apply(CreationDate: js.Date, State: AutoTuneState, UpdateDate: js.Date): AutoTuneStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTuneStatus]
  }
  
  extension [Self <: AutoTuneStatus](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setPendingDeletion(value: Boolean): Self = StObject.set(x, "PendingDeletion", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionUndefined: Self = StObject.set(x, "PendingDeletion", js.undefined)
    
    inline def setState(value: AutoTuneState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersion(value: UIntValue): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
