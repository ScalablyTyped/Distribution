package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverQueryLogConfigAssociation extends StObject {
  
  /**
    * The date and time that the VPC was associated with the query logging configuration, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * If the value of Status is FAILED, the value of Error indicates the cause:    DESTINATION_NOT_FOUND: The specified destination (for example, an Amazon S3 bucket) was deleted.    ACCESS_DENIED: Permissions don't allow sending logs to the destination.   If the value of Status is a value other than FAILED, Error is null. 
    */
  var Error: js.UndefOr[ResolverQueryLogConfigAssociationError] = js.native
  
  /**
    * Contains additional information about the error. If the value or Error is null, the value of ErrorMessage also is null.
    */
  var ErrorMessage: js.UndefOr[ResolverQueryLogConfigAssociationErrorMessage] = js.native
  
  /**
    * The ID of the query logging association.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the query logging configuration that a VPC is associated with.
    */
  var ResolverQueryLogConfigId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the Amazon VPC that is associated with the query logging configuration.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.route53resolverMod.ResourceId] = js.native
  
  /**
    * The status of the specified query logging association. Valid values include the following:    CREATING: Resolver is creating an association between an Amazon VPC and a query logging configuration.    CREATED: The association between an Amazon VPC and a query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging association.    FAILED: Resolver either couldn't create or couldn't delete the query logging association.  
    */
  var Status: js.UndefOr[ResolverQueryLogConfigAssociationStatus] = js.native
}
object ResolverQueryLogConfigAssociation {
  
  @scala.inline
  def apply(): ResolverQueryLogConfigAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfigAssociation]
  }
  
  @scala.inline
  implicit class ResolverQueryLogConfigAssociationMutableBuilder[Self <: ResolverQueryLogConfigAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setError(value: ResolverQueryLogConfigAssociationError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: ResolverQueryLogConfigAssociationErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setResolverQueryLogConfigId(value: ResourceId): Self = StObject.set(x, "ResolverQueryLogConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverQueryLogConfigIdUndefined: Self = StObject.set(x, "ResolverQueryLogConfigId", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverQueryLogConfigAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
