package typings
package beatsLib.beatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("beats", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(bins: js.Array[beatsLib.beatsMod.beatsNs.Bin]): js.Function2[
    /* frequencies */ stdLib.Uint8Array | stdLib.Float32Array | js.Array[scala.Double], 
    /* dt */ js.UndefOr[scala.Double], 
    stdLib.Float32Array
  ] = js.native
  def apply(bins: js.Array[beatsLib.beatsMod.beatsNs.Bin], minSeparation: scala.Double): js.Function2[
    /* frequencies */ stdLib.Uint8Array | stdLib.Float32Array | js.Array[scala.Double], 
    /* dt */ js.UndefOr[scala.Double], 
    stdLib.Float32Array
  ] = js.native
}

