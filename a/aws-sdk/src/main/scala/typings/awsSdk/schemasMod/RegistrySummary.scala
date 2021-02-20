package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrySummary extends StObject {
  
  /**
    * The ARN of the registry.
    */
  var RegistryArn: js.UndefOr[string] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  
  /**
    * Tags associated with the registry.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
}
object RegistrySummary {
  
  @scala.inline
  def apply(): RegistrySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrySummary]
  }
  
  @scala.inline
  implicit class RegistrySummaryMutableBuilder[Self <: RegistrySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryArn(value: string): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
