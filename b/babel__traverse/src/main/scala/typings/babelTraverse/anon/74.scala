package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `74` extends StObject {
  
  var `type`: TSTypeParameterInstantiation = js.native
}
object `74` {
  
  @scala.inline
  def apply(`type`: TSTypeParameterInstantiation): `74` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`74`]
  }
  
  @scala.inline
  implicit class `74MutableBuilder`[Self <: `74`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
