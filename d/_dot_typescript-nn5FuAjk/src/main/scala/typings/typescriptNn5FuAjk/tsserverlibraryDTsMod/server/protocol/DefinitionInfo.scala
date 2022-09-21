package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfo
  extends StObject
     with FileSpanWithContext {
  
  /**
    * When true, the file may or may not exist.
    */
  var unverified: js.UndefOr[Boolean] = js.undefined
}
object DefinitionInfo {
  
  inline def apply(end: Location, file: String, start: Location): DefinitionInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
  
  extension [Self <: DefinitionInfo](x: Self) {
    
    inline def setUnverified(value: Boolean): Self = StObject.set(x, "unverified", value.asInstanceOf[js.Any])
    
    inline def setUnverifiedUndefined: Self = StObject.set(x, "unverified", js.undefined)
  }
}
