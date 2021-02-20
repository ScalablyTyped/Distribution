package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunctionInput extends StObject {
  
  /**
    * The Java class that contains the function code.
    */
  var ClassName: js.UndefOr[NameString] = js.native
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NameString] = js.native
  
  /**
    * The owner of the function.
    */
  var OwnerName: js.UndefOr[NameString] = js.native
  
  /**
    * The owner type.
    */
  var OwnerType: js.UndefOr[PrincipalType] = js.native
  
  /**
    * The resource URIs for the function.
    */
  var ResourceUris: js.UndefOr[ResourceUriList] = js.native
}
object UserDefinedFunctionInput {
  
  @scala.inline
  def apply(): UserDefinedFunctionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedFunctionInput]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionInputMutableBuilder[Self <: UserDefinedFunctionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: NameString): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "ClassName", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NameString): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    @scala.inline
    def setOwnerName(value: NameString): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    @scala.inline
    def setOwnerType(value: PrincipalType): Self = StObject.set(x, "OwnerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerTypeUndefined: Self = StObject.set(x, "OwnerType", js.undefined)
    
    @scala.inline
    def setResourceUris(value: ResourceUriList): Self = StObject.set(x, "ResourceUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUrisUndefined: Self = StObject.set(x, "ResourceUris", js.undefined)
    
    @scala.inline
    def setResourceUrisVarargs(value: ResourceUri*): Self = StObject.set(x, "ResourceUris", js.Array(value :_*))
  }
}
