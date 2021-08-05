package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaRequest extends StObject {
  
  /**
    * The name for the schema.
    */
  var name: Name
  
  /**
    * A schema in Avro JSON format.
    */
  var schema: AvroSchema
}
object CreateSchemaRequest {
  
  inline def apply(name: Name, schema: AvroSchema): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
  
  extension [Self <: CreateSchemaRequest](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: AvroSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
