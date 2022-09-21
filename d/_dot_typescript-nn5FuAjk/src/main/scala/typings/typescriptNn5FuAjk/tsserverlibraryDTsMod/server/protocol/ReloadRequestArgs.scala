package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for reload request.
  */
trait ReloadRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Name of temporary file from which to reload file
    * contents. May be same as file.
    */
  var tmpfile: String
}
object ReloadRequestArgs {
  
  inline def apply(file: String, tmpfile: String): ReloadRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], tmpfile = tmpfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadRequestArgs]
  }
  
  extension [Self <: ReloadRequestArgs](x: Self) {
    
    inline def setTmpfile(value: String): Self = StObject.set(x, "tmpfile", value.asInstanceOf[js.Any])
  }
}
