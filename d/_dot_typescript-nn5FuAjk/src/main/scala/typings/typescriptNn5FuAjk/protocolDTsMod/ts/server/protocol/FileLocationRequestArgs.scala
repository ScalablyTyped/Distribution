package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instances of this interface specify a location in a source file:
  * (file, line, character offset), where line and character offset are 1-based.
  */
trait FileLocationRequestArgs
  extends StObject
     with FileRequestArgs
     with FileLocationOrRangeRequestArgs {
  
  /**
    * The line number for the request (1-based).
    */
  var line: Double
  
  /**
    * The character offset (on the line) for the request (1-based).
    */
  var offset: Double
}
object FileLocationRequestArgs {
  
  inline def apply(file: String, line: Double, offset: Double): FileLocationRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLocationRequestArgs]
  }
  
  extension [Self <: FileLocationRequestArgs](x: Self) {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
