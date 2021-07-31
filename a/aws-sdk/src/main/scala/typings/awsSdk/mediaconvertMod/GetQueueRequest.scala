package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueueRequest extends StObject {
  
  /**
    * The name of the queue that you want information about.
    */
  var Name: string
}
object GetQueueRequest {
  
  @scala.inline
  def apply(Name: string): GetQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueueRequest]
  }
  
  @scala.inline
  implicit class GetQueueRequestMutableBuilder[Self <: GetQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
