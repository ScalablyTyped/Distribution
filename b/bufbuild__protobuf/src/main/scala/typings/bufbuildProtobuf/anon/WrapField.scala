package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.FloatValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapField extends StObject {
  
  def unwrapField(value: FloatValue): Double
  
  def wrapField(value: Double): FloatValue
}
object WrapField {
  
  inline def apply(unwrapField: FloatValue => Double, wrapField: Double => FloatValue): WrapField = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[WrapField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WrapField] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: FloatValue => Double): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: Double => FloatValue): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
