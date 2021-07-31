package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeToken
  extends StObject
     with DSNode {
  
  var `type`: Token
  
  var value: String
}
object DSNodeToken {
  
  @scala.inline
  def apply(value: String): DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Token")
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
