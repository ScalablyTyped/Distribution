package typings.bitcoinjsLib.transactionMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  var hash: Buffer = js.native
  var index: Double = js.native
  var script: Buffer = js.native
  var sequence: Double = js.native
  var witness: js.Array[Buffer] = js.native
}

object Input {
  @scala.inline
  def apply(hash: Buffer, index: Double, script: Buffer, sequence: Double, witness: js.Array[Buffer]): Input = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: Buffer): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Buffer): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setWitnessVarargs(value: Buffer*): Self = this.set("witness", js.Array(value :_*))
    @scala.inline
    def setWitness(value: js.Array[Buffer]): Self = this.set("witness", value.asInstanceOf[js.Any])
  }
  
}

