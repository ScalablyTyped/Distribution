package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var displayName: CardDotContent
}
object DisplayName {
  
  inline def apply(): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = "Card.Content")
    __obj.asInstanceOf[DisplayName]
  }
  
  extension [Self <: DisplayName](x: Self) {
    
    inline def setDisplayName(value: CardDotContent): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
