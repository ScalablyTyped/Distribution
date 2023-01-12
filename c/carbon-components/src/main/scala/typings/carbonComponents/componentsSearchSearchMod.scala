package typings.carbonComponents

import typings.carbonComponents.anon.PartialSearchOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSearchSearchMod {
  
  @JSImport("carbon-components/components/search/search", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Search {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialSearchOptions) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/search/search", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/search/search", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Search extends StObject {
    
    def showClear(value: String, icon: HTMLElement): Unit = js.native
    def showClear(value: Double, icon: HTMLElement): Unit = js.native
    
    def toggleLayout(element: HTMLElement): Unit = js.native
  }
  
  trait SearchOptions extends StObject {
    
    var classClearHidden: String
    
    var classLayoutHidden: String
    
    var selectorClearIcon: String
    
    var selectorIconContainer: String
    
    var selectorInit: String
    
    var selectorSearchInput: String
    
    var selectorSearchView: String
  }
  object SearchOptions {
    
    inline def apply(
      classClearHidden: String,
      classLayoutHidden: String,
      selectorClearIcon: String,
      selectorIconContainer: String,
      selectorInit: String,
      selectorSearchInput: String,
      selectorSearchView: String
    ): SearchOptions = {
      val __obj = js.Dynamic.literal(classClearHidden = classClearHidden.asInstanceOf[js.Any], classLayoutHidden = classLayoutHidden.asInstanceOf[js.Any], selectorClearIcon = selectorClearIcon.asInstanceOf[js.Any], selectorIconContainer = selectorIconContainer.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSearchInput = selectorSearchInput.asInstanceOf[js.Any], selectorSearchView = selectorSearchView.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      inline def setClassClearHidden(value: String): Self = StObject.set(x, "classClearHidden", value.asInstanceOf[js.Any])
      
      inline def setClassLayoutHidden(value: String): Self = StObject.set(x, "classLayoutHidden", value.asInstanceOf[js.Any])
      
      inline def setSelectorClearIcon(value: String): Self = StObject.set(x, "selectorClearIcon", value.asInstanceOf[js.Any])
      
      inline def setSelectorIconContainer(value: String): Self = StObject.set(x, "selectorIconContainer", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorSearchInput(value: String): Self = StObject.set(x, "selectorSearchInput", value.asInstanceOf[js.Any])
      
      inline def setSelectorSearchView(value: String): Self = StObject.set(x, "selectorSearchView", value.asInstanceOf[js.Any])
    }
  }
}
