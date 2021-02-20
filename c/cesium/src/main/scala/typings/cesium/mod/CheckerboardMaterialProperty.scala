package typings.cesium.mod

import typings.cesium.anon.EvenColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CheckerboardMaterialProperty")
@js.native
class CheckerboardMaterialProperty () extends MaterialProperty {
  def this(options: EvenColor) = this()
  
  var evenColor: Color = js.native
  
  var oddColor: Color = js.native
  
  var repeat: Property = js.native
}
