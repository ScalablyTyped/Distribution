package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotThumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var displayName: CardDotThumbnail
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(displayName = "Card.Thumbnail")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: CardDotThumbnail): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
