package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHashKeyRangeMod {
  
  trait HashKeyRange extends StObject {
    
    /**
      * <p>The ending hash key of the hash key range.</p>
      */
    var EndingHashKey: String
    
    /**
      * <p>The starting hash key of the hash key range.</p>
      */
    var StartingHashKey: String
  }
  object HashKeyRange {
    
    @scala.inline
    def apply(EndingHashKey: String, StartingHashKey: String): HashKeyRange = {
      val __obj = js.Dynamic.literal(EndingHashKey = EndingHashKey.asInstanceOf[js.Any], StartingHashKey = StartingHashKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashKeyRange]
    }
    
    @scala.inline
    implicit class HashKeyRangeMutableBuilder[Self <: HashKeyRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndingHashKey(value: String): Self = StObject.set(x, "EndingHashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingHashKey(value: String): Self = StObject.set(x, "StartingHashKey", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledHashKeyRange = HashKeyRange
}
