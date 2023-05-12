package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUAdapter extends StObject {
  
  val features: GPUSupportedFeatures = js.native
  
  val isFallbackAdapter: Boolean = js.native
  
  val limits: GPUSupportedLimits = js.native
  
  // https://michalzalecki.com/nominal-typing-in-typescript/#approach-1-class-with-a-private-property
  val name: String = js.native
  
  def requestAdapterInfo(): js.Promise[GPUAdapterInfo] = js.native
  def requestAdapterInfo(unmaskHints: js.Array[String]): js.Promise[GPUAdapterInfo] = js.native
  
  def requestDevice(): js.Promise[GPUDevice] = js.native
  def requestDevice(descriptor: GPUDeviceDescriptor): js.Promise[GPUDevice] = js.native
}
