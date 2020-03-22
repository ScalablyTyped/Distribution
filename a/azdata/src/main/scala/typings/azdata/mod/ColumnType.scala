package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnType extends js.Object

@JSImport("azdata", "ColumnType")
@js.native
object ColumnType extends js.Object {
  @js.native
  sealed trait button extends ColumnType
  
  @js.native
  sealed trait checkBox extends ColumnType
  
  @js.native
  sealed trait text extends ColumnType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnType with Double] = js.native
  /* 2 */ @js.native
  object button extends TopLevel[button with Double]
  
  /* 1 */ @js.native
  object checkBox extends TopLevel[checkBox with Double]
  
  /* 0 */ @js.native
  object text extends TopLevel[text with Double]
  
}

