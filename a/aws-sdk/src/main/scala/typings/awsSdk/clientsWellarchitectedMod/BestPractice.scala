package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BestPractice extends StObject {
  
  var ChoiceId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceId] = js.undefined
  
  var ChoiceTitle: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceTitle] = js.undefined
}
object BestPractice {
  
  inline def apply(): BestPractice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BestPractice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BestPractice] (val x: Self) extends AnyVal {
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "ChoiceId", js.undefined)
    
    inline def setChoiceTitle(value: ChoiceTitle): Self = StObject.set(x, "ChoiceTitle", value.asInstanceOf[js.Any])
    
    inline def setChoiceTitleUndefined: Self = StObject.set(x, "ChoiceTitle", js.undefined)
  }
}
