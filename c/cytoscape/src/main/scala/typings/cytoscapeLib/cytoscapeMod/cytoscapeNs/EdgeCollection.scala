package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * edges -> Cy.EdgeCollection
     *  a collection of one or more edges
     *
     * The output is a collection of edge elements OR single edge.
     */
@js.native
trait EdgeCollection
  extends Collection[EdgeSingular, EdgeSingular]
     with EdgeCollectionTraversing

