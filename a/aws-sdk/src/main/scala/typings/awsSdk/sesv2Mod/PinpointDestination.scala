package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinpointDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Pinpoint project that you want to send email events to.
    */
  var ApplicationArn: js.UndefOr[AmazonResourceName] = js.native
}
object PinpointDestination {
  
  @scala.inline
  def apply(): PinpointDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinpointDestination]
  }
  
  @scala.inline
  implicit class PinpointDestinationMutableBuilder[Self <: PinpointDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationArn(value: AmazonResourceName): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
  }
}
