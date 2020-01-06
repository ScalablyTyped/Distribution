package typings.cassandraDashStore.cassandraDashStoreMod

import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.cassandraDashDriver.cassandraDashDriverMod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CassandraStoreOptions extends js.Object {
  var client: js.UndefOr[Client | Null] = js.undefined
  var clientOptions: ClientOptions
  var table: String
}

object CassandraStoreOptions {
  @scala.inline
  def apply(clientOptions: ClientOptions, table: String, client: Client = null): CassandraStoreOptions = {
    val __obj = js.Dynamic.literal(clientOptions = clientOptions.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[CassandraStoreOptions]
  }
}

