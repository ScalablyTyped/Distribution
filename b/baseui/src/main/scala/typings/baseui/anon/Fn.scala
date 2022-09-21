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
  
  extension [Self <: Fn](x: Self) {
    
    inline def setFn(value: PopperDataObject => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
  }
}
