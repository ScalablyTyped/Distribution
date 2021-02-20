package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckSchemaVersionValidityInput extends StObject {
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: typings.awsSdk.glueMod.DataFormat = js.native
  
  /**
    * The definition of the schema that has to be validated.
    */
  var SchemaDefinition: SchemaDefinitionString = js.native
}
object CheckSchemaVersionValidityInput {
  
  @scala.inline
  def apply(DataFormat: DataFormat, SchemaDefinition: SchemaDefinitionString): CheckSchemaVersionValidityInput = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckSchemaVersionValidityInput]
  }
  
  @scala.inline
  implicit class CheckSchemaVersionValidityInputMutableBuilder[Self <: CheckSchemaVersionValidityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFormat(value: DataFormat): Self = StObject.set(x, "DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDefinition(value: SchemaDefinitionString): Self = StObject.set(x, "SchemaDefinition", value.asInstanceOf[js.Any])
  }
}
