package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelVersionsResult extends StObject {
  
  /**
    * The model version details.
    */
  var modelVersionDetails: js.UndefOr[modelVersionDetailList] = js.undefined
  
  /**
    * The next token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeModelVersionsResult {
  
  @scala.inline
  def apply(): DescribeModelVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelVersionsResult]
  }
  
  @scala.inline
  implicit class DescribeModelVersionsResultMutableBuilder[Self <: DescribeModelVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelVersionDetails(value: modelVersionDetailList): Self = StObject.set(x, "modelVersionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionDetailsUndefined: Self = StObject.set(x, "modelVersionDetails", js.undefined)
    
    @scala.inline
    def setModelVersionDetailsVarargs(value: ModelVersionDetail*): Self = StObject.set(x, "modelVersionDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
