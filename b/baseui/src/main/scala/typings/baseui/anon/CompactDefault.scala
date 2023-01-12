package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactDefault extends StObject {
  
  val default: default_
  
  val compact: typings.baseui.baseuiStrings.compact
}
object CompactDefault {
  
  inline def apply(): CompactDefault = {
    val __obj = js.Dynamic.literal(compact = "compact", default = "default")
    __obj.asInstanceOf[CompactDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompactDefault] (val x: Self) extends AnyVal {
    
    inline def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
