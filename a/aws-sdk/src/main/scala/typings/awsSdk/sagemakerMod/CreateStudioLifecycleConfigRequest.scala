package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioLifecycleConfigRequest extends StObject {
  
  /**
    * The App type that the Lifecycle Configuration is attached to.
    */
  var StudioLifecycleConfigAppType: typings.awsSdk.sagemakerMod.StudioLifecycleConfigAppType
  
  /**
    * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
    */
  var StudioLifecycleConfigContent: typings.awsSdk.sagemakerMod.StudioLifecycleConfigContent
  
  /**
    * The name of the Studio Lifecycle Configuration to create.
    */
  var StudioLifecycleConfigName: typings.awsSdk.sagemakerMod.StudioLifecycleConfigName
  
  /**
    * Tags to be associated with the Lifecycle Configuration. Each tag consists of a key and an optional value. Tag keys must be unique per resource. Tags are searchable using the Search API. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateStudioLifecycleConfigRequest {
  
  inline def apply(
    StudioLifecycleConfigAppType: StudioLifecycleConfigAppType,
    StudioLifecycleConfigContent: StudioLifecycleConfigContent,
    StudioLifecycleConfigName: StudioLifecycleConfigName
  ): CreateStudioLifecycleConfigRequest = {
    val __obj = js.Dynamic.literal(StudioLifecycleConfigAppType = StudioLifecycleConfigAppType.asInstanceOf[js.Any], StudioLifecycleConfigContent = StudioLifecycleConfigContent.asInstanceOf[js.Any], StudioLifecycleConfigName = StudioLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStudioLifecycleConfigRequest]
  }
  
  extension [Self <: CreateStudioLifecycleConfigRequest](x: Self) {
    
    inline def setStudioLifecycleConfigAppType(value: StudioLifecycleConfigAppType): Self = StObject.set(x, "StudioLifecycleConfigAppType", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigContent(value: StudioLifecycleConfigContent): Self = StObject.set(x, "StudioLifecycleConfigContent", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigName(value: StudioLifecycleConfigName): Self = StObject.set(x, "StudioLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
