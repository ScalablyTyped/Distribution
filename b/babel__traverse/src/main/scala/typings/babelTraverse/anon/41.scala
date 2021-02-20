package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `41` extends StObject {
  
  var `type`: TSFunctionType = js.native
}
object `41` {
  
  @scala.inline
  def apply(`type`: TSFunctionType): `41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit class `41MutableBuilder`[Self <: `41`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
