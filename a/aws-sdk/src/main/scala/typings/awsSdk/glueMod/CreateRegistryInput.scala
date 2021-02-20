package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRegistryInput extends StObject {
  
  /**
    * A description of the registry. If description is not provided, there will not be any default value for this.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore, dollar sign, or hash mark. No whitespace.
    */
  var RegistryName: SchemaRegistryNameString = js.native
  
  /**
    * AWS tags that contain a key value pair and may be searched by console, command line, or API.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object CreateRegistryInput {
  
  @scala.inline
  def apply(RegistryName: SchemaRegistryNameString): CreateRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegistryInput]
  }
  
  @scala.inline
  implicit class CreateRegistryInputMutableBuilder[Self <: CreateRegistryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
