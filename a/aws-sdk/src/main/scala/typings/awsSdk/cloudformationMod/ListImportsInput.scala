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
  def apply(ExportName: ExportName): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsInput]
  }
  @scala.inline
  implicit class ListImportsInputOps[Self <: ListImportsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExportName(value: ExportName): Self = this.set("ExportName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

