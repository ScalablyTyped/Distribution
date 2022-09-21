package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.IridescenceBlock")
@js.native
open class IridescenceBlock protected ()
  extends StObject
     with typings.babylonjs.BABYLON.IridescenceBlock {
  /**
    * Create a new IridescenceBlock
    * @param name defines the block name
    */
  def this(name: String) = this()
}
/* static members */
object IridescenceBlock {
  
  @JSGlobal("BABYLON.IridescenceBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the main code of the block (fragment side)
    * @param iridescenceBlock instance of a IridescenceBlock or null if the code must be generated without an active iridescence module
    * @returns the shader code
    */
  inline def GetCode(iridescenceBlock: Nullable[typings.babylonjs.BABYLON.IridescenceBlock]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCode")(iridescenceBlock.asInstanceOf[js.Any]).asInstanceOf[String]
}
