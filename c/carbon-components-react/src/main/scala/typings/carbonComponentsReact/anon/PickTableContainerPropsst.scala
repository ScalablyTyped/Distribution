package typings.carbonComponentsReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<carbon-components-react.carbon-components-react/lib/components/DataTable/TableContainer.TableContainerProps, 'stickyHeader'> */
trait PickTableContainerPropsst extends StObject {
  
  var stickyHeader: js.UndefOr[Boolean] = js.undefined
}
object PickTableContainerPropsst {
  
  inline def apply(): PickTableContainerPropsst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTableContainerPropsst]
  }
  
  extension [Self <: PickTableContainerPropsst](x: Self) {
    
    inline def setStickyHeader(value: Boolean): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
