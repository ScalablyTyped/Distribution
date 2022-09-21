package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchTemplateVersionsResult extends StObject {
  
  /**
    * Information about the launch template versions.
    */
  var LaunchTemplateVersions: js.UndefOr[LaunchTemplateVersionSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLaunchTemplateVersionsResult {
  
  inline def apply(): DescribeLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsResult]
  }
  
  extension [Self <: DescribeLaunchTemplateVersionsResult](x: Self) {
    
    inline def setLaunchTemplateVersions(value: LaunchTemplateVersionSet): Self = StObject.set(x, "LaunchTemplateVersions", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateVersionsUndefined: Self = StObject.set(x, "LaunchTemplateVersions", js.undefined)
    
    inline def setLaunchTemplateVersionsVarargs(value: LaunchTemplateVersion*): Self = StObject.set(x, "LaunchTemplateVersions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
