package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CompatibilityOptions")
@js.native
open class CompatibilityOptions ()
  extends typings.babylonjs.indexMod.CompatibilityOptions
/* static members */
object CompatibilityOptions {
  
  @JSImport("babylonjs/Legacy/legacy", "CompatibilityOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines if the system should use OpenGL convention for UVs when creating geometry or loading .babylon files (false by default)
    */
  @JSImport("babylonjs/Legacy/legacy", "CompatibilityOptions.UseOpenGLOrientationForUV")
  @js.native
  def UseOpenGLOrientationForUV: Boolean = js.native
  inline def UseOpenGLOrientationForUV_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseOpenGLOrientationForUV")(x.asInstanceOf[js.Any])
}
