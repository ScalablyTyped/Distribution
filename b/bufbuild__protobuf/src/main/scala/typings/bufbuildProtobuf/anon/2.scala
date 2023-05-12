package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt32Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def unwrapField(value: UInt32Value): Double
  
  def wrapField(value: Double): UInt32Value
}
object `2` {
  
  inline def apply(unwrapField: UInt32Value => Double, wrapField: Double => UInt32Value): `2` = {
    val __obj = js.Dynamic.literal(unwrapField = js.Any.fromFunction1(unwrapField), wrapField = js.Any.fromFunction1(wrapField))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setUnwrapField(value: UInt32Value => Double): Self = StObject.set(x, "unwrapField", js.Any.fromFunction1(value))
    
    inline def setWrapField(value: Double => UInt32Value): Self = StObject.set(x, "wrapField", js.Any.fromFunction1(value))
  }
}
