package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.Int32Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def unwrapField(value: Int32Value): Double
  
  def wrapField(value: Double): Int32Value
}
object `1` {
  
  inline def apply(unwrapField: Int32Value => Double, wrapField: Double => Int32Value): `1` = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: Int32Value => Double): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: Double => Int32Value): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
