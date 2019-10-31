package typings.bip174.srcLibInterfacesMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitnessUtxo extends js.Object {
  var script: Buffer
  var value: Double
}

object WitnessUtxo {
  @scala.inline
  def apply(script: Buffer, value: Double): WitnessUtxo = {
    val __obj = js.Dynamic.literal(script = script, value = value)
  
    __obj.asInstanceOf[WitnessUtxo]
  }
}

