package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyHyphen extends StObject {
  
  var inherits: js.UndefOr[PropertyInheritsProperty] = js.native
  
  var `initial-value`: js.UndefOr[String] = js.native
  
  var syntax: js.UndefOr[String] = js.native
}
object PropertyHyphen {
  
  @scala.inline
  def apply(): PropertyHyphen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphen]
  }
  
  @scala.inline
  implicit class PropertyHyphenMutableBuilder[Self <: PropertyHyphen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherits(value: PropertyInheritsProperty): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    @scala.inline
    def `setInitial-value`(value: String): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
