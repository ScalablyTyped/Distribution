package typings.cesium.mod

import typings.cesium.anon.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WallGraphics")
@js.native
class WallGraphics () extends StObject {
  def this(options: Show) = this()
  
  def clone(result: WallGraphics): WallGraphics = js.native
  
  val definitionChanged: Event[js.Array[js.Any]] = js.native
  
  var fill: Property = js.native
  
  var granularity: Property = js.native
  
  var material: MaterialProperty = js.native
  
  var maximumHeights: Property = js.native
  
  def merge(source: WallGraphics): WallGraphics = js.native
  
  var minimumHeights: Property = js.native
  
  var outline: Property = js.native
  
  var outlineColor: Property = js.native
  
  var outlineWidth: Property = js.native
  
  var positions: Property = js.native
  
  var show: Property = js.native
}
