package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CullingVolume")
@js.native
class CullingVolume protected () extends js.Object {
  def this(planes: js.Array[Cartesian4]) = this()
  
  def computeVisibility(boundingVolume: js.Any): Intersect = js.native
  
  var planes: js.Array[Cartesian4] = js.native
}
