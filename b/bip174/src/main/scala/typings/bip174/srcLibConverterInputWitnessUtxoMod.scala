package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.WitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputWitnessUtxoMod {
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean]
  
  inline def decode(keyVal: KeyValue): WitnessUtxo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[WitnessUtxo]
  
  inline def encode(data: WitnessUtxo): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/witnessUtxo", "expected")
  @js.native
  val expected: /* "{ script: Buffer; value: number; }" */ String = js.native
}
