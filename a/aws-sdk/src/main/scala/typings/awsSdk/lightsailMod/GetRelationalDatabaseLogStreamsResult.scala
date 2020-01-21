package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogStreamsResult extends js.Object {
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.native
}

object GetRelationalDatabaseLogStreamsResult {
  @scala.inline
  def apply(logStreams: StringList = null): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    if (logStreams != null) __obj.updateDynamic("logStreams")(logStreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
}

