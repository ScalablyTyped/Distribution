package typings.terserMCwkxx7L.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineFunctions extends StObject
@JSImport(".terser-MCwkxx7L", "InlineFunctions")
@js.native
object InlineFunctions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with InlineFunctions
  /* 0 */ val Disabled: typings.terserMCwkxx7L.mod.InlineFunctions.Disabled & Double = js.native
  
  @js.native
  sealed trait SimpleFunctions
    extends StObject
       with InlineFunctions
  /* 1 */ val SimpleFunctions: typings.terserMCwkxx7L.mod.InlineFunctions.SimpleFunctions & Double = js.native
  
  @js.native
  sealed trait WithArguments
    extends StObject
       with InlineFunctions
  /* 2 */ val WithArguments: typings.terserMCwkxx7L.mod.InlineFunctions.WithArguments & Double = js.native
  
  @js.native
  sealed trait WithArgumentsAndVariables
    extends StObject
       with InlineFunctions
  /* 3 */ val WithArgumentsAndVariables: typings.terserMCwkxx7L.mod.InlineFunctions.WithArgumentsAndVariables & Double = js.native
}
