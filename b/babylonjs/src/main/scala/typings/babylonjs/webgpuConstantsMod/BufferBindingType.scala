package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferBindingType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BufferBindingType")
@js.native
object BufferBindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BufferBindingType & String] = js.native
  
  @js.native
  sealed trait ReadOnlyStorage
    extends StObject
       with BufferBindingType
  /* "read-only-storage" */ val ReadOnlyStorage: typings.babylonjs.webgpuConstantsMod.BufferBindingType.ReadOnlyStorage & String = js.native
  
  @js.native
  sealed trait Storage
    extends StObject
       with BufferBindingType
  /* "storage" */ val Storage: typings.babylonjs.webgpuConstantsMod.BufferBindingType.Storage & String = js.native
  
  @js.native
  sealed trait Uniform
    extends StObject
       with BufferBindingType
  /* "uniform" */ val Uniform: typings.babylonjs.webgpuConstantsMod.BufferBindingType.Uniform & String = js.native
}
