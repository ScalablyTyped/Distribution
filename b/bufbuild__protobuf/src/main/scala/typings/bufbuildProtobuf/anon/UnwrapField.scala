package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.DoubleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnwrapField extends StObject {
  
  def unwrapField(value: DoubleValue): Double
  
  def wrapField(value: Double): DoubleValue
}
object UnwrapField {
  
  inline def apply(unwrapField: DoubleValue => Double, wrapField: Double => DoubleValue): UnwrapField = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[UnwrapField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnwrapField] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: DoubleValue => Double): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: Double => DoubleValue): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
