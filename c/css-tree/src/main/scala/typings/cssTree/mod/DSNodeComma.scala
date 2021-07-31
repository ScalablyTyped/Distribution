package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Comma
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeComma
  extends StObject
     with DSNode {
  
  var `type`: Comma
}
object DSNodeComma {
  
  @scala.inline
  def apply(): DSNodeComma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Comma")
    __obj.asInstanceOf[DSNodeComma]
  }
  
  @scala.inline
  implicit class DSNodeCommaMutableBuilder[Self <: DSNodeComma] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Comma): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
