package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOutpostInput extends js.Object {
  var OutpostId: typings.awsSdk.outpostsMod.OutpostId = js.native
}

object DeleteOutpostInput {
  @scala.inline
  def apply(OutpostId: OutpostId): DeleteOutpostInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOutpostInput]
  }
}

