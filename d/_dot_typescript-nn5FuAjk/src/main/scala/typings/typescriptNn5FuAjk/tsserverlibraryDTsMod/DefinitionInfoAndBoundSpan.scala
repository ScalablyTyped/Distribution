package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinitionInfoAndBoundSpan extends StObject {
  
  var definitions: js.UndefOr[Array[DefinitionInfo]] = js.undefined
  
  var textSpan: TextSpan
}
object DefinitionInfoAndBoundSpan {
  
  inline def apply(textSpan: TextSpan): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
  
  extension [Self <: DefinitionInfoAndBoundSpan](x: Self) {
    
    inline def setDefinitions(value: Array[DefinitionInfo]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
