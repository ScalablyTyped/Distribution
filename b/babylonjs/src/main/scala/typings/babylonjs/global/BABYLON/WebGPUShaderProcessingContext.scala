package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WebGPUBufferDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUShaderProcessingContext")
@js.native
open class WebGPUShaderProcessingContext protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUShaderProcessingContext {
  def this(shaderLanguage: typings.babylonjs.BABYLON.ShaderLanguage) = this()
}
/* static members */
object WebGPUShaderProcessingContext {
  
  @JSGlobal("BABYLON.WebGPUShaderProcessingContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUShaderProcessingContext._KnownUBOs")
  @js.native
  def _KnownUBOs: org.scalablytyped.runtime.StringDictionary[WebGPUBufferDescription] = js.native
  inline def _KnownUBOs_=(x: org.scalablytyped.runtime.StringDictionary[WebGPUBufferDescription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_KnownUBOs")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.WebGPUShaderProcessingContext._SimplifiedKnownBindings")
  @js.native
  def _SimplifiedKnownBindings: Boolean = js.native
  inline def _SimplifiedKnownBindings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifiedKnownBindings")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.WebGPUShaderProcessingContext._SimplifiedKnownUBOs")
  @js.native
  def _SimplifiedKnownUBOs: org.scalablytyped.runtime.StringDictionary[WebGPUBufferDescription] = js.native
  inline def _SimplifiedKnownUBOs_=(x: org.scalablytyped.runtime.StringDictionary[WebGPUBufferDescription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifiedKnownUBOs")(x.asInstanceOf[js.Any])
}
