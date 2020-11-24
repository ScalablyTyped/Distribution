package typings.brorand.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrorandStatic extends js.Object {
  
  def apply(len: Double): Buffer | Uint8Array = js.native
  
  var Rand: RandStatic = js.native
}
