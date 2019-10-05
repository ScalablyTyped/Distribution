package typings.cassandraDashDriver.cassandraDashDriverMod.tracker

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Params
import typings.cassandraDashDriver.cassandraDashDriverMod.ExecutionOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTracker extends js.Object {
  def onError(
    host: Host,
    query: String,
    parameters: js.Array[_],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onError(
    host: Host,
    query: String,
    parameters: StringDictionary[js.Any],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onError(
    host: Host,
    query: String,
    parameters: Null,
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onError(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: js.Array[_],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onError(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: StringDictionary[js.Any],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onError(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: Null,
    executionOptions: ExecutionOptions,
    requestLength: Double,
    err: Error,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: String,
    parameters: js.Array[_],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: String,
    parameters: StringDictionary[js.Any],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: String,
    parameters: Null,
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: js.Array[_],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: StringDictionary[js.Any],
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def onSuccess(
    host: Host,
    query: js.Array[Anon_Params],
    parameters: Null,
    executionOptions: ExecutionOptions,
    requestLength: Double,
    responseLength: Double,
    latency: js.Array[Double]
  ): Unit = js.native
  def shutdown(): Unit = js.native
}

