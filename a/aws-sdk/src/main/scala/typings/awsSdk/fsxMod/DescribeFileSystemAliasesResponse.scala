package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemAliasesResponse extends StObject {
  
  /**
    * An array of one or more DNS aliases currently associated with the specified file system.
    */
  var Aliases: js.UndefOr[typings.awsSdk.fsxMod.Aliases] = js.undefined
  
  /**
    * Present if there are more DNS aliases than returned in the response (String). You can use the NextToken value in a later request to fetch additional descriptions. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.undefined
}
object DescribeFileSystemAliasesResponse {
  
  inline def apply(): DescribeFileSystemAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemAliasesResponse]
  }
  
  extension [Self <: DescribeFileSystemAliasesResponse](x: Self) {
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
