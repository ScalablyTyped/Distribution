package typings.d3DashSelection.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceLocalObject extends js.Object {
  /**
    * Name of the local to be namespaced.
    */
  var local: String
  /**
    * Fully qualified namespace
    */
  var space: String
}

object NamespaceLocalObject {
  @scala.inline
  def apply(local: String, space: String): NamespaceLocalObject = {
    val __obj = js.Dynamic.literal(local = local, space = space)
  
    __obj.asInstanceOf[NamespaceLocalObject]
  }
}

