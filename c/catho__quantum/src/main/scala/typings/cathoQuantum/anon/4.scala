package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var displayName: CardDotHeader = js.native
}
object `4` {
  
  @scala.inline
  def apply(displayName: CardDotHeader): `4` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotHeader): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
