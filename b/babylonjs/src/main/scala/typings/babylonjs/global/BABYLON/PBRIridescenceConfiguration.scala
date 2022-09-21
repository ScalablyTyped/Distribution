package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRIridescenceConfiguration")
@js.native
open class PBRIridescenceConfiguration protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PBRIridescenceConfiguration {
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial, addToPluginList: Boolean) = this()
}
/* static members */
object PBRIridescenceConfiguration {
  
  /**
    * The default index of refraction of the thin-film layer.
    * Defaults to 1.3
    * @hidden
    */
  @JSGlobal("BABYLON.PBRIridescenceConfiguration._DefaultIndexOfRefraction")
  @js.native
  val _DefaultIndexOfRefraction: /* 1.3 */ Double = js.native
  
  /**
    * The default maximum thickness of the thin-film layer given in nanometers (nm).
    * Defaults to 400 nm.
    * @hidden
    */
  @JSGlobal("BABYLON.PBRIridescenceConfiguration._DefaultMaximumThickness")
  @js.native
  val _DefaultMaximumThickness: /* 400 */ Double = js.native
  
  /**
    * The default minimum thickness of the thin-film layer given in nanometers (nm).
    * Defaults to 100 nm.
    * @hidden
    */
  @JSGlobal("BABYLON.PBRIridescenceConfiguration._DefaultMinimumThickness")
  @js.native
  val _DefaultMinimumThickness: /* 100 */ Double = js.native
}
