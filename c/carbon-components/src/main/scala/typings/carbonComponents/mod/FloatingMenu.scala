package typings.carbonComponents.mod

import typings.carbonComponents.anon.Left
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "FloatingMenu")
@js.native
class FloatingMenu protected ()
  extends typings.carbonComponents.componentsMod.FloatingMenu {
  def this(element: js.Any, options: js.Any) = this()
}
object FloatingMenu {
  
  @JSImport("carbon-components", "FloatingMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "FloatingMenu.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object options {
    
    @JSImport("carbon-components", "FloatingMenu.options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "FloatingMenu.options.attribAvoidFocusOnOpen")
    @js.native
    def attribAvoidFocusOnOpen: String = js.native
    @scala.inline
    def attribAvoidFocusOnOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attribAvoidFocusOnOpen")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.attribDirection")
    @js.native
    def attribDirection: String = js.native
    @scala.inline
    def attribDirection_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attribDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.classRefShown")
    @js.native
    def classRefShown: String = js.native
    @scala.inline
    def classRefShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classRefShown")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.classShown")
    @js.native
    def classShown: String = js.native
    @scala.inline
    def classShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classShown")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.eventAfterHidden")
    @js.native
    def eventAfterHidden: String = js.native
    @scala.inline
    def eventAfterHidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.eventAfterShown")
    @js.native
    def eventAfterShown: String = js.native
    @scala.inline
    def eventAfterShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterShown")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.eventBeforeHidden")
    @js.native
    def eventBeforeHidden: String = js.native
    @scala.inline
    def eventBeforeHidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeHidden")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.eventBeforeShown")
    @js.native
    def eventBeforeShown: String = js.native
    @scala.inline
    def eventBeforeShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeShown")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.offset")
    @js.native
    def offset: Left = js.native
    @scala.inline
    def offset_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.refNode")
    @js.native
    def refNode: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
    @scala.inline
    def refNode_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refNode")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.selectorContainer")
    @js.native
    def selectorContainer: String = js.native
    @scala.inline
    def selectorContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "FloatingMenu.options.selectorPrimaryFocus")
    @js.native
    def selectorPrimaryFocus: String = js.native
    @scala.inline
    def selectorPrimaryFocus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPrimaryFocus")(x.asInstanceOf[js.Any])
  }
}
