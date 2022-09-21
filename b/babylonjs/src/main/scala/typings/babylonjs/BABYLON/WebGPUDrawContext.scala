package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroup
import typings.babylonjs.GPUBuffer
import typings.babylonjs.GPURenderBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUDrawContext
  extends StObject
     with IDrawContext {
  
  /* private */ var _bufferManager: Any = js.native
  
  /* private */ var _currentInstanceCount: Any = js.native
  
  /* private */ var _indirectDrawData: Any = js.native
  
  /* private */ var _isDirty: Any = js.native
  
  /* private */ var _materialContextUpdateId: Any = js.native
  
  /* private */ var _useInstancing: Any = js.native
  
  var bindGroups: js.UndefOr[js.Array[GPUBindGroup]] = js.native
  
  var buffers: org.scalablytyped.runtime.StringDictionary[Nullable[WebGPUDataBuffer]] = js.native
  
  var fastBundle: js.UndefOr[GPURenderBundle] = js.native
  
  var indirectDrawBuffer: js.UndefOr[GPUBuffer] = js.native
  
  def isDirty(materialContextUpdateId: Double): Boolean = js.native
  
  def resetIsDirty(materialContextUpdateId: Double): Unit = js.native
  
  def setBuffer(name: String, buffer: Nullable[WebGPUDataBuffer]): Unit = js.native
  
  def setIndirectData(indexOrVertexCount: Double, instanceCount: Double, firstIndexOrVertex: Double): Unit = js.native
  
  @JSName("useInstancing")
  def useInstancing_MWebGPUDrawContext: Boolean = js.native
}
