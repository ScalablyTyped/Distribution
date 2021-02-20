package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotThumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var displayName: CardDotThumbnail = js.native
}
object `8` {
  
  @scala.inline
  def apply(displayName: CardDotThumbnail): `8` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotThumbnail): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
