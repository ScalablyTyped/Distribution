package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `167` extends StObject {
  
  var `type`: Import = js.native
}
object `167` {
  
  @scala.inline
  def apply(`type`: Import): `167` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`167`]
  }
  
  @scala.inline
  implicit class `167MutableBuilder`[Self <: `167`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
