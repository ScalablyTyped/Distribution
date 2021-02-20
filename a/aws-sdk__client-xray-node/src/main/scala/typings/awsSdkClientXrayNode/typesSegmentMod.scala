package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentMod {
  
  @js.native
  trait Segment extends StObject {
    
    /**
      * <p>The segment document.</p>
      */
    var Document: js.UndefOr[String] = js.native
    
    /**
      * <p>The segment's ID.</p>
      */
    var Id: js.UndefOr[String] = js.native
  }
  object Segment {
    
    @scala.inline
    def apply(): Segment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: String): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    }
  }
  
  type UnmarshalledSegment = Segment
}
