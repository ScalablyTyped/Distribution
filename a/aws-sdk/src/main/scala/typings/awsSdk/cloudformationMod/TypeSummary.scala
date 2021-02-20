package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeSummary extends StObject {
  
  /**
    * The ID of the default version of the type. The default version is used when the type version is not specified. To set the default version of a type, use  SetTypeDefaultVersion . 
    */
  var DefaultVersionId: js.UndefOr[TypeVersionId] = js.native
  
  /**
    * The description of the type.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * When the current default version of the type was registered.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.native
  
  /**
    * The kind of type.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the type.
    */
  var TypeArn: js.UndefOr[typings.awsSdk.cloudformationMod.TypeArn] = js.native
  
  /**
    * The name of the type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
}
object TypeSummary {
  
  @scala.inline
  def apply(): TypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeSummary]
  }
  
  @scala.inline
  implicit class TypeSummaryMutableBuilder[Self <: TypeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultVersionId(value: TypeVersionId): Self = StObject.set(x, "DefaultVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVersionIdUndefined: Self = StObject.set(x, "DefaultVersionId", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: Timestamp): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArn(value: TypeArn): Self = StObject.set(x, "TypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArnUndefined: Self = StObject.set(x, "TypeArn", js.undefined)
    
    @scala.inline
    def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
