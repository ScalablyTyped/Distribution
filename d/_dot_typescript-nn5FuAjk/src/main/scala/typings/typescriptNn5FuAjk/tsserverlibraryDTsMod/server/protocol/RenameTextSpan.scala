package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameTextSpan
  extends StObject
     with TextSpanWithContext {
  
  val prefixText: js.UndefOr[String] = js.undefined
  
  val suffixText: js.UndefOr[String] = js.undefined
}
object RenameTextSpan {
  
  inline def apply(end: Location, start: Location): RenameTextSpan = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameTextSpan]
  }
  
  extension [Self <: RenameTextSpan](x: Self) {
    
    inline def setPrefixText(value: String): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
    
    inline def setPrefixTextUndefined: Self = StObject.set(x, "prefixText", js.undefined)
    
    inline def setSuffixText(value: String): Self = StObject.set(x, "suffixText", value.asInstanceOf[js.Any])
    
    inline def setSuffixTextUndefined: Self = StObject.set(x, "suffixText", js.undefined)
  }
}
