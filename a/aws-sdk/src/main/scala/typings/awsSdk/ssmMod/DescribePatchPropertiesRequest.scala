package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchPropertiesRequest extends StObject {
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: typings.awsSdk.ssmMod.OperatingSystem
  
  /**
    * Indicates whether to list patches for the Windows operating system or for applications released by Microsoft. Not applicable for the Linux or macOS operating systems.
    */
  var PatchSet: js.UndefOr[typings.awsSdk.ssmMod.PatchSet] = js.undefined
  
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty
}
object DescribePatchPropertiesRequest {
  
  inline def apply(OperatingSystem: OperatingSystem, Property: PatchProperty): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
  
  extension [Self <: DescribePatchPropertiesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setPatchSet(value: PatchSet): Self = StObject.set(x, "PatchSet", value.asInstanceOf[js.Any])
    
    inline def setPatchSetUndefined: Self = StObject.set(x, "PatchSet", js.undefined)
    
    inline def setProperty(value: PatchProperty): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
  }
}
