package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIOptionShadowDepthMaterial extends StObject {
  
  /** Set doNotInjectCode if the specific shadow map generation code is already implemented by the material. That will prevent this code to be injected twice by ShadowDepthWrapper */
  var doNotInjectCode: js.UndefOr[Boolean] = js.undefined
  
  /** Variables in the vertex shader code that need to have their names remapped.
    * The format is: ["var_name", "var_remapped_name", "var_name", "var_remapped_name", ...]
    * "var_name" should be either: worldPos or vNormalW
    * So, if the variable holding the world position in your vertex shader is not named worldPos, you must tell the system
    * the name to use instead by using: ["worldPos", "myWorldPosVar"] assuming the variable is named myWorldPosVar in your code.
    * If the normal must also be remapped: ["worldPos", "myWorldPosVar", "vNormalW", "myWorldNormal"]
    */
  var remappedVariables: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Set standalone to true if the base material wrapped by ShadowDepthMaterial is not used for a regular object but for depth shadow generation only */
  var standalone: js.UndefOr[Boolean] = js.undefined
}
object IIOptionShadowDepthMaterial {
  
  inline def apply(): IIOptionShadowDepthMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIOptionShadowDepthMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIOptionShadowDepthMaterial] (val x: Self) extends AnyVal {
    
    inline def setDoNotInjectCode(value: Boolean): Self = StObject.set(x, "doNotInjectCode", value.asInstanceOf[js.Any])
    
    inline def setDoNotInjectCodeUndefined: Self = StObject.set(x, "doNotInjectCode", js.undefined)
    
    inline def setRemappedVariables(value: js.Array[String]): Self = StObject.set(x, "remappedVariables", value.asInstanceOf[js.Any])
    
    inline def setRemappedVariablesUndefined: Self = StObject.set(x, "remappedVariables", js.undefined)
    
    inline def setRemappedVariablesVarargs(value: String*): Self = StObject.set(x, "remappedVariables", js.Array(value*))
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
  }
}
