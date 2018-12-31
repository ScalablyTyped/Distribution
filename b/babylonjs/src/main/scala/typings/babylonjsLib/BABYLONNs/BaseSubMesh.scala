package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for submeshes
  */
@JSGlobal("BABYLON.BaseSubMesh")
@js.native
class BaseSubMesh () extends js.Object {
  /** @hidden */
  var _materialDefines: Nullable[MaterialDefines] = js.native
  /** @hidden */
  var _materialEffect: Nullable[Effect] = js.native
  /**
    * Gets associated effect
    */
  val effect: Nullable[Effect] = js.native
  /**
    * Sets associated effect (effect used to render this submesh)
    * @param effect defines the effect to associate with
    * @param defines defines the set of defines used to compile this effect
    */
  def setEffect(effect: Nullable[Effect]): scala.Unit = js.native
  def setEffect(effect: Nullable[Effect], defines: Nullable[MaterialDefines]): scala.Unit = js.native
}

