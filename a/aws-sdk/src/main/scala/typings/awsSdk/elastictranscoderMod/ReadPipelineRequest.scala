package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPipelineRequest extends StObject {
  
  /**
    * The identifier of the pipeline to read.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id = js.native
}
object ReadPipelineRequest {
  
  @scala.inline
  def apply(Id: Id): ReadPipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPipelineRequest]
  }
  
  @scala.inline
  implicit class ReadPipelineRequestMutableBuilder[Self <: ReadPipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
