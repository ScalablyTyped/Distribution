package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HierarchyLink[Datum] extends js.Object {
  /**
       * The source of the link.
       */
  var source: HierarchyNode[Datum]
  /**
       * The target of the link.
       */
  var target: HierarchyNode[Datum]
}

