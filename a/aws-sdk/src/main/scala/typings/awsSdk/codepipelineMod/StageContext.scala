package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageContext extends js.Object {
  /**
    * The name of the stage.
    */
  var name: js.UndefOr[StageName] = js.native
}

object StageContext {
  @scala.inline
  def apply(name: StageName = null): StageContext = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageContext]
  }
}

