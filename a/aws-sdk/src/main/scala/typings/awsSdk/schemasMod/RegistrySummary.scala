package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrySummary extends StObject {
  
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.undefined
  
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.undefined
}
object RegistrySummary {
  
  inline def apply(): RegistrySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrySummary]
  }
  
  extension [Self <: RegistrySummary](x: Self) {
    
    inline def setRegistryArn(value: string): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
