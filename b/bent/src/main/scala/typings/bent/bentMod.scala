package typings.bent

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.bent.bentMod.BentResponse
import typings.bent.bentMod.FetchResponse
import typings.bent.bentMod.Headers
import typings.bent.bentMod.HttpMethod
import typings.bent.bentMod.Json
import typings.bent.bentMod.NodeResponse
import typings.bent.bentMod.Options
import typings.bent.bentMod.RequestBody
import typings.bent.bentMod.RequestFunction
import typings.bent.bentMod.ValidResponse
import typings.bent.bentStrings.buffer
import typings.bent.bentStrings.json
import typings.bent.bentStrings.string
import typings.node.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bent", JSImport.Namespace)
@js.native
object bentMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.bent.bentStrings.GET
    - typings.bent.bentStrings.POST
    - typings.bent.bentStrings.DELETE
    - typings.bent.bentStrings.PUT
    - typings.bent.bentStrings.PATCH
    - typings.bent.bentStrings.HEAD
    - typings.bent.bentStrings.OPTIONS
    - typings.bent.bentStrings.CONNECT
    - typings.bent.bentStrings.TRACE
  */
  trait HttpMethod extends js.Object
  
  def apply(args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = js.native
  def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | ArrayBuffer] = js.native
  def apply(baseUrl: String, `type`: json, args: Options*): RequestFunction[Json] = js.native
  // Method or url first
  def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = js.native
  def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | ArrayBuffer] = js.native
  def apply(`type`: json, args: Options*): RequestFunction[Json] = js.native
  // Type first
  def apply(`type`: string, args: Options*): RequestFunction[String] = js.native
  type BentResponse = NodeResponse | FetchResponse
  type FetchResponse = Response with Anon_StatusCode
  type Headers = StringDictionary[js.Any]
  type Json = (StringDictionary[js.Any] with NumberDictionary[js.Any]) | js.Array[js.Any]
  type NodeResponse = PassThrough with Anon_Headers
  type Options = HttpMethod | StatusCode | Headers | BaseUrl
  type RequestBody = String | Stream | Buffer | ArrayBuffer | Json
  type RequestFunction[T /* <: ValidResponse */] = js.Function2[/* url */ String, /* body */ js.UndefOr[RequestBody], js.Promise[T]]
  type ValidResponse = BentResponse | String | Buffer | ArrayBuffer | Json
}

