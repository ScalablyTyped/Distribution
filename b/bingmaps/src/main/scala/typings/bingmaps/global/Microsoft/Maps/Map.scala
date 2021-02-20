package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IMapLoadOptions
import typings.bingmaps.Microsoft.Maps.IPanoramaInfo
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.Map")
@js.native
class Map protected ()
  extends typings.bingmaps.Microsoft.Maps.Map {
  /**
    * @constructor
    * @param parentElement The parent element of the map as a CSS selector string or HTMLElement.
    * @param options Options used when creating the map.
    */
  def this(parentElement: String, options: IMapLoadOptions) = this()
  def this(parentElement: HTMLElement, options: IMapLoadOptions) = this()
}
/* static members */
object Map {
  
  /**
  		* Gets the streetside panorama information closest to the specified bounding box and returns using a success callback function. 
  		* This information can then be used to set the map view to that streetside panorama.
  		*/
  @JSGlobal("Microsoft.Maps.Map.getClosestPanorama")
  @js.native
  def getClosestPanorama(
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    success: js.Function1[/* panoramaInfo */ IPanoramaInfo, Unit],
    missingCoverage: js.Function0[Unit]
  ): Unit = js.native
  
  /** Returns the branch name; release, experimental, frozen. */
  @JSGlobal("Microsoft.Maps.Map.getVersion")
  @js.native
  def getVersion(): String = js.native
}
