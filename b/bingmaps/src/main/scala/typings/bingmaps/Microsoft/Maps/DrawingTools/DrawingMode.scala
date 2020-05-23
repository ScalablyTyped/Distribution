package typings.bingmaps.Microsoft.Maps.DrawingTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingMode extends js.Object

@JSGlobal("Microsoft.Maps.DrawingTools.DrawingMode")
@js.native
object DrawingMode extends js.Object {
  /** Edit an existing shape. Click on a shape to edit it. */
  @js.native
  sealed trait edit extends DrawingMode
  
  /** Erase and existing shape. Click on the shapes to erase them. */
  @js.native
  sealed trait erase extends DrawingMode
  
  /** Sets the drawing manager into an idle mode. */
  @js.native
  sealed trait none extends DrawingMode
  
  /** Allow the user to draw a polygon. */
  @js.native
  sealed trait polygon extends DrawingMode
  
  /** Allow the user to draw a polyline. */
  @js.native
  sealed trait polyline extends DrawingMode
  
  /** Allow the user to draw a pushpin. */
  @js.native
  sealed trait pushpin extends DrawingMode
  
}

