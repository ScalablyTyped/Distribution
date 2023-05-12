package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocodeType extends StObject
@JSImport("@cesium/engine", "GeocodeType")
@js.native
object GeocodeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeocodeType & Double] = js.native
  
  /**
    * Perform an auto-complete using partial input, typically
    * reserved for providing possible results as a user is typing.
    */
  @js.native
  sealed trait AUTOCOMPLETE
    extends StObject
       with GeocodeType
  /* 1 */ val AUTOCOMPLETE: typings.cesiumEngine.mod.GeocodeType.AUTOCOMPLETE & Double = js.native
  
  /**
    * Perform a search where the input is considered complete.
    */
  @js.native
  sealed trait SEARCH
    extends StObject
       with GeocodeType
  /* 0 */ val SEARCH: typings.cesiumEngine.mod.GeocodeType.SEARCH & Double = js.native
}
