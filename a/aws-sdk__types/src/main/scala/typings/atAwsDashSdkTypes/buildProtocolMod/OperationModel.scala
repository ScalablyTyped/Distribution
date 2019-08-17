package typings.atAwsDashSdkTypes.buildProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationModel extends js.Object {
  var errors: js.Array[Member]
  var http: HttpTrait
  var input: Member
  var metadata: ServiceMetadata
  var name: java.lang.String
  var output: Member
}

object OperationModel {
  @scala.inline
  def apply(
    errors: js.Array[Member],
    http: HttpTrait,
    input: Member,
    metadata: ServiceMetadata,
    name: java.lang.String,
    output: Member
  ): OperationModel = {
    val __obj = js.Dynamic.literal(errors = errors, http = http, input = input, metadata = metadata, name = name, output = output)
  
    __obj.asInstanceOf[OperationModel]
  }
}

