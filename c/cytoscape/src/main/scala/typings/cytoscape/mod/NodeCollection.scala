package typings.cytoscape.mod

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
  extends CollectionIteration[NodeSingular, NodeSingular]
     with CollectionGraphManipulation
     with CollectionEvents
     with CollectionData
     with CollectionPosition
     with CollectionTraversing
     with CollectionLayout
     with CollectionSelection
     with CollectionStyle
     with CollectionAnimation
     with CollectionComparision
     with CollectionBuildingFiltering[NodeSingular, NodeSingular]
     with CollectionAlgorithms
     with NodeCollectionMetadata
     with NodeCollectionPosition
     with NodeCollectionTraversing
     with NodeCollectionCompound
     with _CollectionArgument

