package typings.d3kit

import typings.d3Selection.mod.BaseType
import typings.d3Selection.mod.Selection_
import typings.d3kit.mod.ChartOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object d3kit {
    
    @JSGlobal("d3kit.AbstractChart")
    @js.native
    open class AbstractChart protected ()
      extends typings.d3kit.mod.AbstractChart {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: ChartOptions) = this()
      def this(selector: Element, options: ChartOptions) = this()
    }
    /* static members */
    object AbstractChart {
      
      @JSGlobal("d3kit.AbstractChart")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getCustomEventNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomEventNames")().asInstanceOf[js.Array[String]]
    }
    
    @JSGlobal("d3kit.AbstractPlate")
    @js.native
    open class AbstractPlate protected ()
      extends typings.d3kit.mod.AbstractPlate {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: ChartOptions) = this()
      def this(selector: Element, options: ChartOptions) = this()
    }
    /* static members */
    object AbstractPlate {
      
      @JSGlobal("d3kit.AbstractPlate")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
      inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.Base")
    @js.native
    open class Base ()
      extends typings.d3kit.mod.Base {
      def this(options: ChartOptions) = this()
    }
    /* static members */
    object Base {
      
      @JSGlobal("d3kit.Base")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
      inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.CanvasChart")
    @js.native
    open class CanvasChart protected ()
      extends typings.d3kit.mod.CanvasChart {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: ChartOptions) = this()
      def this(selector: Element, options: ChartOptions) = this()
    }
    /* static members */
    object CanvasChart {
      
      @JSGlobal("d3kit.CanvasChart")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.CanvasPlate")
    @js.native
    open class CanvasPlate ()
      extends typings.d3kit.mod.CanvasPlate {
      def this(options: ChartOptions) = this()
    }
    /* static members */
    object CanvasPlate {
      
      @JSGlobal("d3kit.CanvasPlate")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
      inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.DivPlate")
    @js.native
    open class DivPlate ()
      extends typings.d3kit.mod.DivPlate {
      def this(options: ChartOptions) = this()
    }
    /* static members */
    object DivPlate {
      
      @JSGlobal("d3kit.DivPlate")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
      inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.HybridChart")
    @js.native
    open class HybridChart protected ()
      extends typings.d3kit.mod.HybridChart {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: ChartOptions) = this()
      def this(selector: Element, options: ChartOptions) = this()
    }
    /* static members */
    object HybridChart {
      
      @JSGlobal("d3kit.HybridChart")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
    }
    
    @JSGlobal("d3kit.LayerOrganizer")
    @js.native
    open class LayerOrganizer protected ()
      extends typings.d3kit.mod.LayerOrganizer {
      def this(container: Selection_[BaseType, Any, BaseType, Any]) = this()
      def this(container: Selection_[BaseType, Any, BaseType, Any], defaultTag: String) = this()
    }
    
    @JSGlobal("d3kit.SvgChart")
    @js.native
    open class SvgChart protected ()
      extends typings.d3kit.mod.SvgChart {
      def this(selector: String) = this()
      def this(selector: Element) = this()
      def this(selector: String, options: ChartOptions) = this()
      def this(selector: Element, options: ChartOptions) = this()
    }
    
    @JSGlobal("d3kit.SvgPlate")
    @js.native
    open class SvgPlate ()
      extends typings.d3kit.mod.SvgPlate {
      def this(options: ChartOptions) = this()
    }
    /* static members */
    object SvgPlate {
      
      @JSGlobal("d3kit.SvgPlate")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getDefaultOptions(): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[ChartOptions]
      inline def getDefaultOptions(options: ChartOptions): ChartOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChartOptions]
    }
    
    object helper {
      
      @JSGlobal("d3kit.helper")
      @js.native
      val ^ : js.Any = js.native
      
      inline def debounce(fn: js.Function1[/* repeated */ Any, Unit], delay: Double): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
      
      inline def deepExtend(dest: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(scala.List(dest.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
      
      inline def extend(dest: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(dest.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
      
      inline def functor(value: Any): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("functor")(value.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
      
      inline def isFunction(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def kebabCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebabCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def rebind(target: Any, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def throttle(fn: js.Function1[/* repeated */ Any, Unit], delay: Double): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
    }
  }
}
