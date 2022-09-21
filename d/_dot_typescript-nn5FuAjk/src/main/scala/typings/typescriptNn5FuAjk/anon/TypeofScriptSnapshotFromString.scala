package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofScriptSnapshotFromString extends StObject {
  
  def fromString(text: String): IScriptSnapshot
}
object TypeofScriptSnapshotFromString {
  
  inline def apply(fromString: String => IScriptSnapshot): TypeofScriptSnapshotFromString = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
    __obj.asInstanceOf[TypeofScriptSnapshotFromString]
  }
  
  extension [Self <: TypeofScriptSnapshotFromString](x: Self) {
    
    inline def setFromString(value: String => IScriptSnapshot): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
  }
}
