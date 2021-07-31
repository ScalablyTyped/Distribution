package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSNamedTupleMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `215` extends StObject {
  
  var `type`: TSNamedTupleMember
}
object `215` {
  
  @scala.inline
  def apply(): `215` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[`215`]
  }
  
  @scala.inline
  implicit class `215MutableBuilder`[Self <: `215`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSNamedTupleMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
