package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassCubePostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var _face: Any = js.native
  
  /**
    * Gets or sets the cube face to display.
    *  * 0 is +X
    *  * 1 is -X
    *  * 2 is +Y
    *  * 3 is -Y
    *  * 4 is +Z
    *  * 5 is -Z
    */
  def face: Double = js.native
  def face_=(value: Double): Unit = js.native
}
