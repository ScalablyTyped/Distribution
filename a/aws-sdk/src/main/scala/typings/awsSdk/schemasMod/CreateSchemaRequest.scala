package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSchemaRequest extends StObject {
  
  /**
    * The source of the schema definition.
    */
  var Content: stringMin1Max100000 = js.native
  
  /**
    * A description of the schema.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.native
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  
  /**
    * Tags associated with the schema.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  
  /**
    * The type of schema.
    */
  var Type: typings.awsSdk.schemasMod.Type = js.native
}
object CreateSchemaRequest {
  
  @scala.inline
  def apply(Content: stringMin1Max100000, RegistryName: string, SchemaName: string, Type: Type): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
  
  @scala.inline
  implicit class CreateSchemaRequestMutableBuilder[Self <: CreateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: stringMin1Max100000): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
