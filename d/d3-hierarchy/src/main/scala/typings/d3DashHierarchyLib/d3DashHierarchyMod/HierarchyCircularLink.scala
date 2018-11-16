package typings
package d3DashHierarchyLib.d3DashHierarchyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HierarchyCircularLink[Datum] extends js.Object {
  /**
       * The source of the link.
       */
  var source: HierarchyCircularNode[Datum]
  /**
       * The target of the link.
       */
  var target: HierarchyCircularNode[Datum]
}

