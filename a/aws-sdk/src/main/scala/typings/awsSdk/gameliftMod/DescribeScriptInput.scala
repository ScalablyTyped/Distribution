package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScriptInput extends js.Object {
  /**
    * A unique identifier for a Realtime script to retrieve properties for. You can use either the script ID or ARN value.
    */
  var ScriptId: typings.awsSdk.gameliftMod.ScriptId = js.native
}

object DescribeScriptInput {
  @scala.inline
  def apply(ScriptId: ScriptId): DescribeScriptInput = {
    val __obj = js.Dynamic.literal(ScriptId = ScriptId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeScriptInput]
  }
}

