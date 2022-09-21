package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUMaterialContext
  extends StObject
     with IMaterialContext {
  
  /* protected */ var _numExternalTextures: Double = js.native
  
  /* protected */ var _numFloatTextures: Double = js.native
  
  def forceBindGroupCreation: Boolean = js.native
  
  def hasFloatTextures: Boolean = js.native
  
  var isDirty: Boolean = js.native
  
  var samplers: org.scalablytyped.runtime.StringDictionary[Nullable[IWebGPUMaterialContextSamplerCache]] = js.native
  
  def setSampler(name: String, sampler: Nullable[TextureSampler]): Unit = js.native
  
  def setTexture(name: String, texture: Nullable[InternalTexture | ExternalTexture]): Unit = js.native
  
  var textures: org.scalablytyped.runtime.StringDictionary[Nullable[IWebGPUMaterialContextTextureCache]] = js.native
  
  var updateId: Double = js.native
}
