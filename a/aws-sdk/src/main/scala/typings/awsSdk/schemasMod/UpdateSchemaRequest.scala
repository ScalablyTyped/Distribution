package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaRequest extends StObject {
  
  /**
    * The ID of the client token.
    */
  var ClientTokenId: js.UndefOr[stringMin0Max36] = js.native
  
  /**
    * The source of the schema definition.
    */
  var Content: js.UndefOr[stringMin1Max100000] = js.native
  
  /**
    * The description of the schema.
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
    * The schema type for the events schema.
    */
  var Type: js.UndefOr[typings.awsSdk.schemasMod.Type] = js.native
}
object UpdateSchemaRequest {
  
  @scala.inline
  def apply(RegistryName: string, SchemaName: string): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  
  @scala.inline
  implicit class UpdateSchemaRequestMutableBuilder[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientTokenId(value: stringMin0Max36): Self = StObject.set(x, "ClientTokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenIdUndefined: Self = StObject.set(x, "ClientTokenId", js.undefined)
    
    @scala.inline
    def setContent(value: stringMin1Max100000): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: string): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
