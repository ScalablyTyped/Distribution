package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportConfigurationsResponse extends StObject {
  
  /**
    * 
    */
  var exportsInfo: js.UndefOr[ExportsInfo] = js.undefined
  
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeExportConfigurationsResponse {
  
  inline def apply(): DescribeExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportConfigurationsResponse]
  }
  
  extension [Self <: DescribeExportConfigurationsResponse](x: Self) {
    
    inline def setExportsInfo(value: ExportsInfo): Self = StObject.set(x, "exportsInfo", value.asInstanceOf[js.Any])
    
    inline def setExportsInfoUndefined: Self = StObject.set(x, "exportsInfo", js.undefined)
    
    inline def setExportsInfoVarargs(value: ExportInfo*): Self = StObject.set(x, "exportsInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
