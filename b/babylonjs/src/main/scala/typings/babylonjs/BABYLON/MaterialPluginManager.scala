package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialPluginManager extends StObject {
  
  /**
    * @param plugin
    * @hidden
    */
  def _activatePlugin(plugin: MaterialPluginBase): Unit = js.native
  
  /* protected */ var _activePlugins: js.Array[MaterialPluginBase] = js.native
  
  /* protected */ var _activePluginsForExtraEvents: js.Array[MaterialPluginBase] = js.native
  
  /**
    * @param plugin
    * @hidden
    */
  def _addPlugin(plugin: MaterialPluginBase): Unit = js.native
  
  /* protected */ var _codeInjectionPoints: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Boolean]] = js.native
  
  /* protected */ def _collectPointNames(shaderType: String): Unit = js.native
  /* protected */ def _collectPointNames(shaderType: String, customCode: Nullable[org.scalablytyped.runtime.StringDictionary[String]]): Unit = js.native
  
  /* protected */ var _defineNamesFromPlugins: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Default]] = js.native
  
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
