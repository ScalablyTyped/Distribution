package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workforce extends StObject {
  
  /**
    * The configuration of an Amazon Cognito workforce. A single Cognito workforce is created using and corresponds to a single  Amazon Cognito user pool.
    */
  var CognitoConfig: js.UndefOr[typings.awsSdk.sagemakerMod.CognitoConfig] = js.undefined
  
  /**
    * The date that the workforce is created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The most recent date that was used to successfully add one or more IP address ranges (CIDRs) to a private workforce's allow list.
    */
  var LastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The configuration of an OIDC Identity Provider (IdP) private workforce.
    */
  var OidcConfig: js.UndefOr[OidcConfigForResponse] = js.undefined
  
  /**
    * A list of one to ten IP address ranges (CIDRs) to be added to the workforce allow list. By default, a workforce isn't restricted to specific IP addresses.
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.undefined
  
  /**
    * The subdomain for your OIDC Identity Provider.
    */
  var SubDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the private workforce.
    */
  var WorkforceArn: typings.awsSdk.sagemakerMod.WorkforceArn
  
  /**
    * The name of the private workforce.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
}
object Workforce {
  
  @scala.inline
  def apply(WorkforceArn: WorkforceArn, WorkforceName: WorkforceName): Workforce = {
    val __obj = js.Dynamic.literal(WorkforceArn = WorkforceArn.asInstanceOf[js.Any], WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workforce]
  }
  
  @scala.inline
  implicit class WorkforceMutableBuilder[Self <: Workforce] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCognitoConfig(value: CognitoConfig): Self = StObject.set(x, "CognitoConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoConfigUndefined: Self = StObject.set(x, "CognitoConfig", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Timestamp): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setOidcConfig(value: OidcConfigForResponse): Self = StObject.set(x, "OidcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcConfigUndefined: Self = StObject.set(x, "OidcConfig", js.undefined)
    
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    @scala.inline
    def setSubDomain(value: String): Self = StObject.set(x, "SubDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainUndefined: Self = StObject.set(x, "SubDomain", js.undefined)
    
    @scala.inline
    def setWorkforceArn(value: WorkforceArn): Self = StObject.set(x, "WorkforceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
