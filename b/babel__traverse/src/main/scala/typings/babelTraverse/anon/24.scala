package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var `type`: BlockStatement
}
object `24` {
  
  @scala.inline
  def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
