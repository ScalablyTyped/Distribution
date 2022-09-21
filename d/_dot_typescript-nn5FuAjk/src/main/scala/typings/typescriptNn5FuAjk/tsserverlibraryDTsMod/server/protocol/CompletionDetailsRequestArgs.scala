package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for completion details request.
  */
trait CompletionDetailsRequestArgs
  extends StObject
     with FileLocationRequestArgs {
  
  /**
    * Names of one or more entries for which to obtain details.
    */
  var entryNames: Array[String | CompletionEntryIdentifier]
}
object CompletionDetailsRequestArgs {
  
  inline def apply(entryNames: Array[String | CompletionEntryIdentifier], file: String, line: Double, offset: Double): CompletionDetailsRequestArgs = {
    val __obj = js.Dynamic.literal(entryNames = entryNames.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionDetailsRequestArgs]
  }
  
  extension [Self <: CompletionDetailsRequestArgs](x: Self) {
    
    inline def setEntryNames(value: Array[String | CompletionEntryIdentifier]): Self = StObject.set(x, "entryNames", value.asInstanceOf[js.Any])
  }
}
