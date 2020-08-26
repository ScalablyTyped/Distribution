package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineIndexFieldRequest extends js.Object {
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * The index field and field options you want to configure. 
    */
  var IndexField: typings.awsSdk.cloudsearchMod.IndexField = js.native
}

object DefineIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexField: IndexField): DefineIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldRequest]
  }
  @scala.inline
  implicit class DefineIndexFieldRequestOps[Self <: DefineIndexFieldRequest] (val x: Self) extends AnyVal {
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
    def setIndexField(value: IndexField): Self = this.set("IndexField", value.asInstanceOf[js.Any])
  }
  
}

