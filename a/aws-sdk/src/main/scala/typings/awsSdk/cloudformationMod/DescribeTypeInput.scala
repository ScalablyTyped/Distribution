package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTypeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[TypeArn] = js.native
  
  /**
    * The kind of type.  Currently the only valid value is RESOURCE. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typings.awsSdk.cloudformationMod.TypeName] = js.native
  
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered. If you specify a VersionId, DescribeType returns information about that specific type version. Otherwise, it returns information about the default type version.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}
object DescribeTypeInput {
  
  @scala.inline
  def apply(): DescribeTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTypeInput]
  }
  
  @scala.inline
  implicit class DescribeTypeInputMutableBuilder[Self <: DescribeTypeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
