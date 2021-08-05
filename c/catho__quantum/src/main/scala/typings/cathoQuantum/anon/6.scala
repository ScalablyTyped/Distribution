package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var displayName: CardDotMedia
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Media")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setDisplayName(value: CardDotMedia): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
