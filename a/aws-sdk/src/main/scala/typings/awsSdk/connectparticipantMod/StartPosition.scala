package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPosition extends StObject {
  
  /**
    * The time in ISO format where to start. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.undefined
  
  /**
    * The ID of the message or event where to start. 
    */
  var Id: js.UndefOr[ChatItemId] = js.undefined
  
  /**
    * The start position of the most recent message where you want to start. 
    */
  var MostRecent: js.UndefOr[typings.awsSdk.connectparticipantMod.MostRecent] = js.undefined
}
object StartPosition {
  
  inline def apply(): StartPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPosition]
  }
  
  extension [Self <: StartPosition](x: Self) {
    
    inline def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    inline def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMostRecent(value: MostRecent): Self = StObject.set(x, "MostRecent", value.asInstanceOf[js.Any])
    
    inline def setMostRecentUndefined: Self = StObject.set(x, "MostRecent", js.undefined)
  }
}
