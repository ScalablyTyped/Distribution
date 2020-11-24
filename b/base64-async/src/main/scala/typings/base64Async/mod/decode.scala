package typings.base64Async.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64-async", "decode")
@js.native
object decode extends js.Object {
  
  def apply(input: String): js.Promise[Buffer] = js.native
  def apply(input: String, options: Options): js.Promise[Buffer] = js.native
}
