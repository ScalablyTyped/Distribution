package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployAsApplicationConfigurationDescription extends StObject {
  
  /**
    * The location that holds the data required to specify an Amazon Data Analytics application.
    */
  var S3ContentLocationDescription: S3ContentBaseLocationDescription
}
object DeployAsApplicationConfigurationDescription {
  
  inline def apply(S3ContentLocationDescription: S3ContentBaseLocationDescription): DeployAsApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal(S3ContentLocationDescription = S3ContentLocationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployAsApplicationConfigurationDescription]
  }
  
  extension [Self <: DeployAsApplicationConfigurationDescription](x: Self) {
    
    inline def setS3ContentLocationDescription(value: S3ContentBaseLocationDescription): Self = StObject.set(x, "S3ContentLocationDescription", value.asInstanceOf[js.Any])
  }
}
