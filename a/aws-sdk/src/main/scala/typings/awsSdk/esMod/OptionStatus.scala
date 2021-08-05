package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionStatus extends StObject {
  
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: UpdateTimestamp
  
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState
  
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: UpdateTimestamp
  
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
}
object OptionStatus {
  
  inline def apply(CreationDate: UpdateTimestamp, State: OptionState, UpdateDate: UpdateTimestamp): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  
  extension [Self <: OptionStatus](x: Self) {
    
    inline def setCreationDate(value: UpdateTimestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletion(value: Boolean): Self = StObject.set(x, "PendingDeletion", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionUndefined: Self = StObject.set(x, "PendingDeletion", js.undefined)
    
    inline def setState(value: OptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: UpdateTimestamp): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersion(value: UIntValue): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
