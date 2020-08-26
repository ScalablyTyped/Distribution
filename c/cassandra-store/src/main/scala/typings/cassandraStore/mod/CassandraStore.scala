package typings.cassandraStore.mod

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import typings.expressSession.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CassandraStore extends Store {
  var _client: Client = js.native
  var _clientOptions: ClientOptions = js.native
  def client: Client = js.native
  def clientOptions: ClientOptions = js.native
  def clientOptions_=(value: ClientOptions): Unit = js.native
  def client_=(value: Client): Unit = js.native
  def table: String = js.native
  def table_=(value: String): Unit = js.native
}

