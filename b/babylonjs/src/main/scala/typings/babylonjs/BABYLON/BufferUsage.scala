package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferUsage extends StObject
@JSGlobal("BABYLON.BufferUsage")
@js.native
object BufferUsage extends StObject {
  
  @js.native
  sealed trait CopyDst
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait CopySrc
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait Index
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait Indirect
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait MapRead
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait MapWrite
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait QueryResolve
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait Storage
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait Uniform
    extends StObject
       with BufferUsage
  
  @js.native
  sealed trait Vertex
    extends StObject
       with BufferUsage
}
