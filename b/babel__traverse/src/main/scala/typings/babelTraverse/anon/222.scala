package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  var `type`: DeclareOpaqueType
}
object `222` {
  
  @scala.inline
  def apply(): `222` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[`222`]
  }
  
  @scala.inline
  implicit class `222MutableBuilder`[Self <: `222`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareOpaqueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
