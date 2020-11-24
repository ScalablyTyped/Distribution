package typings.chance.anon

import typings.chance.chanceStrings.all
import typings.chance.chanceStrings.female
import typings.chance.chanceStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.PrefixOptions> */
@js.native
trait PartialPrefixOptions extends js.Object {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var gender: js.UndefOr[male | female | all] = js.native
}
object PartialPrefixOptions {
  
  @scala.inline
  def apply(): PartialPrefixOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPrefixOptions]
  }
  
  @scala.inline
  implicit class PartialPrefixOptionsOps[Self <: PartialPrefixOptions] (val x: Self) extends AnyVal {
    
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
    def setGender(value: male | female | all): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
  }
}
