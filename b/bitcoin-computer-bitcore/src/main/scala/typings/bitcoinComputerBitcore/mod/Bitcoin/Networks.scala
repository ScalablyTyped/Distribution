package typings.bitcoinComputerBitcore.mod.Bitcoin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks")
@js.native
open class Networks () extends StObject {
  
  def getNetworks(): Networks = js.native
}
object Networks {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(data: Any): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(data.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  /* static member */
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks.defaultNetwork")
  @js.native
  def defaultNetwork: Networks = js.native
  inline def defaultNetwork_=(x: Networks): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNetwork")(x.asInstanceOf[js.Any])
  
  inline def get(args: String, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: String, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Double, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Double, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Network, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  inline def get(args: Network, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks.livenet")
  @js.native
  val livenet: Network = js.native
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks.mainnet")
  @js.native
  val mainnet: Network = js.native
  
  inline def remove(network: Network): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(network.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.Networks.testnet")
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
    
    extension [Self <: Network](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
