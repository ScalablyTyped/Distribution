package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments in document highlight request; include: filesToSearch, file,
  * line, offset.
  */
trait DocumentHighlightsRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * List of files to search for document highlights.
    */
  var filesToSearch: Array[String]
}
object DocumentHighlightsRequestArgs {
  
  inline def apply(file: String, filesToSearch: Array[String], line: Double, offset: Double): DocumentHighlightsRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], filesToSearch = filesToSearch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlightsRequestArgs]
  }
  
  extension [Self <: DocumentHighlightsRequestArgs](x: Self) {
    
    inline def setFilesToSearch(value: Array[String]): Self = StObject.set(x, "filesToSearch", value.asInstanceOf[js.Any])
  }
}
