package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify supportsColor.supportsColor.Level * / any, 'level'> */
trait Pickanylevel extends StObject {
  
  var level: js.UndefOr[Any] = js.undefined
}
object Pickanylevel {
  
  inline def apply(): Pickanylevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pickanylevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pickanylevel] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: Any): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
