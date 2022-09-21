package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.idrawcontextMod.IDrawContext
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webgpuBufferManagerMod.WebGPUBufferManager
import typings.babylonjs.webgpuDataBufferMod.WebGPUDataBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuDrawContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuDrawContext", "WebGPUDrawContext")
  @js.native
  open class WebGPUDrawContext protected ()
    extends StObject
       with IDrawContext {
    def this(bufferManager: WebGPUBufferManager) = this()
    
    /* private */ var _bufferManager: Any = js.native
    
    /* private */ var _currentInstanceCount: Any = js.native
    
    /* private */ var _indirectDrawData: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /* private */ var _materialContextUpdateId: Any = js.native
    
    /* private */ var _useInstancing: Any = js.native
    
    var bindGroups: js.UndefOr[js.Array[GPUBindGroup]] = js.native
    
    var buffers: StringDictionary[Nullable[WebGPUDataBuffer]] = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    var fastBundle: js.UndefOr[GPURenderBundle] = js.native
    
    var indirectDrawBuffer: js.UndefOr[GPUBuffer] = js.native
    
    def isDirty(materialContextUpdateId: Double): Boolean = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    def resetIsDirty(materialContextUpdateId: Double): Unit = js.native
    
    def setBuffer(name: String, buffer: Nullable[WebGPUDataBuffer]): Unit = js.native
    
    def setIndirectData(indexOrVertexCount: Double, instanceCount: Double, firstIndexOrVertex: Double): Unit = js.native
    
    /* CompleteClass */
    var uniqueId: Double = js.native
    
    /* CompleteClass */
    var useInstancing: Boolean = js.native
    @JSName("useInstancing")
    def useInstancing_MWebGPUDrawContext: Boolean = js.native
  }
  /* static members */
  object WebGPUDrawContext {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuDrawContext", "WebGPUDrawContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuDrawContext", "WebGPUDrawContext._Counter")
    @js.native
    def _Counter: Any = js.native
    inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
  }
}
