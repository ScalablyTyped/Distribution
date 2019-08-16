package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_CollectResults
import typings.cassandraDashDriver.Anon_ParamsQuery
import typings.cassandraDashDriver.cassandraDashDriverMod.concurrentNs.ResultSetGroup
import typings.cassandraDashDriver.cassandraDashDriverMod.concurrentNs.executeConcurrentOptions
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "concurrent")
@js.native
object concurrentNs extends js.Object {
  @js.native
  class ResultSetGroup protected () extends js.Object {
    def this(options: Anon_CollectResults) = this()
    var errors: js.Array[Error] = js.native
    var resultItems: js.Array[_] = js.native
    var totalExecuted: Double = js.native
  }
  
  trait executeConcurrentOptions extends js.Object {
    var collectResults: js.UndefOr[Boolean] = js.undefined
    var concurrencyLevel: js.UndefOr[Double] = js.undefined
    var executionProfile: js.UndefOr[String] = js.undefined
    var maxErrors: js.UndefOr[Double] = js.undefined
    var raiseOnFirstError: js.UndefOr[Boolean] = js.undefined
  }
  
  def executeConcurrent(client: Client, query: String, parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(
    client: Client,
    query: String,
    parameters: js.Array[js.Array[_]],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: StringDictionary[js.Any]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(
    client: Client,
    query: String,
    parameters: StringDictionary[js.Any],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: String, parameters: Readable, options: executeConcurrentOptions): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: js.Array[Anon_ParamsQuery], parameters: js.Array[js.Array[_]]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: js.Array[js.Array[_]],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: js.Array[Anon_ParamsQuery], parameters: StringDictionary[js.Any]): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: StringDictionary[js.Any],
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(client: Client, query: js.Array[Anon_ParamsQuery], parameters: Readable): js.Promise[ResultSetGroup] = js.native
  def executeConcurrent(
    client: Client,
    query: js.Array[Anon_ParamsQuery],
    parameters: Readable,
    options: executeConcurrentOptions
  ): js.Promise[ResultSetGroup] = js.native
}

