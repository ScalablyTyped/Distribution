package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.TapTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoftapTree extends StObject {
  
  def canAdd(currentData: Any, newData: Any): Boolean
  
  def check(data: Any): /* is bip174.bip174/src/lib/interfaces.TapTree */ Boolean
  
  def decode(keyVal: KeyValue): TapTree
  
  def encode(tree: TapTree): KeyValue
  
  val expected: /* "{ leaves: [{ depth: number; leafVersion: number, script: Buffer; }] }" */ String
}
object TypeoftapTree {
  
  inline def apply(
    canAdd: (Any, Any) => Boolean,
    check: Any => /* is bip174.bip174/src/lib/interfaces.TapTree */ Boolean,
    decode: KeyValue => TapTree,
    encode: TapTree => KeyValue,
    expected: /* "{ leaves: [{ depth: number; leafVersion: number, script: Buffer; }] }" */ String
  ): TypeoftapTree = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoftapTree]
  }
  
  extension [Self <: TypeoftapTree](x: Self) {
    
    inline def setCanAdd(value: (Any, Any) => Boolean): Self = StObject.set(x, "canAdd", js.Any.fromFunction2(value))
    
    inline def setCheck(value: Any => /* is bip174.bip174/src/lib/interfaces.TapTree */ Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
    
    inline def setDecode(value: KeyValue => TapTree): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: TapTree => KeyValue): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setExpected(value: /* "{ leaves: [{ depth: number; leafVersion: number, script: Buffer; }] }" */ String): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
  }
}
