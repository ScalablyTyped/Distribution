package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BytesValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def unwrapField(value: BytesValue): js.typedarray.Uint8Array
  
  def wrapField(value: js.typedarray.Uint8Array): BytesValue
}
object `5` {
  
  inline def apply(
    unwrapField: BytesValue => js.typedarray.Uint8Array,
    wrapField: js.typedarray.Uint8Array => BytesValue
  ): `5` = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: BytesValue => js.typedarray.Uint8Array): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: js.typedarray.Uint8Array => BytesValue): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
