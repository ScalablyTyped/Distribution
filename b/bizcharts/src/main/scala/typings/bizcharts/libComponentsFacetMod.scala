package typings.bizcharts

import typings.antvG2.libInterfaceMod.FacetCfg
import typings.antvG2.libInterfaceMod.FacetTitle
import typings.antvG2.libInterfaceMod.Line
import typings.bizcharts.bizchartsStrings.circle
import typings.bizcharts.bizchartsStrings.list
import typings.bizcharts.bizchartsStrings.matrix
import typings.bizcharts.bizchartsStrings.mirror
import typings.bizcharts.bizchartsStrings.rect
import typings.bizcharts.bizchartsStrings.tree
import typings.react.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFacetMod {
  
  @JSImport("bizcharts/lib/components/Facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: IFacetProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait IFacetProps
    extends StObject
       with FacetCfg[Any]
       with Children {
    
    /** 指定每行可显示分面的个数，超出时会自动换行。 */
    var cols: js.UndefOr[Double] = js.native
    
    /** 行标题的样式。 */
    var columnTitle: js.UndefOr[FacetTitle] = js.native
    
    /** 绘制每个分面 */
    def eachView(view: Any, facet: Any): Unit = js.native
    
    var line: js.UndefOr[Line] = js.native
    
    /** 列标题的样式。 */
    var rowTitle: js.UndefOr[FacetTitle] = js.native
    
    /** 标题样式。 */
    var title: js.UndefOr[FacetTitle] = js.native
    
    /** 是否转置。 */
    var transpose: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_IFacetProps: circle | rect | mirror | list | matrix | tree = js.native
  }
}
