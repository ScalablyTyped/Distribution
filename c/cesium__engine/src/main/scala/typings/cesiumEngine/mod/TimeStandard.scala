package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeStandard extends StObject
@JSImport("@cesium/engine", "TimeStandard")
@js.native
object TimeStandard extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeStandard & Double] = js.native
  
  /**
    * Represents the International Atomic Time (TAI) time standard.
    * TAI is the principal time standard to which the other time standards are related.
    */
  @js.native
  sealed trait TAI
    extends StObject
       with TimeStandard
  /* 1 */ val TAI: typings.cesiumEngine.mod.TimeStandard.TAI & Double = js.native
  
  /**
    * Represents the coordinated Universal Time (UTC) time standard.
    *
    * UTC is related to TAI according to the relationship
    * <code>UTC = TAI - deltaT</code> where <code>deltaT</code> is the number of leap
    * seconds which have been introduced as of the time in TAI.
    */
  @js.native
  sealed trait UTC
    extends StObject
       with TimeStandard
  /* 0 */ val UTC: typings.cesiumEngine.mod.TimeStandard.UTC & Double = js.native
}
