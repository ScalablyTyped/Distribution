package typings.chance.anon

import typings.chance.Chance.FirstNameNationalities
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.NameOptions> */
@js.native
trait PartialNameOptions extends js.Object {
  
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
  implicit class PartialNameOptionsOps[Self <: PartialNameOptions] (val x: Self) extends AnyVal {
    
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
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setGender(value: male | female): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setMiddle(value: Boolean): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    
    @scala.inline
    def setMiddle_initial(value: Boolean): Self = this.set("middle_initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle_initial: Self = this.set("middle_initial", js.undefined)
    
    @scala.inline
    def setNationality(value: FirstNameNationalities): Self = this.set("nationality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNationality: Self = this.set("nationality", js.undefined)
    
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: Boolean): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
