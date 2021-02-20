package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSRestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `205` extends StObject {
  
  var `type`: TSRestType = js.native
}
object `205` {
  
  @scala.inline
  def apply(`type`: TSRestType): `205` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`205`]
  }
  
  @scala.inline
  implicit class `205MutableBuilder`[Self <: `205`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
