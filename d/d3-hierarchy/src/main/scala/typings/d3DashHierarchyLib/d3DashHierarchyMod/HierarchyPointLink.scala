package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyPointLink[Datum] extends js.Object {
  /**
    * The source of the link.
    */
  var source: HierarchyPointNode[Datum]
  /**
    * The target of the link.
    */
  var target: HierarchyPointNode[Datum]
}

