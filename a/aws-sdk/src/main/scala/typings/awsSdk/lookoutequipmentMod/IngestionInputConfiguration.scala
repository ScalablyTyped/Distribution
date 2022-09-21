package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestionInputConfiguration extends StObject {
  
  /**
    * The location information for the S3 bucket used for input data for the data ingestion. 
    */
  var S3InputConfiguration: IngestionS3InputConfiguration
}
object IngestionInputConfiguration {
  
  inline def apply(S3InputConfiguration: IngestionS3InputConfiguration): IngestionInputConfiguration = {
    val __obj = js.Dynamic.literal(S3InputConfiguration = S3InputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestionInputConfiguration]
  }
  
  extension [Self <: IngestionInputConfiguration](x: Self) {
    
    inline def setS3InputConfiguration(value: IngestionS3InputConfiguration): Self = StObject.set(x, "S3InputConfiguration", value.asInstanceOf[js.Any])
  }
}
