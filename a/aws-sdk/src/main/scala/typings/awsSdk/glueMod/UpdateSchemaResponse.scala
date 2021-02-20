package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaResponse extends StObject {
  
  /**
    * The name of the registry that contains the schema.
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var SchemaArn: js.UndefOr[GlueResourceArn] = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[SchemaRegistryNameString] = js.native
}
object UpdateSchemaResponse {
  
  @scala.inline
  def apply(): UpdateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSchemaResponse]
  }
  
  @scala.inline
  implicit class UpdateSchemaResponseMutableBuilder[Self <: UpdateSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
    
    @scala.inline
    def setSchemaArn(value: GlueResourceArn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
    
    @scala.inline
    def setSchemaName(value: SchemaRegistryNameString): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
  }
}
