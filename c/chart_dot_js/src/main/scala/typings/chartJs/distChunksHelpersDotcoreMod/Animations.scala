package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animations extends StObject {
  
  def configure(animations: AnyObject): Unit
  
  def update(target: AnyObject, values: AnyObject): js.UndefOr[Boolean]
}
object Animations {
  
  inline def apply(configure: AnyObject => Unit, update: (AnyObject, AnyObject) => js.UndefOr[Boolean]): Animations = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Animations]
  }
  
  extension [Self <: Animations](x: Self) {
    
    inline def setConfigure(value: AnyObject => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (AnyObject, AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
