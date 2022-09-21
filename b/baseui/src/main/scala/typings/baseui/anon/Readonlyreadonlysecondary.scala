package typings.baseui.anon

import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.tertiary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly secondary :'secondary',  readonly tertiary :'tertiary'}> */
trait Readonlyreadonlysecondary extends StObject {
  
  val secondary: typings.baseui.baseuiStrings.secondary
  
  val tertiary: typings.baseui.baseuiStrings.tertiary
}
object Readonlyreadonlysecondary {
  
  inline def apply(): Readonlyreadonlysecondary = {
    val __obj = js.Dynamic.literal(secondary = "secondary", tertiary = "tertiary")
    __obj.asInstanceOf[Readonlyreadonlysecondary]
  }
  
  extension [Self <: Readonlyreadonlysecondary](x: Self) {
    
    inline def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setTertiary(value: tertiary): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
  }
}
