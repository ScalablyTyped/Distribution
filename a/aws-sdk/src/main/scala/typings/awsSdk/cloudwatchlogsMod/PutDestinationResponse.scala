package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDestinationResponse extends StObject {
  
  /**
    * The destination.
    */
  var destination: js.UndefOr[Destination] = js.native
}
object PutDestinationResponse {
  
  @scala.inline
  def apply(): PutDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDestinationResponse]
  }
  
  @scala.inline
  implicit class PutDestinationResponseMutableBuilder[Self <: PutDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
