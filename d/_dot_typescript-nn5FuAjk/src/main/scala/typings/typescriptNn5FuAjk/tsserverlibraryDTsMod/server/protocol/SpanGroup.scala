package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  A group of text spans, all in 'file'.
  */
trait SpanGroup extends StObject {
  
  /** The file to which the spans apply */
  var file: String
  
  /** The text spans in this group */
  var locs: Array[RenameTextSpan]
}
object SpanGroup {
  
  inline def apply(file: String, locs: Array[RenameTextSpan]): SpanGroup = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], locs = locs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanGroup]
  }
  
  extension [Self <: SpanGroup](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setLocs(value: Array[RenameTextSpan]): Self = StObject.set(x, "locs", value.asInstanceOf[js.Any])
  }
}
