package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Default
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.enginesProcessorsShaderProcessingOptionsMod.ShaderCustomProcessingFunction
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginBindForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginDisposed
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginFillRenderTargetTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetActiveTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetAnimatables
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginGetDefineNames
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHardBindForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHasRenderTargetTextures
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginHasTexture
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginIsReadyForSubMesh
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareDefines
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareEffect
import typings.babylonjs.materialsMaterialPluginEventMod.MaterialPluginPrepareUniformBuffer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsMaterialPluginManagerMod {
  
  @JSImport("babylonjs/Materials/materialPluginManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Materials/materialPluginManager", "MaterialPluginManager")
  @js.native
  open class MaterialPluginManager protected () extends StObject {
    /**
      * Creates a new instance of the plugin manager
      * @param material material that this manager will manage the plugins for
      */
    def this(material: Material) = this()
    
    /**
      * @internal
      */
    def _activatePlugin(plugin: MaterialPluginBase): Unit = js.native
    
    /* protected */ var _activePlugins: js.Array[MaterialPluginBase] = js.native
    
    /* protected */ var _activePluginsForExtraEvents: js.Array[MaterialPluginBase] = js.native
    
    /**
      * @internal
      */
    def _addPlugin(plugin: MaterialPluginBase): Unit = js.native
    
    /* protected */ var _codeInjectionPoints: StringDictionary[StringDictionary[Boolean]] = js.native
    
    /* protected */ def _collectPointNames(shaderType: String): Unit = js.native
    /* protected */ def _collectPointNames(shaderType: String, customCode: Nullable[StringDictionary[String]]): Unit = js.native
    
    /* protected */ var _defineNamesFromPlugins: js.UndefOr[StringDictionary[Default]] = js.native
    
    /* protected */ var _engine: Engine = js.native
    
    /* protected */ var _fragmentDeclaration: String = js.native
    
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginDisposed): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginGetActiveTextures): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginGetAnimatables): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginGetDefineNames): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginHasTexture): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginPrepareEffect): Unit = js.native
    /* protected */ def _handlePluginEvent(id: Double, info: MaterialPluginPrepareUniformBuffer): Unit = js.native
    
    /* protected */ def _handlePluginEventBindForSubMesh(eventData: MaterialPluginBindForSubMesh): Unit = js.native
    
    /* protected */ def _handlePluginEventFillRenderTargetTextures(eventData: MaterialPluginFillRenderTargetTextures): Unit = js.native
    
    /* protected */ def _handlePluginEventHardBindForSubMesh(eventData: MaterialPluginHardBindForSubMesh): Unit = js.native
    
    /* protected */ def _handlePluginEventHasRenderTargetTextures(eventData: MaterialPluginHasRenderTargetTextures): Unit = js.native
    
    /* protected */ def _handlePluginEventIsReadyForSubMesh(eventData: MaterialPluginIsReadyForSubMesh): Unit = js.native
    
    /* protected */ def _handlePluginEventPrepareDefines(eventData: MaterialPluginPrepareDefines): Unit = js.native
    
    /* protected */ def _handlePluginEventPrepareDefinesBeforeAttributes(eventData: MaterialPluginPrepareDefines): Unit = js.native
    
    /* protected */ def _injectCustomCode(): ShaderCustomProcessingFunction = js.native
    /* protected */ def _injectCustomCode(existingCallback: js.Function2[/* shaderType */ String, /* code */ String, String]): ShaderCustomProcessingFunction = js.native
    
    /* protected */ var _material: Material = js.native
    
    /* protected */ var _plugins: js.Array[MaterialPluginBase] = js.native
    
    /* protected */ var _samplerList: js.Array[String] = js.native
    
    /* protected */ var _scene: Scene = js.native
    
    /* protected */ var _uboDeclaration: String = js.native
    
    /* protected */ var _uboList: js.Array[String] = js.native
    
    /* protected */ var _uniformList: js.Array[String] = js.native
    
    /* protected */ var _vertexDeclaration: String = js.native
    
    /**
      * Gets a plugin from the list of plugins managed by this manager
      * @param name name of the plugin
      * @returns the plugin if found, else null
      */
    def getPlugin(name: String): Nullable[MaterialPluginBase] = js.native
  }
  /* static members */
  object MaterialPluginManager {
    
    @JSImport("babylonjs/Materials/materialPluginManager", "MaterialPluginManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Map a plugin class name to a #define name (used in the vertex/fragment shaders as a marker of the plugin usage) */
    @JSImport("babylonjs/Materials/materialPluginManager", "MaterialPluginManager._MaterialPluginClassToMainDefine")
    @js.native
    def _MaterialPluginClassToMainDefine: Any = js.native
    inline def _MaterialPluginClassToMainDefine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MaterialPluginClassToMainDefine")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/materialPluginManager", "MaterialPluginManager._MaterialPluginCounter")
    @js.native
    def _MaterialPluginCounter: Any = js.native
    inline def _MaterialPluginCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MaterialPluginCounter")(x.asInstanceOf[js.Any])
  }
  
  inline def RegisterMaterialPlugin(pluginName: String, factory: PluginMaterialFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterMaterialPlugin")(pluginName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def UnregisterAllMaterialPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterAllMaterialPlugins")().asInstanceOf[Unit]
  
  inline def UnregisterMaterialPlugin(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterMaterialPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type PluginMaterialFactory = js.Function1[/* material */ Material, Nullable[MaterialPluginBase]]
  
  /* augmented module */
  object babylonjsMaterialsMaterialAugmentingMod {
    
    trait Material extends StObject {
      
      /**
        * Plugin manager for this material
        */
      var pluginManager: js.UndefOr[MaterialPluginManager] = js.undefined
    }
    object Material {
      
      inline def apply(): typings.babylonjs.materialsMaterialPluginManagerMod.babylonjsMaterialsMaterialAugmentingMod.Material = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.babylonjs.materialsMaterialPluginManagerMod.babylonjsMaterialsMaterialAugmentingMod.Material]
      }
      
      extension [Self <: typings.babylonjs.materialsMaterialPluginManagerMod.babylonjsMaterialsMaterialAugmentingMod.Material](x: Self) {
        
        inline def setPluginManager(value: MaterialPluginManager): Self = StObject.set(x, "pluginManager", value.asInstanceOf[js.Any])
        
        inline def setPluginManagerUndefined: Self = StObject.set(x, "pluginManager", js.undefined)
      }
    }
  }
}
