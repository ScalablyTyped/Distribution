package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantConstraintsMod {
  
  trait GrantConstraints extends StObject {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    var EncryptionContextEquals: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    var EncryptionContextSubset: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  }
  object GrantConstraints {
    
    inline def apply(): GrantConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantConstraints]
    }
    
    extension [Self <: GrantConstraints](x: Self) {
      
      inline def setEncryptionContextEquals(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContextEquals", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "EncryptionContextEquals", js.undefined)
      
      inline def setEncryptionContextSubset(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContextSubset", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "EncryptionContextSubset", js.undefined)
    }
  }
  
  trait UnmarshalledGrantConstraints
    extends StObject
       with GrantConstraints {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    @JSName("EncryptionContextEquals")
    var EncryptionContextEquals_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    @JSName("EncryptionContextSubset")
    var EncryptionContextSubset_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object UnmarshalledGrantConstraints {
    
    inline def apply(): UnmarshalledGrantConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrantConstraints]
    }
    
    extension [Self <: UnmarshalledGrantConstraints](x: Self) {
      
      inline def setEncryptionContextEquals(value: StringDictionary[String]): Self = StObject.set(x, "EncryptionContextEquals", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "EncryptionContextEquals", js.undefined)
      
      inline def setEncryptionContextSubset(value: StringDictionary[String]): Self = StObject.set(x, "EncryptionContextSubset", value.asInstanceOf[js.Any])
      
      inline def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "EncryptionContextSubset", js.undefined)
    }
  }
}
