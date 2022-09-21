package typings.babylonjs.webgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferUsage extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BufferUsage")
@js.native
object BufferUsage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferUsage & Double] = js.native
  
  @js.native
  sealed trait CopyDst
    extends StObject
       with BufferUsage
  /* 8 */ val CopyDst: typings.babylonjs.webgpuConstantsMod.BufferUsage.CopyDst & Double = js.native
  
  @js.native
  sealed trait CopySrc
    extends StObject
       with BufferUsage
  /* 4 */ val CopySrc: typings.babylonjs.webgpuConstantsMod.BufferUsage.CopySrc & Double = js.native
  
  @js.native
  sealed trait Index
    extends StObject
       with BufferUsage
  /* 16 */ val Index: typings.babylonjs.webgpuConstantsMod.BufferUsage.Index & Double = js.native
  
  @js.native
  sealed trait Indirect
    extends StObject
       with BufferUsage
  /* 256 */ val Indirect: typings.babylonjs.webgpuConstantsMod.BufferUsage.Indirect & Double = js.native
  
  @js.native
  sealed trait MapRead
    extends StObject
       with BufferUsage
  /* 1 */ val MapRead: typings.babylonjs.webgpuConstantsMod.BufferUsage.MapRead & Double = js.native
  
  @js.native
  sealed trait MapWrite
    extends StObject
       with BufferUsage
  /* 2 */ val MapWrite: typings.babylonjs.webgpuConstantsMod.BufferUsage.MapWrite & Double = js.native
  
  @js.native
  sealed trait QueryResolve
    extends StObject
       with BufferUsage
  /* 512 */ val QueryResolve: typings.babylonjs.webgpuConstantsMod.BufferUsage.QueryResolve & Double = js.native
  
  @js.native
  sealed trait Storage
    extends StObject
       with BufferUsage
  /* 128 */ val Storage: typings.babylonjs.webgpuConstantsMod.BufferUsage.Storage & Double = js.native
  
  @js.native
  sealed trait Uniform
    extends StObject
       with BufferUsage
  /* 64 */ val Uniform: typings.babylonjs.webgpuConstantsMod.BufferUsage.Uniform & Double = js.native
  
  @js.native
  sealed trait Vertex
    extends StObject
       with BufferUsage
  /* 32 */ val Vertex: typings.babylonjs.webgpuConstantsMod.BufferUsage.Vertex & Double = js.native
}
