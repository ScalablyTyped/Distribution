package typings.chance.anon

import typings.chance.chanceStrings.lower
import typings.chance.chanceStrings.upper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.CharacterOptions> */
@js.native
trait PartialCharacterOptions extends StObject {
  
  var alpha: js.UndefOr[Boolean] = js.native
  
  var casing: js.UndefOr[upper | lower] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var pool: js.UndefOr[String] = js.native
  
  var symbols: js.UndefOr[Boolean] = js.native
}
object PartialCharacterOptions {
  
  @scala.inline
  def apply(): PartialCharacterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCharacterOptions]
  }
  
  @scala.inline
  implicit class PartialCharacterOptionsMutableBuilder[Self <: PartialCharacterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setCasing(value: upper | lower): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasingUndefined: Self = StObject.set(x, "casing", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
