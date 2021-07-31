package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ele  --> Cy.Singular
  * a collection of a single element (node or edge)
  * NB: every singular collection is a general collection too (but not vice versa)!
  */
@js.native
trait Singular[TOut, TIn]
  extends StObject
     with Collection[TOut, TIn]
     with SingularGraphManipulation
     with SingularData
     with SingularPosition
     with SingularSelection
     with SingularStyle
     with SingularAnimation
