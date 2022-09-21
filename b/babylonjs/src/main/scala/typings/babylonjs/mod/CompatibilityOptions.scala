package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CompatibilityOptions")
@js.native
open class CompatibilityOptions ()
  extends typings.babylonjs.legacyMod.CompatibilityOptions
/* static members */
object CompatibilityOptions {
  
  @JSImport("babylonjs", "CompatibilityOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines if the system should use OpenGL convention for UVs when creating geometry or loading .babylon files (false by default)
    */
  @JSImport("babylonjs", "CompatibilityOptions.UseOpenGLOrientationForUV")
  @js.native
  def UseOpenGLOrientationForUV: Boolean = js.native
  inline def UseOpenGLOrientationForUV_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOpenGLOrientationForUV")(x.asInstanceOf[js.Any])
}
