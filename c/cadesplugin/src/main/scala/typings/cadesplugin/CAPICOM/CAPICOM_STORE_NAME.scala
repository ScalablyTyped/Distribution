package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginStrings.AddressBook
import typings.cadesplugin.cadespluginStrings.Ca
import typings.cadesplugin.cadespluginStrings.My
import typings.cadesplugin.cadespluginStrings.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_STORE_NAME extends StoreNamePlugin {
  
  val CAPICOM_CA_STORE: Ca = js.native
  
  val CAPICOM_OTHER_STORE: AddressBook = js.native
  
  val CAPICOM_ROOT_STORE: Root = js.native
}
object CAPICOM_STORE_NAME {
  
  @scala.inline
  def apply(
    CAPICOM_CA_STORE: Ca,
    CAPICOM_MY_STORE: My,
    CAPICOM_OTHER_STORE: AddressBook,
    CAPICOM_ROOT_STORE: Root
  ): CAPICOM_STORE_NAME = {
    val __obj = js.Dynamic.literal(CAPICOM_CA_STORE = CAPICOM_CA_STORE.asInstanceOf[js.Any], CAPICOM_MY_STORE = CAPICOM_MY_STORE.asInstanceOf[js.Any], CAPICOM_OTHER_STORE = CAPICOM_OTHER_STORE.asInstanceOf[js.Any], CAPICOM_ROOT_STORE = CAPICOM_ROOT_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_STORE_NAME]
  }
  
  @scala.inline
  implicit class CAPICOM_STORE_NAMEMutableBuilder[Self <: CAPICOM_STORE_NAME] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_CA_STORE(value: Ca): Self = StObject.set(x, "CAPICOM_CA_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_OTHER_STORE(value: AddressBook): Self = StObject.set(x, "CAPICOM_OTHER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ROOT_STORE(value: Root): Self = StObject.set(x, "CAPICOM_ROOT_STORE", value.asInstanceOf[js.Any])
  }
}
