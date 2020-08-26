package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastNameOptions extends js.Object {
  var nationality: LastNameNationalities = js.native
}

object LastNameOptions {
  @scala.inline
  def apply(nationality: LastNameNationalities): LastNameOptions = {
    val __obj = js.Dynamic.literal(nationality = nationality.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastNameOptions]
  }
  @scala.inline
  implicit class LastNameOptionsOps[Self <: LastNameOptions] (val x: Self) extends AnyVal {
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
    def setNationality(value: LastNameNationalities): Self = this.set("nationality", value.asInstanceOf[js.Any])
  }
  
}

