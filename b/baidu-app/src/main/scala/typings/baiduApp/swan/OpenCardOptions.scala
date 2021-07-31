package typings.baiduApp.swan

import typings.baiduApp.anon.CardId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var cardList: js.Array[CardId]
}
object OpenCardOptions {
  
  @scala.inline
  def apply(cardList: js.Array[CardId]): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardOptions]
  }
  
  @scala.inline
  implicit class OpenCardOptionsMutableBuilder[Self <: OpenCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value :_*))
  }
}
