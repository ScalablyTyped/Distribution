package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Collisions/intersectionInfo", JSImport.Namespace)
@js.native
object intersectionInfoMod extends js.Object {
  @js.native
  class IntersectionInfo protected () extends js.Object {
    def this(bu: Nullable[Double], bv: Nullable[Double], distance: Double) = this()
    var bu: Nullable[Double] = js.native
    var bv: Nullable[Double] = js.native
    var distance: Double = js.native
    var faceId: Double = js.native
    var subMeshId: Double = js.native
  }
  
}

