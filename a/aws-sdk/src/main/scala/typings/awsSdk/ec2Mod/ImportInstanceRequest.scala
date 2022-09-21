package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceRequest extends StObject {
  
  /**
    * A description for the instance being imported.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The disk image.
    */
  var DiskImages: js.UndefOr[DiskImageList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The launch specification.
    */
  var LaunchSpecification: js.UndefOr[ImportInstanceLaunchSpecification] = js.undefined
  
  /**
    * The instance operating system.
    */
  var Platform: PlatformValues
}
object ImportInstanceRequest {
  
  inline def apply(Platform: PlatformValues): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal(Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceRequest]
  }
  
  extension [Self <: ImportInstanceRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDiskImages(value: DiskImageList): Self = StObject.set(x, "DiskImages", value.asInstanceOf[js.Any])
    
    inline def setDiskImagesUndefined: Self = StObject.set(x, "DiskImages", js.undefined)
    
    inline def setDiskImagesVarargs(value: DiskImage*): Self = StObject.set(x, "DiskImages", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setLaunchSpecification(value: ImportInstanceLaunchSpecification): Self = StObject.set(x, "LaunchSpecification", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationUndefined: Self = StObject.set(x, "LaunchSpecification", js.undefined)
    
    inline def setPlatform(value: PlatformValues): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
  }
}
