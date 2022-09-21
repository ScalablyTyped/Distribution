package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesMessage extends StObject {
  
  /**
    * A list of attribute names.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
}
object DescribeAccountAttributesMessage {
  
  inline def apply(): DescribeAccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesMessage]
  }
  
  extension [Self <: DescribeAccountAttributesMessage](x: Self) {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesUndefined: Self = StObject.set(x, "AttributeNames", js.undefined)
    
    inline def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
  }
}
