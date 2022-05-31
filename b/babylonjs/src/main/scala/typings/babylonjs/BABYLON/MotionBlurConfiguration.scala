package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionBlurConfiguration
  extends StObject
     with PrePassEffectConfiguration
object MotionBlurConfiguration {
  
  inline def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): MotionBlurConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionBlurConfiguration]
  }
}
