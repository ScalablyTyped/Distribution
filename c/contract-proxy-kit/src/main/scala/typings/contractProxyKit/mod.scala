package typings.contractProxyKit

import org.scalablytyped.runtime.StringDictionary
import typings.contractProxyKit.anon.Typeofethers
import typings.contractProxyKit.contractProxyKitInts.`0`
import typings.contractProxyKit.contractProxyKitInts.`1`
import typings.ethers.typesProvidersSignerMod.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contract-proxy-kit", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CPK
  @JSImport("contract-proxy-kit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("contract-proxy-kit", "CALL")
  @js.native
  def CALL: `0` = js.native
  inline def CALL_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("contract-proxy-kit", "DELEGATECALL")
  @js.native
  def DELEGATECALL: `1` = js.native
  inline def DELEGATECALL_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELEGATECALL")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def create(opts: CPKConfig): js.Promise[CPK] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CPK]]
  
  @js.native
  trait CPK extends StObject {
    
    def address: String = js.native
    
    def execTransactions(transactions: js.Array[Transaction]): js.Promise[TransactionResult] = js.native
    def execTransactions(transactions: js.Array[Transaction], options: TransactionOptions): js.Promise[TransactionResult] = js.native
    
    def getOwnerAccount(): js.Promise[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contractProxyKit.mod.Web3SpecificConfig
    - typings.contractProxyKit.mod.EthersSpecificConfig
  */
  trait CPKConfig extends StObject
  object CPKConfig {
    
    inline def EthersSpecificConfig(ethers: Typeofethers, signer: Signer): typings.contractProxyKit.mod.EthersSpecificConfig = {
      val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contractProxyKit.mod.EthersSpecificConfig]
    }
    
    inline def Web3SpecificConfig(web3: js.Object): typings.contractProxyKit.mod.Web3SpecificConfig = {
      val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.contractProxyKit.mod.Web3SpecificConfig]
    }
  }
  
  trait CommonConfig extends StObject {
    
    var networks: js.UndefOr[StringDictionary[NetworkConfigEntry]] = js.undefined
  }
  object CommonConfig {
    
    inline def apply(): CommonConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonConfig] (val x: Self) extends AnyVal {
      
      inline def setNetworks(value: StringDictionary[NetworkConfigEntry]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      
      inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    }
  }
  
  trait EthersSpecificConfig
    extends StObject
       with CommonConfig
       with CPKConfig {
    
    var ethers: Typeofethers
    
    var signer: Signer
  }
  object EthersSpecificConfig {
    
    inline def apply(ethers: Typeofethers, signer: Signer): EthersSpecificConfig = {
      val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
      __obj.asInstanceOf[EthersSpecificConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EthersSpecificConfig] (val x: Self) extends AnyVal {
      
      inline def setEthers(value: Typeofethers): Self = StObject.set(x, "ethers", value.asInstanceOf[js.Any])
      
      inline def setSigner(value: Signer): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkConfigEntry extends StObject {
    
    var fallbackHandlerAddress: String
    
    var masterCopyAddress: String
    
    var multiSendAddress: String
    
    var proxyFactoryAddress: String
  }
  object NetworkConfigEntry {
    
    inline def apply(
      fallbackHandlerAddress: String,
      masterCopyAddress: String,
      multiSendAddress: String,
      proxyFactoryAddress: String
    ): NetworkConfigEntry = {
      val __obj = js.Dynamic.literal(fallbackHandlerAddress = fallbackHandlerAddress.asInstanceOf[js.Any], masterCopyAddress = masterCopyAddress.asInstanceOf[js.Any], multiSendAddress = multiSendAddress.asInstanceOf[js.Any], proxyFactoryAddress = proxyFactoryAddress.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkConfigEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkConfigEntry] (val x: Self) extends AnyVal {
      
      inline def setFallbackHandlerAddress(value: String): Self = StObject.set(x, "fallbackHandlerAddress", value.asInstanceOf[js.Any])
      
      inline def setMasterCopyAddress(value: String): Self = StObject.set(x, "masterCopyAddress", value.asInstanceOf[js.Any])
      
      inline def setMultiSendAddress(value: String): Self = StObject.set(x, "multiSendAddress", value.asInstanceOf[js.Any])
      
      inline def setProxyFactoryAddress(value: String): Self = StObject.set(x, "proxyFactoryAddress", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transaction extends StObject {
    
    var data: String
    
    var operation: Double | String | js.Object
    
    var to: String
    
    var value: Double | String | js.Object
  }
  object Transaction {
    
    inline def apply(
      data: String,
      operation: Double | String | js.Object,
      to: String,
      value: Double | String | js.Object
    ): Transaction = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: Double | String | js.Object): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TransactionOptions = js.Object
  
  trait TransactionResult extends StObject {
    
    var hash: String
    
    var promiEvent: js.UndefOr[js.Object] = js.undefined
    
    var transactionResponse: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ Any
      ] = js.undefined
  }
  object TransactionResult {
    
    inline def apply(hash: String): TransactionResult = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionResult] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPromiEvent(value: js.Object): Self = StObject.set(x, "promiEvent", value.asInstanceOf[js.Any])
      
      inline def setPromiEventUndefined: Self = StObject.set(x, "promiEvent", js.undefined)
      
      inline def setTransactionResponse(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.providers.TransactionResponse */ Any
      ): Self = StObject.set(x, "transactionResponse", value.asInstanceOf[js.Any])
      
      inline def setTransactionResponseUndefined: Self = StObject.set(x, "transactionResponse", js.undefined)
    }
  }
  
  trait Web3SpecificConfig
    extends StObject
       with CommonConfig
       with CPKConfig {
    
    var ownerAccount: js.UndefOr[String] = js.undefined
    
    var web3: js.Object
  }
  object Web3SpecificConfig {
    
    inline def apply(web3: js.Object): Web3SpecificConfig = {
      val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
      __obj.asInstanceOf[Web3SpecificConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Web3SpecificConfig] (val x: Self) extends AnyVal {
      
      inline def setOwnerAccount(value: String): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
      
      inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
      
      inline def setWeb3(value: js.Object): Self = StObject.set(x, "web3", value.asInstanceOf[js.Any])
    }
  }
}
