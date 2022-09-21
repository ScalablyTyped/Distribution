package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployAsApplicationConfiguration extends StObject {
  
  /**
    * The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version number of the Amazon S3 object that contains the data. 
    */
  var S3ContentLocation: S3ContentBaseLocation
}
object DeployAsApplicationConfiguration {
  
  inline def apply(S3ContentLocation: S3ContentBaseLocation): DeployAsApplicationConfiguration = {
    val __obj = js.Dynamic.literal(S3ContentLocation = S3ContentLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployAsApplicationConfiguration]
  }
  
  extension [Self <: DeployAsApplicationConfiguration](x: Self) {
    
    inline def setS3ContentLocation(value: S3ContentBaseLocation): Self = StObject.set(x, "S3ContentLocation", value.asInstanceOf[js.Any])
  }
}
