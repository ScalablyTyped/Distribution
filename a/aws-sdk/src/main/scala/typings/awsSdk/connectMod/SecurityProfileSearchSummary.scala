package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileSearchSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the security profile.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The description of the security profile.
    */
  var Description: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The identifier of the security profile.
    */
  var Id: js.UndefOr[SecurityProfileId] = js.undefined
  
  /**
    * The organization resource identifier.
    */
  var OrganizationResourceId: js.UndefOr[InstanceId] = js.undefined
  
  /**
    * The name of the security profile.
    */
  var SecurityProfileName: js.UndefOr[typings.awsSdk.connectMod.SecurityProfileName] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object SecurityProfileSearchSummary {
  
  inline def apply(): SecurityProfileSearchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileSearchSummary]
  }
  
  extension [Self <: SecurityProfileSearchSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: SecurityProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: SecurityProfileId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setOrganizationResourceId(value: InstanceId): Self = StObject.set(x, "OrganizationResourceId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationResourceIdUndefined: Self = StObject.set(x, "OrganizationResourceId", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "SecurityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "SecurityProfileName", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
