package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `239` extends StObject {
  
  var `type`: TypeParameterInstantiation = js.native
}
object `239` {
  
  @scala.inline
  def apply(`type`: TypeParameterInstantiation): `239` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`239`]
  }
  
  @scala.inline
  implicit class `239MutableBuilder`[Self <: `239`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TypeParameterInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
