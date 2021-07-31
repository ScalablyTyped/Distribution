package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployedImage extends StObject {
  
  /**
    * The date and time when the image path for the model resolved to the ResolvedImage 
    */
  var ResolutionTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The specific digest path of the image hosted in this ProductionVariant.
    */
  var ResolvedImage: js.UndefOr[ContainerImage] = js.undefined
  
  /**
    * The image path you specified when you created the model.
    */
  var SpecifiedImage: js.UndefOr[ContainerImage] = js.undefined
}
object DeployedImage {
  
  @scala.inline
  def apply(): DeployedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedImage]
  }
  
  @scala.inline
  implicit class DeployedImageMutableBuilder[Self <: DeployedImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolutionTime(value: Timestamp): Self = StObject.set(x, "ResolutionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionTimeUndefined: Self = StObject.set(x, "ResolutionTime", js.undefined)
    
    @scala.inline
    def setResolvedImage(value: ContainerImage): Self = StObject.set(x, "ResolvedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedImageUndefined: Self = StObject.set(x, "ResolvedImage", js.undefined)
    
    @scala.inline
    def setSpecifiedImage(value: ContainerImage): Self = StObject.set(x, "SpecifiedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiedImageUndefined: Self = StObject.set(x, "SpecifiedImage", js.undefined)
  }
}
