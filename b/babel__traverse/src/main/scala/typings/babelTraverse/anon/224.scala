package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSModuleBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `224` extends StObject {
  
  var `type`: TSModuleBlock
}
object `224` {
  
  @scala.inline
  def apply(): `224` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[`224`]
  }
  
  @scala.inline
  implicit class `224MutableBuilder`[Self <: `224`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSModuleBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
