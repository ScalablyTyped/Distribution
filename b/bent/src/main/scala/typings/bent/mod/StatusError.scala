package typings.bent.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bent", "StatusError")
@js.native
class StatusError () extends Error {
  var headers: StringDictionary[js.Any] = js.native
  var responseBody: js.Promise[ArrayBuffer | Buffer] = js.native
  var statusCode: Double = js.native
  def arrayBuffer(): js.Promise[ArrayBuffer | Buffer] = js.native
  def json(): js.Promise[Json] = js.native
  def text(): js.Promise[String] = js.native
}

