package typings.cassandraDashStore.cassandraDashStoreMod

import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.cassandraDashDriver.cassandraDashDriverMod.ClientOptions
import typings.expressDashSession.expressDashSessionMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CassandraStore extends Store {
  var _client: Client = js.native
  var _clientOptions: ClientOptions = js.native
  def client(): Client = js.native
  def client(value: Client): js.Any = js.native
  def clientOptions(): ClientOptions = js.native
  def clientOptions(value: ClientOptions): js.Any = js.native
  def table(): String = js.native
  def table(value: String): js.Any = js.native
}

