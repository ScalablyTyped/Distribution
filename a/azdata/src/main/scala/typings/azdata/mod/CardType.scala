package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends js.Object
@JSImport("azdata", "CardType")
@js.native
object CardType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType with String] = js.native
  
  @js.native
  sealed trait Details extends CardType
  /* "Details" */ @js.native
  object Details extends TopLevel[Details with String]
  
  @js.native
  sealed trait ListItem extends CardType
  /* "ListItem" */ @js.native
  object ListItem extends TopLevel[ListItem with String]
  
  @js.native
  sealed trait VerticalButton extends CardType
  /* "VerticalButton" */ @js.native
  object VerticalButton extends TopLevel[VerticalButton with String]
}
