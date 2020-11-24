package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ele  --> Cy.Singular
  * a collection of a single element (node or edge)
  * NB: every singular collection is a general collection too (but not vice versa)!
  */
@js.native
trait Singular[TOut, TIn]
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
     with SingularGraphManipulation
     with SingularData
     with SingularPosition
     with SingularSelection
     with SingularStyle
     with SingularAnimation
