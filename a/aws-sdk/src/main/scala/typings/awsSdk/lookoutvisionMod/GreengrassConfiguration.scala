package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreengrassConfiguration extends StObject {
  
  /**
    * Additional compiler options for the Greengrass component. Currently, only NVIDIA Graphics Processing Units (GPU) and CPU accelerators are supported. If you specify TargetDevice, don't specify CompilerOptions. For more information, see Compiler options in the Amazon Lookout for Vision Developer Guide. 
    */
  var CompilerOptions: js.UndefOr[typings.awsSdk.lookoutvisionMod.CompilerOptions] = js.undefined
  
  /**
    *  A description for the AWS IoT Greengrass component. 
    */
  var ComponentDescription: js.UndefOr[typings.awsSdk.lookoutvisionMod.ComponentDescription] = js.undefined
  
  /**
    *  A name for the AWS IoT Greengrass component. 
    */
  var ComponentName: typings.awsSdk.lookoutvisionMod.ComponentName
  
  /**
    * A Version for the AWS IoT Greengrass component. If you don't provide a value, a default value of  Model Version.0.0 is used. 
    */
  var ComponentVersion: js.UndefOr[typings.awsSdk.lookoutvisionMod.ComponentVersion] = js.undefined
  
  /**
    *  An S3 location in which Lookout for Vision stores the component artifacts. 
    */
  var S3OutputLocation: S3Location
  
  /**
    *  A set of tags (key-value pairs) that you want to attach to the AWS IoT Greengrass component. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The target device for the model. Currently the only supported value is jetson_xavier. If you specify TargetDevice, you can't specify TargetPlatform. 
    */
  var TargetDevice: js.UndefOr[typings.awsSdk.lookoutvisionMod.TargetDevice] = js.undefined
  
  /**
    * The target platform for the model. If you specify TargetPlatform, you can't specify TargetDevice. 
    */
  var TargetPlatform: js.UndefOr[typings.awsSdk.lookoutvisionMod.TargetPlatform] = js.undefined
}
object GreengrassConfiguration {
  
  inline def apply(ComponentName: ComponentName, S3OutputLocation: S3Location): GreengrassConfiguration = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], S3OutputLocation = S3OutputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreengrassConfiguration]
  }
  
  extension [Self <: GreengrassConfiguration](x: Self) {
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "CompilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "CompilerOptions", js.undefined)
    
    inline def setComponentDescription(value: ComponentDescription): Self = StObject.set(x, "ComponentDescription", value.asInstanceOf[js.Any])
    
    inline def setComponentDescriptionUndefined: Self = StObject.set(x, "ComponentDescription", js.undefined)
    
    inline def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    inline def setComponentVersion(value: ComponentVersion): Self = StObject.set(x, "ComponentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "ComponentVersion", js.undefined)
    
    inline def setS3OutputLocation(value: S3Location): Self = StObject.set(x, "S3OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetDevice(value: TargetDevice): Self = StObject.set(x, "TargetDevice", value.asInstanceOf[js.Any])
    
    inline def setTargetDeviceUndefined: Self = StObject.set(x, "TargetDevice", js.undefined)
    
    inline def setTargetPlatform(value: TargetPlatform): Self = StObject.set(x, "TargetPlatform", value.asInstanceOf[js.Any])
    
    inline def setTargetPlatformUndefined: Self = StObject.set(x, "TargetPlatform", js.undefined)
  }
}
