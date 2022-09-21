package typings.cytoscapeNavigator

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.Ext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-navigator", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait Nav extends StObject {
    
    /**
      * Remove the navigator and clean up.
      */
    def destroy(): Unit
  }
  object Nav {
    
    inline def apply(destroy: () => Unit): Nav = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
      __obj.asInstanceOf[Nav]
    }
    
    extension [Self <: Nav](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Container element.
      * Supported strings: an element id selector (like "#someId"), or a className selector (like ".someClassName"). Otherwise an element will be created by the library.
      * Default: false
      */
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Double click delay in milliseconds.
      * Default: 200
      */
    var dblClickDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Flag to destroy the container on plugin destroy.
      * Default: true
      */
    var removeCustomContainer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rerender delay in milliseconds.
      * Default: 500
      */
    var rerenderDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Frames per second.
      * Set false to update graph pan only on drag end.
      * Set to 0 to update graph instantly.
      * Set a number (e.g. 60) to update graph not more than N times per second.
      * Default: 0
      */
    var viewLiveFramerate: js.UndefOr[Double | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDblClickDelay(value: Double): Self = StObject.set(x, "dblClickDelay", value.asInstanceOf[js.Any])
      
      inline def setDblClickDelayUndefined: Self = StObject.set(x, "dblClickDelay", js.undefined)
      
      inline def setRemoveCustomContainer(value: Boolean): Self = StObject.set(x, "removeCustomContainer", value.asInstanceOf[js.Any])
      
      inline def setRemoveCustomContainerUndefined: Self = StObject.set(x, "removeCustomContainer", js.undefined)
      
      inline def setRerenderDelay(value: Double): Self = StObject.set(x, "rerenderDelay", value.asInstanceOf[js.Any])
      
      inline def setRerenderDelayUndefined: Self = StObject.set(x, "rerenderDelay", js.undefined)
      
      inline def setViewLiveFramerate(value: Double | Boolean): Self = StObject.set(x, "viewLiveFramerate", value.asInstanceOf[js.Any])
      
      inline def setViewLiveFramerateUndefined: Self = StObject.set(x, "viewLiveFramerate", js.undefined)
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
          * Set up the navigator according to the given options.
          */
        def navigator(): Nav = js.native
        def navigator(options: Options): Nav = js.native
      }
    }
  }
}
