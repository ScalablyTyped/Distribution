package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.QualifiedTypeIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `73` extends StObject {
  
  var `type`: QualifiedTypeIdentifier = js.native
}
object `73` {
  
  @scala.inline
  def apply(`type`: QualifiedTypeIdentifier): `73` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  
  @scala.inline
  implicit class `73MutableBuilder`[Self <: `73`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: QualifiedTypeIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
