package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiEdge[T] extends VoronoiPointPair {
  
  /**
    * The Voronoi site on the left side of the edge.
    */
  var left: VoronoiSite[T] = js.native
  
  /**
    * The Voronoi site on the right side of the edge; `null` for a clipped border edge.
    */
  var right: VoronoiSite[T] | Null = js.native
}
