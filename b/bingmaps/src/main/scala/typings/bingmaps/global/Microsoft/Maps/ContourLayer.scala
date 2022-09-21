package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IContourLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.ContourLayer")
@js.native
open class ContourLayer protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.ContourLayer {
  /**
    * @constructor
    * @param contourLines The contour lines that compose this layer.
    * @param options The contour layer options.
    */
  def this(contourLines: js.Array[typings.bingmaps.Microsoft.Maps.ContourLine]) = this()
  def this(contourLines: js.Array[typings.bingmaps.Microsoft.Maps.ContourLine], options: IContourLayerOptions) = this()
  
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
}
