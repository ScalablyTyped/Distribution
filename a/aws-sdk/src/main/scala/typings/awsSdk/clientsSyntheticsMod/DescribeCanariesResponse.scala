package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCanariesResponse extends StObject {
  
  /**
    * Returns an array. Each item in the array contains the full information about one canary.
    */
  var Canaries: js.UndefOr[typings.awsSdk.clientsSyntheticsMod.Canaries] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeCanaries operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeCanariesResponse {
  
  inline def apply(): DescribeCanariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCanariesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCanariesResponse] (val x: Self) extends AnyVal {
    
    inline def setCanaries(value: Canaries): Self = StObject.set(x, "Canaries", value.asInstanceOf[js.Any])
    
    inline def setCanariesUndefined: Self = StObject.set(x, "Canaries", js.undefined)
    
    inline def setCanariesVarargs(value: Canary*): Self = StObject.set(x, "Canaries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
