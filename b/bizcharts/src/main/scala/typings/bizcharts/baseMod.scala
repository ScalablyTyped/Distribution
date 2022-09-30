package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libInterfaceMod.AnnotationBaseOption
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("bizcharts/lib/components/Annotation/base", JSImport.Default)
  @js.native
  abstract class default[PropsI] () extends Annotation[PropsI]
  object default {
    
    @JSImport("bizcharts/lib/components/Annotation/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bizcharts/lib/components/Annotation/base", "default.contextType")
    @js.native
    def contextType: Any = js.native
    inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Annotation[PropsI] extends Component[PropsI, Any, Any] {
    
    /* protected */ var annotation: Any = js.native
    
    /* protected */ var annotationType: String = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAnnotation(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnnotation(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnnotation(): Unit = js.native
    
    def getChartIns(): Any = js.native
    
    /* protected */ var id: String = js.native
    
    /* protected */ var index: Double = js.native
  }
  
  trait IAnnotationBaseProps
    extends StObject
       with AnnotationBaseOption
       with /* key */ StringDictionary[Any] {
    
    var chartIns: js.UndefOr[Any] = js.undefined
  }
  object IAnnotationBaseProps {
    
    inline def apply(): IAnnotationBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnnotationBaseProps]
    }
    
    extension [Self <: IAnnotationBaseProps](x: Self) {
      
      inline def setChartIns(value: Any): Self = StObject.set(x, "chartIns", value.asInstanceOf[js.Any])
      
      inline def setChartInsUndefined: Self = StObject.set(x, "chartIns", js.undefined)
    }
  }
}
