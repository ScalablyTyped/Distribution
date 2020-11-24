package typings.beats.mod

import typings.std.Float32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("beats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ] = js.native
  def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ Uint8Array | Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    Float32Array
  ] = js.native
}
