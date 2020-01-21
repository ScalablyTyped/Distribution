package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutpostsOutput extends js.Object {
  var NextToken: js.UndefOr[Token] = js.native
  var Outposts: js.UndefOr[outpostListDefinition] = js.native
}

object ListOutpostsOutput {
  @scala.inline
  def apply(NextToken: Token = null, Outposts: outpostListDefinition = null): ListOutpostsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Outposts != null) __obj.updateDynamic("Outposts")(Outposts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOutpostsOutput]
  }
}

