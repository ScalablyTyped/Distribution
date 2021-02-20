package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSharedDirectoriesResult extends StObject {
  
  /**
    * If not null, token that indicates that more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeSharedDirectories to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
  
  /**
    * A list of all shared directories in your account.
    */
  var SharedDirectories: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectories] = js.native
}
object DescribeSharedDirectoriesResult {
  
  @scala.inline
  def apply(): DescribeSharedDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSharedDirectoriesResult]
  }
  
  @scala.inline
  implicit class DescribeSharedDirectoriesResultMutableBuilder[Self <: DescribeSharedDirectoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSharedDirectories(value: SharedDirectories): Self = StObject.set(x, "SharedDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoriesUndefined: Self = StObject.set(x, "SharedDirectories", js.undefined)
    
    @scala.inline
    def setSharedDirectoriesVarargs(value: SharedDirectory*): Self = StObject.set(x, "SharedDirectories", js.Array(value :_*))
  }
}
