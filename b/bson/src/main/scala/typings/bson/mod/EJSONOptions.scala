package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EJSONOptions extends StObject {
  
  /**
    * Output using the Extended JSON v1 spec
    * @defaultValue `false`
    */
  var legacy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable Extended JSON's `relaxed` mode, which attempts to return native JS types where possible, rather than BSON types
    * @defaultValue `false` */
  var relaxed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable native bigint support
    * @defaultValue `false`
    */
  var useBigInt64: js.UndefOr[Boolean] = js.undefined
}
object EJSONOptions {
  
  inline def apply(): EJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EJSONOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EJSONOptions] (val x: Self) extends AnyVal {
    
    inline def setLegacy(value: Boolean): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
    
    inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
    
    inline def setRelaxed(value: Boolean): Self = StObject.set(x, "relaxed", value.asInstanceOf[js.Any])
    
    inline def setRelaxedUndefined: Self = StObject.set(x, "relaxed", js.undefined)
    
    inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
    
    inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
  }
}
