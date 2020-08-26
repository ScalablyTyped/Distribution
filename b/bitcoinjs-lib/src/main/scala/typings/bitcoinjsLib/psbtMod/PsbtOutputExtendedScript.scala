package typings.bitcoinjsLib.psbtMod

import typings.bip174.interfacesMod.PsbtOutput
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PsbtOutputExtendedScript
  extends PsbtOutput
     with PsbtOutputExtended {
  var script: Buffer = js.native
  var value: Double = js.native
}

object PsbtOutputExtendedScript {
  @scala.inline
  def apply(script: Buffer, value: Double): PsbtOutputExtendedScript = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtOutputExtendedScript]
  }
  @scala.inline
  implicit class PsbtOutputExtendedScriptOps[Self <: PsbtOutputExtendedScript] (val x: Self) extends AnyVal {
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
    def setScript(value: Buffer): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

