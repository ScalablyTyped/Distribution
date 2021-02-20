package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.DeclareInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `156` extends StObject {
  
  var `type`: DeclareInterface = js.native
}
object `156` {
  
  @scala.inline
  def apply(`type`: DeclareInterface): `156` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`156`]
  }
  
  @scala.inline
  implicit class `156MutableBuilder`[Self <: `156`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeclareInterface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
