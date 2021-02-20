package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var displayName: CardDotDescription = js.native
}
object `0` {
  
  @scala.inline
  def apply(displayName: CardDotDescription): `0` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotDescription): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
