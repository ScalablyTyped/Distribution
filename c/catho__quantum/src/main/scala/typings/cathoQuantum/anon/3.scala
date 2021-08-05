package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotFooter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var displayName: CardDotFooter
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Footer")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDisplayName(value: CardDotFooter): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
