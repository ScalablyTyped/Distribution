package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeCoveragesOutput extends js.Object {
  
  /**
    * An array of CodeCoverage objects that contain the results.
    */
  var codeCoverages: js.UndefOr[CodeCoverages] = js.native
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to DescribeCodeCoverages to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object DescribeCodeCoveragesOutput {
  
  @scala.inline
  def apply(): DescribeCodeCoveragesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeCoveragesOutput]
  }
  
  @scala.inline
  implicit class DescribeCodeCoveragesOutputOps[Self <: DescribeCodeCoveragesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodeCoveragesVarargs(value: CodeCoverage*): Self = this.set("codeCoverages", js.Array(value :_*))
    
    @scala.inline
    def setCodeCoverages(value: CodeCoverages): Self = this.set("codeCoverages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeCoverages: Self = this.set("codeCoverages", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
