package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyCustomMessage extends StObject {
  
  /**
    * The message content that's passed to an AWS Lambda function or to a web hook.
    */
  var Data: js.UndefOr[string] = js.native
}
object JourneyCustomMessage {
  
  @scala.inline
  def apply(): JourneyCustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyCustomMessage]
  }
  
  @scala.inline
  implicit class JourneyCustomMessageMutableBuilder[Self <: JourneyCustomMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
