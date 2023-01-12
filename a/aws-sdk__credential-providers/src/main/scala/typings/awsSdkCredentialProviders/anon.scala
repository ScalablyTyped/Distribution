package typings.awsSdkCredentialProviders

import typings.awsSdkClientSts.distTypesModelsModels0Mod.PolicyDescriptorType
import typings.awsSdkClientSts.distTypesModelsModels0Mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@aws-sdk/client-sts.@aws-sdk/client-sts.AssumeRoleCommandInput, 'RoleSessionName'> & {  RoleSessionName :string | undefined} */
  trait OmitAssumeRoleCommandInpu extends StObject {
    
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    var ExternalId: js.UndefOr[String] = js.undefined
    
    var Policy: js.UndefOr[String] = js.undefined
    
    var PolicyArns: js.UndefOr[js.Array[PolicyDescriptorType]] = js.undefined
    
    var RoleArn: js.UndefOr[String] = js.undefined
    
    var RoleSessionName: js.UndefOr[String] = js.undefined
    
    var SerialNumber: js.UndefOr[String] = js.undefined
    
    var SourceIdentity: js.UndefOr[String] = js.undefined
    
    var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
    
    var TokenCode: js.UndefOr[String] = js.undefined
    
    var TransitiveTagKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object OmitAssumeRoleCommandInpu {
    
    inline def apply(): OmitAssumeRoleCommandInpu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitAssumeRoleCommandInpu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitAssumeRoleCommandInpu] (val x: Self) extends AnyVal {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setExternalId(value: String): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyArns(value: js.Array[PolicyDescriptorType]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
      
      inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
      
      inline def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
      
      inline def setRoleSessionName(value: String): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
      
      inline def setRoleSessionNameUndefined: Self = StObject.set(x, "RoleSessionName", js.undefined)
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
      
      inline def setSourceIdentity(value: String): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
      
      inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
      
      inline def setTokenCode(value: String): Self = StObject.set(x, "TokenCode", value.asInstanceOf[js.Any])
      
      inline def setTokenCodeUndefined: Self = StObject.set(x, "TokenCode", js.undefined)
      
      inline def setTransitiveTagKeys(value: js.Array[String]): Self = StObject.set(x, "TransitiveTagKeys", value.asInstanceOf[js.Any])
      
      inline def setTransitiveTagKeysUndefined: Self = StObject.set(x, "TransitiveTagKeys", js.undefined)
      
      inline def setTransitiveTagKeysVarargs(value: String*): Self = StObject.set(x, "TransitiveTagKeys", js.Array(value*))
    }
  }
}
