package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignCustomMessage extends StObject {
  
  /**
    * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
    */
  var Data: js.UndefOr[string] = js.native
}
object CampaignCustomMessage {
  
  @scala.inline
  def apply(): CampaignCustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCustomMessage]
  }
  
  @scala.inline
  implicit class CampaignCustomMessageMutableBuilder[Self <: CampaignCustomMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
