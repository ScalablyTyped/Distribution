package typings.awsSdkClientDynamodbBrowser.typesDeleteGlobalSecondaryIndexActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be deleted.</p>
    */
  var IndexName: String
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
}

