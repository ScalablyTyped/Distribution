package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.FirstNameOptions> */
@js.native
trait PartialFirstNameOptions extends StObject {
  
  var gender: js.UndefOr[male | female] = js.native
  
  var nationality: js.UndefOr[FirstNameNationalities] = js.native
}
object PartialFirstNameOptions {
  
  @scala.inline
  def apply(): PartialFirstNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFirstNameOptions]
  }
  
  @scala.inline
  implicit class PartialFirstNameOptionsMutableBuilder[Self <: PartialFirstNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setNationality(value: FirstNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationalityUndefined: Self = StObject.set(x, "nationality", js.undefined)
  }
}
