package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredSchemaRequest extends js.Object {
  /**
    * An array of strings where each string is a JSON event. These are the events that were used to generate the schema. The array includes a single type of event and has a maximum size of 10 events.
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

