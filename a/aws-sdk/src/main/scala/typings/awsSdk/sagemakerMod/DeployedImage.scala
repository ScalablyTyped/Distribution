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
  
  inline def apply(): DeployedImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeployedImage]
  }
  
  extension [Self <: DeployedImage](x: Self) {
    
    inline def setResolutionTime(value: Timestamp): Self = StObject.set(x, "ResolutionTime", value.asInstanceOf[js.Any])
    
    inline def setResolutionTimeUndefined: Self = StObject.set(x, "ResolutionTime", js.undefined)
    
    inline def setResolvedImage(value: ContainerImage): Self = StObject.set(x, "ResolvedImage", value.asInstanceOf[js.Any])
    
    inline def setResolvedImageUndefined: Self = StObject.set(x, "ResolvedImage", js.undefined)
    
    inline def setSpecifiedImage(value: ContainerImage): Self = StObject.set(x, "SpecifiedImage", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedImageUndefined: Self = StObject.set(x, "SpecifiedImage", js.undefined)
  }
}
