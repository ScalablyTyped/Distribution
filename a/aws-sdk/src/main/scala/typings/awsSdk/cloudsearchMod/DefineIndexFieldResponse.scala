package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineIndexFieldResponse extends js.Object {
  var IndexField: IndexFieldStatus = js.native
}

object DefineIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DefineIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineIndexFieldResponse]
  }
}

