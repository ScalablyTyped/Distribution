package typings.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyHyphen[TLength, TTime] extends StObject {
  
  var inherits: js.UndefOr[Inherits] = js.undefined
  
  var `initial-value`: js.UndefOr[String] = js.undefined
  
  var syntax: js.UndefOr[String] = js.undefined
}
object PropertyHyphen {
  
  inline def apply[TLength, TTime](): PropertyHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyHyphen[TLength, TTime]]
  }
  
  extension [Self <: PropertyHyphen[?, ?], TLength, TTime](x: Self & (PropertyHyphen[TLength, TTime])) {
    
    inline def setInherits(value: Inherits): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
    
    inline def `setInitial-value`(value: String): Self = StObject.set(x, "initial-value", value.asInstanceOf[js.Any])
    
    inline def `setInitial-valueUndefined`: Self = StObject.set(x, "initial-value", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
  }
}
