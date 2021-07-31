package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grantee extends StObject {
  
  /**
    * Screen name of the grantee.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.s3Mod.DisplayName] = js.undefined
  
  /**
    * Email address of the grantee.  Using email addresses to specify a grantee is only supported in the following AWS Regions:    US East (N. Virginia)   US West (N. California)    US West (Oregon)    Asia Pacific (Singapore)   Asia Pacific (Sydney)   Asia Pacific (Tokyo)   Europe (Ireland)   South America (São Paulo)   For a list of all the Amazon S3 supported Regions and endpoints, see Regions and Endpoints in the AWS General Reference. 
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.s3Mod.EmailAddress] = js.undefined
  
  /**
    * The canonical user ID of the grantee.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.undefined
  
  /**
    * Type of grantee
    */
  var Type: typings.awsSdk.s3Mod.Type
  
  /**
    * URI of the grantee group.
    */
  var URI: js.UndefOr[typings.awsSdk.s3Mod.URI] = js.undefined
}
object Grantee {
  
  @scala.inline
  def apply(Type: Type): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  
  @scala.inline
  implicit class GranteeMutableBuilder[Self <: Grantee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: URI): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
