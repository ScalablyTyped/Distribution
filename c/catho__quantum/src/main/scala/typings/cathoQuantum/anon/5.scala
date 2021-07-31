package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotHeaderText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var displayName: CardDotHeaderText
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal(displayName = "Card.HeaderText")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotHeaderText): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
