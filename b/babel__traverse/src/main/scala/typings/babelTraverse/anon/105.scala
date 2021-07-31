package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var `type`: EmptyStatement
}
object `105` {
  
  @scala.inline
  def apply(): `105` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit class `105MutableBuilder`[Self <: `105`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
