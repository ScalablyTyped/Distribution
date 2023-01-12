package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCommonPrefixMod {
  
  trait CommonPrefix extends StObject {
    
    /**
      * _Prefix shape
      */
    var Prefix: js.UndefOr[String] = js.undefined
  }
  object CommonPrefix {
    
    inline def apply(): CommonPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonPrefix] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    }
  }
  
  type UnmarshalledCommonPrefix = CommonPrefix
}
