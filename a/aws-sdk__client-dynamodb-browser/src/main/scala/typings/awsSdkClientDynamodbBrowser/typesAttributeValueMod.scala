package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeValueMod {
  
  trait AttributeValue extends StObject {
    
    /**
      * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
      */
    var B: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
    
    /**
      * <p>An attribute of type Boolean. For example:</p> <p> <code>"BOOL": true</code> </p>
      */
    var BOOL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
      */
    var BS: js.UndefOr[
        (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
      ] = js.undefined
    
    /**
      * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
      */
    var L: js.UndefOr[js.Array[AttributeValue] | Iterable[AttributeValue]] = js.undefined
    
    /**
      * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
      */
    var M: js.UndefOr[StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])] = js.undefined
    
    /**
      * <p>An attribute of type Number. For example:</p> <p> <code>"N": "123.45"</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
      */
    var N: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
      */
    var NS: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>An attribute of type Null. For example:</p> <p> <code>"NULL": true</code> </p>
      */
    var NULL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>An attribute of type String. For example:</p> <p> <code>"S": "Hello"</code> </p>
      */
    var S: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
      */
    var SS: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
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
      def setB(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOL(value: Boolean): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOLUndefined: Self = StObject.set(x, "BOOL", js.undefined)
      
      @scala.inline
      def setBS(
        value: (js.Array[ArrayBuffer | ArrayBufferView | String]) | (Iterable[ArrayBuffer | ArrayBufferView | String])
      ): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      @scala.inline
      def setBSVarargs(value: (ArrayBuffer | ArrayBufferView | String)*): Self = StObject.set(x, "BS", js.Array(value :_*))
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      @scala.inline
      def setL(value: js.Array[AttributeValue] | Iterable[AttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      @scala.inline
      def setM(value: StringDictionary[AttributeValue] | (Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNS(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      @scala.inline
      def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value :_*))
      
      @scala.inline
      def setNULL(value: Boolean): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNULLUndefined: Self = StObject.set(x, "NULL", js.undefined)
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      @scala.inline
      def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value :_*))
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "S", js.undefined)
    }
  }
  
  trait UnmarshalledAttributeValue
    extends StObject
       with AttributeValue {
    
    /**
      * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
      */
    @JSName("BS")
    var BS_UnmarshalledAttributeValue: js.UndefOr[js.Array[Uint8Array]] = js.undefined
    
    /**
      * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
      */
    @JSName("B")
    var B_UnmarshalledAttributeValue: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
      */
    @JSName("L")
    var L_UnmarshalledAttributeValue: js.UndefOr[js.Array[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
      */
    @JSName("M")
    var M_UnmarshalledAttributeValue: js.UndefOr[StringDictionary[UnmarshalledAttributeValue]] = js.undefined
    
    /**
      * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
      */
    @JSName("NS")
    var NS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>An attribute of type String Set. For example:</p> <p> <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code> </p>
      */
    @JSName("SS")
    var SS_UnmarshalledAttributeValue: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledAttributeValue {
    
    @scala.inline
    def apply(): UnmarshalledAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAttributeValue]
    }
    
    @scala.inline
    implicit class UnmarshalledAttributeValueMutableBuilder[Self <: UnmarshalledAttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Uint8Array): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBS(value: js.Array[Uint8Array]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      @scala.inline
      def setBSVarargs(value: Uint8Array*): Self = StObject.set(x, "BS", js.Array(value :_*))
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      @scala.inline
      def setL(value: js.Array[UnmarshalledAttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setLVarargs(value: UnmarshalledAttributeValue*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      @scala.inline
      def setM(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      @scala.inline
      def setNS(value: js.Array[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      @scala.inline
      def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value :_*))
      
      @scala.inline
      def setSS(value: js.Array[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      @scala.inline
      def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value :_*))
    }
  }
}
