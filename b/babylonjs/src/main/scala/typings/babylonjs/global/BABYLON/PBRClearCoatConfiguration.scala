package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PBRClearCoatConfiguration")
@js.native
open class PBRClearCoatConfiguration protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PBRClearCoatConfiguration {
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial, addToPluginList: Boolean) = this()
}
/* static members */
object PBRClearCoatConfiguration {
  
  /**
    * This defaults to 1.5 corresponding to a 0.04 f0 or a 4% reflectance at normal incidence
    * The default fits with a polyurethane material.
    * @internal
    */
  @JSGlobal("BABYLON.PBRClearCoatConfiguration._DefaultIndexOfRefraction")
  @js.native
  val _DefaultIndexOfRefraction: /* 1.5 */ Double = js.native
}
