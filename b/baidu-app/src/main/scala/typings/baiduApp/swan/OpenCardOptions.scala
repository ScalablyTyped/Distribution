package typings.baiduApp.swan

import typings.baiduApp.anon.CardId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCardOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var cardList: js.Array[CardId]
}
object OpenCardOptions {
  
  inline def apply(cardList: js.Array[CardId]): OpenCardOptions = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCardOptions] (val x: Self) extends AnyVal {
    
    inline def setCardList(value: js.Array[CardId]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: CardId*): Self = StObject.set(x, "cardList", js.Array(value*))
  }
}
