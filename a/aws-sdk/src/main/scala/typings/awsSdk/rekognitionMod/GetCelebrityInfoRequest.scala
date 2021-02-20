package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCelebrityInfoRequest extends StObject {
  
  /**
    * The ID for the celebrity. You get the celebrity ID from a call to the RecognizeCelebrities operation, which recognizes celebrities in an image. 
    */
  var Id: RekognitionUniqueId = js.native
}
object GetCelebrityInfoRequest {
  
  @scala.inline
  def apply(Id: RekognitionUniqueId): GetCelebrityInfoRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCelebrityInfoRequest]
  }
  
  @scala.inline
  implicit class GetCelebrityInfoRequestMutableBuilder[Self <: GetCelebrityInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: RekognitionUniqueId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
