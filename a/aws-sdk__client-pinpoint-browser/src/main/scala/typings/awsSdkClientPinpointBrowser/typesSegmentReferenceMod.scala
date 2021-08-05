package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSegmentReferenceMod {
  
  trait SegmentReference extends StObject {
    
    /**
      * A unique identifier for the segment.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * If specified contains a specific version of the segment included.
      */
    var Version: js.UndefOr[Double] = js.undefined
  }
  object SegmentReference {
    
    inline def apply(): SegmentReference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentReference]
    }
    
    extension [Self <: SegmentReference](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    }
  }
  
  type UnmarshalledSegmentReference = SegmentReference
}
