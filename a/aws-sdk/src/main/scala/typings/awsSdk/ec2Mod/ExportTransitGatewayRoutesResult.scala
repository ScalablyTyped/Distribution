package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTransitGatewayRoutesResult extends StObject {
  
  /**
    * The URL of the exported file in Amazon S3. For example, s3://bucket_name/VPCTransitGateway/TransitGatewayRouteTables/file_name.
    */
  var S3Location: js.UndefOr[String] = js.undefined
}
object ExportTransitGatewayRoutesResult {
  
  inline def apply(): ExportTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTransitGatewayRoutesResult]
  }
  
  extension [Self <: ExportTransitGatewayRoutesResult](x: Self) {
    
    inline def setS3Location(value: String): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
  }
}
