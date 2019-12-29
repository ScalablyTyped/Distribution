package typings.datastoreDashCore.datastoreDashCoreMod

import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Datastore
import typings.interfaceDashDatastore.interfaceDashDatastoreMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mount[Value] extends js.Object {
  /**
    * The child datastore.
    */
  var datastore: Datastore[Value]
  /**
    * The mount prefix.
    */
  var prefix: Key
}

object Mount {
  @scala.inline
  def apply[Value](datastore: Datastore[Value], prefix: Key): Mount[Value] = {
    val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mount[Value]]
  }
}

