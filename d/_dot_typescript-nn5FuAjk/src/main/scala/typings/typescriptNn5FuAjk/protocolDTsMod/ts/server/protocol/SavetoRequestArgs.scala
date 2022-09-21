package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for saveto request.
  */
trait SavetoRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Name of temporary file into which to save server's view of
    * file contents.
    */
  var tmpfile: String
}
object SavetoRequestArgs {
  
  inline def apply(file: String, tmpfile: String): SavetoRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], tmpfile = tmpfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavetoRequestArgs]
  }
  
  extension [Self <: SavetoRequestArgs](x: Self) {
    
    inline def setTmpfile(value: String): Self = StObject.set(x, "tmpfile", value.asInstanceOf[js.Any])
  }
}
