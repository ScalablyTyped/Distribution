package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An item found in a navto response.
  */
trait NavtoItem
  extends StObject
     with FileSpan {
  
  /**
    * Kind of symbol's container symbol (if any).
    */
  var containerKind: js.UndefOr[ScriptElementKind] = js.undefined
  
  /**
    * Name of symbol's container symbol (if any); for example,
    * the class name if symbol is a class member.
    */
  var containerName: js.UndefOr[String] = js.undefined
  
  /**
    * If this was a case sensitive or insensitive match.
    */
  var isCaseSensitive: Boolean
  
  /**
    * The symbol's kind (such as 'className' or 'parameterName').
    */
  var kind: ScriptElementKind
  
  /**
    * Optional modifiers for the kind (such as 'public').
    */
  var kindModifiers: js.UndefOr[String] = js.undefined
  
  /**
    * exact, substring, or prefix.
    */
  var matchKind: String
  
  /**
    * The symbol's name.
    */
  var name: String
}
object NavtoItem {
  
  inline def apply(
    end: Location,
    file: String,
    isCaseSensitive: Boolean,
    kind: ScriptElementKind,
    matchKind: String,
    name: String,
    start: Location
  ): NavtoItem = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavtoItem]
  }
  
  extension [Self <: NavtoItem](x: Self) {
    
    inline def setContainerKind(value: ScriptElementKind): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    inline def setContainerKindUndefined: Self = StObject.set(x, "containerKind", js.undefined)
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setKindModifiersUndefined: Self = StObject.set(x, "kindModifiers", js.undefined)
    
    inline def setMatchKind(value: String): Self = StObject.set(x, "matchKind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
