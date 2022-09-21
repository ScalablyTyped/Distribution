package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly horizontal :'horizontal',  readonly vertical :'vertical'}> */
trait Readonlyreadonlyhorizonta extends StObject {
  
  val horizontal: typings.baseui.baseuiStrings.horizontal
  
  val vertical: typings.baseui.baseuiStrings.vertical
}
object Readonlyreadonlyhorizonta {
  
  inline def apply(): Readonlyreadonlyhorizonta = {
    val __obj = js.Dynamic.literal(horizontal = "horizontal", vertical = "vertical")
    __obj.asInstanceOf[Readonlyreadonlyhorizonta]
  }
  
  extension [Self <: Readonlyreadonlyhorizonta](x: Self) {
    
    inline def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
