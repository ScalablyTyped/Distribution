package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemsResponse extends StObject {
  
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[typings.awsSdk.fsxMod.FileSystems] = js.undefined
  
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.undefined
}
object DescribeFileSystemsResponse {
  
  inline def apply(): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
  
  extension [Self <: DescribeFileSystemsResponse](x: Self) {
    
    inline def setFileSystems(value: FileSystems): Self = StObject.set(x, "FileSystems", value.asInstanceOf[js.Any])
    
    inline def setFileSystemsUndefined: Self = StObject.set(x, "FileSystems", js.undefined)
    
    inline def setFileSystemsVarargs(value: FileSystem*): Self = StObject.set(x, "FileSystems", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
