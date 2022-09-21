package typings.carbonComponentsReact.anon

import typings.carbonComponentsReact.searchLayoutButtonSearchLayoutButtonMod.SearchLayoutButtonFormat
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: NonNullable[js.UndefOr[SearchLayoutButtonFormat]]
}
object Format {
  
  inline def apply(format: NonNullable[js.UndefOr[SearchLayoutButtonFormat]]): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: NonNullable[js.UndefOr[SearchLayoutButtonFormat]]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
