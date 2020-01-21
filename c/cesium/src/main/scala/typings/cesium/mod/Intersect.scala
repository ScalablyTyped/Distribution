package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Intersect extends js.Object

@JSImport("cesium", "Intersect")
@js.native
object Intersect extends js.Object {
  @js.native
  sealed trait INSIDE extends Intersect
  
  @js.native
  sealed trait INTERSECTING extends Intersect
  
  @js.native
  sealed trait OUTSIDE extends Intersect
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Intersect with Double] = js.native
  /* 2 */ @js.native
  object INSIDE extends TopLevel[INSIDE with Double]
  
  /* 1 */ @js.native
  object INTERSECTING extends TopLevel[INTERSECTING with Double]
  
  /* 0 */ @js.native
  object OUTSIDE extends TopLevel[OUTSIDE with Double]
  
}

