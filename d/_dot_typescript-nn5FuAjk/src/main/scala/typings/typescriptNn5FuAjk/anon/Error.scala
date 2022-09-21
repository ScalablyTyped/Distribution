package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.RequireResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with RequireResult {
  
  var error: Unit
}
object Error {
  
  inline def apply(error: Unit): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
