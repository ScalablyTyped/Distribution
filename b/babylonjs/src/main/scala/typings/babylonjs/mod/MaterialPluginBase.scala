package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MaterialPluginBase")
@js.native
open class MaterialPluginBase protected ()
  extends typings.babylonjs.legacyLegacyMod.MaterialPluginBase {
  /**
    * Creates a new material plugin
    * @param material parent material of the plugin
    * @param name name of the plugin
    * @param priority priority of the plugin
    * @param defines list of defines used by the plugin. The value of the property is the default value for this property
    * @param addToPluginList true to add the plugin to the list of plugins managed by the material plugin manager of the material (default: true)
    * @param enable true to enable the plugin (it is handy if the plugin does not handle properties to switch its current activation)
    */
  def this(material: typings.babylonjs.materialsMaterialMod.Material, name: String, priority: Double) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: org.scalablytyped.runtime.StringDictionary[Any]
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: org.scalablytyped.runtime.StringDictionary[Any],
    addToPluginList: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: Unit,
    addToPluginList: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: org.scalablytyped.runtime.StringDictionary[Any],
    addToPluginList: Boolean,
    enable: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: org.scalablytyped.runtime.StringDictionary[Any],
    addToPluginList: Unit,
    enable: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: Unit,
    addToPluginList: Boolean,
    enable: Boolean
  ) = this()
  def this(
    material: typings.babylonjs.materialsMaterialMod.Material,
    name: String,
    priority: Double,
    defines: Unit,
    addToPluginList: Unit,
    enable: Boolean
  ) = this()
}
