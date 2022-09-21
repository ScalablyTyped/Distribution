package typings.cassandraDriver.mod

import typings.cassandraDriver.anon.Params
import typings.cassandraDriver.concurrentMod.concurrent.Options
import typings.cassandraDriver.concurrentMod.concurrent.ResultSetGroup
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concurrent {
  
  @JSImport("cassandra-driver", "concurrent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeConcurrent(client: Client, queries: js.Array[Params]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, queries: js.Array[Params], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], queries.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]]): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[Any]], options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
  inline def executeConcurrent(client: Client, query: String, parameters: Readable, options: Options): js.Promise[ResultSetGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeConcurrent")(client.asInstanceOf[js.Any], query.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultSetGroup]]
}
