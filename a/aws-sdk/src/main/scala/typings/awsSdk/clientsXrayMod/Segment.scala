package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /**
    * The segment document.
    */
  var Document: js.UndefOr[SegmentDocument] = js.undefined
  
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[SegmentId] = js.undefined
}
object Segment {
  
  inline def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  extension [Self <: Segment](x: Self) {
    
    inline def setDocument(value: SegmentDocument): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    inline def setId(value: SegmentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
