package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeprecateDomainInput extends js.Object {
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var name: DomainName = js.native
}

object UndeprecateDomainInput {
  @scala.inline
  def apply(name: DomainName): UndeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateDomainInput]
  }
  @scala.inline
  implicit class UndeprecateDomainInputOps[Self <: UndeprecateDomainInput] (val x: Self) extends AnyVal {
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
    def setName(value: DomainName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

