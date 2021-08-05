package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var displayName: CardDotTitle
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Title")
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setDisplayName(value: CardDotTitle): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
