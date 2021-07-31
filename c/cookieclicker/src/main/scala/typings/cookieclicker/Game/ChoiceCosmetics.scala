package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoiceCosmetics extends StObject {
  
  /**
    * The picture to use
    */
  var pic: String
}
object ChoiceCosmetics {
  
  @scala.inline
  def apply(pic: String): ChoiceCosmetics = {
    val __obj = js.Dynamic.literal(pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceCosmetics]
  }
  
  @scala.inline
  implicit class ChoiceCosmeticsMutableBuilder[Self <: ChoiceCosmetics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
