package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainResult extends js.Object {
  /**
    *  Contains information about the created domain after processing the request. 
    */
  var domain: js.UndefOr[DomainDescription] = js.native
}

object CreateDomainResult {
  @scala.inline
  def apply(): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResult]
  }
  @scala.inline
  implicit class CreateDomainResultOps[Self <: CreateDomainResult] (val x: Self) extends AnyVal {
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
    def setDomain(value: DomainDescription): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
  }
  
}

