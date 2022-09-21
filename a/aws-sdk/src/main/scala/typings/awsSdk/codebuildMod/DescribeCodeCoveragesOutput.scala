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
  
  inline def apply(): DescribeCodeCoveragesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeCoveragesOutput]
  }
  
  extension [Self <: DescribeCodeCoveragesOutput](x: Self) {
    
    inline def setCodeCoverages(value: CodeCoverages): Self = StObject.set(x, "codeCoverages", value.asInstanceOf[js.Any])
    
    inline def setCodeCoveragesUndefined: Self = StObject.set(x, "codeCoverages", js.undefined)
    
    inline def setCodeCoveragesVarargs(value: CodeCoverage*): Self = StObject.set(x, "codeCoverages", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
