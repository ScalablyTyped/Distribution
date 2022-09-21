package typings.terserMCwkxx7L.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputQuoteStyle extends StObject
@JSImport(".terser-MCwkxx7L", "OutputQuoteStyle")
@js.native
object OutputQuoteStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputQuoteStyle & Double] = js.native
  
  @js.native
  sealed trait AlwaysDouble
    extends StObject
       with OutputQuoteStyle
  /* 2 */ val AlwaysDouble: typings.terserMCwkxx7L.mod.OutputQuoteStyle.AlwaysDouble & Double = js.native
  
  @js.native
  sealed trait AlwaysOriginal
    extends StObject
       with OutputQuoteStyle
  /* 3 */ val AlwaysOriginal: typings.terserMCwkxx7L.mod.OutputQuoteStyle.AlwaysOriginal & Double = js.native
  
  @js.native
  sealed trait AlwaysSingle
    extends StObject
       with OutputQuoteStyle
  /* 1 */ val AlwaysSingle: typings.terserMCwkxx7L.mod.OutputQuoteStyle.AlwaysSingle & Double = js.native
  
  @js.native
  sealed trait PreferDouble
    extends StObject
       with OutputQuoteStyle
  /* 0 */ val PreferDouble: typings.terserMCwkxx7L.mod.OutputQuoteStyle.PreferDouble & Double = js.native
}
