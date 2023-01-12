package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.anon.NodeCount
import typings.babylonjs.anon.Token
import typings.babylonjs.buffersBufferMod.VertexBuffer
import typings.babylonjs.enginesWebGPUWebgpuCacheRenderPipelineMod.WebGPUCacheRenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuCacheRenderPipelineTreeMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineTree", "WebGPUCacheRenderPipelineTree")
  @js.native
  open class WebGPUCacheRenderPipelineTree protected () extends WebGPUCacheRenderPipeline {
    def this(device: GPUDevice, emptyVertexBuffer: VertexBuffer, useTextureStage: Boolean) = this()
    
    /* private */ var _nodeStack: Any = js.native
    
    /* protected */ def _setRenderPipeline(param: Token): Unit = js.native
  }
  /* static members */
  object WebGPUCacheRenderPipelineTree {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineTree", "WebGPUCacheRenderPipelineTree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def GetNodeCounts(): NodeCount = ^.asInstanceOf[js.Dynamic].applyDynamic("GetNodeCounts")().asInstanceOf[NodeCount]
    
    inline def GetPipelines(): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPipelines")().asInstanceOf[js.Array[js.Array[Double]]]
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipelineTree", "WebGPUCacheRenderPipelineTree._Cache")
    @js.native
    def _Cache: Any = js.native
    inline def _Cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Cache")(x.asInstanceOf[js.Any])
    
    inline def _GetPipelines(
      node: NodeState,
      pipelines: js.Array[js.Array[Double]],
      curPath: js.Array[Double],
      curPathLen: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetPipelines")(node.asInstanceOf[js.Any], pipelines.asInstanceOf[js.Any], curPath.asInstanceOf[js.Any], curPathLen.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** @internal */
  trait NodeState extends StObject {
    
    def count(): js.Tuple2[Double, Double]
    
    var pipeline: GPURenderPipeline
    
    var values: NumberDictionary[NodeState]
  }
  object NodeState {
    
    inline def apply(
      count: () => js.Tuple2[Double, Double],
      pipeline: GPURenderPipeline,
      values: NumberDictionary[NodeState]
    ): NodeState = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), pipeline = pipeline.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeState] (val x: Self) extends AnyVal {
      
      inline def setCount(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setPipeline(value: GPURenderPipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      inline def setValues(value: NumberDictionary[NodeState]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
