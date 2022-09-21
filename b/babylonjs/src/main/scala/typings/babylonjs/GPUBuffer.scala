package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUBuffer
  extends StObject
     with GPUObjectBase {
  
  def destroy(): Unit = js.native
  
  def getMappedRange(): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: Unit, size: GPUSize64): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: GPUSize64): js.typedarray.ArrayBuffer = js.native
  def getMappedRange(offset: GPUSize64, size: GPUSize64): js.typedarray.ArrayBuffer = js.native
  
  def mapAsync(mode: GPUMapModeFlags): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: Unit, size: GPUSize64): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: GPUSize64): js.Promise[Unit] = js.native
  def mapAsync(mode: GPUMapModeFlags, offset: GPUSize64, size: GPUSize64): js.Promise[Unit] = js.native
  
  def unmap(): Unit = js.native
}
