package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSigningJobResponse extends StObject {
  
  /**
    * Date and time that the signing job was completed.
    */
  var completedAt: js.UndefOr[CompletedAt] = js.undefined
  
  /**
    * Date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The ID of the signing job on output.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * A list of any overrides that were applied to the signing operation.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  
  /**
    * The microcontroller platform to which your signed code image will be distributed.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * The name of the profile that initiated the signing operation.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.undefined
  
  /**
    * Name of the S3 bucket where the signed code image is saved by code signing.
    */
  var signedObject: js.UndefOr[SignedObject] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of your code signing certificate.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  
  /**
    * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  
  /**
    * The object that contains the name of your S3 bucket or your raw code.
    */
  var source: js.UndefOr[Source] = js.undefined
  
  /**
    * Status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
  
  /**
    * String value that contains the status reason.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}
object DescribeSigningJobResponse {
  
  inline def apply(): DescribeSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSigningJobResponse]
  }
  
  extension [Self <: DescribeSigningJobResponse](x: Self) {
    
    inline def setCompletedAt(value: CompletedAt): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setOverrides(value: SigningPlatformOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setRequestedBy(value: RequestedBy): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setRequestedByUndefined: Self = StObject.set(x, "requestedBy", js.undefined)
    
    inline def setSignedObject(value: SignedObject): Self = StObject.set(x, "signedObject", value.asInstanceOf[js.Any])
    
    inline def setSignedObjectUndefined: Self = StObject.set(x, "signedObject", js.undefined)
    
    inline def setSigningMaterial(value: SigningMaterial): Self = StObject.set(x, "signingMaterial", value.asInstanceOf[js.Any])
    
    inline def setSigningMaterialUndefined: Self = StObject.set(x, "signingMaterial", js.undefined)
    
    inline def setSigningParameters(value: SigningParameters): Self = StObject.set(x, "signingParameters", value.asInstanceOf[js.Any])
    
    inline def setSigningParametersUndefined: Self = StObject.set(x, "signingParameters", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: SigningStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
