package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var `type`: MetaProperty
}
object `81` {
  
  @scala.inline
  def apply(): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit class `81MutableBuilder`[Self <: `81`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
