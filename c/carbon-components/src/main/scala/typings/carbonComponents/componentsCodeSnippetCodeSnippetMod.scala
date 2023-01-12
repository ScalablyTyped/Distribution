package typings.carbonComponents

import typings.carbonComponents.anon.PartialCodeSnippetOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCodeSnippetCodeSnippetMod {
  
  @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CodeSnippet {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialCodeSnippetOptions) = this()
    
    /* CompleteClass */
    override def _handleClick(): Unit = js.native
    
    /* CompleteClass */
    override def _initCodeSnippet(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/code-snippet/code-snippet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/code-snippet/code-snippet", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CodeSnippet extends StObject {
    
    def _handleClick(): Unit
    
    def _initCodeSnippet(): Unit
  }
  object CodeSnippet {
    
    inline def apply(_handleClick: () => Unit, _initCodeSnippet: () => Unit): CodeSnippet = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction0(_handleClick), _initCodeSnippet = js.Any.fromFunction0(_initCodeSnippet))
      __obj.asInstanceOf[CodeSnippet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeSnippet] (val x: Self) extends AnyVal {
      
      inline def set_handleClick(value: () => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction0(value))
      
      inline def set_initCodeSnippet(value: () => Unit): Self = StObject.set(x, "_initCodeSnippet", js.Any.fromFunction0(value))
    }
  }
  
  trait CodeSnippetOptions extends StObject {
    
    var attribShowLessText: String
    
    var attribShowMoreText: String
    
    var classExpandBtn: String
    
    var classExpandText: String
    
    var classExpanded: String
    
    var classHideExpand: String
    
    var minHeight: Double
    
    var selectorInit: String
  }
  object CodeSnippetOptions {
    
    inline def apply(
      attribShowLessText: String,
      attribShowMoreText: String,
      classExpandBtn: String,
      classExpandText: String,
      classExpanded: String,
      classHideExpand: String,
      minHeight: Double,
      selectorInit: String
    ): CodeSnippetOptions = {
      val __obj = js.Dynamic.literal(attribShowLessText = attribShowLessText.asInstanceOf[js.Any], attribShowMoreText = attribShowMoreText.asInstanceOf[js.Any], classExpandBtn = classExpandBtn.asInstanceOf[js.Any], classExpandText = classExpandText.asInstanceOf[js.Any], classExpanded = classExpanded.asInstanceOf[js.Any], classHideExpand = classHideExpand.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeSnippetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeSnippetOptions] (val x: Self) extends AnyVal {
      
      inline def setAttribShowLessText(value: String): Self = StObject.set(x, "attribShowLessText", value.asInstanceOf[js.Any])
      
      inline def setAttribShowMoreText(value: String): Self = StObject.set(x, "attribShowMoreText", value.asInstanceOf[js.Any])
      
      inline def setClassExpandBtn(value: String): Self = StObject.set(x, "classExpandBtn", value.asInstanceOf[js.Any])
      
      inline def setClassExpandText(value: String): Self = StObject.set(x, "classExpandText", value.asInstanceOf[js.Any])
      
      inline def setClassExpanded(value: String): Self = StObject.set(x, "classExpanded", value.asInstanceOf[js.Any])
      
      inline def setClassHideExpand(value: String): Self = StObject.set(x, "classHideExpand", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    }
  }
}
