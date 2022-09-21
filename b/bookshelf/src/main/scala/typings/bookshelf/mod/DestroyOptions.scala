package typings.bookshelf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyOptions
  extends StObject
     with SyncOptions {
  
  /** @default true */
  var require: js.UndefOr[Boolean] = js.undefined
}
object DestroyOptions {
  
  inline def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  extension [Self <: DestroyOptions](x: Self) {
    
    inline def setRequire(value: Boolean): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
  }
}
