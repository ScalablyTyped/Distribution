package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteBuildsInput extends js.Object {
  /**
    * The IDs of the builds to delete.
    */
  var ids: BuildIds = js.native
}

object BatchDeleteBuildsInput {
  @scala.inline
  def apply(ids: BuildIds): BatchDeleteBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDeleteBuildsInput]
  }
}

