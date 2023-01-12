package typings.baseui.anon

import typings.baseui.layerTypesMod.PopperDataObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  def fn(data: PopperDataObject): Unit
}
object Fn {
  
  inline def apply(fn: PopperDataObject => Unit): Fn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
    
    inline def setFn(value: PopperDataObject => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
  }
}
