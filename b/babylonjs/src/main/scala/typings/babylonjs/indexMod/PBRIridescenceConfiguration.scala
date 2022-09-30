package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PBRIridescenceConfiguration")
@js.native
open class PBRIridescenceConfiguration protected ()
  extends typings.babylonjs.materialsIndexMod.PBRIridescenceConfiguration {
  def this(material: typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial, addToPluginList: Boolean) = this()
}
/* static members */
object PBRIridescenceConfiguration {
  
  /**
    * The default index of refraction of the thin-film layer.
    * Defaults to 1.3
    * @internal
    */
  @JSImport("babylonjs/index", "PBRIridescenceConfiguration._DefaultIndexOfRefraction")
  @js.native
  val _DefaultIndexOfRefraction: Double = js.native
  
  /**
    * The default maximum thickness of the thin-film layer given in nanometers (nm).
    * Defaults to 400 nm.
    * @internal
    */
  @JSImport("babylonjs/index", "PBRIridescenceConfiguration._DefaultMaximumThickness")
  @js.native
  val _DefaultMaximumThickness: Double = js.native
  
  /**
    * The default minimum thickness of the thin-film layer given in nanometers (nm).
    * Defaults to 100 nm.
    * @internal
    */
  @JSImport("babylonjs/index", "PBRIridescenceConfiguration._DefaultMinimumThickness")
  @js.native
  val _DefaultMinimumThickness: Double = js.native
}
