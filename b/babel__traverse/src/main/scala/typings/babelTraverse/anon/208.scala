package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `208` extends StObject {
  
  var `type`: TSConstructorType = js.native
}
object `208` {
  
  @scala.inline
  def apply(`type`: TSConstructorType): `208` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`208`]
  }
  
  @scala.inline
  implicit class `208MutableBuilder`[Self <: `208`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
