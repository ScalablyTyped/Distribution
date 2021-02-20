package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Iso8601 extends StObject
@JSImport("cesium", "Iso8601")
@js.native
object Iso8601 extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Iso8601 with Double] = js.native
  
  @js.native
  sealed trait MAXIMUM_INTERVAL extends Iso8601
  /* 2 */ val MAXIMUM_INTERVAL: typings.cesium.mod.Iso8601.MAXIMUM_INTERVAL with Double = js.native
  
  @js.native
  sealed trait MAXIMUM_VALUE extends Iso8601
  /* 1 */ val MAXIMUM_VALUE: typings.cesium.mod.Iso8601.MAXIMUM_VALUE with Double = js.native
  
  @js.native
  sealed trait MINIMUM_VALUE extends Iso8601
  /* 0 */ val MINIMUM_VALUE: typings.cesium.mod.Iso8601.MINIMUM_VALUE with Double = js.native
}
