package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFailure extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination resource.
    */
  var Destination: js.UndefOr[DestinationArn] = js.undefined
}
object OnFailure {
  
  @scala.inline
  def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  
  @scala.inline
  implicit class OnFailureMutableBuilder[Self <: OnFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: DestinationArn): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
  }
}
