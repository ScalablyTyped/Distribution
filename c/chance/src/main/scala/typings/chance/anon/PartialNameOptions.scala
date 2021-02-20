package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.NameOptions> */
@js.native
trait PartialNameOptions extends StObject {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var gender: js.UndefOr[male | female] = js.native
  
  var middle: js.UndefOr[Boolean] = js.native
  
  var middle_initial: js.UndefOr[Boolean] = js.native
  
  var nationality: js.UndefOr[FirstNameNationalities] = js.native
  
  var prefix: js.UndefOr[Boolean] = js.native
  
  var suffix: js.UndefOr[Boolean] = js.native
}
object PartialNameOptions {
  
  @scala.inline
  def apply(): PartialNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNameOptions]
  }
  
  @scala.inline
  implicit class PartialNameOptionsMutableBuilder[Self <: PartialNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setGender(value: male | female): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setMiddle(value: Boolean): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    @scala.inline
    def setMiddle_initial(value: Boolean): Self = StObject.set(x, "middle_initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle_initialUndefined: Self = StObject.set(x, "middle_initial", js.undefined)
    
    @scala.inline
    def setNationality(value: FirstNameNationalities): Self = StObject.set(x, "nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNationalityUndefined: Self = StObject.set(x, "nationality", js.undefined)
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
