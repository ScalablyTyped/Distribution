package typings.baseui.anon

import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly top :'top',  readonly trailing :'trailing'}> */
trait Readonlyreadonlytoptoprea extends StObject {
  
  val top: typings.baseui.baseuiStrings.top
  
  val trailing: typings.baseui.baseuiStrings.trailing
}
object Readonlyreadonlytoptoprea {
  
  inline def apply(): Readonlyreadonlytoptoprea = {
    val __obj = js.Dynamic.literal(top = "top", trailing = "trailing")
    __obj.asInstanceOf[Readonlyreadonlytoptoprea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonlyreadonlytoptoprea] (val x: Self) extends AnyVal {
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTrailing(value: trailing): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
  }
}
