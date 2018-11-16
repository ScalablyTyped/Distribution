package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ReferenceProperty")
@js.native
class ReferenceProperty protected ()
  extends cesiumLib.cesiumMod.CesiumNs.ReferenceProperty {
  def this(targetCollection: cesiumLib.cesiumMod.CesiumNs.EntityCollection, targetId: java.lang.String, targetPropertyNames: java.lang.String) = this()
}

@JSImport("cesium", "ReferenceProperty")
@js.native
object ReferenceProperty extends js.Object {
  def fromString(targetCollection: cesiumLib.cesiumMod.CesiumNs.Entity, referenceString: java.lang.String): cesiumLib.cesiumMod.CesiumNs.ReferenceProperty = js.native
}

