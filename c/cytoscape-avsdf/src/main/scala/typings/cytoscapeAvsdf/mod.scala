package typings.cytoscapeAvsdf

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.BaseLayoutOptions
import typings.cytoscape.mod.Css.TransitionTimingFunction
import typings.cytoscape.mod.Ext
import typings.cytoscapeAvsdf.cytoscapeAvsdfBooleans.`false`
import typings.cytoscapeAvsdf.cytoscapeAvsdfStrings.avsdf
import typings.cytoscapeAvsdf.cytoscapeAvsdfStrings.during
import typings.cytoscapeAvsdf.cytoscapeAvsdfStrings.end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-avsdf", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  /**
    * Options for the Adjacent Vertex with Smallest Degree First (AVSDF) layout
    * algorithm.
    * @see <a href='https://github.com/iVis-at-Bilkent/cytoscape.js-avsdf'>cytoscape-avsdf package Documentation</a>
    */
  trait AvsdfLayoutOptions
    extends StObject
       with BaseLayoutOptions {
    
    /**
      * Type of layout animation. The option set is {'during', 'end', false}
      * @default 'end'
      */
    var animate: js.UndefOr[end | during | `false`] = js.undefined
    
    /**
      * Duration for animate:end
      * @default 500
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * easing of animation if enabled
      * @default undefined
      */
    var animationEasing: js.UndefOr[TransitionTimingFunction] = js.undefined
    
    /**
      * Whether to fit the network view after when done
      * @default true
      */
    var fit: js.UndefOr[Boolean] = js.undefined
    
    @JSName("name")
    var name_AvsdfLayoutOptions: avsdf
    
    /**
      * How apart the nodes are
      * @default 60
      */
    var nodeSeparation: js.UndefOr[Double] = js.undefined
    
    /**
      * Padding on fit
      * @default 10
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * number of ticks per frame; higher is faster but more jerky
      * @default 30
      */
    var refresh: js.UndefOr[Double] = js.undefined
    
    /**
      * Prevent the user grabbing nodes during the layout (usually with animate:true)
      * @default false
      */
    var ungrabifyWhileSimulating: js.UndefOr[Boolean] = js.undefined
  }
  object AvsdfLayoutOptions {
    
    inline def apply(): AvsdfLayoutOptions = {
      val __obj = js.Dynamic.literal(name = "avsdf")
      __obj.asInstanceOf[AvsdfLayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvsdfLayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: end | during | `false`): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationEasing(value: TransitionTimingFunction): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
      
      inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setName(value: avsdf): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeSeparation(value: Double): Self = StObject.set(x, "nodeSeparation", value.asInstanceOf[js.Any])
      
      inline def setNodeSeparationUndefined: Self = StObject.set(x, "nodeSeparation", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      inline def setUngrabifyWhileSimulating(value: Boolean): Self = StObject.set(x, "ungrabifyWhileSimulating", value.asInstanceOf[js.Any])
      
      inline def setUngrabifyWhileSimulatingUndefined: Self = StObject.set(x, "ungrabifyWhileSimulating", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
}
