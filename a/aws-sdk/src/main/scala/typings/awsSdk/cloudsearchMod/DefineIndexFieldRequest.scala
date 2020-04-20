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
}

