package typings.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "PBRClearCoatConfiguration")
@js.native
open class PBRClearCoatConfiguration protected ()
  extends typings.babylonjs.materialsPbrIndexMod.PBRClearCoatConfiguration {
  def this(material: typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.pbrBaseMaterialMod.PBRBaseMaterial, addToPluginList: Boolean) = this()
}
/* static members */
object PBRClearCoatConfiguration {
  
  /**
    * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
    * The default fits with a polyurethane material.
    * @internal
    */
  @JSImport("babylonjs/Materials/index", "PBRClearCoatConfiguration._DefaultIndexOfRefraction")
  @js.native
  val _DefaultIndexOfRefraction: Double = js.native
}
