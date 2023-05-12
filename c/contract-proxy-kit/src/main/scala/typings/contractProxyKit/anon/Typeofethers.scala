package typings.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable8
import typings.ethers.anon.Error
import typings.ethers.anon.From
import typings.ethers.typesAbiCodersAbstractCoderMod.Result
import typings.ethers.typesAbiFragmentsMod.ErrorFragment
import typings.ethers.typesAbiFragmentsMod.FragmentType
import typings.ethers.typesAbiFragmentsMod.FunctionFragment
import typings.ethers.typesAbiFragmentsMod.ParamType
import typings.ethers.typesAbiMod.EventFragment
import typings.ethers.typesAbiMod.Interface
import typings.ethers.typesAddressMod.AddressLike
import typings.ethers.typesAddressMod.NameResolver
import typings.ethers.typesContractContractMod.BaseContract
import typings.ethers.typesContractTypesMod.ContractEventName
import typings.ethers.typesCryptoMod.SigningKey
import typings.ethers.typesCryptoScryptMod.ProgressCallback
import typings.ethers.typesCryptoSignatureMod.SignatureLike
import typings.ethers.typesHashTypedDataMod.TypedDataDomain
import typings.ethers.typesHashTypedDataMod.TypedDataField
import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersFormattingMod.BlockParams
import typings.ethers.typesProvidersFormattingMod.LogParams
import typings.ethers.typesProvidersFormattingMod.TransactionReceiptParams
import typings.ethers.typesProvidersFormattingMod.TransactionResponseParams
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderBrowserMod.Eip1193Provider
import typings.ethers.typesProvidersProviderFallbackMod.FallbackProviderConfig
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiProvider
import typings.ethers.typesProvidersProviderMod.EventFilter
import typings.ethers.typesProvidersProviderMod.FeeData
import typings.ethers.typesProvidersProviderMod.Log
import typings.ethers.typesProvidersProviderMod.PreparedTransactionRequest
import typings.ethers.typesProvidersProviderMod.Provider
import typings.ethers.typesProvidersProviderMod.TransactionReceipt
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionResponse
import typings.ethers.typesProvidersProviderSocketMod.SocketProvider
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketLike
import typings.ethers.typesProvidersSignerMod.Signer
import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListish
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CodedEthersError
import typings.ethers.typesUtilsErrorsMod.ErrorCode
import typings.ethers.typesUtilsErrorsMod.ErrorInfo
import typings.ethers.typesUtilsEventsMod.EventEmitterable
import typings.ethers.typesUtilsFetchMod.FetchRequest
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.ethers.typesUtilsMathsMod.Numeric
import typings.ethers.typesUtilsRlpMod.RlpStructuredData
import typings.ethers.typesUtilsUtf8Mod.UnicodeNormalizationForm
import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorFunc
import typings.ethers.typesWalletJsonCrowdsaleMod.CrowdsaleAccount
import typings.ethers.typesWalletJsonKeystoreMod.EncryptOptions
import typings.ethers.typesWalletJsonKeystoreMod.KeystoreAccount
import typings.ethers.typesWordlistsWordlistMod.Wordlist
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofethers extends StObject {
  
  var AbiCoder: TypeofAbiCoder = js.native
  
  var AbstractProvider: Instantiable0[typings.ethers.mod.ethers.AbstractProvider] = js.native
  
  var AbstractSigner: Instantiable0[typings.ethers.mod.ethers.AbstractSigner[Null | Provider]] = js.native
  
  var AlchemyProvider: TypeofAlchemyProvider = js.native
  
  var AnkrProvider: TypeofAnkrProvider = js.native
  
  var BaseContract: TypeofBaseContract = js.native
  
  var BaseWallet: Instantiable1[/* privateKey */ SigningKey, typings.ethers.mod.ethers.BaseWallet] = js.native
  
  var Block: Instantiable2[/* block */ BlockParams, /* provider */ Provider, typings.ethers.mod.ethers.Block] = js.native
  
  var BrowserProvider: Instantiable1[/* ethereum */ Eip1193Provider, typings.ethers.mod.ethers.BrowserProvider] = js.native
  
  var CloudflareProvider: Instantiable0[typings.ethers.mod.ethers.CloudflareProvider] = js.native
  
  var ConstructorFragment: TypeofConstructorFragment = js.native
  
  var Contract: Instantiable0[typings.ethers.mod.ethers.Contract] = js.native
  
  var ContractEventPayload: Instantiable5[
    /* contract */ BaseContract, 
    /* listener */ Null, 
    /* filter */ ContractEventName, 
    /* fragment */ EventFragment, 
    /* _log */ Log, 
    typings.ethers.mod.ethers.ContractEventPayload
  ] = js.native
  
  var ContractFactory: TypeofContractFactory = js.native
  
  var ContractTransactionReceipt: Instantiable3[
    /* iface */ Interface, 
    /* provider */ Provider, 
    /* tx */ TransactionReceipt, 
    typings.ethers.mod.ethers.ContractTransactionReceipt
  ] = js.native
  
  var ContractTransactionResponse: Instantiable3[
    /* iface */ Interface, 
    /* provider */ Provider, 
    /* tx */ TransactionResponse, 
    typings.ethers.mod.ethers.ContractTransactionResponse
  ] = js.native
  
  var ContractUnknownEventPayload: Instantiable4[
    /* contract */ BaseContract, 
    /* listener */ Null, 
    /* filter */ ContractEventName, 
    /* log */ Log, 
    typings.ethers.mod.ethers.ContractUnknownEventPayload
  ] = js.native
  
  var EnsPlugin: Instantiable0[typings.ethers.mod.ethers.EnsPlugin] = js.native
  
  var EnsResolver: TypeofEnsResolver = js.native
  
  var ErrorDescription: Instantiable3[
    /* fragment */ ErrorFragment, 
    /* selector */ String, 
    /* args */ Result, 
    typings.ethers.mod.ethers.ErrorDescription
  ] = js.native
  
  var ErrorFragment: TypeofErrorFragment = js.native
  
  val EtherSymbol: String = js.native
  
  var EtherscanPlugin: Instantiable1[/* baseUrl */ String, typings.ethers.mod.ethers.EtherscanPlugin] = js.native
  
  var EtherscanProvider: Instantiable0[typings.ethers.mod.ethers.EtherscanProvider] = js.native
  
  var EventFragment: TypeofEventFragment = js.native
  
  var EventLog: Instantiable3[
    /* log */ Log, 
    /* iface */ Interface, 
    /* fragment */ EventFragment, 
    typings.ethers.mod.ethers.EventLog
  ] = js.native
  
  var EventPayload: Instantiable3[
    /* emitter */ EventEmitterable[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    /* listener */ Null, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* filter */ Any, 
    typings.ethers.mod.ethers.EventPayload[js.Object]
  ] = js.native
  
  var FallbackFragment: TypeofFallbackFragment = js.native
  
  var FallbackProvider: Instantiable1[
    /* providers */ js.Array[AbstractProvider | FallbackProviderConfig], 
    typings.ethers.mod.ethers.FallbackProvider
  ] = js.native
  
  var FeeData: Instantiable0[typings.ethers.mod.ethers.FeeData] = js.native
  
  var FeeDataNetworkPlugin: Instantiable1[
    /* feeDataFunc */ js.Function1[/* provider */ Provider, js.Promise[FeeData]], 
    typings.ethers.mod.ethers.FeeDataNetworkPlugin
  ] = js.native
  
  var FetchCancelSignal: Instantiable1[/* request */ FetchRequest, typings.ethers.mod.ethers.FetchCancelSignal] = js.native
  
  var FetchRequest: TypeofFetchRequest = js.native
  
  var FetchResponse: Instantiable3[
    /* statusCode */ Double, 
    /* statusMessage */ String, 
    /* headers */ Record[String, String], 
    typings.ethers.mod.ethers.FetchResponse
  ] = js.native
  
  var FixedNumber: TypeofFixedNumber = js.native
  
  var Fragment: TypeofFragment = js.native
  
  var FunctionFragment: TypeofFunctionFragment = js.native
  
  var GasCostPlugin: Instantiable0[typings.ethers.mod.ethers.GasCostPlugin] = js.native
  
  var HDNodeVoidWallet: Instantiable8[
    /* guard */ Any, 
    /* address */ String, 
    /* publicKey */ String, 
    /* parentFingerprint */ String, 
    /* chainCode */ String, 
    /* path */ Null, 
    /* index */ Double, 
    /* depth */ Double, 
    typings.ethers.mod.ethers.HDNodeVoidWallet
  ] = js.native
  
  var HDNodeWallet: TypeofHDNodeWallet = js.native
  
  var Indexed: TypeofIndexed = js.native
  
  var InfuraProvider: TypeofInfuraProvider = js.native
  
  var InfuraWebSocketProvider: Instantiable0[typings.ethers.mod.ethers.InfuraWebSocketProvider] = js.native
  
  var Interface: TypeofInterface = js.native
  
  var IpcSocketProvider: Instantiable1[/* path */ String, typings.ethers.mod.ethers.IpcSocketProvider] = js.native
  
  var JsonRpcApiProvider: Instantiable0[typings.ethers.mod.ethers.JsonRpcApiProvider] = js.native
  
  var JsonRpcProvider: Instantiable0[typings.ethers.mod.ethers.JsonRpcProvider] = js.native
  
  var JsonRpcSigner: Instantiable2[
    /* provider */ JsonRpcApiProvider, 
    /* address */ String, 
    typings.ethers.mod.ethers.JsonRpcSigner
  ] = js.native
  
  var LangEn: TypeofLangEn = js.native
  
  var Log: Instantiable2[/* log */ LogParams, /* provider */ Provider, typings.ethers.mod.ethers.Log] = js.native
  
  var LogDescription: Instantiable3[
    /* fragment */ typings.ethers.typesAbiFragmentsMod.EventFragment, 
    /* topic */ String, 
    /* args */ Result, 
    typings.ethers.mod.ethers.LogDescription
  ] = js.native
  
  val MaxInt256: js.BigInt = js.native
  
  val MaxUint256: js.BigInt = js.native
  
  val MessagePrefix: String = js.native
  
  val MinInt256: js.BigInt = js.native
  
  var Mnemonic: TypeofMnemonic = js.native
  
  val N: js.BigInt = js.native
  
  var NamedFragment: Instantiable4[
    /* guard */ Any, 
    /* type */ FragmentType, 
    /* name */ String, 
    /* inputs */ js.Array[ParamType], 
    typings.ethers.mod.ethers.NamedFragment
  ] = js.native
  
  var Network: TypeofNetwork = js.native
  
  var NetworkPlugin: Instantiable1[/* name */ String, typings.ethers.mod.ethers.NetworkPlugin] = js.native
  
  var NonceManager: Instantiable1[/* signer */ Signer, typings.ethers.mod.ethers.NonceManager] = js.native
  
  var ParamType: TypeofParamType = js.native
  
  var PocketProvider: TypeofPocketProvider = js.native
  
  var QuickNodeProvider: TypeofQuickNodeProvider = js.native
  
  var Result: TypeofResult = js.native
  
  var Signature: TypeofSignature = js.native
  
  var SigningKey: TypeofSigningKey = js.native
  
  var SocketBlockSubscriber: Instantiable1[/* provider */ SocketProvider, typings.ethers.mod.ethers.SocketBlockSubscriber] = js.native
  
  var SocketEventSubscriber: Instantiable2[
    /* provider */ SocketProvider, 
    /* filter */ EventFilter, 
    typings.ethers.mod.ethers.SocketEventSubscriber
  ] = js.native
  
  var SocketPendingSubscriber: Instantiable1[/* provider */ SocketProvider, typings.ethers.mod.ethers.SocketPendingSubscriber] = js.native
  
  var SocketProvider: Instantiable0[typings.ethers.mod.ethers.SocketProvider] = js.native
  
  var SocketSubscriber: Instantiable2[
    /* provider */ SocketProvider, 
    /* filter */ js.Array[Any], 
    typings.ethers.mod.ethers.SocketSubscriber
  ] = js.native
  
  var StructFragment: TypeofStructFragment = js.native
  
  var Transaction: TypeofTransaction = js.native
  
  var TransactionDescription: Instantiable4[
    /* fragment */ FunctionFragment, 
    /* selector */ String, 
    /* args */ Result, 
    /* value */ js.BigInt, 
    typings.ethers.mod.ethers.TransactionDescription
  ] = js.native
  
  var TransactionReceipt: Instantiable2[
    /* tx */ TransactionReceiptParams, 
    /* provider */ Provider, 
    typings.ethers.mod.ethers.TransactionReceipt
  ] = js.native
  
  var TransactionResponse: Instantiable2[
    /* tx */ TransactionResponseParams, 
    /* provider */ Provider, 
    typings.ethers.mod.ethers.TransactionResponse
  ] = js.native
  
  var Typed: TypeofTyped = js.native
  
  var TypedDataEncoder: TypeofTypedDataEncoder = js.native
  
  var UnmanagedSubscriber: Instantiable1[/* name */ String, typings.ethers.mod.ethers.UnmanagedSubscriber] = js.native
  
  /* Inlined std.Readonly<std.Record<'error' | 'ignore' | 'replace', ethers.ethers/types/utils/utf8.Utf8ErrorFunc>> */
  val Utf8ErrorFuncs: TypeofUtf8ErrorFuncs = js.native
  
  var VoidSigner: Instantiable1[/* address */ String, typings.ethers.mod.ethers.VoidSigner] = js.native
  
  var Wallet: TypeofWallet = js.native
  
  var WebSocketProvider: Instantiable1[/* url */ String, typings.ethers.mod.ethers.WebSocketProvider] = js.native
  
  val WeiPerEther: js.BigInt = js.native
  
  var Wordlist: Instantiable1[/* locale */ String, typings.ethers.mod.ethers.Wordlist] = js.native
  
  var WordlistOwl: Instantiable3[
    /* locale */ String, 
    /* data */ String, 
    /* checksum */ String, 
    typings.ethers.mod.ethers.WordlistOwl
  ] = js.native
  
  var WordlistOwlA: Instantiable4[
    /* locale */ String, 
    /* data */ String, 
    /* accent */ String, 
    /* checksum */ String, 
    typings.ethers.mod.ethers.WordlistOwlA
  ] = js.native
  
  val ZeroAddress: String = js.native
  
  val ZeroHash: String = js.native
  
  def accessListify(value: AccessListish): AccessList = js.native
  
  def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K): /* asserts check */ Boolean = js.native
  def assert[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](check: Any, message: String, code: K, info: ErrorInfo[T]): /* asserts check */ Boolean = js.native
  
  def assertArgument(check: Any, message: String, name: String, value: Any): /* asserts check */ Boolean = js.native
  
  def assertArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def assertArgumentCount(count: Double, expectedCount: Double, message: String): Unit = js.native
  
  def assertNormalize(form: String): Unit = js.native
  
  def assertPrivate(givenGuard: Any, guard: Any): Unit = js.native
  def assertPrivate(givenGuard: Any, guard: Any, className: String): Unit = js.native
  
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  def computeAddress(key: String): String = js.native
  def computeAddress(key: SigningKey): String = js.native
  
  val computeHmac: TypeofcomputeHmac = js.native
  
  def concat(datas: js.Array[BytesLike]): String = js.native
  
  def copyRequest(req: TransactionRequest): PreparedTransactionRequest = js.native
  
  def dataLength(data: BytesLike): Double = js.native
  
  def dataSlice(data: BytesLike): String = js.native
  def dataSlice(data: BytesLike, start: Double): String = js.native
  def dataSlice(data: BytesLike, start: Double, end: Double): String = js.native
  def dataSlice(data: BytesLike, start: Unit, end: Double): String = js.native
  
  def decodeBase58(value: String): js.BigInt = js.native
  
  def decodeBase64(value: String): js.typedarray.Uint8Array = js.native
  
  def decodeBytes32String(_bytes: BytesLike): String = js.native
  
  def decodeRlp(_data: BytesLike): RlpStructuredData = js.native
  
  def decryptCrowdsaleJson(json: String, _password: String): CrowdsaleAccount = js.native
  def decryptCrowdsaleJson(json: String, _password: js.typedarray.Uint8Array): CrowdsaleAccount = js.native
  
  def decryptKeystoreJson(json: String, _password: String): js.Promise[KeystoreAccount] = js.native
  def decryptKeystoreJson(json: String, _password: String, progress: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array): js.Promise[KeystoreAccount] = js.native
  def decryptKeystoreJson(json: String, _password: js.typedarray.Uint8Array, progress: ProgressCallback): js.Promise[KeystoreAccount] = js.native
  
  def decryptKeystoreJsonSync(json: String, _password: String): KeystoreAccount = js.native
  def decryptKeystoreJsonSync(json: String, _password: js.typedarray.Uint8Array): KeystoreAccount = js.native
  
  val defaultPath: String = js.native
  
  def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any
  ): Unit = js.native
  def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any,
    types: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? string} */ js.Any
  ): Unit = js.native
  
  def dnsEncode(name: String): String = js.native
  
  def encodeBase58(_value: BytesLike): String = js.native
  
  def encodeBase64(data: BytesLike): String = js.native
  
  def encodeBytes32String(text: String): String = js.native
  
  def encodeRlp(`object`: RlpStructuredData): String = js.native
  
  def encryptKeystoreJson(account: KeystoreAccount, password: String): js.Promise[String] = js.native
  def encryptKeystoreJson(account: KeystoreAccount, password: String, options: EncryptOptions): js.Promise[String] = js.native
  def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array): js.Promise[String] = js.native
  def encryptKeystoreJson(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): js.Promise[String] = js.native
  
  def encryptKeystoreJsonSync(account: KeystoreAccount, password: String): String = js.native
  def encryptKeystoreJsonSync(account: KeystoreAccount, password: String, options: EncryptOptions): String = js.native
  def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array): String = js.native
  def encryptKeystoreJsonSync(account: KeystoreAccount, password: js.typedarray.Uint8Array, options: EncryptOptions): String = js.native
  
  def ensNormalize(name: String): String = js.native
  
  def formatEther(wei: BigNumberish): String = js.native
  
  def formatUnits(value: BigNumberish): String = js.native
  def formatUnits(value: BigNumberish, unit: String): String = js.native
  def formatUnits(value: BigNumberish, unit: Numeric): String = js.native
  
  def fromTwos(_value: BigNumberish, _width: Numeric): js.BigInt = js.native
  
  def getAccountPath(_index: Numeric): String = js.native
  
  def getAddress(address: String): String = js.native
  
  def getBigInt(value: BigNumberish): js.BigInt = js.native
  def getBigInt(value: BigNumberish, name: String): js.BigInt = js.native
  
  def getBytes(value: BytesLike): js.typedarray.Uint8Array = js.native
  def getBytes(value: BytesLike, name: String): js.typedarray.Uint8Array = js.native
  
  def getBytesCopy(value: BytesLike): js.typedarray.Uint8Array = js.native
  def getBytesCopy(value: BytesLike, name: String): js.typedarray.Uint8Array = js.native
  
  def getCreate2Address(_from: String, _salt: BytesLike, _initCodeHash: BytesLike): String = js.native
  
  def getCreateAddress(tx: From): String = js.native
  
  def getDefaultProvider(network: String): AbstractProvider = js.native
  def getDefaultProvider(network: String, options: Any): AbstractProvider = js.native
  def getDefaultProvider(network: Networkish): AbstractProvider = js.native
  def getDefaultProvider(network: Networkish, options: Any): AbstractProvider = js.native
  def getDefaultProvider(network: WebSocketLike): AbstractProvider = js.native
  def getDefaultProvider(network: WebSocketLike, options: Any): AbstractProvider = js.native
  
  def getIcapAddress(address: String): String = js.native
  
  def getIndexedAccountPath(_index: Numeric): String = js.native
  
  def getNumber(value: BigNumberish): Double = js.native
  def getNumber(value: BigNumberish, name: String): Double = js.native
  
  def getUint(value: BigNumberish): js.BigInt = js.native
  def getUint(value: BigNumberish, name: String): js.BigInt = js.native
  
  def hashMessage(message: String): String = js.native
  def hashMessage(message: js.typedarray.Uint8Array): String = js.native
  
  def hexlify(data: BytesLike): String = js.native
  
  def id(value: String): String = js.native
  
  def isAddress(value: Any): /* is string */ Boolean = js.native
  
  def isAddressable(value: Any): /* is ethers.ethers/types/address.Addressable */ Boolean = js.native
  
  def isBytesLike(value: Any): /* is ethers.ethers/types/utils/data.BytesLike */ Boolean = js.native
  
  def isCallException(error: Any): /* is ethers.ethers/types/utils/errors.CallExceptionError */ Boolean = js.native
  
  def isCrowdsaleJson(json: String): Boolean = js.native
  
  def isError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](error: Any, code: K): /* is T */ Boolean = js.native
  
  def isHexString(value: Any): /* is / * template literal string: 0x${string} * / string */ Boolean = js.native
  def isHexString(value: Any, length: Boolean): /* is / * template literal string: 0x${string} * / string */ Boolean = js.native
  def isHexString(value: Any, length: Double): /* is / * template literal string: 0x${string} * / string */ Boolean = js.native
  
  def isKeystoreJson(json: String): Boolean = js.native
  
  def isValidName(name: String): /* is string */ Boolean = js.native
  
  val keccak256: Typeofkeccak256 = js.native
  
  def lock(): Unit = js.native
  
  def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K): T = js.native
  def makeError[K /* <: ErrorCode */, T /* <: CodedEthersError[K] */](message: String, code: K, info: ErrorInfo[T]): T = js.native
  
  def mask(_value: BigNumberish, _bits: Numeric): js.BigInt = js.native
  
  def namehash(name: String): String = js.native
  
  def parseEther(ether: String): js.BigInt = js.native
  
  def parseUnits(value: String): js.BigInt = js.native
  def parseUnits(value: String, unit: String): js.BigInt = js.native
  def parseUnits(value: String, unit: Numeric): js.BigInt = js.native
  
  val pbkdf2: Typeofpbkdf2 = js.native
  
  val randomBytes: TypeofrandomBytes = js.native
  
  def recoverAddress(digest: BytesLike, signature: SignatureLike): String = js.native
  
  def resolveAddress(target: AddressLike): String | js.Promise[String] = js.native
  def resolveAddress(target: AddressLike, resolver: NameResolver): String | js.Promise[String] = js.native
  
  def resolveProperties[T](
    value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | std.Promise<T[P]>} */ js.Any
  ): js.Promise[T] = js.native
  
  val ripemd160: Typeofripemd160 = js.native
  
  val scrypt: Typeofscrypt = js.native
  
  val scryptSync: TypeofscryptSync = js.native
  
  val sha256: Typeofsha256 = js.native
  
  val sha512: Typeofsha512 = js.native
  
  def showThrottleMessage(service: String): Unit = js.native
  
  def solidityPacked(types: js.Array[String], values: js.Array[Any]): String = js.native
  
  def solidityPackedKeccak256(types: js.Array[String], values: js.Array[Any]): String = js.native
  
  def solidityPackedSha256(types: js.Array[String], values: js.Array[Any]): String = js.native
  
  def stripZerosLeft(data: BytesLike): String = js.native
  
  def toBeArray(_value: BigNumberish): js.typedarray.Uint8Array = js.native
  
  def toBeHex(_value: BigNumberish): String = js.native
  def toBeHex(_value: BigNumberish, _width: Numeric): String = js.native
  
  def toBigInt(value: js.typedarray.Uint8Array): js.BigInt = js.native
  def toBigInt(value: BigNumberish): js.BigInt = js.native
  
  def toNumber(value: js.typedarray.Uint8Array): Double = js.native
  def toNumber(value: BigNumberish): Double = js.native
  
  def toQuantity(value: BigNumberish | BytesLike): String = js.native
  
  def toTwos(_value: BigNumberish, _width: Numeric): js.BigInt = js.native
  
  def toUtf8Bytes(str: String): js.typedarray.Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = js.native
  
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  def toUtf8String(bytes: BytesLike): String = js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  def uuidV4(randomBytes: BytesLike): String = js.native
  
  def verifyMessage(message: String, sig: SignatureLike): String = js.native
  def verifyMessage(message: js.typedarray.Uint8Array, sig: SignatureLike): String = js.native
  
  def verifyTypedData(
    domain: TypedDataDomain,
    types: Record[String, js.Array[TypedDataField]],
    value: Record[String, Any],
    signature: SignatureLike
  ): String = js.native
  
  val version: String = js.native
  
  val wordlists: Record[String, Wordlist] = js.native
  
  def zeroPadBytes(data: BytesLike, length: Double): String = js.native
  
  def zeroPadValue(data: BytesLike, length: Double): String = js.native
}
