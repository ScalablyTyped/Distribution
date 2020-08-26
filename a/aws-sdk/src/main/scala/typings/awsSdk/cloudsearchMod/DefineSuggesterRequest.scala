package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineSuggesterRequest extends js.Object {
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  var Suggester: typings.awsSdk.cloudsearchMod.Suggester = js.native
}

object DefineSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
  @scala.inline
  implicit class DefineSuggesterRequestOps[Self <: DefineSuggesterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggester(value: Suggester): Self = this.set("Suggester", value.asInstanceOf[js.Any])
  }
  
}

