package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends StObject
@JSImport("azdata", "CardType")
@js.native
object CardType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType & String] = js.native
  
  @js.native
  sealed trait Details
    extends StObject
       with CardType
  /* "Details" */ val Details: typings.azdata.mod.CardType.Details & String = js.native
  
  @js.native
  sealed trait ListItem
    extends StObject
       with CardType
  /* "ListItem" */ val ListItem: typings.azdata.mod.CardType.ListItem & String = js.native
  
  @js.native
  sealed trait VerticalButton
    extends StObject
       with CardType
  /* "VerticalButton" */ val VerticalButton: typings.azdata.mod.CardType.VerticalButton & String = js.native
}
