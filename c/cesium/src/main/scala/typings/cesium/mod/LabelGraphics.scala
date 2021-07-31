package typings.cesium.mod

import typings.cesium.anon.BackgroundColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "LabelGraphics")
@js.native
class LabelGraphics () extends StObject {
  def this(options: BackgroundColor) = this()
  
  var backgroundColor: Property = js.native
  
  def clone(result: LabelGraphics): LabelGraphics = js.native
  
  var definitionChanged: Event[js.Array[js.Any]] = js.native
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  var eyeOffset: Property = js.native
  
  var fillColor: Color = js.native
  
  var font: String = js.native
  
  var horizontalOrigin: Property = js.native
  
  def merge(source: LabelGraphics): LabelGraphics = js.native
  
  var outlineColor: Color = js.native
  
  var outlineWidth: Double = js.native
  
  var pixelOffset: Property = js.native
  
  var pixelOffsetScaleByDistance: Property = js.native
  
  var scale: Property = js.native
  
  var show: Property = js.native
  
  var showBackground: js.UndefOr[Property] = js.native
  
  var style: Property = js.native
  
  var text: Property = js.native
  
  var translucencyByDistance: Property = js.native
  
  var verticalOrigin: Property = js.native
}
