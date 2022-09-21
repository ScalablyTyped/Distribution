package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Moleculer_
  extends StObject
     with Instrumentation {
  
  /**
    * Whether to include context meta as tags.
    *
    * @default false
    */
  var meta: js.UndefOr[Boolean] = js.undefined
}
object Moleculer_ {
  
  inline def apply(): Moleculer_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Moleculer_]
  }
  
  extension [Self <: Moleculer_](x: Self) {
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
