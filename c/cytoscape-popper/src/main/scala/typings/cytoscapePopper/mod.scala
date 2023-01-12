package typings.cytoscapePopper

import org.scalablytyped.runtime.Shortcut
import typings.cytoscape.mod.Ext
import typings.cytoscape.mod.Position
import typings.popperjsCore.libTypesMod.Instance
import typings.popperjsCore.libTypesMod.VirtualElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-popper", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait Dimensions extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object Dimensions {
    
    inline def apply(h: Double, w: Double): Dimensions = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[Type] extends StObject {
    
    /*
      * The HTML content of the popper. May be a DOM Element reference or a function that returns one.
      */
    var content: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.undefined
    
    /*
      * The [Popper options](https://popper.js.org/docs/v2/constructors/#options) object.
      * You may use this to override Popper options.
      */
    var popper: js.UndefOr[typings.popperjsCore.libTypesMod.Options] = js.undefined
    
    /*
      * A function that can be used to override the [rendered](http://js.cytoscape.org/#notation/position) Cytoscape bounding box dimensions
      * considered for the popper target (i.e. `cy` or `ele`).
      * It defines only the effective `width` and `height` (`bb.w` and `bb.h`) of the Popper target.
      * This option is more often useful for elements rather than for the core.
      */
    var renderedDimensions: js.UndefOr[js.Function1[/* el */ Type, Dimensions]] = js.undefined
    
    /*
      * A function that can be used to override the [rendered](http://js.cytoscape.org/#notation/position) Cytoscape position of the Popper target.
      * This option is mandatory when using Popper on the core.
      * For an element, the centre of its bounding box is used by default.
      */
    var renderedPosition: js.UndefOr[js.Function1[/* el */ Type, Position]] = js.undefined
  }
  object Options {
    
    inline def apply[Type](): Options[Type] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Type]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], Type] (val x: Self & Options[Type]) extends AnyVal {
      
      inline def setContent(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPopper(value: typings.popperjsCore.libTypesMod.Options): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
      
      inline def setRenderedDimensions(value: /* el */ Type => Dimensions): Self = StObject.set(x, "renderedDimensions", js.Any.fromFunction1(value))
      
      inline def setRenderedDimensionsUndefined: Self = StObject.set(x, "renderedDimensions", js.undefined)
      
      inline def setRenderedPosition(value: /* el */ Type => Position): Self = StObject.set(x, "renderedPosition", js.Any.fromFunction1(value))
      
      inline def setRenderedPositionUndefined: Self = StObject.set(x, "renderedPosition", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  type getPopperInstance[Type] = js.Function1[/* opts */ js.UndefOr[Options[Type]], Instance]
  
  type getPopperRef[Type] = js.Function1[/* opts */ js.UndefOr[Options[Type]], VirtualElement]
  
  object global {
    
    object cytoscape {
      
      trait Core extends StObject {
        
        /*
          * Get a [Popper Instance](https://popper.js.org/docs/v2/constructors/) for the specified core Cytoscape instance.
          */
        def popper(): Instance
        def popper(opts: Options[Core]): Instance
        
        /*
          * Get a [Popper virtual element](https://popper.js.org/docs/v2/virtual-elements/)
          * (aka Popper reference object in Popper v1) for the specified core Cytoscape instance.
          */
        def popperRef(): VirtualElement
        def popperRef(opts: Options[Core]): VirtualElement
        /*
          * Get a [Popper virtual element](https://popper.js.org/docs/v2/virtual-elements/)
          * (aka Popper reference object in Popper v1) for the specified core Cytoscape instance.
          */
        @JSName("popperRef")
        var popperRef_Original: getPopperRef[Core]
        
        /*
          * Get a [Popper Instance](https://popper.js.org/docs/v2/constructors/) for the specified core Cytoscape instance.
          */
        @JSName("popper")
        var popper_Original: getPopperInstance[Core]
      }
      object Core {
        
        inline def apply(
          popper: /* opts */ js.UndefOr[Options[Core]] => Instance,
          popperRef: /* opts */ js.UndefOr[Options[Core]] => VirtualElement
        ): Core = {
          val __obj = js.Dynamic.literal(popper = js.Any.fromFunction1(popper), popperRef = js.Any.fromFunction1(popperRef))
          __obj.asInstanceOf[Core]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Core] (val x: Self) extends AnyVal {
          
          inline def setPopper(value: /* opts */ js.UndefOr[Options[Core]] => Instance): Self = StObject.set(x, "popper", js.Any.fromFunction1(value))
          
          inline def setPopperRef(value: /* opts */ js.UndefOr[Options[Core]] => VirtualElement): Self = StObject.set(x, "popperRef", js.Any.fromFunction1(value))
        }
      }
      
      trait SingularData extends StObject {
        
        /*
          * Get a [Popper Instance](https://popper.js.org/docs/v2/constructors/) for the specified element.
          */
        def popper(): Instance
        def popper(opts: Options[SingularData]): Instance
        
        /*
          * Get a [Popper virtual element](https://popper.js.org/docs/v2/virtual-elements/)
          * (aka Popper reference object in Popper v1) for the specified specified element.
          */
        def popperRef(): VirtualElement
        def popperRef(opts: Options[SingularData]): VirtualElement
        /*
          * Get a [Popper virtual element](https://popper.js.org/docs/v2/virtual-elements/)
          * (aka Popper reference object in Popper v1) for the specified specified element.
          */
        @JSName("popperRef")
        var popperRef_Original: getPopperRef[SingularData]
        
        /*
          * Get a [Popper Instance](https://popper.js.org/docs/v2/constructors/) for the specified element.
          */
        @JSName("popper")
        var popper_Original: getPopperInstance[SingularData]
      }
      object SingularData {
        
        inline def apply(
          popper: /* opts */ js.UndefOr[Options[SingularData]] => Instance,
          popperRef: /* opts */ js.UndefOr[Options[SingularData]] => VirtualElement
        ): SingularData = {
          val __obj = js.Dynamic.literal(popper = js.Any.fromFunction1(popper), popperRef = js.Any.fromFunction1(popperRef))
          __obj.asInstanceOf[SingularData]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: SingularData] (val x: Self) extends AnyVal {
          
          inline def setPopper(value: /* opts */ js.UndefOr[Options[SingularData]] => Instance): Self = StObject.set(x, "popper", js.Any.fromFunction1(value))
          
          inline def setPopperRef(value: /* opts */ js.UndefOr[Options[SingularData]] => VirtualElement): Self = StObject.set(x, "popperRef", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
