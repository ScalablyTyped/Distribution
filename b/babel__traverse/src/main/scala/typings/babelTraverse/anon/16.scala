package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ForInStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var `type`: ForInStatement
}
object `16` {
  
  @scala.inline
  def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
