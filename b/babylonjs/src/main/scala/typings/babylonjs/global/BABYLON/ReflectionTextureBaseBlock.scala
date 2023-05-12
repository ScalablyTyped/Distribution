package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.ReflectionTextureBaseBlock")
@js.native
open class ReflectionTextureBaseBlock protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ReflectionTextureBaseBlock {
  /**
    * Create a new ReflectionTextureBaseBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
object ReflectionTextureBaseBlock {
  
  @JSGlobal("BABYLON.ReflectionTextureBaseBlock")
  @js.native
  val ^ : js.Any = js.native
  
  inline def _OnGenerateOnlyFragmentCodeChanged(block: typings.babylonjs.BABYLON.NodeMaterialBlock, _propertyName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_OnGenerateOnlyFragmentCodeChanged")(block.asInstanceOf[js.Any], _propertyName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
