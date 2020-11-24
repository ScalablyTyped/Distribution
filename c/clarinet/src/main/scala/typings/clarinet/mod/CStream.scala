package typings.clarinet.mod

import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("clarinet", "CStream")
@js.native
class CStream () extends Stream {
  def this(opt: Options) = this()
  
  var _parser: CParser = js.native
  
  def destroy(): Unit = js.native
  
  def end(chunk: String): Unit = js.native
}
