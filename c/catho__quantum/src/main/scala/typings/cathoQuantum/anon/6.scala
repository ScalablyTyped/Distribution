package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotHeaderText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var displayName: CardDotHeaderText
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(displayName = "Card.HeaderText")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: CardDotHeaderText): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
