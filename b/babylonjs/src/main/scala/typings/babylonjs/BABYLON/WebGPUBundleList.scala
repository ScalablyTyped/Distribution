package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderBundle
import typings.babylonjs.GPURenderBundleEncoder
import typings.babylonjs.GPURenderPassEncoder
import typings.babylonjs.GPUTextureFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUBundleList extends StObject {
  
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
