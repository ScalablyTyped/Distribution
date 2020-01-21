package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  cy   --> Cy.Core
  *   The core object is your interface to a graph.
  *
  * It is your entry point to Cytoscape.js:
  * All of the library’s features are accessed through this object.
  * http://js.cytoscape.org/#core
  */
@js.native
trait Core
  extends CoreGraphManipulation
     with CoreGraphManipulationExt
     with CoreEvents
     with CoreViewportManipulation
     with CoreAnimation
     with CoreLayout
     with CoreStyle
     with CoreExport

