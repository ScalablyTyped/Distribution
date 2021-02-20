package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringAttributeConstraintsType extends StObject {
  
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.native
  
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.native
}
object StringAttributeConstraintsType {
  
  @scala.inline
  def apply(): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
  
  @scala.inline
  implicit class StringAttributeConstraintsTypeMutableBuilder[Self <: StringAttributeConstraintsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: StringType): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: StringType): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "MinLength", js.undefined)
  }
}
