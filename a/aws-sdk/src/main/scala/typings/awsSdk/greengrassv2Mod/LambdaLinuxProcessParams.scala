package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaLinuxProcessParams extends StObject {
  
  /**
    * The parameters for the container in which the Lambda function runs.
    */
  var containerParams: js.UndefOr[LambdaContainerParams] = js.undefined
  
  /**
    * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime environment inside the IoT Greengrass container, or as a regular process outside any container. Default: GreengrassContainer 
    */
  var isolationMode: js.UndefOr[LambdaIsolationMode] = js.undefined
}
object LambdaLinuxProcessParams {
  
  inline def apply(): LambdaLinuxProcessParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaLinuxProcessParams]
  }
  
  extension [Self <: LambdaLinuxProcessParams](x: Self) {
    
    inline def setContainerParams(value: LambdaContainerParams): Self = StObject.set(x, "containerParams", value.asInstanceOf[js.Any])
    
    inline def setContainerParamsUndefined: Self = StObject.set(x, "containerParams", js.undefined)
    
    inline def setIsolationMode(value: LambdaIsolationMode): Self = StObject.set(x, "isolationMode", value.asInstanceOf[js.Any])
    
    inline def setIsolationModeUndefined: Self = StObject.set(x, "isolationMode", js.undefined)
  }
}
