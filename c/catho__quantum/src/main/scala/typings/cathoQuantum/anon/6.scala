package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var displayName: CardDotMedia = js.native
}
object `6` {
  
  @scala.inline
  def apply(displayName: CardDotMedia): `6` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotMedia): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
