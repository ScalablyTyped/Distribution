package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Iso8601 extends js.Object

@JSImport("cesium", "Iso8601")
@js.native
object Iso8601 extends js.Object {
  @js.native
  sealed trait MAXIMUM_INTERVAL extends Iso8601
  
  @js.native
  sealed trait MAXIMUM_VALUE extends Iso8601
  
  @js.native
  sealed trait MINIMUM_VALUE extends Iso8601
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Iso8601 with Double] = js.native
  /* 2 */ @js.native
  object MAXIMUM_INTERVAL extends TopLevel[MAXIMUM_INTERVAL with Double]
  
  /* 1 */ @js.native
  object MAXIMUM_VALUE extends TopLevel[MAXIMUM_VALUE with Double]
  
  /* 0 */ @js.native
  object MINIMUM_VALUE extends TopLevel[MINIMUM_VALUE with Double]
  
}

