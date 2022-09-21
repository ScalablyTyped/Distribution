package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferBindingType extends StObject
@JSGlobal("BABYLON.BufferBindingType")
@js.native
object BufferBindingType extends StObject {
  
  @js.native
  sealed trait ReadOnlyStorage
    extends StObject
       with BufferBindingType
  
  @js.native
  sealed trait Storage
    extends StObject
       with BufferBindingType
  
  @js.native
  sealed trait Uniform
    extends StObject
       with BufferBindingType
}
