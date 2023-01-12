package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotFooter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var displayName: CardDotFooter
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Footer")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: CardDotFooter): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
