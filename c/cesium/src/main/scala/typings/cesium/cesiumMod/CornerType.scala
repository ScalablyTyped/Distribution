package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.CornerType.BEVELED
import typings.cesium.cesiumMod.CornerType.MITERED
import typings.cesium.cesiumMod.CornerType.ROUNDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CornerType extends js.Object

@JSImport("cesium", "CornerType")
@js.native
object CornerType extends js.Object {
  @js.native
  sealed trait BEVELED extends CornerType
  
  @js.native
  sealed trait MITERED extends CornerType
  
  @js.native
  sealed trait ROUNDED extends CornerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerType with Double] = js.native
  /* 2 */ @js.native
  object BEVELED extends TopLevel[BEVELED with Double]
  
  /* 1 */ @js.native
  object MITERED extends TopLevel[MITERED with Double]
  
  /* 0 */ @js.native
  object ROUNDED extends TopLevel[ROUNDED with Double]
  
}

