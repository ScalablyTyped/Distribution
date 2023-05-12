package typings.bitcoinComputerLib.mod

import typings.bitcoinComputerLib.anon.Args
import typings.bitcoinComputerLib.bitcoinComputerLibStrings.ASC
import typings.bitcoinComputerLib.bitcoinComputerLibStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  mod :string,   publicKey :string,   limit :number,   offset :number,   order :'ASC' | 'DESC',   ids :std.Array<string>,   contract :{  class :T,   args :std.ConstructorParameters<T> | undefined}}> */
trait UserQuery[T /* <: Class */] extends StObject {
  
  var contract: js.UndefOr[Args[T]] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var mod: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[ASC | DESC] = js.undefined
  
  var publicKey: js.UndefOr[String] = js.undefined
}
object UserQuery {
  
  inline def apply[T /* <: Class */](): UserQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserQuery[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserQuery[?], T /* <: Class */] (val x: Self & UserQuery[T]) extends AnyVal {
    
    inline def setContract(value: Args[T]): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: ASC | DESC): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
