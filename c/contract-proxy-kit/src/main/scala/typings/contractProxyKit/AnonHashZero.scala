package typings.contractProxyKit

import typings.ethers.typesMod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashZero extends js.Object {
  var AddressZero: String
  var HashZero: String
  var NegativeOne: BigNumber
  var One: BigNumber
  var Two: BigNumber
  var WeiPerEther: BigNumber
  var Zero: BigNumber
}

object AnonHashZero {
  @scala.inline
  def apply(
    AddressZero: String,
    HashZero: String,
    NegativeOne: BigNumber,
    One: BigNumber,
    Two: BigNumber,
    WeiPerEther: BigNumber,
    Zero: BigNumber
  ): AnonHashZero = {
    val __obj = js.Dynamic.literal(AddressZero = AddressZero.asInstanceOf[js.Any], HashZero = HashZero.asInstanceOf[js.Any], NegativeOne = NegativeOne.asInstanceOf[js.Any], One = One.asInstanceOf[js.Any], Two = Two.asInstanceOf[js.Any], WeiPerEther = WeiPerEther.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashZero]
  }
}

