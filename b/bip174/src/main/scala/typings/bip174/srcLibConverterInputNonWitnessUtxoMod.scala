package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.NonWitnessUtxo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputNonWitnessUtxoMod {
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean]
  
  inline def decode(keyVal: KeyValue): NonWitnessUtxo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[NonWitnessUtxo]
  
  inline def encode(data: NonWitnessUtxo): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/nonWitnessUtxo", "expected")
  @js.native
  val expected: /* "Buffer" */ String = js.native
}
