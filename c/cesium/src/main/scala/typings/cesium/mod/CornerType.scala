package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CornerType extends js.Object
@JSImport("cesium", "CornerType")
@js.native
object CornerType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CornerType with Double] = js.native
  
  @js.native
  sealed trait BEVELED extends CornerType
  /* 2 */ @js.native
  object BEVELED extends TopLevel[BEVELED with Double]
  
  @js.native
  sealed trait MITERED extends CornerType
  /* 1 */ @js.native
  object MITERED extends TopLevel[MITERED with Double]
  
  @js.native
  sealed trait ROUNDED extends CornerType
  /* 0 */ @js.native
  object ROUNDED extends TopLevel[ROUNDED with Double]
}
