package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredSchemaRequest extends js.Object {
  /**
    * An array of strings that
    */
  var Events: listOfGetDiscoveredSchemaVersionItemInput = js.native
  /**
    * The type of event.
    */
  var Type: typings.awsSdk.schemasMod.Type = js.native
}

object GetDiscoveredSchemaRequest {
  @scala.inline
  def apply(Events: listOfGetDiscoveredSchemaVersionItemInput, Type: Type): GetDiscoveredSchemaRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDiscoveredSchemaRequest]
  }
}

