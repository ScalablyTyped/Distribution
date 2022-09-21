package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceEntry
  extends StObject
     with DocumentSpan {
  
  var isInString: js.UndefOr[`true`] = js.undefined
  
  var isWriteAccess: Boolean
}
object ReferenceEntry {
  
  inline def apply(fileName: java.lang.String, isWriteAccess: Boolean, textSpan: TextSpan): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
  
  extension [Self <: ReferenceEntry](x: Self) {
    
    inline def setIsInString(value: `true`): Self = StObject.set(x, "isInString", value.asInstanceOf[js.Any])
    
    inline def setIsInStringUndefined: Self = StObject.set(x, "isInString", js.undefined)
    
    inline def setIsWriteAccess(value: Boolean): Self = StObject.set(x, "isWriteAccess", value.asInstanceOf[js.Any])
  }
}
