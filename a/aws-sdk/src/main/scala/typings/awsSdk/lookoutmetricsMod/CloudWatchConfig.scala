package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchConfig extends StObject {
  
  /**
    * Settings for backtest mode.
    */
  var BackTestConfiguration: js.UndefOr[typings.awsSdk.lookoutmetricsMod.BackTestConfiguration] = js.undefined
  
  /**
    * An IAM role that gives Amazon Lookout for Metrics permission to access data in Amazon CloudWatch.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
}
object CloudWatchConfig {
  
  inline def apply(): CloudWatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchConfig]
  }
  
  extension [Self <: CloudWatchConfig](x: Self) {
    
    inline def setBackTestConfiguration(value: BackTestConfiguration): Self = StObject.set(x, "BackTestConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBackTestConfigurationUndefined: Self = StObject.set(x, "BackTestConfiguration", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
