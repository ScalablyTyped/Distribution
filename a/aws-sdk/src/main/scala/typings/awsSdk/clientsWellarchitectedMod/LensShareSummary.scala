package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LensShareSummary extends StObject {
  
  var ShareId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ShareId] = js.undefined
  
  var SharedWith: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.SharedWith] = js.undefined
  
  var Status: js.UndefOr[ShareStatus] = js.undefined
  
  /**
    * Optional message to compliment the Status field.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.StatusMessage] = js.undefined
}
object LensShareSummary {
  
  inline def apply(): LensShareSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LensShareSummary]
  }
  
  extension [Self <: LensShareSummary](x: Self) {
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setShareIdUndefined: Self = StObject.set(x, "ShareId", js.undefined)
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
    
    inline def setSharedWithUndefined: Self = StObject.set(x, "SharedWith", js.undefined)
    
    inline def setStatus(value: ShareStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
