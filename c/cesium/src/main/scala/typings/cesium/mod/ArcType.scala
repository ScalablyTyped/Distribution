package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArcType extends js.Object
@JSImport("cesium", "ArcType")
@js.native
object ArcType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArcType with Double] = js.native
  
  @js.native
  sealed trait GEODESIC extends ArcType
  /* 1 */ @js.native
  object GEODESIC extends TopLevel[GEODESIC with Double]
  
  @js.native
  sealed trait NONE extends ArcType
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait RHUMB extends ArcType
  /* 2 */ @js.native
  object RHUMB extends TopLevel[RHUMB with Double]
}
