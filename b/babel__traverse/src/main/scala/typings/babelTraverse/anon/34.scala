package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var `type`: DeclareModule
}
object `34` {
  
  @scala.inline
  def apply(): `34` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit class `34MutableBuilder`[Self <: `34`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareModule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
