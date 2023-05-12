package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferMapState extends StObject
@JSGlobal("BABYLON.BufferMapState")
@js.native
object BufferMapState extends StObject {
  
  @js.native
  sealed trait Mapped
    extends StObject
       with BufferMapState
  
  @js.native
  sealed trait Pending
    extends StObject
       with BufferMapState
  
  @js.native
  sealed trait Unmapped
    extends StObject
       with BufferMapState
}
