package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
     with _CollectionArgument
