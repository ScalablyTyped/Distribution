package typings.bizcharts

import typings.antvG2.libInterfaceMod.ShapePoint
import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryBaseMod {
  
  /* note: abstract class */ @JSImport("bizcharts/lib/geometry/Base", JSImport.Default)
  @js.native
  open class default[T /* <: IBaseGemoProps */] protected () extends BaseGeom[T] {
    def this(props: Any) = this()
  }
  
  @js.native
  trait BaseGeom[T /* <: IBaseGemoProps */]
    extends Component[T, js.Object, Any] {
    
    /* protected */ val GemoBaseClassName: String = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseGeom(): Unit = js.native
    
    var geomHelper: GeomHelper = js.native
    
    /* protected */ var interactionTypes: js.Array[String] = js.native
  }
  
  trait GeomHelper extends StObject {
    
    var GemoBaseClassName: String
    
    var config: Record[String, Any]
    
    def createGeomInstance(GemoBaseClassName: Any, cfg: Any): Unit
    
    def destroy(): Unit
    
    var geom: typings.antvG2.libGeometryBaseMod.default[ShapePoint]
    
    var interactionTypes: js.Array[String]
    
    var rootChart: Any
    
    def setView(view: Any): Unit
    
    def update(newConfig: Any, component: Any): Unit
    
    var view: Any
  }
  object GeomHelper {
    
    inline def apply(
      GemoBaseClassName: String,
      config: Record[String, Any],
      createGeomInstance: (Any, Any) => Unit,
      destroy: () => Unit,
      geom: typings.antvG2.libGeometryBaseMod.default[ShapePoint],
      interactionTypes: js.Array[String],
      rootChart: Any,
      setView: Any => Unit,
      update: (Any, Any) => Unit,
      view: Any
    ): GeomHelper = {
      val __obj = js.Dynamic.literal(GemoBaseClassName = GemoBaseClassName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], createGeomInstance = js.Any.fromFunction2(createGeomInstance), destroy = js.Any.fromFunction0(destroy), geom = geom.asInstanceOf[js.Any], interactionTypes = interactionTypes.asInstanceOf[js.Any], rootChart = rootChart.asInstanceOf[js.Any], setView = js.Any.fromFunction1(setView), update = js.Any.fromFunction2(update), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeomHelper]
    }
    
    extension [Self <: GeomHelper](x: Self) {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreateGeomInstance(value: (Any, Any) => Unit): Self = StObject.set(x, "createGeomInstance", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGemoBaseClassName(value: String): Self = StObject.set(x, "GemoBaseClassName", value.asInstanceOf[js.Any])
      
      inline def setGeom(value: typings.antvG2.libGeometryBaseMod.default[ShapePoint]): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
      
      inline def setInteractionTypes(value: js.Array[String]): Self = StObject.set(x, "interactionTypes", value.asInstanceOf[js.Any])
      
      inline def setInteractionTypesVarargs(value: String*): Self = StObject.set(x, "interactionTypes", js.Array(value*))
      
      inline def setRootChart(value: Any): Self = StObject.set(x, "rootChart", value.asInstanceOf[js.Any])
      
      inline def setSetView(value: Any => Unit): Self = StObject.set(x, "setView", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setView(value: Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
