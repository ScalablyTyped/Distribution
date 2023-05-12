package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorFilter extends StObject
@JSGlobal("BABYLON.ErrorFilter")
@js.native
object ErrorFilter extends StObject {
  
  @js.native
  sealed trait Internal
    extends StObject
       with ErrorFilter
  
  @js.native
  sealed trait OutOfMemory
    extends StObject
       with ErrorFilter
  
  @js.native
  sealed trait Validation
    extends StObject
       with ErrorFilter
}
