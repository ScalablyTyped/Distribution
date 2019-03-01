package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  nodes -> Cy.NodeCollection
  *  a collection of one or more nodes
  *
  * The output is a collection of node elements OR single node.
  */
@js.native
trait NodeCollection
  extends Collection[NodeSingular, NodeSingular]
     with NodeCollectionMetadata
     with NodeCollectionPosition
     with NodeCollectionTraversing
     with NodeCollectionCompound
     with _CollectionArgument

