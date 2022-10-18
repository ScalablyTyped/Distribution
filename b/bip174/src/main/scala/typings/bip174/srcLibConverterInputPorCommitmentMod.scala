package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PorCommitment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterInputPorCommitmentMod {
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean]
  
  inline def decode(keyVal: KeyValue): PorCommitment = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[PorCommitment]
  
  inline def encode(data: PorCommitment): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/input/porCommitment", "expected")
  @js.native
  val expected: /* "string" */ String = js.native
}
