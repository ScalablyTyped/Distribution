package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuBundleListMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPUBundleList")
  @js.native
  open class WebGPUBundleList protected () extends StObject {
    def this(device: GPUDevice) = this()
    
    /* private */ var _bundleEncoder: Any = js.native
    
    /* private */ var _currentBundleList: Any = js.native
    
    /* private */ var _currentItemIsBundle: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _finishBundle: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* private */ var _listLength: Any = js.native
    
    def addBundle(): Unit = js.native
    def addBundle(bundle: GPURenderBundle): Unit = js.native
    
    def addItem(item: IWebGPURenderItem): Unit = js.native
    
    def close(): Unit = js.native
    
    def getBundleEncoder(colorFormats: js.Array[GPUTextureFormat | Null], depthStencilFormat: Unit, sampleCount: Double): GPURenderBundleEncoder = js.native
    def getBundleEncoder(
      colorFormats: js.Array[GPUTextureFormat | Null],
      depthStencilFormat: GPUTextureFormat,
      sampleCount: Double
    ): GPURenderBundleEncoder = js.native
    
    var numDrawCalls: Double = js.native
    
    def reset(): Unit = js.native
    
    def run(renderPass: GPURenderPassEncoder): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemBeginOcclusionQuery")
  @js.native
  open class WebGPURenderItemBeginOcclusionQuery protected ()
    extends StObject
       with IWebGPURenderItem {
    def this(query: Double) = this()
    
    var query: Double = js.native
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemBlendColor")
  @js.native
  open class WebGPURenderItemBlendColor protected ()
    extends StObject
       with IWebGPURenderItem {
    def this(color: js.Array[Nullable[Double]]) = this()
    
    var color: js.Array[Nullable[Double]] = js.native
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemEndOcclusionQuery")
  @js.native
  open class WebGPURenderItemEndOcclusionQuery ()
    extends StObject
       with IWebGPURenderItem {
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemScissor")
  @js.native
  open class WebGPURenderItemScissor protected ()
    extends StObject
       with IWebGPURenderItem {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
    
    var h: Double = js.native
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemStencilRef")
  @js.native
  open class WebGPURenderItemStencilRef protected ()
    extends StObject
       with IWebGPURenderItem {
    def this(ref: Double) = this()
    
    var ref: Double = js.native
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuBundleList", "WebGPURenderItemViewport")
  @js.native
  open class WebGPURenderItemViewport protected ()
    extends StObject
       with IWebGPURenderItem {
    def this(x: Double, y: Double, w: Double, h: Double) = this()
    
    var h: Double = js.native
    
    /* CompleteClass */
    override def run(renderPass: GPURenderPassEncoder): Unit = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  /** @internal */
  trait IWebGPURenderItem extends StObject {
    
    def run(renderPass: GPURenderPassEncoder): Unit
  }
  object IWebGPURenderItem {
    
    inline def apply(run: GPURenderPassEncoder => Unit): IWebGPURenderItem = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[IWebGPURenderItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebGPURenderItem] (val x: Self) extends AnyVal {
      
      inline def setRun(value: GPURenderPassEncoder => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
}
