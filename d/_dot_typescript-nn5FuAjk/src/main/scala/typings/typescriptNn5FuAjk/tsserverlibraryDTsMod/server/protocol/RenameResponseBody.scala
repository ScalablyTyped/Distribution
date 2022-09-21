package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameResponseBody extends StObject {
  
  /**
    * Information about the item to be renamed.
    */
  var info: RenameInfo
  
  /**
    * An array of span groups (one per file) that refer to the item to be renamed.
    */
  var locs: Array[SpanGroup]
}
object RenameResponseBody {
  
  inline def apply(info: RenameInfo, locs: Array[SpanGroup]): RenameResponseBody = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], locs = locs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameResponseBody]
  }
  
  extension [Self <: RenameResponseBody](x: Self) {
    
    inline def setInfo(value: RenameInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setLocs(value: Array[SpanGroup]): Self = StObject.set(x, "locs", value.asInstanceOf[js.Any])
  }
}
