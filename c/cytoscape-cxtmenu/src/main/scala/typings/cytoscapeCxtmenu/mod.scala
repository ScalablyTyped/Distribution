package typings.cytoscapeCxtmenu

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.Selector
import typings.cytoscape.mod.SingularData
import typings.cytoscapeCxtmenu.anon.PartialCSSStyleDeclaratio
import typings.cytoscapeCxtmenu.cytoscapeCxtmenuBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-cxtmenu", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait Command extends StObject {
    
    /*
      * HTML or text content to be displayed as the command's label in the menu's command list.
      */
    var content: js.UndefOr[HTMLElement | String] = js.undefined
    
    /*
      * Additional CSS properties to apply to the command content.
      */
    var contentStyle: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
    
    /*
      * Whether or not the command is selectable.
      *
      * Default: true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Custom background color in menu's command list.
      * Can be any valid [CSS color definition](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /*
      * A function to execute when the command is selected.
      */
    var select: js.UndefOr[js.Function1[/* element */ SingularData, Unit]] = js.undefined
  }
  object Command {
    
    inline def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setContent(value: HTMLElement | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentStyle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setSelect(value: /* element */ SingularData => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
  
  trait MenuInstance extends StObject {
    
    /*
      * Clean up by manually destroying the menu instance.
      */
    def destroy(): Unit
  }
  object MenuInstance {
    
    inline def apply(destroy: () => Unit): MenuInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[MenuInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuInstance] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  // function(ele){ return 100; }
  type MenuRadiusFunction = js.Function1[/* element */ SingularData, Double]
  
  trait Options extends StObject {
    
    /*
      * The color used to indicate the selected command.
      * Can be any valid [CSS color definition](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
      */
    var activeFillColor: js.UndefOr[String] = js.undefined
    
    /*
      * Additional size in pixels for the active command.
      * Default: 20
      */
    var activePadding: js.UndefOr[Double] = js.undefined
    
    /*
      * Specify whether the spotlight radius should adapt to the node size.
      *
      * Default: false
      */
    var adaptativeNodeSpotlightRadius: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Whether or not to draw the menu at mouse position.
      *
      * Default: false
      */
    var atMouse: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Array of commands to be displayed in the menu.
      * Alternatively, a function that returns an array of commands
      * depending on the selected element.
      */
    var commands: js.UndefOr[
        js.Array[Command] | (js.Function1[/* element */ SingularData, js.Array[Command]])
      ] = js.undefined
    
    /*
      * The background color of the menu.
      * Can be any valid [CSS color definition](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
      */
    var fillColor: js.UndefOr[String] = js.undefined
    
    /*
      * The size in pixels of the pointer to the active command, will default to the node size if the node size is smaller than the indicator size.
      *
      * Default: 24
      */
    var indicatorSize: js.UndefOr[Double] = js.undefined
    
    /*
      * The color of text in the command's content.
      * Can be any valid [CSS color definition](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
      *
      * Default: white
      */
    var itemColor: js.UndefOr[String] = js.undefined
    
    /*
      * The text shadow color of the command's content.
      * Can be any valid [CSS color definition](https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).
      *
      * Default: transparent
      */
    var itemTextShadowColor: js.UndefOr[String] = js.undefined
    
    /*
      * The maximum radius in pixels of the spotlight (ignored for the node if {@link adaptativeNodeSpotlightRadius} is enabled but still used for the edge & background).
      *
      * Default: 38
      */
    var maxSpotlightRadius: js.UndefOr[Double] = js.undefined
    
    /*
      * The outer radius (element center to the end of the menu) in pixels.
      * It is added to the rendered size of the element.
      *
      * Default: 100
      */
    var menuRadius: js.UndefOr[MenuRadiusFunction | Double] = js.undefined
    
    /*
      * The minimum radius in pixels of the spotlight (ignored for the node if {@link adaptativeNodeSpotlightRadius} is enabled but still used for the edge & background).
      *
      * Default: 24
      */
    var minSpotlightRadius: js.UndefOr[Double] = js.undefined
    
    /*
      * Space-separated [Cytoscape events](https://js.cytoscape.org/#events) that will open the menu.
      *
      * Default: 'cxttapstart taphold'
      */
    var openMenuEvents: js.UndefOr[String] = js.undefined
    
    /*
      * If set to a number, this will cancel the command if the pointer is released outside of the spotlight, padded by the number given.
      *
      * Default: false
      */
    var outsideMenuCancel: js.UndefOr[`false` | Double] = js.undefined
    
    /*
      * Elements to which the cxtmenu instance will be applied
      */
    var selector: js.UndefOr[Selector] = js.undefined
    
    /*
      * The empty spacing in pixels between successive commands.
      *
      * Default: 3
      */
    var separatorWidth: js.UndefOr[Double] = js.undefined
    
    /*
      * Extra spacing in pixels between the element and the spotlight.
      *
      * Default: 4
      */
    var spotlightPadding: js.UndefOr[Double] = js.undefined
    
    /*
      * The z-index of the UI div.
      *
      * Default: 9999
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setActiveFillColor(value: String): Self = StObject.set(x, "activeFillColor", value.asInstanceOf[js.Any])
      
      inline def setActiveFillColorUndefined: Self = StObject.set(x, "activeFillColor", js.undefined)
      
      inline def setActivePadding(value: Double): Self = StObject.set(x, "activePadding", value.asInstanceOf[js.Any])
      
      inline def setActivePaddingUndefined: Self = StObject.set(x, "activePadding", js.undefined)
      
      inline def setAdaptativeNodeSpotlightRadius(value: Boolean): Self = StObject.set(x, "adaptativeNodeSpotlightRadius", value.asInstanceOf[js.Any])
      
      inline def setAdaptativeNodeSpotlightRadiusUndefined: Self = StObject.set(x, "adaptativeNodeSpotlightRadius", js.undefined)
      
      inline def setAtMouse(value: Boolean): Self = StObject.set(x, "atMouse", value.asInstanceOf[js.Any])
      
      inline def setAtMouseUndefined: Self = StObject.set(x, "atMouse", js.undefined)
      
      inline def setCommands(value: js.Array[Command] | (js.Function1[/* element */ SingularData, js.Array[Command]])): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsFunction1(value: /* element */ SingularData => js.Array[Command]): Self = StObject.set(x, "commands", js.Any.fromFunction1(value))
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setIndicatorSize(value: Double): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
      
      inline def setIndicatorSizeUndefined: Self = StObject.set(x, "indicatorSize", js.undefined)
      
      inline def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      inline def setItemColorUndefined: Self = StObject.set(x, "itemColor", js.undefined)
      
      inline def setItemTextShadowColor(value: String): Self = StObject.set(x, "itemTextShadowColor", value.asInstanceOf[js.Any])
      
      inline def setItemTextShadowColorUndefined: Self = StObject.set(x, "itemTextShadowColor", js.undefined)
      
      inline def setMaxSpotlightRadius(value: Double): Self = StObject.set(x, "maxSpotlightRadius", value.asInstanceOf[js.Any])
      
      inline def setMaxSpotlightRadiusUndefined: Self = StObject.set(x, "maxSpotlightRadius", js.undefined)
      
      inline def setMenuRadius(value: MenuRadiusFunction | Double): Self = StObject.set(x, "menuRadius", value.asInstanceOf[js.Any])
      
      inline def setMenuRadiusFunction1(value: /* element */ SingularData => Double): Self = StObject.set(x, "menuRadius", js.Any.fromFunction1(value))
      
      inline def setMenuRadiusUndefined: Self = StObject.set(x, "menuRadius", js.undefined)
      
      inline def setMinSpotlightRadius(value: Double): Self = StObject.set(x, "minSpotlightRadius", value.asInstanceOf[js.Any])
      
      inline def setMinSpotlightRadiusUndefined: Self = StObject.set(x, "minSpotlightRadius", js.undefined)
      
      inline def setOpenMenuEvents(value: String): Self = StObject.set(x, "openMenuEvents", value.asInstanceOf[js.Any])
      
      inline def setOpenMenuEventsUndefined: Self = StObject.set(x, "openMenuEvents", js.undefined)
      
      inline def setOutsideMenuCancel(value: `false` | Double): Self = StObject.set(x, "outsideMenuCancel", value.asInstanceOf[js.Any])
      
      inline def setOutsideMenuCancelUndefined: Self = StObject.set(x, "outsideMenuCancel", js.undefined)
      
      inline def setSelector(value: Selector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSeparatorWidth(value: Double): Self = StObject.set(x, "separatorWidth", value.asInstanceOf[js.Any])
      
      inline def setSeparatorWidthUndefined: Self = StObject.set(x, "separatorWidth", js.undefined)
      
      inline def setSpotlightPadding(value: Double): Self = StObject.set(x, "spotlightPadding", value.asInstanceOf[js.Any])
      
      inline def setSpotlightPaddingUndefined: Self = StObject.set(x, "spotlightPadding", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  object global {
    
    object cytoscape {
      
      @js.native
      trait Core extends StObject {
        
        /*
          * Set up the context menu according to the given options.
          */
        def cxtmenu(): MenuInstance = js.native
        def cxtmenu(options: Options): MenuInstance = js.native
      }
    }
  }
}
