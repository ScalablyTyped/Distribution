package typings.bingmaps.Microsoft.Maps.SpatialMath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////
/// Geometry Calculations
//////////////////////////////////////////////
/**
* A colleciton of geometry calculations that can be performed against Bing Maps shapes.
* @requires The Microsoft.Maps.SpatialMath module.
*/
@JSGlobal("Microsoft.Maps.SpatialMath.Geometry")
@js.native
object Geometry extends js.Object {
  @js.native
  sealed trait BufferEndCap extends js.Object
  
  @js.native
  object BufferEndCap extends js.Object {
    /** Adds a flat end to a buffered line that touches the end of the line. */
    @js.native
    sealed trait Flat extends BufferEndCap
    
    /** Adds a rounded end to a buffered line. */
    @js.native
    sealed trait Round extends BufferEndCap
    
    /** Adds a square end to a buffered line that has a buffer area at the end of the line. */
    @js.native
    sealed trait Square extends BufferEndCap
    
  }
  
}

