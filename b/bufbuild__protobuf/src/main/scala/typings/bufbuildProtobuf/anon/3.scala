package typings.bufbuildProtobuf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def unwrapField(value: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue): Boolean
  
  def wrapField(value: Boolean): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
}
object `3` {
  
  inline def apply(
    unwrapField: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue => Boolean,
    wrapField: Boolean => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue
  ): `3` = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue => Boolean): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: Boolean => typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.BoolValue): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
