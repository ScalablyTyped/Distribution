package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreDeleteGlobalSecondaryIndexActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be deleted.</p>
    */
  var IndexName: String
}

object _DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String): _DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName)
  
    __obj.asInstanceOf[_DeleteGlobalSecondaryIndexAction]
  }
}

