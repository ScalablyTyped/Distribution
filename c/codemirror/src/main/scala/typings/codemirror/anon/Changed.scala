package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changed extends StObject {
  
  var changed: js.UndefOr[FromTo] = js.undefined
  
  var doc: typings.codemirror.mod.Doc
  
  var name: String
}
object Changed {
  
  inline def apply(doc: typings.codemirror.mod.Doc, name: String): Changed = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  extension [Self <: Changed](x: Self) {
    
    inline def setChanged(value: FromTo): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setDoc(value: typings.codemirror.mod.Doc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
