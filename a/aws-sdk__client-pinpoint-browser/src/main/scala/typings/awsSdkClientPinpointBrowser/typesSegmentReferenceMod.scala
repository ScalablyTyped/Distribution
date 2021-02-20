package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentReferenceMod {
  
  @js.native
  trait SegmentReference extends StObject {
    
    /**
      * A unique identifier for the segment.
      */
    var Id: js.UndefOr[String] = js.native
    
    /**
      * If specified contains a specific version of the segment included.
      */
    var Version: js.UndefOr[Double] = js.native
  }
  object SegmentReference {
    
    @scala.inline
    def apply(): SegmentReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentReference]
    }
    
    @scala.inline
    implicit class SegmentReferenceMutableBuilder[Self <: SegmentReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledSegmentReference = SegmentReference
}
