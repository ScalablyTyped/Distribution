package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyCircularNode[Datum] extends HierarchyNode[Datum] {
  
  /**
    * The radius of the circle.
    */
  var r: Double = js.native
  
  /**
    * The x-coordinate of the circle’s center.
    */
  var x: Double = js.native
  
  /**
    * The y-coordinate of the circle’s center.
    */
  var y: Double = js.native
}
