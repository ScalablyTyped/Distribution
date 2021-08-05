package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPartListElementMod {
  
  trait PartListElement extends StObject {
    
    /**
      * <p>The byte range of a part, inclusive of the upper value of the range.</p>
      */
    var RangeInBytes: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.</p>
      */
    var SHA256TreeHash: js.UndefOr[String] = js.undefined
  }
  object PartListElement {
    
    inline def apply(): PartListElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartListElement]
    }
    
    extension [Self <: PartListElement](x: Self) {
      
      inline def setRangeInBytes(value: String): Self = StObject.set(x, "RangeInBytes", value.asInstanceOf[js.Any])
      
      inline def setRangeInBytesUndefined: Self = StObject.set(x, "RangeInBytes", js.undefined)
      
      inline def setSHA256TreeHash(value: String): Self = StObject.set(x, "SHA256TreeHash", value.asInstanceOf[js.Any])
      
      inline def setSHA256TreeHashUndefined: Self = StObject.set(x, "SHA256TreeHash", js.undefined)
    }
  }
  
  type UnmarshalledPartListElement = PartListElement
}
