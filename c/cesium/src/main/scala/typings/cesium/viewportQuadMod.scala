package typings.cesium

import typings.cesium.mod.BoundingRectangle
import typings.cesium.mod.Material
import typings.cesium.mod.ViewportQuad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportQuadMod {
  
  @JSImport("cesium/Source/Scene/ViewportQuad", JSImport.Default)
  @js.native
  open class default () extends ViewportQuad {
    def this(rectangle: BoundingRectangle) = this()
    def this(rectangle: Unit, material: Material) = this()
    def this(rectangle: BoundingRectangle, material: Material) = this()
  }
}
