package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinpointDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Pinpoint project to send email events to.
    */
  var ApplicationArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object PinpointDestination {
  
  inline def apply(): PinpointDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinpointDestination]
  }
  
  extension [Self <: PinpointDestination](x: Self) {
    
    inline def setApplicationArn(value: AmazonResourceName): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
  }
}
