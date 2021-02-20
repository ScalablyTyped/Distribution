package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `177` extends StObject {
  
  var `type`: DeclareVariable = js.native
}
object `177` {
  
  @scala.inline
  def apply(`type`: DeclareVariable): `177` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`177`]
  }
  
  @scala.inline
  implicit class `177MutableBuilder`[Self <: `177`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareVariable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
