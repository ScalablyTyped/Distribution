package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var displayName: CardDotDescription
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Description")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDisplayName(value: CardDotDescription): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
