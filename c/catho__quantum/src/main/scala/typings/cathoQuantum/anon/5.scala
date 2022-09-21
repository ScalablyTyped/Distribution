package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var displayName: CardDotHeader
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Header")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setDisplayName(value: CardDotHeader): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
