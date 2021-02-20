package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssNodeCommon extends StObject {
  
  var loc: js.UndefOr[CssLocation] = js.native
  
  var `type`: String = js.native
}
object CssNodeCommon {
  
  @scala.inline
  def apply(`type`: String): CssNodeCommon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssNodeCommon]
  }
  
  @scala.inline
  implicit class CssNodeCommonMutableBuilder[Self <: CssNodeCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoc(value: CssLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
