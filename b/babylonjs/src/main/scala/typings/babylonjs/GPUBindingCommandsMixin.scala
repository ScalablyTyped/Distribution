package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUBindingCommandsMixin extends StObject {
  
  def setBindGroup(index: GPUIndex32, bindGroup: GPUBindGroup): Unit = js.native
  def setBindGroup(
    index: GPUIndex32,
    bindGroup: GPUBindGroup,
    dynamicOffsetData: js.typedarray.Uint32Array,
    dynamicOffsetsDataStart: GPUSize64,
    dynamicOffsetsDataLength: GPUSize32
  ): Unit = js.native
  def setBindGroup(index: GPUIndex32, bindGroup: GPUBindGroup, dynamicOffsets: js.Array[GPUBufferDynamicOffset]): Unit = js.native
}
