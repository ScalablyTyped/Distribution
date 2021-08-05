package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.FirstNameOptions> */
trait PartialFirstNameOptions extends StObject {
  
  var gender: js.UndefOr[male | female] = js.undefined
  
  var nationality: js.UndefOr[FirstNameNationalities] = js.undefined
}
object PartialFirstNameOptions {
  
  inline def apply(): PartialFirstNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFirstNameOptions]
  }
  
  extension [Self <: PartialFirstNameOptions](x: Self) {
    
    inline def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setNationality(value: FirstNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
    
    inline def setNationalityUndefined: Self = StObject.set(x, "nationality", js.undefined)
  }
}
