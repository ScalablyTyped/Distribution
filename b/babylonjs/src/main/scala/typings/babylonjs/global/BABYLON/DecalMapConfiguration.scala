package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DecalMapConfiguration")
@js.native
open class DecalMapConfiguration protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DecalMapConfiguration {
  /**
    * Creates a new DecalMapConfiguration
    * @param material The material to attach the decal map plugin to
    * @param addToPluginList If the plugin should be added to the material plugin list
    */
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.BABYLON.StandardMaterial) = this()
  def this(material: typings.babylonjs.BABYLON.PBRBaseMaterial, addToPluginList: Boolean) = this()
  def this(material: typings.babylonjs.BABYLON.StandardMaterial, addToPluginList: Boolean) = this()
}
