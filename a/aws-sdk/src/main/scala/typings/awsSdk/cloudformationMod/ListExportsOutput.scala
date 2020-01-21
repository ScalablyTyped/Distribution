package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExportsOutput extends js.Object {
  /**
    * The output for the ListExports action.
    */
  var Exports: js.UndefOr[typings.awsSdk.cloudformationMod.Exports] = js.native
  /**
    * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListExportsOutput {
  @scala.inline
  def apply(Exports: Exports = null, NextToken: NextToken = null): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    if (Exports != null) __obj.updateDynamic("Exports")(Exports.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExportsOutput]
  }
}

