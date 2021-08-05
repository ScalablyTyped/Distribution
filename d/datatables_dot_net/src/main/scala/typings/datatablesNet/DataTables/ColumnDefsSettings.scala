package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefsSettings
  extends StObject
     with ColumnSettings {
  
  var targets: String | Double | (js.Array[Double | String])
}
object ColumnDefsSettings {
  
  inline def apply(targets: String | Double | (js.Array[Double | String])): ColumnDefsSettings = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefsSettings]
  }
  
  extension [Self <: ColumnDefsSettings](x: Self) {
    
    inline def setTargets(value: String | Double | (js.Array[Double | String])): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: (Double | String)*): Self = StObject.set(x, "targets", js.Array(value :_*))
  }
}
