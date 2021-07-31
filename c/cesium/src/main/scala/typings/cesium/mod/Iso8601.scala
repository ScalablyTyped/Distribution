package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Iso8601 extends StObject
@JSImport("cesium", "Iso8601")
@js.native
object Iso8601 extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Iso8601 & Double] = js.native
  
  @js.native
  sealed trait MAXIMUM_INTERVAL
    extends StObject
       with Iso8601
  /* 2 */ val MAXIMUM_INTERVAL: typings.cesium.mod.Iso8601.MAXIMUM_INTERVAL & Double = js.native
  
  @js.native
  sealed trait MAXIMUM_VALUE
    extends StObject
       with Iso8601
  /* 1 */ val MAXIMUM_VALUE: typings.cesium.mod.Iso8601.MAXIMUM_VALUE & Double = js.native
  
  @js.native
  sealed trait MINIMUM_VALUE
    extends StObject
       with Iso8601
  /* 0 */ val MINIMUM_VALUE: typings.cesium.mod.Iso8601.MINIMUM_VALUE & Double = js.native
}
