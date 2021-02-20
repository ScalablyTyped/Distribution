package typings.cesium.mod

import typings.cesium.anon.OddColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "StripeMaterialProperty")
@js.native
class StripeMaterialProperty () extends MaterialProperty {
  def this(options: OddColor) = this()
  
  var evenColor: Color = js.native
  
  var oddColor: Color = js.native
  
  var offset: Property = js.native
  
  var orientation: Property = js.native
  
  var repeat: Double = js.native
}
