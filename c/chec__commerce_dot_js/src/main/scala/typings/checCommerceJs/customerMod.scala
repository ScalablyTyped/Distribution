package typings.checCommerceJs

import typings.checCommerceJs.anon.Customerid
import typings.checCommerceJs.anon.Success
import typings.checCommerceJs.cartMod.RequestMethod
import typings.checCommerceJs.mod.^
import typings.checCommerceJs.orderMod.Order
import typings.checCommerceJs.paginationMod.PaginationMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerMod {
  
  @JSImport("@chec/commerce.js/features/customer", "Customer")
  @js.native
  open class Customer protected () extends StObject {
    def this(commerce: ^) = this()
    
    def _request(endpoint: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: js.Object, extraHeaders: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: js.Object, extraHeaders: js.Object, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: js.Object, extraHeaders: Unit, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: Unit, extraHeaders: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: Unit, extraHeaders: js.Object, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: Unit, data: Unit, extraHeaders: Unit, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: js.Object, extraHeaders: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: js.Object, extraHeaders: js.Object, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: js.Object, extraHeaders: Unit, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: Unit, extraHeaders: js.Object): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: Unit, extraHeaders: js.Object, token: String): js.Promise[Any] = js.native
    def _request(endpoint: String, method: RequestMethod, data: Unit, extraHeaders: Unit, token: String): js.Promise[Any] = js.native
    
    def about(): js.Promise[typings.checCommerceJs.typesCustomerMod.Customer] = js.native
    
    def getOrder(orderId: String): js.Promise[Order] = js.native
    def getOrder(orderId: String, customerId: String): js.Promise[Order] = js.native
    def getOrder(orderId: String, customerId: String, token: String): js.Promise[Order] = js.native
    def getOrder(orderId: String, customerId: Unit, token: String): js.Promise[Order] = js.native
    
    def getOrders(): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: String): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: String, token: String): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: String, token: String, params: js.Object): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: String, token: Unit, params: js.Object): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: Unit, token: String): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: Unit, token: String, params: js.Object): js.Promise[CustomerOrdersCollection] = js.native
    def getOrders(customerId: Unit, token: Unit, params: js.Object): js.Promise[CustomerOrdersCollection] = js.native
    
    def getToken(token: String): js.Promise[Customerid] = js.native
    def getToken(token: String, save: Boolean): js.Promise[Customerid] = js.native
    
    def id(): String | Null = js.native
    
    def isLoggedIn(): Boolean = js.native
    
    def login(email: String, base_url: String): js.Promise[Success] = js.native
    
    def logout(): Unit = js.native
    
    def token(): String | Null = js.native
    
    def update(data: CustomerUpdate): js.Promise[typings.checCommerceJs.typesCustomerMod.Customer] = js.native
    def update(data: CustomerUpdate, customerId: String): js.Promise[typings.checCommerceJs.typesCustomerMod.Customer] = js.native
    def update(data: CustomerUpdate, customerId: String, token: String): js.Promise[typings.checCommerceJs.typesCustomerMod.Customer] = js.native
    def update(data: CustomerUpdate, customerId: Unit, token: String): js.Promise[typings.checCommerceJs.typesCustomerMod.Customer] = js.native
  }
  
  trait CustomerOrdersCollection extends StObject {
    
    var data: js.Array[Order]
    
    var meta: PaginationMeta
  }
  object CustomerOrdersCollection {
    
    inline def apply(data: js.Array[Order], meta: PaginationMeta): CustomerOrdersCollection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerOrdersCollection]
    }
    
    extension [Self <: CustomerOrdersCollection](x: Self) {
      
      inline def setData(value: js.Array[Order]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Order*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setMeta(value: PaginationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomerUpdate extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var firstname: js.UndefOr[String] = js.undefined
    
    var lastname: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[js.Object] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object CustomerUpdate {
    
    inline def apply(): CustomerUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomerUpdate]
    }
    
    extension [Self <: CustomerUpdate](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
      
      inline def setFirstnameUndefined: Self = StObject.set(x, "firstname", js.undefined)
      
      inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
      
      inline def setLastnameUndefined: Self = StObject.set(x, "lastname", js.undefined)
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
}
