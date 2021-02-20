package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFileSystemAliasesResponse extends StObject {
  
  /**
    * An array of one or more DNS aliases currently associated with the specified file system.
    */
  var Aliases: js.UndefOr[typings.awsSdk.fsxMod.Aliases] = js.native
  
  /**
    * Present if there are more DNS aliases than returned in the response (String). You can use the NextToken value in a later request to fetch additional descriptions. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.native
}
object DescribeFileSystemAliasesResponse {
  
  @scala.inline
  def apply(): DescribeFileSystemAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemAliasesResponse]
  }
  
  @scala.inline
  implicit class DescribeFileSystemAliasesResponseMutableBuilder[Self <: DescribeFileSystemAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
