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
  
  inline def apply(pic: String): ChoiceCosmetics = {
    val __obj = js.Dynamic.literal(pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceCosmetics]
  }
  
  extension [Self <: ChoiceCosmetics](x: Self) {
    
    inline def setPic(value: String): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
