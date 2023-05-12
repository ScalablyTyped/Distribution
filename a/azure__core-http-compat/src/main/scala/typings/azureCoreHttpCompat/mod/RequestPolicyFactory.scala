package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPolicyFactory extends StObject {
  
  def create(nextPolicy: RequestPolicy, options: RequestPolicyOptionsLike): RequestPolicy
}
object RequestPolicyFactory {
  
  inline def apply(create: (RequestPolicy, RequestPolicyOptionsLike) => RequestPolicy): RequestPolicyFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[RequestPolicyFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPolicyFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (RequestPolicy, RequestPolicyOptionsLike) => RequestPolicy): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
