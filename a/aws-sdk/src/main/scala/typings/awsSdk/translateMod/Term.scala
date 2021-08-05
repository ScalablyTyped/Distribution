package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Term extends StObject {
  
  /**
    * The source text of the term being translated by the custom terminology.
    */
  var SourceText: js.UndefOr[String] = js.undefined
  
  /**
    * The target text of the term being translated by the custom terminology.
    */
  var TargetText: js.UndefOr[String] = js.undefined
}
object Term {
  
  inline def apply(): Term = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Term]
  }
  
  extension [Self <: Term](x: Self) {
    
    inline def setSourceText(value: String): Self = StObject.set(x, "SourceText", value.asInstanceOf[js.Any])
    
    inline def setSourceTextUndefined: Self = StObject.set(x, "SourceText", js.undefined)
    
    inline def setTargetText(value: String): Self = StObject.set(x, "TargetText", value.asInstanceOf[js.Any])
    
    inline def setTargetTextUndefined: Self = StObject.set(x, "TargetText", js.undefined)
  }
}
