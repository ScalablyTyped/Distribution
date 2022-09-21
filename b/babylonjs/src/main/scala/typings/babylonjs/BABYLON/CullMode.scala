package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CullMode extends StObject
@JSGlobal("BABYLON.CullMode")
@js.native
object CullMode extends StObject {
  
  @js.native
  sealed trait Back
    extends StObject
       with CullMode
  
  @js.native
  sealed trait Front
    extends StObject
       with CullMode
  
  @js.native
  sealed trait None
    extends StObject
       with CullMode
}
