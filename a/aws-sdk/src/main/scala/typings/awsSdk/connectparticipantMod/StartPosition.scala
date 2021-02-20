package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPosition extends StObject {
  
  /**
    * The time in ISO format where to start. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  
  /**
    * The ID of the message or event where to start. 
    */
  var Id: js.UndefOr[ChatItemId] = js.native
  
  /**
    * The start position of the most recent message where you want to start. 
    */
  var MostRecent: js.UndefOr[typings.awsSdk.connectparticipantMod.MostRecent] = js.native
}
object StartPosition {
  
  @scala.inline
  def apply(): StartPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPosition]
  }
  
  @scala.inline
  implicit class StartPositionMutableBuilder[Self <: StartPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    @scala.inline
    def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMostRecent(value: MostRecent): Self = StObject.set(x, "MostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMostRecentUndefined: Self = StObject.set(x, "MostRecent", js.undefined)
  }
}
