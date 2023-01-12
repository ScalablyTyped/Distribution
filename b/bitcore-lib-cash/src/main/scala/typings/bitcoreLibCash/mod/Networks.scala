package typings.bitcoreLibCash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Networks {
  
  @JSImport("bitcore-lib-cash", "Networks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(data: Any): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(data.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  inline def get(args: String, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: String, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Double, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Double, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Network, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Network, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  
  @JSImport("bitcore-lib-cash", "Networks.livenet")
  @js.native
  val livenet: Network = js.native
  
  @JSImport("bitcore-lib-cash", "Networks.mainnet")
  @js.native
  val mainnet: Network = js.native
  
  inline def remove(network: Network): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(network.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @JSImport("bitcore-lib-cash", "Networks.testnet")
  @js.native
  val testnet: Network = js.native
  
  trait Network extends StObject {
    
    val alias: String
    
    val name: String
  }
  object Network {
    
    inline def apply(alias: String, name: String): Network = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
