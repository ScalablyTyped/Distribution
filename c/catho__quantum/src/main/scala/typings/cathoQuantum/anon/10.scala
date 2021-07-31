package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var displayName: CardDotTitle
}
object `10` {
  
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Title")
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotTitle): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
