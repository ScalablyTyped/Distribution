package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CompatibilityOptions")
@js.native
open class CompatibilityOptions ()
  extends StObject
     with typings.babylonjs.BABYLON.CompatibilityOptions
/* static members */
object CompatibilityOptions {
  
  @JSGlobal("BABYLON.CompatibilityOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines if the system should use OpenGL convention for UVs when creating geometry or loading .babylon files (false by default)
    */
  @JSGlobal("BABYLON.CompatibilityOptions.UseOpenGLOrientationForUV")
  @js.native
  def UseOpenGLOrientationForUV: Boolean = js.native
  inline def UseOpenGLOrientationForUV_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOpenGLOrientationForUV")(x.asInstanceOf[js.Any])
}
