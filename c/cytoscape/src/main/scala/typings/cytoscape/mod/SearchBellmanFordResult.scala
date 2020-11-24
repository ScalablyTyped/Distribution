package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
@js.native
trait SearchBellmanFordResult extends js.Object {
  
  /**
    *  function that computes the shortest distance from root node to argument node
    * (either objects or selector string)
    *
    */
  def distanceTo(node: NodeSingular): Double = js.native
  def distanceTo(node: Selector): Double = js.native
  
  /* true/false. If true, pathTo and distanceTo will be undefined */
  var hasNegativeWeightCycle: Boolean = js.native
  
  /**
    * function that computes the shortest path from root node to the argument node
    * (either objects or selector string)
    */
  def pathTo(node: NodeSingular): CollectionReturnValue = js.native
  def pathTo(node: Selector): CollectionReturnValue = js.native
}
