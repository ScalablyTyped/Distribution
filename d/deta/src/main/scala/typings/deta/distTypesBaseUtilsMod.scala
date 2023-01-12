package typings.deta

import typings.deta.distTypesTypesActionMod.Action
import typings.deta.distTypesTypesBasicMod.ArrayType
import typings.deta.distTypesTypesBasicMod.BasicType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseUtilsMod {
  
  @JSImport("deta/dist/types/base/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("deta/dist/types/base/utils", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BaseUtils
  
  inline def getTTL(): TTLResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")().asInstanceOf[TTLResponse]
  inline def getTTL(expireIn: Double): TTLResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")(expireIn.asInstanceOf[js.Any]).asInstanceOf[TTLResponse]
  inline def getTTL(expireIn: Double, expireAt: js.Date): TTLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")(expireIn.asInstanceOf[js.Any], expireAt.asInstanceOf[js.Any])).asInstanceOf[TTLResponse]
  inline def getTTL(expireIn: Double, expireAt: Double): TTLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")(expireIn.asInstanceOf[js.Any], expireAt.asInstanceOf[js.Any])).asInstanceOf[TTLResponse]
  inline def getTTL(expireIn: Unit, expireAt: js.Date): TTLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")(expireIn.asInstanceOf[js.Any], expireAt.asInstanceOf[js.Any])).asInstanceOf[TTLResponse]
  inline def getTTL(expireIn: Unit, expireAt: Double): TTLResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("getTTL")(expireIn.asInstanceOf[js.Any], expireAt.asInstanceOf[js.Any])).asInstanceOf[TTLResponse]
  
  @js.native
  trait BaseUtils extends StObject {
    
    def append(value: ArrayType): Action = js.native
    def append(value: BasicType): Action = js.native
    
    def increment(): Action = js.native
    def increment(value: Double): Action = js.native
    
    def prepend(value: ArrayType): Action = js.native
    def prepend(value: BasicType): Action = js.native
    
    def trim(): Action = js.native
  }
  
  trait TTLResponse extends StObject {
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object TTLResponse {
    
    inline def apply(): TTLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TTLResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TTLResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
