package typings.cassandraStore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CassandraStore extends Store {
  
  var _client: Client = js.native
  
  var _clientOptions: ClientOptions = js.native
  
  @JSName("all")
  def all_MCassandraStore(
    callback: js.Function2[
      /* err */ js.Any, 
      /* obj */ js.UndefOr[js.Array[SessionData] | StringDictionary[SessionData] | Null], 
      Unit
    ]
  ): Unit = js.native
  
  @JSName("clear")
  def clear_MCassandraStore(): Unit = js.native
  @JSName("clear")
  def clear_MCassandraStore(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  def client: Client = js.native
  
  def clientOptions: ClientOptions = js.native
  def clientOptions_=(value: ClientOptions): Unit = js.native
  
  def client_=(value: Client): Unit = js.native
  
  @JSName("length")
  def length_MCassandraStore(callback: js.Function2[/* err */ js.Any, /* length */ Double, Unit]): Unit = js.native
  
  def table: String = js.native
  def table_=(value: String): Unit = js.native
  
  @JSName("touch")
  def touch_MCassandraStore(sid: String, session: SessionData): Unit = js.native
  @JSName("touch")
  def touch_MCassandraStore(sid: String, session: SessionData, callback: js.Function0[Unit]): Unit = js.native
}
