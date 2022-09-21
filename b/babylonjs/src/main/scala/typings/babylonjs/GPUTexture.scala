package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUTexture
  extends StObject
     with GPUObjectBase {
  
  def createView(): GPUTextureView = js.native
  def createView(descriptor: GPUTextureViewDescriptor): GPUTextureView = js.native
  
  def destroy(): Unit = js.native
}
