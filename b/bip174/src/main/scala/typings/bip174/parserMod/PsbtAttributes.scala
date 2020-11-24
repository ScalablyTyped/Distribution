package typings.bip174.parserMod

import typings.bip174.interfacesMod.PsbtGlobal
import typings.bip174.interfacesMod.PsbtInput
import typings.bip174.interfacesMod.PsbtOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtAttributes extends js.Object {
  
  var globalMap: PsbtGlobal = js.native
  
  var inputs: js.Array[PsbtInput] = js.native
  
  var outputs: js.Array[PsbtOutput] = js.native
}
object PsbtAttributes {
  
  @scala.inline
  def apply(globalMap: PsbtGlobal, inputs: js.Array[PsbtInput], outputs: js.Array[PsbtOutput]): PsbtAttributes = {
    val __obj = js.Dynamic.literal(globalMap = globalMap.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PsbtAttributes]
  }
  
  @scala.inline
  implicit class PsbtAttributesOps[Self <: PsbtAttributes] (val x: Self) extends AnyVal {
    
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
    def setGlobalMap(value: PsbtGlobal): Self = this.set("globalMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: PsbtInput*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[PsbtInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: PsbtOutput*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[PsbtOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
  }
}
