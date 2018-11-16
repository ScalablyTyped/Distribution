package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#eles.bellmanFord
     */
@js.native
trait SearchBellmanFordResult extends js.Object {
  /* true/false. If true, pathTo and distanceTo will be undefined */
  var hasNegativeWeightCycle: scala.Boolean = js.native
  /**
           *  function that computes the shortest distance from root node to argument node
           * (either objects or selector string)
           *
           */
  def distanceTo(node: NodeSingular): scala.Double = js.native
  /**
           *  function that computes the shortest distance from root node to argument node
           * (either objects or selector string)
           *
           */
  def distanceTo(node: Selector): scala.Double = js.native
  /**
           * function that computes the shortest path from root node to the argument node
           * (either objects or selector string)
           */
  def pathTo(node: NodeSingular): CollectionReturnValue = js.native
  /**
           * function that computes the shortest path from root node to the argument node
           * (either objects or selector string)
           */
  def pathTo(node: Selector): CollectionReturnValue = js.native
}

