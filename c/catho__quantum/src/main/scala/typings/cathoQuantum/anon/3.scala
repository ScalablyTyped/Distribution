package typings.cathoQuantum.anon

import typings.cathoQuantum.cathoQuantumStrings.CardDotFooter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var displayName: CardDotFooter = js.native
}
object `3` {
  
  @scala.inline
  def apply(displayName: CardDotFooter): `3` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotFooter): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
