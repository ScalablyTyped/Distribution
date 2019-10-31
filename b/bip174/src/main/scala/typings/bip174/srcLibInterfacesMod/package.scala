package typings.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcLibInterfacesMod {
  import typings.bip174.Anon_InputCount
  import typings.node.Buffer

  type FinalScriptSig = Buffer
  type FinalScriptWitness = Buffer
  type NonWitnessUtxo = Buffer
  type PorCommitment = String
  type RedeemScript = Buffer
  type SighashType = Double
  type TransactionFromBuffer = js.Function1[/* buffer */ Buffer, Transaction]
  type TransactionIOCountGetter = js.Function1[/* txBuffer */ Buffer, Anon_InputCount]
  type TransactionInputAdder = js.Function2[/* input */ TransactionInput, /* txBuffer */ Buffer, Buffer]
  type TransactionLocktimeSetter = js.Function2[/* locktime */ Double, /* txBuffer */ Buffer, Buffer]
  type TransactionOutputAdder = js.Function2[/* output */ TransactionOutput, /* txBuffer */ Buffer, Buffer]
  type TransactionVersionSetter = js.Function2[/* version */ Double, /* txBuffer */ Buffer, Buffer]
  type WitnessScript = Buffer
}
