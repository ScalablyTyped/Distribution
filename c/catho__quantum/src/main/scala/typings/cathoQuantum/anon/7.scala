package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var displayName: CardDotMedia
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Media")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: CardDotMedia): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
