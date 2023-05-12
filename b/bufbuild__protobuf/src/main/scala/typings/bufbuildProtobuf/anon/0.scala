package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def unwrapField(value: UInt64Value): js.BigInt
  
  def wrapField(value: js.BigInt): UInt64Value
}
object `0` {
  
  inline def apply(unwrapField: UInt64Value => js.BigInt, wrapField: js.BigInt => UInt64Value): `0` = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: UInt64Value => js.BigInt): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: js.BigInt => UInt64Value): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
