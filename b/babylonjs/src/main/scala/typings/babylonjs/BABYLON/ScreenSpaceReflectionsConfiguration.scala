package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenSpaceReflectionsConfiguration extends PrePassEffectConfiguration
object ScreenSpaceReflectionsConfiguration {
  
  @scala.inline
  def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): ScreenSpaceReflectionsConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenSpaceReflectionsConfiguration]
  }
}
