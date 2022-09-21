package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompareFunction extends StObject
@JSGlobal("BABYLON.CompareFunction")
@js.native
object CompareFunction extends StObject {
  
  @js.native
  sealed trait Always
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait Equal
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait Greater
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait GreaterEqual
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait Less
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait LessEqual
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait Never
    extends StObject
       with CompareFunction
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with CompareFunction
}
