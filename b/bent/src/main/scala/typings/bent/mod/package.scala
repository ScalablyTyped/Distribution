package typings.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseUrl = java.lang.String
  type BentResponse = typings.bent.mod.NodeResponse | typings.bent.mod.FetchResponse
  type FetchResponse = typings.std.Response with typings.bent.AnonStatusCode
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Json = (org.scalablytyped.runtime.StringDictionary[js.Any] with org.scalablytyped.runtime.NumberDictionary[js.Any]) | js.Array[js.Any]
  type NodeResponse = typings.node.streamMod.PassThrough with typings.bent.AnonHeaders
  type Options = typings.bent.mod.HttpMethod | typings.bent.mod.StatusCode | typings.bent.mod.Headers | typings.bent.mod.BaseUrl
  type RequestBody = java.lang.String | typings.node.streamMod.Stream | typings.node.Buffer | typings.std.ArrayBuffer | typings.bent.mod.Json
  type RequestFunction[T /* <: typings.bent.mod.ValidResponse */] = js.Function3[
    /* url */ java.lang.String, 
    /* body */ js.UndefOr[typings.bent.mod.RequestBody], 
    /* headers */ js.UndefOr[typings.bent.mod.Headers], 
    js.Promise[T]
  ]
  type StatusCode = scala.Double
  type ValidResponse = typings.bent.mod.BentResponse | java.lang.String | typings.node.Buffer | typings.std.ArrayBuffer | typings.bent.mod.Json
}
