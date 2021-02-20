package typings.awsSdkClientKmsNode

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGrantConstraintsMod {
  
  @js.native
  trait GrantConstraints extends StObject {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    var EncryptionContextEquals: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    var EncryptionContextSubset: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  }
  object GrantConstraints {
    
    @scala.inline
    def apply(): GrantConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantConstraints]
    }
    
    @scala.inline
    implicit class GrantConstraintsMutableBuilder[Self <: GrantConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionContextEquals(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContextEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "EncryptionContextEquals", js.undefined)
      
      @scala.inline
      def setEncryptionContextSubset(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "EncryptionContextSubset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "EncryptionContextSubset", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledGrantConstraints extends GrantConstraints {
    
    /**
      * <p>A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    @JSName("EncryptionContextEquals")
    var EncryptionContextEquals_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * <p>A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.</p>
      */
    @JSName("EncryptionContextSubset")
    var EncryptionContextSubset_UnmarshalledGrantConstraints: js.UndefOr[StringDictionary[String]] = js.native
  }
  object UnmarshalledGrantConstraints {
    
    @scala.inline
    def apply(): UnmarshalledGrantConstraints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGrantConstraints]
    }
    
    @scala.inline
    implicit class UnmarshalledGrantConstraintsMutableBuilder[Self <: UnmarshalledGrantConstraints] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionContextEquals(value: StringDictionary[String]): Self = StObject.set(x, "EncryptionContextEquals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "EncryptionContextEquals", js.undefined)
      
      @scala.inline
      def setEncryptionContextSubset(value: StringDictionary[String]): Self = StObject.set(x, "EncryptionContextSubset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "EncryptionContextSubset", js.undefined)
    }
  }
}
