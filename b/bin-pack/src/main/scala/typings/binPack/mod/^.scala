package typings.binPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bin-pack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: Bin */](bins: js.Array[T]): PackResult[T] = js.native
  def apply[T /* <: Bin */](bins: js.Array[T], options: Options): PackResult[T] = js.native
}
