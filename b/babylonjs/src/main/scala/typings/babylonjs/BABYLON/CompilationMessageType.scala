package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompilationMessageType extends StObject
@JSGlobal("BABYLON.CompilationMessageType")
@js.native
object CompilationMessageType extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with CompilationMessageType
  
  @js.native
  sealed trait Info
    extends StObject
       with CompilationMessageType
  
  @js.native
  sealed trait Warning
    extends StObject
       with CompilationMessageType
}
