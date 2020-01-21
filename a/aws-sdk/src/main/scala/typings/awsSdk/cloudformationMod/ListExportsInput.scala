package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExportsInput extends js.Object {
  /**
    * A string (provided by the ListExports response output) that identifies the next page of exported output values that you asked to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListExportsInput {
  @scala.inline
  def apply(NextToken: NextToken = null): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExportsInput]
  }
}

