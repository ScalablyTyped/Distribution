package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workteam extends StObject {
  
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the work team.
    */
  var Description: String200
  
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of MemberDefinition objects that contains objects that identify the workers that make up the work team.  Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use CognitoMemberDefinition. For workforces created using your own OIDC identity provider (IdP) use OidcMemberDefinition.
    */
  var MemberDefinitions: typings.awsSdk.sagemakerMod.MemberDefinitions
  
  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.sagemakerMod.NotificationConfiguration] = js.undefined
  
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.undefined
  
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the workforce.
    */
  var WorkforceArn: js.UndefOr[typings.awsSdk.sagemakerMod.WorkforceArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn
  
  /**
    * The name of the work team.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName
}
object Workteam {
  
  inline def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamArn: WorkteamArn,
    WorkteamName: WorkteamName
  ): Workteam = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workteam]
  }
  
  extension [Self <: Workteam](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDescription(value: String200): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setMemberDefinitions(value: MemberDefinitions): Self = StObject.set(x, "MemberDefinitions", value.asInstanceOf[js.Any])
    
    inline def setMemberDefinitionsVarargs(value: MemberDefinition*): Self = StObject.set(x, "MemberDefinitions", js.Array(value*))
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    inline def setProductListingIds(value: ProductListings): Self = StObject.set(x, "ProductListingIds", value.asInstanceOf[js.Any])
    
    inline def setProductListingIdsUndefined: Self = StObject.set(x, "ProductListingIds", js.undefined)
    
    inline def setProductListingIdsVarargs(value: String*): Self = StObject.set(x, "ProductListingIds", js.Array(value*))
    
    inline def setSubDomain(value: String): Self = StObject.set(x, "SubDomain", value.asInstanceOf[js.Any])
    
    inline def setSubDomainUndefined: Self = StObject.set(x, "SubDomain", js.undefined)
    
    inline def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
    
    inline def setWorkforceArnUndefined: Self = StObject.set(x, "WorkforceArn", js.undefined)
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
    
    inline def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
