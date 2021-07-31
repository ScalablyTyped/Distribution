package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaInput extends StObject {
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.   SchemaId$SchemaName: The name of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId
}
object GetSchemaInput {
  
  @scala.inline
  def apply(SchemaId: SchemaId): GetSchemaInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaInput]
  }
  
  @scala.inline
  implicit class GetSchemaInputMutableBuilder[Self <: GetSchemaInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = StObject.set(x, "SchemaId", value.asInstanceOf[js.Any])
  }
}
