package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPURenderPassEncoder
  extends StObject
     with GPUObjectBase
     with GPUCommandsMixin
     with GPUDebugCommandsMixin
     with GPUBindingCommandsMixin
     with GPURenderCommandsMixin {
  
  def beginOcclusionQuery(queryIndex: GPUSize32): Unit = js.native
  
  def end(): Unit = js.native
  
  def endOcclusionQuery(): Unit = js.native
  
  def executeBundles(bundles: js.Array[GPURenderBundle]): Unit = js.native
  
  def setBlendConstant(color: GPUColor): Unit = js.native
  
  def setScissorRect(
    x: GPUIntegerCoordinate,
    y: GPUIntegerCoordinate,
    width: GPUIntegerCoordinate,
    height: GPUIntegerCoordinate
  ): Unit = js.native
  
  def setStencilReference(reference: GPUStencilValue): Unit = js.native
  
  def setViewport(x: Double, y: Double, width: Double, height: Double, minDepth: Double, maxDepth: Double): Unit = js.native
}
