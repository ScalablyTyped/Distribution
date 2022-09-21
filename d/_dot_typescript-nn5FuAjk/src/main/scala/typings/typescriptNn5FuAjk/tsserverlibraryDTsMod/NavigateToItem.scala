package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.camelCase
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.exact
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.prefix
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.substring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToItem extends StObject {
  
  var containerKind: ScriptElementKind
  
  var containerName: java.lang.String
  
  var fileName: java.lang.String
  
  var isCaseSensitive: Boolean
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var matchKind: exact | prefix | substring | camelCase
  
  var name: java.lang.String
  
  var textSpan: TextSpan
}
object NavigateToItem {
  
  inline def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: exact | prefix | substring | camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  
  extension [Self <: NavigateToItem](x: Self) {
    
    inline def setContainerKind(value: ScriptElementKind): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    inline def setContainerName(value: java.lang.String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setMatchKind(value: exact | prefix | substring | camelCase): Self = StObject.set(x, "matchKind", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
