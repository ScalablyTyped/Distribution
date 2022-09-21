package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryType extends StObject
@JSGlobal("BABYLON.QueryType")
@js.native
object QueryType extends StObject {
  
  @js.native
  sealed trait Occlusion
    extends StObject
       with QueryType
  
  @js.native
  sealed trait Timestamp
    extends StObject
       with QueryType
}
