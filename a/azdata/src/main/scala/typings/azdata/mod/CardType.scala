package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CardType extends js.Object

@JSImport("azdata", "CardType")
@js.native
object CardType extends js.Object {
  @js.native
  sealed trait Details extends CardType
  
  @js.native
  sealed trait ListItem extends CardType
  
  @js.native
  sealed trait VerticalButton extends CardType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType with String] = js.native
  /* "Details" */ @js.native
  object Details extends TopLevel[Details with String]
  
  /* "ListItem" */ @js.native
  object ListItem extends TopLevel[ListItem with String]
  
  /* "VerticalButton" */ @js.native
  object VerticalButton extends TopLevel[VerticalButton with String]
  
}

