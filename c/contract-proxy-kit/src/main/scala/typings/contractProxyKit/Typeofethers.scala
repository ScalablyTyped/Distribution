package typings.contractProxyKit

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.contractProxyKit.contractProxyKitStrings.`4Dot0Dot0-betaDot3`
import typings.contractProxyKit.contractProxyKitStrings.node
import typings.ethers.mod.ethers.Contract
import typings.ethers.mod.ethers.Interface
import typings.ethers.mod.ethers.SigningKey
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.ParamType
import typings.ethers.typesMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofethers extends js.Object {
  var Contract: Instantiable3[
    /* addressOrName */ String, 
    /* contractInterface */ js.Array[String | ParamType], 
    /* signerOrProvider */ Signer, 
    typings.ethers.mod.ethers.Contract
  ]
  val HDNode: TypeofHDNode
  var Interface: Instantiable1[/* abi */ js.Array[String | ParamType], typings.ethers.mod.ethers.Interface]
  var SigningKey: Instantiable1[/* privateKey */ Arrayish, typings.ethers.mod.ethers.SigningKey]
  var Wallet: TypeofWallet
  val constants: AnonAddressZero
  val errors: Typeoferrors
  val platform: node
  val providers: Typeofproviders
  val types: TypeoftypesBigNumber
  val utils: Typeofutils
  val version: `4Dot0Dot0-betaDot3`
  val wordlists: Typeofwordlists
}

object Typeofethers {
  @scala.inline
  def apply(
    Contract: Instantiable3[
      /* addressOrName */ String, 
      /* contractInterface */ js.Array[String | ParamType], 
      /* signerOrProvider */ Signer, 
      Contract
    ],
    HDNode: TypeofHDNode,
    Interface: Instantiable1[/* abi */ js.Array[String | ParamType], Interface],
    SigningKey: Instantiable1[/* privateKey */ Arrayish, SigningKey],
    Wallet: TypeofWallet,
    constants: AnonAddressZero,
    errors: Typeoferrors,
    platform: node,
    providers: Typeofproviders,
    types: TypeoftypesBigNumber,
    utils: Typeofutils,
    version: `4Dot0Dot0-betaDot3`,
    wordlists: Typeofwordlists
  ): Typeofethers = {
    val __obj = js.Dynamic.literal(Contract = Contract.asInstanceOf[js.Any], HDNode = HDNode.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], SigningKey = SigningKey.asInstanceOf[js.Any], Wallet = Wallet.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], wordlists = wordlists.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofethers]
  }
}

