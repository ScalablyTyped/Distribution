package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelMesh extends js.Object {
  var id: java.lang.String
  var materials: js.Array[ModelMaterial]
  var name: java.lang.String
}

object ModelMesh {
  @scala.inline
  def apply(id: java.lang.String, materials: js.Array[ModelMaterial], name: java.lang.String): ModelMesh = {
    val __obj = js.Dynamic.literal(id = id, materials = materials, name = name)
  
    __obj.asInstanceOf[ModelMesh]
  }
}

