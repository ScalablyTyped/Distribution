package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the container.
    */
  var Resource: ContainerARN
}
object ListTagsForResourceInput {
  
  inline def apply(Resource: ContainerARN): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  extension [Self <: ListTagsForResourceInput](x: Self) {
    
    inline def setResource(value: ContainerARN): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
