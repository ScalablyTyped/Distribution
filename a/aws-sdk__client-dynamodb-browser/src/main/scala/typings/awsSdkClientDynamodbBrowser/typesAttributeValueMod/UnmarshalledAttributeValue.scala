package typings.awsSdkClientDynamodbBrowser.typesAttributeValueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAttributeValue extends AttributeValue {
  
  /**
    * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
    */
  @JSName("BS")
  var BS_UnmarshalledAttributeValue: js.UndefOr[js.Array[Uint8Array]] = js.native
  
  /**
    * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
    */
  @JSName("B")
  var B_UnmarshalledAttributeValue: js.UndefOr[Uint8Array] = js.native
  
  /**
    * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
    */
  @JSName("L")
  var L_UnmarshalledAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.native
  
  /**
    * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
    */
  @JSName("M")
  var M_UnmarshalledAttributeValue: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.native
  
  /**
    * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
    */
  @JSName("NS")
  var NS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
    */
  @JSName("SS")
  var SS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.native
}
object UnmarshalledAttributeValue {
  
  @scala.inline
  def apply(): UnmarshalledAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAttributeValue]
  }
  
  @scala.inline
  implicit class UnmarshalledAttributeValueOps[Self <: UnmarshalledAttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setB(value: Uint8Array): Self = this.set("B", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("B", js.undefined)
    
    @scala.inline
    def setBSVarargs(value: Uint8Array*): Self = this.set("BS", js.Array(value :_*))
    
    @scala.inline
    def setBS(value: js.Array[Uint8Array]): Self = this.set("BS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBS: Self = this.set("BS", js.undefined)
    
    @scala.inline
    def setLVarargs(value: UnmarshalledAttributeValue*): Self = this.set("L", js.Array(value :_*))
    
    @scala.inline
    def setL(value: js.Array[UnmarshalledAttributeValue]): Self = this.set("L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    
    @scala.inline
    def setM(value: StringDictionary[UnmarshalledAttributeValue]): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    
    @scala.inline
    def setNSVarargs(value: String*): Self = this.set("NS", js.Array(value :_*))
    
    @scala.inline
    def setNS(value: js.Array[String]): Self = this.set("NS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNS: Self = this.set("NS", js.undefined)
    
    @scala.inline
    def setSSVarargs(value: String*): Self = this.set("SS", js.Array(value :_*))
    
    @scala.inline
    def setSS(value: js.Array[String]): Self = this.set("SS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSS: Self = this.set("SS", js.undefined)
  }
}
