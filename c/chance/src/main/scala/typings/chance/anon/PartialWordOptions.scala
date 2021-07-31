package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.WordOptions> */
trait PartialWordOptions extends StObject {
  
  var capitalize: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var syllables: js.UndefOr[Double] = js.undefined
}
object PartialWordOptions {
  
  @scala.inline
  def apply(): PartialWordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWordOptions]
  }
  
  @scala.inline
  implicit class PartialWordOptionsMutableBuilder[Self <: PartialWordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setSyllables(value: Double): Self = StObject.set(x, "syllables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyllablesUndefined: Self = StObject.set(x, "syllables", js.undefined)
  }
}
