package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageState extends StObject {
  
  /**
    * The reason for the image's status. 
    */
  var reason: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the image. 
    */
  var status: js.UndefOr[ImageStatus] = js.native
}
object ImageState {
  
  @scala.inline
  def apply(): ImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageState]
  }
  
  @scala.inline
  implicit class ImageStateMutableBuilder[Self <: ImageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: NonEmptyString): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: ImageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
