package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegistryResponse extends StObject {
  
  /**
    * The description of the registry.
    */
  var Description: js.UndefOr[string] = js.native
  
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
object DescribeRegistryResponse {
  
  @scala.inline
  def apply(): DescribeRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegistryResponse]
  }
  
  @scala.inline
  implicit class DescribeRegistryResponseMutableBuilder[Self <: DescribeRegistryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
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
