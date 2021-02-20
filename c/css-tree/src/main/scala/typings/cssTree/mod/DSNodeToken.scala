package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeToken extends DSNode {
  
  var `type`: Token = js.native
  
  var value: String = js.native
}
object DSNodeToken {
  
  @scala.inline
  def apply(`type`: Token, value: String): DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeToken]
  }
  
  @scala.inline
  implicit class DSNodeTokenMutableBuilder[Self <: DSNodeToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Token): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
