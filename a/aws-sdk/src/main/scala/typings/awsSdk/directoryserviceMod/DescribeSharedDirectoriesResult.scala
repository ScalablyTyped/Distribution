package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSharedDirectoriesResult extends StObject {
  
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
  
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectories] = js.undefined
}
object DescribeSharedDirectoriesResult {
  
  inline def apply(): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
  
  extension [Self <: DescribeSharedDirectoriesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSharedDirectories(value: SharedDirectories): Self = StObject.set(x, "SharedDirectories", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoriesUndefined: Self = StObject.set(x, "SharedDirectories", js.undefined)
    
    inline def setSharedDirectoriesVarargs(value: SharedDirectory*): Self = StObject.set(x, "SharedDirectories", js.Array(value :_*))
  }
}
