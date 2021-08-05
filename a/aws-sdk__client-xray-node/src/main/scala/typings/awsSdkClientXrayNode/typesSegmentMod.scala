package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentMod {
  
  trait Segment extends StObject {
    
    /**
      * <p>The segment document.</p>
      */
    var Document: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The segment's ID.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
  }
  object Segment {
    
    inline def apply(): Segment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segment]
    }
    
    extension [Self <: Segment](x: Self) {
      
      inline def setDocument(value: String): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    }
  }
  
  type UnmarshalledSegment = Segment
}
