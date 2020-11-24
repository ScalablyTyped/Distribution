package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSAO2Configuration extends PrePassEffectConfiguration
object SSAO2Configuration {
  
  @scala.inline
  def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): SSAO2Configuration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSAO2Configuration]
  }
}
