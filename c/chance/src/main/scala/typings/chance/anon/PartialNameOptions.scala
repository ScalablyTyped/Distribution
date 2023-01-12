package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.NameOptions> */
trait PartialNameOptions extends StObject {
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var gender: js.UndefOr[male | female] = js.undefined
  
  var middle: js.UndefOr[Boolean] = js.undefined
  
  var middle_initial: js.UndefOr[Boolean] = js.undefined
  
  var nationality: js.UndefOr[FirstNameNationalities] = js.undefined
  
  var prefix: js.UndefOr[Boolean] = js.undefined
  
  var suffix: js.UndefOr[Boolean] = js.undefined
}
object PartialNameOptions {
  
  inline def apply(): PartialNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNameOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNameOptions] (val x: Self) extends AnyVal {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setMiddle(value: Boolean): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    inline def setMiddle_initial(value: Boolean): Self = StObject.set(x, "middle_initial", value.asInstanceOf[js.Any])
    
    inline def setMiddle_initialUndefined: Self = StObject.set(x, "middle_initial", js.undefined)
    
    inline def setNationality(value: FirstNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
    
    inline def setNationalityUndefined: Self = StObject.set(x, "nationality", js.undefined)
    
    inline def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
