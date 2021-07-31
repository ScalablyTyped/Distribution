package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCodeCoveragesOutput extends StObject {
  
  /**
    * An array of CodeCoverage objects that contain the results.
    */
  var codeCoverages: js.UndefOr[CodeCoverages] = js.undefined
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to DescribeCodeCoverages to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeCodeCoveragesOutput {
  
  @scala.inline
  def apply(): DescribeCodeCoveragesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeCoveragesOutput]
  }
  
  @scala.inline
  implicit class DescribeCodeCoveragesOutputMutableBuilder[Self <: DescribeCodeCoveragesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeCoverages(value: CodeCoverages): Self = StObject.set(x, "codeCoverages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeCoveragesUndefined: Self = StObject.set(x, "codeCoverages", js.undefined)
    
    @scala.inline
    def setCodeCoveragesVarargs(value: CodeCoverage*): Self = StObject.set(x, "codeCoverages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
