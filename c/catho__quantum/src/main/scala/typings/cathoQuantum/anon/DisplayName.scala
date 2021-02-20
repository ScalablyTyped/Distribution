package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayName extends StObject {
  
  var displayName: CardDotContent = js.native
}
object DisplayName {
  
  @scala.inline
  def apply(displayName: CardDotContent): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit class DisplayNameMutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotContent): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
