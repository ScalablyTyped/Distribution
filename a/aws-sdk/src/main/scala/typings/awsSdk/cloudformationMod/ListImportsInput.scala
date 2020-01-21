package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImportsInput extends js.Object {
  /**
    * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value. 
    */
  var ExportName: typings.awsSdk.cloudformationMod.ExportName = js.native
  /**
    * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListImportsInput {
  @scala.inline
  def apply(ExportName: ExportName, NextToken: NextToken = null): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsInput]
  }
}

