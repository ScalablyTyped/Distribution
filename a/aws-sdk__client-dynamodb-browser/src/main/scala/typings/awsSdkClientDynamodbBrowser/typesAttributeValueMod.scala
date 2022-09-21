package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAttributeValueMod {
  
  trait AttributeValue extends StObject {
    
    /**
      * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
      */
    var B: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.undefined
    
    /**
      * <p>An attribute of type Boolean. For example:</p> <p> <code>"BOOL": true</code> </p>
      */
    var BOOL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
      */
    var BS: js.UndefOr[
        (js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String]) | (js.Iterable[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String])
      ] = js.undefined
    
    /**
      * <p>An attribute of type List. For example:</p> <p> <code>"L": ["Cookies", "Coffee", 3.14159]</code> </p>
      */
    var L: js.UndefOr[js.Array[AttributeValue] | js.Iterable[AttributeValue]] = js.undefined
    
    /**
      * <p>An attribute of type Map. For example:</p> <p> <code>"M": {"Name": {"S": "Joe"}, "Age": {"N": "35"}}</code> </p>
      */
    var M: js.UndefOr[
        StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])
      ] = js.undefined
    
    /**
      * <p>An attribute of type Number. For example:</p> <p> <code>"N": "123.45"</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
      */
    var N: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An attribute of type Number Set. For example:</p> <p> <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code> </p> <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility across languages and libraries. However, DynamoDB treats them as number type attributes for mathematical operations.</p>
      */
    var NS: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
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
    var SS: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  }
  object AttributeValue {
    
    inline def apply(): AttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValue]
    }
    
    extension [Self <: AttributeValue](x: Self) {
      
      inline def setB(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setBOOL(value: Boolean): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
      
      inline def setBOOLUndefined: Self = StObject.set(x, "BOOL", js.undefined)
      
      inline def setBS(
        value: (js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String]) | (js.Iterable[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String])
      ): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBSVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String)*): Self = StObject.set(x, "BS", js.Array(value*))
      
      inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      inline def setL(value: js.Array[AttributeValue] | js.Iterable[AttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value*))
      
      inline def setM(value: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]])): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNS(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      inline def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value*))
      
      inline def setNULL(value: Boolean): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      inline def setNULLUndefined: Self = StObject.set(x, "NULL", js.undefined)
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setSS(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value*))
      
      inline def setSUndefined: Self = StObject.set(x, "S", js.undefined)
    }
  }
  
  trait UnmarshalledAttributeValue
    extends StObject
       with AttributeValue {
    
    /**
      * <p>An attribute of type Binary Set. For example:</p> <p> <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code> </p>
      */
    @JSName("BS")
    var BS_UnmarshalledAttributeValue: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
    
    /**
      * <p>An attribute of type Binary. For example:</p> <p> <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code> </p>
      */
    @JSName("B")
    var B_UnmarshalledAttributeValue: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
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
    
    inline def apply(): UnmarshalledAttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAttributeValue]
    }
    
    extension [Self <: UnmarshalledAttributeValue](x: Self) {
      
      inline def setB(value: js.typedarray.Uint8Array): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setBS(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBSVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "BS", js.Array(value*))
      
      inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      inline def setL(value: js.Array[UnmarshalledAttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setLVarargs(value: UnmarshalledAttributeValue*): Self = StObject.set(x, "L", js.Array(value*))
      
      inline def setM(value: StringDictionary[UnmarshalledAttributeValue]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setNS(value: js.Array[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      inline def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value*))
      
      inline def setSS(value: js.Array[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value*))
    }
  }
}
