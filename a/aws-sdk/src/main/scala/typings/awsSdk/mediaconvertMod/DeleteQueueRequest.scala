package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQueueRequest extends StObject {
  
  /**
    * The name of the queue that you want to delete.
    */
  var Name: string = js.native
}
object DeleteQueueRequest {
  
  @scala.inline
  def apply(Name: string): DeleteQueueRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueueRequest]
  }
  
  @scala.inline
  implicit class DeleteQueueRequestMutableBuilder[Self <: DeleteQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
