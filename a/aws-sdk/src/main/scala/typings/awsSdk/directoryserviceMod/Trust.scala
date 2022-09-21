package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trust extends StObject {
  
  /**
    * The date and time that the trust relationship was created.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Directory ID of the Amazon Web Services directory involved in the trust relationship.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The date and time that the trust relationship was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
    */
  var RemoteDomainName: js.UndefOr[typings.awsSdk.directoryserviceMod.RemoteDomainName] = js.undefined
  
  /**
    * Current state of selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.directoryserviceMod.SelectiveAuth] = js.undefined
  
  /**
    * The date and time that the TrustState was last updated.
    */
  var StateLastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The trust relationship direction.
    */
  var TrustDirection: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustDirection] = js.undefined
  
  /**
    * The unique ID of the trust relationship.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.undefined
  
  /**
    * The trust relationship state.
    */
  var TrustState: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustState] = js.undefined
  
  /**
    * The reason for the TrustState.
    */
  var TrustStateReason: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustStateReason] = js.undefined
  
  /**
    * The trust relationship type. Forest is the default.
    */
  var TrustType: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustType] = js.undefined
}
object Trust {
  
  inline def apply(): Trust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trust]
  }
  
  extension [Self <: Trust](x: Self) {
    
    inline def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setRemoteDomainName(value: RemoteDomainName): Self = StObject.set(x, "RemoteDomainName", value.asInstanceOf[js.Any])
    
    inline def setRemoteDomainNameUndefined: Self = StObject.set(x, "RemoteDomainName", js.undefined)
    
    inline def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    inline def setStateLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "StateLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setStateLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StateLastUpdatedDateTime", js.undefined)
    
    inline def setTrustDirection(value: TrustDirection): Self = StObject.set(x, "TrustDirection", value.asInstanceOf[js.Any])
    
    inline def setTrustDirectionUndefined: Self = StObject.set(x, "TrustDirection", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    inline def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
    
    inline def setTrustState(value: TrustState): Self = StObject.set(x, "TrustState", value.asInstanceOf[js.Any])
    
    inline def setTrustStateReason(value: TrustStateReason): Self = StObject.set(x, "TrustStateReason", value.asInstanceOf[js.Any])
    
    inline def setTrustStateReasonUndefined: Self = StObject.set(x, "TrustStateReason", js.undefined)
    
    inline def setTrustStateUndefined: Self = StObject.set(x, "TrustState", js.undefined)
    
    inline def setTrustType(value: TrustType): Self = StObject.set(x, "TrustType", value.asInstanceOf[js.Any])
    
    inline def setTrustTypeUndefined: Self = StObject.set(x, "TrustType", js.undefined)
  }
}
