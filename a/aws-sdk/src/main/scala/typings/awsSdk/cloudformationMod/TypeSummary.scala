package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeSummary extends StObject {
  
  /**
    * The ID of the default version of the extension. The default version is used when the extension version isn't specified. This applies only to private extensions you have registered in your account. For public extensions, both those provided by Amazon and published by third parties, CloudFormation returns null. For more information, see RegisterType. To set the default version of an extension, use  SetTypeDefaultVersion .
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.undefined
  
  /**
    * The description of the extension.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * Whether the extension is activated for this account and region. This applies only to third-party public extensions. Extensions published by Amazon are activated by default.
    */
  var IsActivated: js.UndefOr[typings.awsSdk.cloudformationMod.IsActivated] = js.undefined
  
  /**
    * When the specified extension version was registered. This applies only to:   Private extensions you have registered in your account. For more information, see RegisterType.   Public extensions you have activated in your account with auto-update specified. For more information, see ActivateType.   For all other extension types, CloudFormation returns null.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the latest version of the public extension that is available. For any extensions other than activated third-arty extensions, CloudFormation returns null. How you specified AutoUpdate when enabling the extension affects whether CloudFormation automatically updates the extension in this account and region when a new version is released. For more information, see Setting CloudFormation to automatically use new versions of extensions in the CloudFormation User Guide.
    */
  var LatestPublicVersion: js.UndefOr[PublicVersionNumber] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the type name of the public extension. If you specified a TypeNameAlias when enabling the extension in this account and region, CloudFormation treats that alias as the extension's type name within the account and region, not the type name of the public extension. For more information, see Specifying aliases to refer to extensions in the CloudFormation User Guide.
    */
  var OriginalTypeName: js.UndefOr[TypeName] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the version of the public extension to be used for CloudFormation operations in this account and Region. How you specified AutoUpdate when enabling the extension affects whether CloudFormation automatically updates the extension in this account and region when a new version is released. For more information, see Setting CloudFormation to automatically use new versions of extensions in the CloudFormation User Guide.
    */
  var PublicVersionNumber: js.UndefOr[typings.awsSdk.cloudformationMod.PublicVersionNumber] = js.undefined
  
  /**
    * The ID of the extension publisher, if the extension is published by a third party. Extensions published by Amazon don't return a publisher ID.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.cloudformationMod.PublisherId] = js.undefined
  
  /**
    * The service used to verify the publisher identity. For more information, see Registering your account to publish CloudFormation extensions in the  CFN-CLI User Guide for Extension Development.
    */
  var PublisherIdentity: js.UndefOr[IdentityProvider] = js.undefined
  
  /**
    * The publisher name, as defined in the public profile for that publisher in the service used to verify the publisher identity.
    */
  var PublisherName: js.UndefOr[typings.awsSdk.cloudformationMod.PublisherName] = js.undefined
  
  /**
    * The kind of extension.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the extension.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.undefined
  
  /**
    * The name of the extension. If you specified a TypeNameAlias when you activate this extension in your account and region, CloudFormation considers that alias as the type name.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
}
object TypeSummary {
  
  inline def apply(): TypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeSummary]
  }
  
  extension [Self <: TypeSummary](x: Self) {
    
    inline def setDefaultVersionId(value: TypeVersionId): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsActivated(value: IsActivated): Self = StObject.set(x, "IsActivated", value.asInstanceOf[js.Any])
    
    inline def setIsActivatedUndefined: Self = StObject.set(x, "IsActivated", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setLatestPublicVersion(value: PublicVersionNumber): Self = StObject.set(x, "LatestPublicVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestPublicVersionUndefined: Self = StObject.set(x, "LatestPublicVersion", js.undefined)
    
    inline def setOriginalTypeName(value: TypeName): Self = StObject.set(x, "OriginalTypeName", value.asInstanceOf[js.Any])
    
    inline def setOriginalTypeNameUndefined: Self = StObject.set(x, "OriginalTypeName", js.undefined)
    
    inline def setPublicVersionNumber(value: PublicVersionNumber): Self = StObject.set(x, "PublicVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicVersionNumberUndefined: Self = StObject.set(x, "PublicVersionNumber", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setPublisherIdentity(value: IdentityProvider): Self = StObject.set(x, "PublisherIdentity", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdentityUndefined: Self = StObject.set(x, "PublisherIdentity", js.undefined)
    
    inline def setPublisherName(value: PublisherName): Self = StObject.set(x, "PublisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "PublisherName", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    inline def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
