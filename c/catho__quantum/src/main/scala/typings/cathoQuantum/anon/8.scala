package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotThumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var displayName: CardDotThumbnail
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Thumbnail")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setDisplayName(value: CardDotThumbnail): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
