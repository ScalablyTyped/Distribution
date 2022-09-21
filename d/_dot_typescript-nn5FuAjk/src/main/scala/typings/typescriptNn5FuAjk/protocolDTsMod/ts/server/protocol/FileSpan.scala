package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object found in response messages defining a span of text in a specific source file.
  */
trait FileSpan
  extends StObject
     with TextSpan {
  
  /**
    * File containing text span.
    */
  var file: String
}
object FileSpan {
  
  inline def apply(end: Location, file: String, start: Location): FileSpan = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSpan]
  }
  
  extension [Self <: FileSpan](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
  }
}
