package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenSpaceReflectionsConfiguration
  extends StObject
     with PrePassEffectConfiguration
object ScreenSpaceReflectionsConfiguration {
  
  inline def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): ScreenSpaceReflectionsConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenSpaceReflectionsConfiguration]
  }
}
