package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIOptionShadowDepthMaterial extends StObject {
  
  /** Variables in the vertex shader code that need to have their names remapped.
    * The format is: ["var_name", "var_remapped_name", "var_name", "var_remapped_name", ...]
    * "var_name" should be either: worldPos or vNormalW
    * So, if the variable holding the world position in your vertex shader is not named worldPos, you must tell the system
    * the name to use instead by using: ["worldPos", "myWorldPosVar"] assuming the variable is named myWorldPosVar in your code.
    * If the normal must also be remapped: ["worldPos", "myWorldPosVar", "vNormalW", "myWorldNormal"]
    */
  var remappedVariables: js.UndefOr[js.Array[String]] = js.native
  
  /** Set standalone to true if the base material wrapped by ShadowDepthMaterial is not used for a regular object but for depth shadow generation only */
  var standalone: js.UndefOr[Boolean] = js.native
}
object IIOptionShadowDepthMaterial {
  
  @scala.inline
  def apply(): IIOptionShadowDepthMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIOptionShadowDepthMaterial]
  }
  
  @scala.inline
  implicit class IIOptionShadowDepthMaterialMutableBuilder[Self <: IIOptionShadowDepthMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemappedVariables(value: js.Array[String]): Self = StObject.set(x, "remappedVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemappedVariablesUndefined: Self = StObject.set(x, "remappedVariables", js.undefined)
    
    @scala.inline
    def setRemappedVariablesVarargs(value: String*): Self = StObject.set(x, "remappedVariables", js.Array(value :_*))
    
    @scala.inline
    def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
  }
}
