package typings.d3Selection.mod

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
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamespaceLocalObject]
  }
}

