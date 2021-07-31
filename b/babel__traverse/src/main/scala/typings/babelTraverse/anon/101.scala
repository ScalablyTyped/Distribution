package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSInferType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101` extends StObject {
  
  var `type`: TSInferType
}
object `101` {
  
  @scala.inline
  def apply(): `101` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[`101`]
  }
  
  @scala.inline
  implicit class `101MutableBuilder`[Self <: `101`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
