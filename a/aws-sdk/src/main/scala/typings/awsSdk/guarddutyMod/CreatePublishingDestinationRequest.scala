package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublishingDestinationRequest extends StObject {
  
  /**
    * The idempotency token for the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.undefined
  
  /**
    * The properties of the publishing destination, including the ARNs for the destination and the KMS key used for encryption.
    */
  var DestinationProperties: typings.awsSdk.guarddutyMod.DestinationProperties
  
  /**
    * The type of resource for the publishing destination. Currently only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.guarddutyMod.DestinationType
  
  /**
    * The ID of the GuardDuty detector associated with the publishing destination.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object CreatePublishingDestinationRequest {
  
  inline def apply(
    DestinationProperties: DestinationProperties,
    DestinationType: DestinationType,
    DetectorId: DetectorId
  ): CreatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationProperties = DestinationProperties.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationRequest]
  }
  
  extension [Self <: CreatePublishingDestinationRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDestinationProperties(value: DestinationProperties): Self = StObject.set(x, "DestinationProperties", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
