package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeValue extends StObject {
  
  /**
    * An attribute of type Binary. For example:  "B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk" 
    */
  var B: js.UndefOr[BinaryAttributeValue] = js.native
  
  /**
    * An attribute of type Boolean. For example:  "BOOL": true 
    */
  var BOOL: js.UndefOr[BooleanAttributeValue] = js.native
  
  /**
    * An attribute of type Binary Set. For example:  "BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="] 
    */
  var BS: js.UndefOr[BinarySetAttributeValue] = js.native
  
  /**
    * An attribute of type List. For example:  "L": [ {"S": "Cookies"} , {"S": "Coffee"}, {"N", "3.14159"}] 
    */
  var L: js.UndefOr[ListAttributeValue] = js.native
  
  /**
    * An attribute of type Map. For example:  "M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}} 
    */
  var M: js.UndefOr[MapAttributeValue] = js.native
  
  /**
    * An attribute of type Number. For example:  "N": "123.45"  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var N: js.UndefOr[NumberAttributeValue] = js.native
  
  /**
    * An attribute of type Number Set. For example:  "NS": ["42.2", "-19", "7.5", "3.14"]  Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.
    */
  var NS: js.UndefOr[NumberSetAttributeValue] = js.native
  
  /**
    * An attribute of type Null. For example:  "NULL": true 
    */
  var NULL: js.UndefOr[NullAttributeValue] = js.native
  
  /**
    * An attribute of type String. For example:  "S": "Hello" 
    */
  var S: js.UndefOr[StringAttributeValue] = js.native
  
  /**
    * An attribute of type String Set. For example:  "SS": ["Giraffe", "Hippo" ,"Zebra"] 
    */
  var SS: js.UndefOr[StringSetAttributeValue] = js.native
}
object AttributeValue {
  
  @scala.inline
  def apply(): AttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: BinaryAttributeValue): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOOL(value: BooleanAttributeValue): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOOLUndefined: Self = StObject.set(x, "BOOL", js.undefined)
    
    @scala.inline
    def setBS(value: BinarySetAttributeValue): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
    
    @scala.inline
    def setBSVarargs(value: BinaryAttributeValue*): Self = StObject.set(x, "BS", js.Array(value :_*))
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "B", js.undefined)
    
    @scala.inline
    def setL(value: ListAttributeValue): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "L", js.undefined)
    
    @scala.inline
    def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value :_*))
    
    @scala.inline
    def setM(value: MapAttributeValue): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMUndefined: Self = StObject.set(x, "M", js.undefined)
    
    @scala.inline
    def setN(value: NumberAttributeValue): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNS(value: NumberSetAttributeValue): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
    
    @scala.inline
    def setNSVarargs(value: NumberAttributeValue*): Self = StObject.set(x, "NS", js.Array(value :_*))
    
    @scala.inline
    def setNULL(value: NullAttributeValue): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNULLUndefined: Self = StObject.set(x, "NULL", js.undefined)
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    @scala.inline
    def setS(value: StringAttributeValue): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS(value: StringSetAttributeValue): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
    
    @scala.inline
    def setSSVarargs(value: StringAttributeValue*): Self = StObject.set(x, "SS", js.Array(value :_*))
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "S", js.undefined)
  }
}
