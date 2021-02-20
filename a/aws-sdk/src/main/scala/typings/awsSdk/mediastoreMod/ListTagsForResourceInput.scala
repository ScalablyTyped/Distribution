package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the container.
    */
  var Resource: ContainerARN = js.native
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(Resource: ContainerARN): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: ContainerARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
