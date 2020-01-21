package typings.cytoscape.mod

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
  extends CollectionIteration[EdgeSingular, EdgeSingular]
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
     with CollectionBuildingFiltering[EdgeSingular, EdgeSingular]
     with CollectionAlgorithms
     with EdgeCollectionTraversing
     with _CollectionArgument

