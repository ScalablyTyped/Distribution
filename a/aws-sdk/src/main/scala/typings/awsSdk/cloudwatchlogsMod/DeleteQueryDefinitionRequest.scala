package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueryDefinitionRequest extends js.Object {
  var queryDefinitionId: QueryId = js.native
}

object DeleteQueryDefinitionRequest {
  @scala.inline
  def apply(queryDefinitionId: QueryId): DeleteQueryDefinitionRequest = {
    val __obj = js.Dynamic.literal(queryDefinitionId = queryDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryDefinitionRequest]
  }
}

