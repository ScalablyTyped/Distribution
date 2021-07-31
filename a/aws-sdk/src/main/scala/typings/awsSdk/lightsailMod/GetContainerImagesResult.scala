package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerImagesResult extends StObject {
  
  /**
    * An array of objects that describe container images that are registered to the container service.
    */
  var containerImages: js.UndefOr[ContainerImageList] = js.undefined
}
object GetContainerImagesResult {
  
  @scala.inline
  def apply(): GetContainerImagesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerImagesResult]
  }
  
  @scala.inline
  implicit class GetContainerImagesResultMutableBuilder[Self <: GetContainerImagesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerImages(value: ContainerImageList): Self = StObject.set(x, "containerImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImagesUndefined: Self = StObject.set(x, "containerImages", js.undefined)
    
    @scala.inline
    def setContainerImagesVarargs(value: ContainerImage*): Self = StObject.set(x, "containerImages", js.Array(value :_*))
  }
}
