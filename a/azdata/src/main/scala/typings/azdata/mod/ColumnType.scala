package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnType extends js.Object
@JSImport("azdata", "ColumnType")
@js.native
object ColumnType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType with Double] = js.native
  
  @js.native
  sealed trait button extends ColumnType
  /* 2 */ @js.native
  object button extends TopLevel[button with Double]
  
  @js.native
  sealed trait checkBox extends ColumnType
  /* 1 */ @js.native
  object checkBox extends TopLevel[checkBox with Double]
  
  @js.native
  sealed trait text extends ColumnType
  /* 0 */ @js.native
  object text extends TopLevel[text with Double]
}
