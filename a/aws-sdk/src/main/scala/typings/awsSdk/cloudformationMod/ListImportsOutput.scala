package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImportsOutput extends js.Object {
  /**
    * A list of stack names that are importing the specified exported output value. 
    */
  var Imports: js.UndefOr[typings.awsSdk.cloudformationMod.Imports] = js.native
  /**
    * A string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListImportsOutput {
  @scala.inline
  def apply(Imports: Imports = null, NextToken: NextToken = null): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    if (Imports != null) __obj.updateDynamic("Imports")(Imports.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsOutput]
  }
}

