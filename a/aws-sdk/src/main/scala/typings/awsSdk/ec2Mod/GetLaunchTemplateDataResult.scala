package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateDataResult extends StObject {
  
  /**
    * The instance data.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.undefined
}
object GetLaunchTemplateDataResult {
  
  inline def apply(): GetLaunchTemplateDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchTemplateDataResult]
  }
  
  extension [Self <: GetLaunchTemplateDataResult](x: Self) {
    
    inline def setLaunchTemplateData(value: ResponseLaunchTemplateData): Self = StObject.set(x, "LaunchTemplateData", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateDataUndefined: Self = StObject.set(x, "LaunchTemplateData", js.undefined)
  }
}
