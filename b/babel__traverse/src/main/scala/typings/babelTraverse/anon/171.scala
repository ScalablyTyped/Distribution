package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `171` extends StObject {
  
  var `type`: CatchClause
}
object `171` {
  
  @scala.inline
  def apply(): `171` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[`171`]
  }
  
  @scala.inline
  implicit class `171MutableBuilder`[Self <: `171`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
