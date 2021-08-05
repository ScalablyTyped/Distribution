package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTypeDefaultVersionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the type for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.undefined
  
  /**
    * The kind of type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.undefined
  
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.undefined
}
object SetTypeDefaultVersionInput {
  
  inline def apply(): SetTypeDefaultVersionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetTypeDefaultVersionInput]
  }
  
  extension [Self <: SetTypeDefaultVersionInput](x: Self) {
    
    inline def setArn(value: PrivateTypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
