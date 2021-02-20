package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `162` extends StObject {
  
  var `type`: DeclareTypeAlias = js.native
}
object `162` {
  
  @scala.inline
  def apply(`type`: DeclareTypeAlias): `162` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`162`]
  }
  
  @scala.inline
  implicit class `162MutableBuilder`[Self <: `162`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
