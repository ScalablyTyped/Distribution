package typings.bip174

import typings.bip174.interfacesMod.FinalScriptWitness
import typings.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalScriptWitnessMod {
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.FinalScriptWitness */ Boolean]
  
  @scala.inline
  def decode(keyVal: KeyValue): FinalScriptWitness = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[FinalScriptWitness]
  
  @scala.inline
  def encode(data: FinalScriptWitness): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/finalScriptWitness", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
