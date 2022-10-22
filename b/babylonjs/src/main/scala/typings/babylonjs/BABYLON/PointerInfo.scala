package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointerInfo
  extends StObject
     with PointerInfoBase {
  
  /**
    * Generates the picking info if needed
    */
  /** @internal */
  def _generatePickInfo(): Unit = js.native
  
  /* private */ var _inputManager: Any = js.native
  
  /* private */ var _pickInfo: Any = js.native
  
  /**
    * Defines the picking info associated with this PointerInfo object (if applicable)
    */
  def pickInfo: Nullable[PickingInfo] = js.native
}
