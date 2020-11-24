package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.FirstNameOptions> */
@js.native
trait PartialFirstNameOptions extends js.Object {
  
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
  implicit class PartialFirstNameOptionsOps[Self <: PartialFirstNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGender(value: male | female): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setNationality(value: FirstNameNationalities): Self = this.set("nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNationality: Self = this.set("nationality", js.undefined)
  }
}
