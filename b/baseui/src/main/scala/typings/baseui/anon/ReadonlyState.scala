package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/phone-input.State> */
@js.native
trait ReadonlyState extends StObject {
  
  val country: ReadonlyCountry = js.native
  
  val text: js.UndefOr[String] = js.native
}
object ReadonlyState {
  
  @scala.inline
  def apply(country: ReadonlyCountry): ReadonlyState = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyState]
  }
  
  @scala.inline
  implicit class ReadonlyStateMutableBuilder[Self <: ReadonlyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: ReadonlyCountry): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
