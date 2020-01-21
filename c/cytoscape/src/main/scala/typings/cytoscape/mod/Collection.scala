package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * eles --> Cy.Collection
  *  a collection of one or more elements (nodes and edges)
  *
  * The input can be any element (node and edge) collection.
  * http://js.cytoscape.org/#collection
  */
@js.native
trait Collection[TOut, TIn]
  extends CollectionIteration[TIn, TOut]
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
     with CollectionBuildingFiltering[TIn, TOut]
     with CollectionAlgorithms

