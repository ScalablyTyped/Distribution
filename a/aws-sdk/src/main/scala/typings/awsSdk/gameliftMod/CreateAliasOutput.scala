package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasOutput extends js.Object {
  /**
    * The newly created alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.native
}

object CreateAliasOutput {
  @scala.inline
  def apply(Alias: Alias = null): CreateAliasOutput = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasOutput]
  }
}

