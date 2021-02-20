package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
