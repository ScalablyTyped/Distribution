package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BOOLMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.BSMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.LMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.MMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NSMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.NULLMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.SMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.SSMember
  - typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeValue.UnknownMember
*/
trait AttributeValue extends StObject
object AttributeValue {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/models/models_0", "AttributeValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def visit[T](value: AttributeValue, visitor: Visitor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(value.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * <p>An attribute of type Binary. For example:</p>
    *          <p>
    *             <code>"B": "dGhpcyB0ZXh0IGlzIGJhc2U2NC1lbmNvZGVk"</code>
    *          </p>
    */
  trait BMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.typedarray.Uint8Array
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object BMember {
    
    inline def apply(B: js.typedarray.Uint8Array): BMember = {
      val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any])
      __obj.asInstanceOf[BMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BMember] (val x: Self) extends AnyVal {
      
      inline def setB(value: js.typedarray.Uint8Array): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type Boolean. For example:</p>
    *          <p>
    *             <code>"BOOL": true</code>
    *          </p>
    */
  trait BOOLMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: Boolean
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object BOOLMember {
    
    inline def apply(BOOL: Boolean): BOOLMember = {
      val __obj = js.Dynamic.literal(BOOL = BOOL.asInstanceOf[js.Any])
      __obj.asInstanceOf[BOOLMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BOOLMember] (val x: Self) extends AnyVal {
      
      inline def setBOOL(value: Boolean): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type Binary Set. For example:</p>
    *          <p>
    *             <code>"BS": ["U3Vubnk=", "UmFpbnk=", "U25vd3k="]</code>
    *          </p>
    */
  trait BSMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.Array[js.typedarray.Uint8Array]
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object BSMember {
    
    inline def apply(BS: js.Array[js.typedarray.Uint8Array]): BSMember = {
      val __obj = js.Dynamic.literal(BS = BS.asInstanceOf[js.Any])
      __obj.asInstanceOf[BSMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BSMember] (val x: Self) extends AnyVal {
      
      inline def setBS(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "BS", js.Array(value*))
    }
  }
  
  /**
    * <p>An attribute of type List. For example:</p>
    *          <p>
    *             <code>"L": [ \{"S": "Cookies"\} , \{"S": "Coffee"\}, \{"N": "3.14159"\}]</code>
    *          </p>
    */
  trait LMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.Array[AttributeValue]
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object LMember {
    
    inline def apply(L: js.Array[AttributeValue]): LMember = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any])
      __obj.asInstanceOf[LMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LMember] (val x: Self) extends AnyVal {
      
      inline def setL(value: js.Array[AttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value*))
    }
  }
  
  /**
    * <p>An attribute of type Map. For example:</p>
    *          <p>
    *             <code>"M": \{"Name": \{"S": "Joe"\}, "Age": \{"N": "35"\}\}</code>
    *          </p>
    */
  trait MMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: Record[String, AttributeValue]
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object MMember {
    
    inline def apply(M: Record[String, AttributeValue]): MMember = {
      val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MMember] (val x: Self) extends AnyVal {
      
      inline def setM(value: Record[String, AttributeValue]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type Number. For example:</p>
    *          <p>
    *             <code>"N": "123.45"</code>
    *          </p>
    *          <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility
    *             across languages and libraries. However, DynamoDB treats them as number type attributes
    *             for mathematical operations.</p>
    */
  trait NMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: String
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object NMember {
    
    inline def apply(N: String): NMember = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any])
      __obj.asInstanceOf[NMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NMember] (val x: Self) extends AnyVal {
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type Number Set. For example:</p>
    *          <p>
    *             <code>"NS": ["42.2", "-19", "7.5", "3.14"]</code>
    *          </p>
    *          <p>Numbers are sent across the network to DynamoDB as strings, to maximize compatibility
    *             across languages and libraries. However, DynamoDB treats them as number type attributes
    *             for mathematical operations.</p>
    */
  trait NSMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.Array[String]
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object NSMember {
    
    inline def apply(NS: js.Array[String]): NSMember = {
      val __obj = js.Dynamic.literal(NS = NS.asInstanceOf[js.Any])
      __obj.asInstanceOf[NSMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NSMember] (val x: Self) extends AnyVal {
      
      inline def setNS(value: js.Array[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value*))
    }
  }
  
  /**
    * <p>An attribute of type Null. For example:</p>
    *          <p>
    *             <code>"NULL": true</code>
    *          </p>
    */
  trait NULLMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: Boolean
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object NULLMember {
    
    inline def apply(NULL: Boolean): NULLMember = {
      val __obj = js.Dynamic.literal(NULL = NULL.asInstanceOf[js.Any])
      __obj.asInstanceOf[NULLMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NULLMember] (val x: Self) extends AnyVal {
      
      inline def setNULL(value: Boolean): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type String. For example:</p>
    *          <p>
    *             <code>"S": "Hello"</code>
    *          </p>
    */
  trait SMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: String
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object SMember {
    
    inline def apply(S: String): SMember = {
      val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMember] (val x: Self) extends AnyVal {
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * <p>An attribute of type String Set. For example:</p>
    *          <p>
    *             <code>"SS": ["Giraffe", "Hippo" ,"Zebra"]</code>
    *          </p>
    */
  trait SSMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.UndefOr[scala.Nothing] = js.undefined
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.Array[String]
  }
  object SSMember {
    
    inline def apply(SS: js.Array[String]): SSMember = {
      val __obj = js.Dynamic.literal(SS = SS.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSMember] (val x: Self) extends AnyVal {
      
      inline def setSS(value: js.Array[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value*))
    }
  }
  
  trait UnknownMember
    extends StObject
       with AttributeValue {
    
    @JSName("$unknown")
    var $unknown: js.Tuple2[String, Any]
    
    var B: js.UndefOr[scala.Nothing] = js.undefined
    
    var BOOL: js.UndefOr[scala.Nothing] = js.undefined
    
    var BS: js.UndefOr[scala.Nothing] = js.undefined
    
    var L: js.UndefOr[scala.Nothing] = js.undefined
    
    var M: js.UndefOr[scala.Nothing] = js.undefined
    
    var N: js.UndefOr[scala.Nothing] = js.undefined
    
    var NS: js.UndefOr[scala.Nothing] = js.undefined
    
    var NULL: js.UndefOr[scala.Nothing] = js.undefined
    
    var S: js.UndefOr[scala.Nothing] = js.undefined
    
    var SS: js.UndefOr[scala.Nothing] = js.undefined
  }
  object UnknownMember {
    
    inline def apply($unknown: js.Tuple2[String, Any]): UnknownMember = {
      val __obj = js.Dynamic.literal($unknown = $unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnknownMember]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnknownMember] (val x: Self) extends AnyVal {
      
      inline def set$unknown(value: js.Tuple2[String, Any]): Self = StObject.set(x, "$unknown", value.asInstanceOf[js.Any])
    }
  }
  
  trait Visitor[T] extends StObject {
    
    def B(value: js.typedarray.Uint8Array): T
    
    def BOOL(value: Boolean): T
    
    def BS(value: js.Array[js.typedarray.Uint8Array]): T
    
    def L(value: js.Array[AttributeValue]): T
    
    def M(value: Record[String, AttributeValue]): T
    
    def N(value: String): T
    
    def NS(value: js.Array[String]): T
    
    def NULL(value: Boolean): T
    
    def S(value: String): T
    
    def SS(value: js.Array[String]): T
    
    @JSName("_")
    def _underscore(name: String, value: Any): T
  }
  object Visitor {
    
    inline def apply[T](
      B: js.typedarray.Uint8Array => T,
      BOOL: Boolean => T,
      BS: js.Array[js.typedarray.Uint8Array] => T,
      L: js.Array[AttributeValue] => T,
      M: Record[String, AttributeValue] => T,
      N: String => T,
      NS: js.Array[String] => T,
      NULL: Boolean => T,
      S: String => T,
      SS: js.Array[String] => T,
      _underscore: (String, Any) => T
    ): Visitor[T] = {
      val __obj = js.Dynamic.literal(B = js.Any.fromFunction1(B), BOOL = js.Any.fromFunction1(BOOL), BS = js.Any.fromFunction1(BS), L = js.Any.fromFunction1(L), M = js.Any.fromFunction1(M), N = js.Any.fromFunction1(N), NS = js.Any.fromFunction1(NS), NULL = js.Any.fromFunction1(NULL), S = js.Any.fromFunction1(S), SS = js.Any.fromFunction1(SS))
      __obj.updateDynamic("_")(js.Any.fromFunction2(_underscore))
      __obj.asInstanceOf[Visitor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visitor[?], T] (val x: Self & Visitor[T]) extends AnyVal {
      
      inline def setB(value: js.typedarray.Uint8Array => T): Self = StObject.set(x, "B", js.Any.fromFunction1(value))
      
      inline def setBOOL(value: Boolean => T): Self = StObject.set(x, "BOOL", js.Any.fromFunction1(value))
      
      inline def setBS(value: js.Array[js.typedarray.Uint8Array] => T): Self = StObject.set(x, "BS", js.Any.fromFunction1(value))
      
      inline def setL(value: js.Array[AttributeValue] => T): Self = StObject.set(x, "L", js.Any.fromFunction1(value))
      
      inline def setM(value: Record[String, AttributeValue] => T): Self = StObject.set(x, "M", js.Any.fromFunction1(value))
      
      inline def setN(value: String => T): Self = StObject.set(x, "N", js.Any.fromFunction1(value))
      
      inline def setNS(value: js.Array[String] => T): Self = StObject.set(x, "NS", js.Any.fromFunction1(value))
      
      inline def setNULL(value: Boolean => T): Self = StObject.set(x, "NULL", js.Any.fromFunction1(value))
      
      inline def setS(value: String => T): Self = StObject.set(x, "S", js.Any.fromFunction1(value))
      
      inline def setSS(value: js.Array[String] => T): Self = StObject.set(x, "SS", js.Any.fromFunction1(value))
      
      inline def set_underscore(value: (String, Any) => T): Self = StObject.set(x, "_", js.Any.fromFunction2(value))
    }
  }
}
