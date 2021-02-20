package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommonPrefixMod {
  
  @js.native
  trait CommonPrefix extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.native
  }
  object CommonPrefix {
    
    @scala.inline
    def apply(): CommonPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPrefix]
    }
    
    @scala.inline
    implicit class CommonPrefixMutableBuilder[Self <: CommonPrefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  type UnmarshalledCommonPrefix = CommonPrefix
}
