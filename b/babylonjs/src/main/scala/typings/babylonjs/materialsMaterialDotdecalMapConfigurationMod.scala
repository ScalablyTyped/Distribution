package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.materialsMaterialDefinesMod.MaterialDefines
import typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.materialsPbrPbrBaseMaterialMod.PBRBaseMaterial
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMaterialDotdecalMapConfigurationMod {
  
  @JSImport("babylonjs/Materials/material.decalMapConfiguration", "DecalMapConfiguration")
  @js.native
  open class DecalMapConfiguration protected () extends MaterialPluginBase {
    /**
      * Creates a new DecalMapConfiguration
      * @param material The material to attach the decal map plugin to
      * @param addToPluginList If the plugin should be added to the material plugin list
      */
    def this(material: PBRBaseMaterial) = this()
    def this(material: StandardMaterial) = this()
    def this(material: PBRBaseMaterial, addToPluginList: Boolean) = this()
    def this(material: StandardMaterial, addToPluginList: Boolean) = this()
    
    /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
    
    /* private */ var _isEnabled: Any = js.native
    
    /** @internal */
    def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
    
    /* private */ var _smoothAlpha: Any = js.native
    
    /**
      * Enables or disables the decal map on this material
      */
    var isEnabled: Boolean = js.native
    
    def isReadyForSubMesh(defines: DecalMapDefines, scene: Scene, engine: Engine, subMesh: SubMesh): Boolean = js.native
    
    def prepareDefines(defines: DecalMapDefines, scene: Scene, mesh: AbstractMesh): Unit = js.native
    
    /**
      * Enables or disables the smooth alpha mode on this material. Default: false.
      * When enabled, the alpha value used to blend the decal map will be the squared value and will produce a smoother result.
      */
    var smoothAlpha: Boolean = js.native
  }
  
  @JSImport("babylonjs/Materials/material.decalMapConfiguration", "DecalMapDefines")
  @js.native
  /**
    * Creates a new instance
    * @param externalProperties list of external properties to inject into the object
    */
  open class DecalMapDefines () extends MaterialDefines {
    def this(externalProperties: StringDictionary[Default]) = this()
    
    var DECAL: Boolean = js.native
    
    var DECALDIRECTUV: Double = js.native
    
    var DECAL_SMOOTHALPHA: Boolean = js.native
    
    var GAMMADECAL: Boolean = js.native
  }
}
