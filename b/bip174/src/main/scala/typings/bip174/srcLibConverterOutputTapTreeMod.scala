package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.TapTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterOutputTapTreeMod {
  
  @JSImport("bip174/src/lib/converter/output/tapTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAdd(currentData: Any, newData: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canAdd")(currentData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapTree */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(data.asInstanceOf[js.Any]).asInstanceOf[/* is bip174.bip174/src/lib/interfaces.TapTree */ Boolean]
  
  inline def decode(keyVal: KeyValue): TapTree = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(keyVal.asInstanceOf[js.Any]).asInstanceOf[TapTree]
  
  inline def encode(tree: TapTree): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(tree.asInstanceOf[js.Any]).asInstanceOf[KeyValue]
  
  @JSImport("bip174/src/lib/converter/output/tapTree", "expected")
  @js.native
  val expected: /* "{ leaves: [{ depth: number; leafVersion: number, script: Buffer; }] }" */ String = js.native
}
