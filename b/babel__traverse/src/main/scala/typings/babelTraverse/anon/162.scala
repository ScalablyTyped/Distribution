package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `162` extends StObject {
  
  var `type`: DeclareTypeAlias
}
object `162` {
  
  @scala.inline
  def apply(): `162` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit class `162MutableBuilder`[Self <: `162`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
