package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsSelectSelectMod.SelectProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPaginationExperimentalPageSelectorMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Pagination/experimental/PageSelector", JSImport.Default)
  @js.native
  val default: FC[PageSelectorProps] = js.native
  
  trait PageSelectorProps
    extends StObject
       with SelectProps {
    
    var currentPage: Double
    
    var totalPages: Double
  }
  object PageSelectorProps {
    
    inline def apply(currentPage: Double, id: String, totalPages: Double): PageSelectorProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageSelectorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageSelectorProps] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[PageSelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsPaginationExperimentalPageSelectorMod.foo` */
  override def _to: FC[PageSelectorProps] = default
}
