package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDataSourcesOutput extends js.Object {
  
  /**
    * An ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  
  /**
    * A list of DataSource that meet the search criteria. 
    */
  var Results: js.UndefOr[DataSources] = js.native
}
object DescribeDataSourcesOutput {
  
  @scala.inline
  def apply(): DescribeDataSourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourcesOutput]
  }
  
  @scala.inline
  implicit class DescribeDataSourcesOutputOps[Self <: DescribeDataSourcesOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: StringType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: DataSource*): Self = this.set("Results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: DataSources): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
}
