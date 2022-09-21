package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeProfilesRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The identifiers of the fields in the profile that has the information you want to apply to the merge. For example, say you want to merge EmailAddress from Profile1 into MainProfile. This would be the identifier of the EmailAddress field in Profile1. 
    */
  var FieldSourceProfileIds: js.UndefOr[typings.awsSdk.customerprofilesMod.FieldSourceProfileIds] = js.undefined
  
  /**
    * The identifier of the profile to be taken.
    */
  var MainProfileId: uuid
  
  /**
    * The identifier of the profile to be merged into MainProfileId.
    */
  var ProfileIdsToBeMerged: ProfileIdToBeMergedList
}
object MergeProfilesRequest {
  
  inline def apply(DomainName: name, MainProfileId: uuid, ProfileIdsToBeMerged: ProfileIdToBeMergedList): MergeProfilesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], MainProfileId = MainProfileId.asInstanceOf[js.Any], ProfileIdsToBeMerged = ProfileIdsToBeMerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeProfilesRequest]
  }
  
  extension [Self <: MergeProfilesRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setFieldSourceProfileIds(value: FieldSourceProfileIds): Self = StObject.set(x, "FieldSourceProfileIds", value.asInstanceOf[js.Any])
    
    inline def setFieldSourceProfileIdsUndefined: Self = StObject.set(x, "FieldSourceProfileIds", js.undefined)
    
    inline def setMainProfileId(value: uuid): Self = StObject.set(x, "MainProfileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdsToBeMerged(value: ProfileIdToBeMergedList): Self = StObject.set(x, "ProfileIdsToBeMerged", value.asInstanceOf[js.Any])
    
    inline def setProfileIdsToBeMergedVarargs(value: uuid*): Self = StObject.set(x, "ProfileIdsToBeMerged", js.Array(value*))
  }
}
