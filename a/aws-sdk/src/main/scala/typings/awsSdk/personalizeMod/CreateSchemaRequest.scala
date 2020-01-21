package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaRequest extends js.Object {
  /**
    * The name for the schema.
    */
  var name: Name = js.native
  /**
    * A schema in Avro JSON format.
    */
  var schema: AvroSchema = js.native
}

object CreateSchemaRequest {
  @scala.inline
  def apply(name: Name, schema: AvroSchema): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateSchemaRequest]
  }
}

