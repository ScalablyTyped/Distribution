package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceShare extends StObject {
  
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time when the resource share was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates how the resource share was created. Possible values include:    CREATED_FROM_POLICY - Indicates that the resource share was created from an AWS Identity and Access Management (AWS IAM) policy attached to a resource. These resource shares are visible only to the AWS account that created it. They cannot be modified in AWS RAM.    PROMOTING_TO_STANDARD - The resource share is in the process of being promoted. For more information, see PromoteResourceShareCreatedFromPolicy.    STANDARD - Indicates that the resource share was created in AWS RAM using the console or APIs. These resource shares are visible to all principals. They can be modified in AWS RAM.  
    */
  var featureSet: js.UndefOr[ResourceShareFeatureSet] = js.undefined
  
  /**
    * The time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.undefined
  
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The tags for the resource share.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object ResourceShare {
  
  inline def apply(): ResourceShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShare]
  }
  
  extension [Self <: ResourceShare](x: Self) {
    
    inline def setAllowExternalPrincipals(value: Boolean): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
    
    inline def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFeatureSet(value: ResourceShareFeatureSet): Self = StObject.set(x, "featureSet", value.asInstanceOf[js.Any])
    
    inline def setFeatureSetUndefined: Self = StObject.set(x, "featureSet", js.undefined)
    
    inline def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwningAccountId(value: String): Self = StObject.set(x, "owningAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwningAccountIdUndefined: Self = StObject.set(x, "owningAccountId", js.undefined)
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setStatus(value: ResourceShareStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
