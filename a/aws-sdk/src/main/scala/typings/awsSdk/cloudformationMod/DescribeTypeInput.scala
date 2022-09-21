package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTypeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * The version number of a public third-party extension.
    */
  var PublicVersionNumber: js.UndefOr[typings.awsSdk.cloudformationMod.PublicVersionNumber] = js.undefined
  
  /**
    * The publisher ID of the extension publisher. Extensions provided by Amazon Web Services are not assigned a publisher ID.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.cloudformationMod.PublisherId] = js.undefined
  
  /**
    * The kind of extension. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the extension. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
  
  /**
    * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the extension version when it is registered. If you specify a VersionId, DescribeType returns information about that specific extension version. Otherwise, it returns information about the default extension version.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.undefined
}
object DescribeTypeInput {
  
  inline def apply(): DescribeTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeInput]
  }
  
  extension [Self <: DescribeTypeInput](x: Self) {
    
    inline def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setPublicVersionNumber(value: PublicVersionNumber): Self = StObject.set(x, "PublicVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicVersionNumberUndefined: Self = StObject.set(x, "PublicVersionNumber", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
