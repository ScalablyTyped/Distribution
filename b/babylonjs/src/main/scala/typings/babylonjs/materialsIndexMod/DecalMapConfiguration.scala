package typings.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "DecalMapConfiguration")
@js.native
open class DecalMapConfiguration protected ()
  extends typings.babylonjs.materialsMaterialDotdecalMapConfigurationMod.DecalMapConfiguration {
  /**
    * Creates a new DecalMapConfiguration
    * @param material The material to attach the decal map plugin to
    * @param addToPluginList If the plugin should be added to the material plugin list
    */
  def this(material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial) = this()
  def this(material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial) = this()
  def this(
    material: typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial,
    addToPluginList: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    addToPluginList: Boolean
  ) = this()
}
