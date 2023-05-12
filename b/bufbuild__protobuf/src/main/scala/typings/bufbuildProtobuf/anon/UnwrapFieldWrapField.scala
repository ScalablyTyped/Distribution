package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.Int64Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnwrapFieldWrapField extends StObject {
  
  def unwrapField(value: Int64Value): js.BigInt
  
  def wrapField(value: js.BigInt): Int64Value
}
object UnwrapFieldWrapField {
  
  inline def apply(unwrapField: Int64Value => js.BigInt, wrapField: js.BigInt => Int64Value): UnwrapFieldWrapField = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[UnwrapFieldWrapField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnwrapFieldWrapField] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: Int64Value => js.BigInt): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: js.BigInt => Int64Value): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
