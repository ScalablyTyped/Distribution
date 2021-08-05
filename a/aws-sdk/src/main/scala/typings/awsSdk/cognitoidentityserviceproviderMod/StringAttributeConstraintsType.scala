package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringAttributeConstraintsType extends StObject {
  
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.undefined
  
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.undefined
}
object StringAttributeConstraintsType {
  
  inline def apply(): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
  
  extension [Self <: StringAttributeConstraintsType](x: Self) {
    
    inline def setMaxLength(value: StringType): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    inline def setMinLength(value: StringType): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "MinLength", js.undefined)
  }
}
