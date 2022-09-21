package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Quaternion
import typings.cesium.mod.TranslationRotationScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translationRotationScaleMod {
  
  @JSImport("cesium/Source/Core/TranslationRotationScale", JSImport.Default)
  @js.native
  open class default () extends TranslationRotationScale {
    def this(translation: Cartesian3) = this()
    def this(translation: Unit, rotation: Quaternion) = this()
    def this(translation: Cartesian3, rotation: Quaternion) = this()
    def this(translation: Unit, rotation: Unit, scale: Cartesian3) = this()
    def this(translation: Unit, rotation: Quaternion, scale: Cartesian3) = this()
    def this(translation: Cartesian3, rotation: Unit, scale: Cartesian3) = this()
    def this(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3) = this()
  }
}
