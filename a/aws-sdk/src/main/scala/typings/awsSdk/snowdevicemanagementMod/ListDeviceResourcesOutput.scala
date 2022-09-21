package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceResourcesOutput extends StObject {
  
  /**
    * A pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A structure defining the resource's type, Amazon Resource Name (ARN), and ID.
    */
  var resources: js.UndefOr[ResourceSummaryList] = js.undefined
}
object ListDeviceResourcesOutput {
  
  inline def apply(): ListDeviceResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceResourcesOutput]
  }
  
  extension [Self <: ListDeviceResourcesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResources(value: ResourceSummaryList): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: ResourceSummary*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
