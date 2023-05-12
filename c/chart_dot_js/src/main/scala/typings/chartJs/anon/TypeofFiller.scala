package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFiller extends StObject {
  
  def afterDatasetsUpdate(chart: Any, _args: Any, options: Any): Unit
  
  def beforeDatasetDraw(chart: Any, args: Any, options: Any): Unit
  
  def beforeDatasetsDraw(chart: Any, _args: Any, options: Any): Unit
  
  def beforeDraw(chart: Any, _args: Any, options: Any): Unit
  
  val defaults: TypeofdefaultsDrawTime
  
  val id: String
}
object TypeofFiller {
  
  inline def apply(
    afterDatasetsUpdate: (Any, Any, Any) => Unit,
    beforeDatasetDraw: (Any, Any, Any) => Unit,
    beforeDatasetsDraw: (Any, Any, Any) => Unit,
    beforeDraw: (Any, Any, Any) => Unit,
    defaults: TypeofdefaultsDrawTime,
    id: String
  ): TypeofFiller = {
    val __obj = js.Dynamic.literal(afterDatasetsUpdate = js.Any.fromFunction3(afterDatasetsUpdate), beforeDatasetDraw = js.Any.fromFunction3(beforeDatasetDraw), beforeDatasetsDraw = js.Any.fromFunction3(beforeDatasetsDraw), beforeDraw = js.Any.fromFunction3(beforeDraw), defaults = defaults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFiller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofFiller] (val x: Self) extends AnyVal {
    
    inline def setAfterDatasetsUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "afterDatasetsUpdate", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetDraw(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeDatasetDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDatasetsDraw(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeDatasetsDraw", js.Any.fromFunction3(value))
    
    inline def setBeforeDraw(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeDraw", js.Any.fromFunction3(value))
    
    inline def setDefaults(value: TypeofdefaultsDrawTime): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
