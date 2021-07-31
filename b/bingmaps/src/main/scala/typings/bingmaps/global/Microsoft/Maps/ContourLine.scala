package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPrimitiveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.ContourLine")
@js.native
class ContourLine protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.ContourLine {
  /**
    * @constructor
    * @param boundary The boundary of this contour line
    * @param contourValue The value associated with this contour line
    */
  def this(boundary: js.Array[typings.bingmaps.Microsoft.Maps.Location]) = this()
  def this(boundary: js.Array[typings.bingmaps.Microsoft.Maps.Location], contourValue: String) = this()
  def this(boundary: js.Array[typings.bingmaps.Microsoft.Maps.Location], contourValue: Double) = this()
  
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  /* CompleteClass */
  override def getCursor(): String = js.native
  
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): Unit = js.native
}
