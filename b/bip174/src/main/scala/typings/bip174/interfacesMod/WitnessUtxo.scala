package typings.bip174.interfacesMod

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
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WitnessUtxo]
  }
}

