package typings.c3.anon

import typings.c3.mod.DataSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targets extends StObject {
  
  var targets: js.Array[DataSeries]
}
object Targets {
  
  inline def apply(targets: js.Array[DataSeries]): Targets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Targets] (val x: Self) extends AnyVal {
    
    inline def setTargets(value: js.Array[DataSeries]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: DataSeries*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
