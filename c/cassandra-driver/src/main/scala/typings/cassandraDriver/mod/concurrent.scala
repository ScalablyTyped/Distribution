package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Params
import typings.cassandraDriver.concurrentMod.concurrent.Options
import typings.cassandraDriver.concurrentMod.concurrent.ResultSetGroup
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrent {
  
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, queries: js.Array[Params]): js.Promise[ResultSetGroup] = js.native
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, queries: js.Array[Params], options: Options): js.Promise[ResultSetGroup] = js.native
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]], options: Options): js.Promise[ResultSetGroup] = js.native
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  @JSImport("cassandra-driver", "concurrent.executeConcurrent")
  @js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = js.native
}
