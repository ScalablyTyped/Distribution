package typings.base64Async.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("base64-async", "encode")
@js.native
object encode extends js.Object {
  
  def apply(input: Buffer): js.Promise[String] = js.native
  def apply(input: Buffer, options: Options): js.Promise[String] = js.native
}
