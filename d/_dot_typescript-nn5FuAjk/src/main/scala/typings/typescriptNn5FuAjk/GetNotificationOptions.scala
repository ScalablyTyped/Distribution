package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationOptions extends StObject {
  
  var tag: js.UndefOr[java.lang.String] = js.undefined
}
object GetNotificationOptions {
  
  inline def apply(): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationOptions]
  }
  
  extension [Self <: GetNotificationOptions](x: Self) {
    
    inline def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
