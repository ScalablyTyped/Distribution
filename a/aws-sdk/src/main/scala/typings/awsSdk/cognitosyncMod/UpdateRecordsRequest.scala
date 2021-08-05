package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecordsRequest extends StObject {
  
  /**
    * Intended to supply a device ID that will populate the lastModifiedBy field referenced in other methods. The ClientContext field is not yet implemented.
    */
  var ClientContext: js.UndefOr[typings.awsSdk.cognitosyncMod.ClientContext] = js.undefined
  
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: typings.awsSdk.cognitosyncMod.DatasetName
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.cognitosyncMod.DeviceId] = js.undefined
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: typings.awsSdk.cognitosyncMod.IdentityId
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId
  
  /**
    * A list of patch operations.
    */
  var RecordPatches: js.UndefOr[RecordPatchList] = js.undefined
  
  /**
    * The SyncSessionToken returned by a previous call to ListRecords for this dataset and identity.
    */
  var SyncSessionToken: typings.awsSdk.cognitosyncMod.SyncSessionToken
}
object UpdateRecordsRequest {
  
  inline def apply(
    DatasetName: DatasetName,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId,
    SyncSessionToken: SyncSessionToken
  ): UpdateRecordsRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SyncSessionToken = SyncSessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecordsRequest]
  }
  
  extension [Self <: UpdateRecordsRequest](x: Self) {
    
    inline def setClientContext(value: ClientContext): Self = StObject.set(x, "ClientContext", value.asInstanceOf[js.Any])
    
    inline def setClientContextUndefined: Self = StObject.set(x, "ClientContext", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setRecordPatches(value: RecordPatchList): Self = StObject.set(x, "RecordPatches", value.asInstanceOf[js.Any])
    
    inline def setRecordPatchesUndefined: Self = StObject.set(x, "RecordPatches", js.undefined)
    
    inline def setRecordPatchesVarargs(value: RecordPatch*): Self = StObject.set(x, "RecordPatches", js.Array(value :_*))
    
    inline def setSyncSessionToken(value: SyncSessionToken): Self = StObject.set(x, "SyncSessionToken", value.asInstanceOf[js.Any])
  }
}
