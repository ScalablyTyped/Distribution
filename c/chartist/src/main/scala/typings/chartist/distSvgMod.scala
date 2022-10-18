package typings.chartist

import typings.chartist.anon.EaseInBack
import typings.chartist.distSvgTypesMod.Attributes
import typings.chartist.distSvgTypesMod.SvgPathOptions
import typings.std.ArrayLike
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgMod {
  
  @JSImport("chartist/dist/svg", "Svg")
  @js.native
  open class Svg protected ()
    extends typings.chartist.distSvgSvgMod.Svg {
    /**
      * @param name The name of the SVG element to create or an SVG dom element which should be wrapped into Svg
      * @param attributes An object with properties that will be added as attributes to the SVG element that is created. Attributes with undefined values will not be added.
      * @param className This class or class list will be added to the SVG element
      * @param parent The parent SVG wrapper object where this newly created wrapper and it's element will be attached to as child
      * @param insertFirst If this param is set to true in conjunction with a parent element the newly created element will be added as first child element in the parent element
      */
    def this(name: String) = this()
    def this(name: Element) = this()
    def this(name: String, attributes: Attributes) = this()
    def this(name: Element, attributes: Attributes) = this()
    def this(name: String, attributes: Unit, className: String) = this()
    def this(name: String, attributes: Attributes, className: String) = this()
    def this(name: Element, attributes: Unit, className: String) = this()
    def this(name: Element, attributes: Attributes, className: String) = this()
    def this(name: String, attributes: Unit, className: String, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(name: String, attributes: Unit, className: Unit, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(
      name: String,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg
    ) = this()
    def this(name: String, attributes: Attributes, className: Unit, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(name: Element, attributes: Unit, className: String, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(name: Element, attributes: Unit, className: Unit, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(
      name: Element,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg
    ) = this()
    def this(name: Element, attributes: Attributes, className: Unit, parent: typings.chartist.distSvgSvgMod.Svg) = this()
    def this(name: String, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Unit,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Unit,
      className: Unit,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Attributes, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: String, attributes: Attributes, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: String,
      attributes: Attributes,
      className: Unit,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Unit, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Unit,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Unit, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Unit,
      className: Unit,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Attributes, className: String, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Attributes,
      className: String,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
    def this(name: Element, attributes: Attributes, className: Unit, parent: Unit, insertFirst: Boolean) = this()
    def this(
      name: Element,
      attributes: Attributes,
      className: Unit,
      parent: typings.chartist.distSvgSvgMod.Svg,
      insertFirst: Boolean
    ) = this()
  }
  /* static members */
  object Svg {
    
    /**
      * @todo Only there for chartist <1 compatibility. Remove after deprecation warining.
      * @deprecated Use the animation module export `easings` directly.
      */
    @JSImport("chartist/dist/svg", "Svg.Easing")
    @js.native
    val Easing: EaseInBack = js.native
  }
  
  @JSImport("chartist/dist/svg", "SvgList")
  @js.native
  open class SvgList protected ()
    extends typings.chartist.distSvgSvgListMod.SvgList {
    /**
      * @param nodeList An Array of SVG DOM nodes or a SVG DOM NodeList (as returned by document.querySelectorAll)
      */
    def this(nodeList: ArrayLike[Element]) = this()
  }
  
  @JSImport("chartist/dist/svg", "SvgPath")
  @js.native
  /**
    * Used to construct a new path object.
    * @param close If set to true then this path will be closed when stringified (with a Z at the end)
    * @param options Options object that overrides the default objects. See default options for more details.
    */
  open class SvgPath ()
    extends typings.chartist.distSvgSvgPathMod.SvgPath {
    def this(close: Boolean) = this()
    def this(close: Boolean, options: SvgPathOptions) = this()
    def this(close: Unit, options: SvgPathOptions) = this()
  }
  /* static members */
  object SvgPath {
    
    @JSImport("chartist/dist/svg", "SvgPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static function on `SvgPath` is joining multiple paths together into one paths.
      * @param paths A list of paths to be joined together. The order is important.
      * @param close If the newly created path should be a closed path
      * @param options Path options for the newly created path.
      */
    inline def join(paths: js.Array[typings.chartist.distSvgSvgPathMod.SvgPath]): typings.chartist.distSvgSvgPathMod.SvgPath = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[typings.chartist.distSvgSvgPathMod.SvgPath]
    inline def join(paths: js.Array[typings.chartist.distSvgSvgPathMod.SvgPath], close: Boolean): typings.chartist.distSvgSvgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.distSvgSvgPathMod.SvgPath]
    inline def join(
      paths: js.Array[typings.chartist.distSvgSvgPathMod.SvgPath],
      close: Boolean,
      options: SvgPathOptions
    ): typings.chartist.distSvgSvgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.distSvgSvgPathMod.SvgPath]
    inline def join(paths: js.Array[typings.chartist.distSvgSvgPathMod.SvgPath], close: Unit, options: SvgPathOptions): typings.chartist.distSvgSvgPathMod.SvgPath = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any], close.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.chartist.distSvgSvgPathMod.SvgPath]
  }
  
  object easings {
    
    @JSImport("chartist/dist/svg", "easings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chartist/dist/svg", "easings.easeInBack")
    @js.native
    def easeInBack: js.Array[Double] = js.native
    inline def easeInBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInCirc")
    @js.native
    def easeInCirc: js.Array[Double] = js.native
    inline def easeInCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInCubic")
    @js.native
    def easeInCubic: js.Array[Double] = js.native
    inline def easeInCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInExpo")
    @js.native
    def easeInExpo: js.Array[Double] = js.native
    inline def easeInExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutBack")
    @js.native
    def easeInOutBack: js.Array[Double] = js.native
    inline def easeInOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutCirc")
    @js.native
    def easeInOutCirc: js.Array[Double] = js.native
    inline def easeInOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutCubic")
    @js.native
    def easeInOutCubic: js.Array[Double] = js.native
    inline def easeInOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutExpo")
    @js.native
    def easeInOutExpo: js.Array[Double] = js.native
    inline def easeInOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutQuad")
    @js.native
    def easeInOutQuad: js.Array[Double] = js.native
    inline def easeInOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutQuart")
    @js.native
    def easeInOutQuart: js.Array[Double] = js.native
    inline def easeInOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutQuint")
    @js.native
    def easeInOutQuint: js.Array[Double] = js.native
    inline def easeInOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInOutSine")
    @js.native
    def easeInOutSine: js.Array[Double] = js.native
    inline def easeInOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInOutSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInQuad")
    @js.native
    def easeInQuad: js.Array[Double] = js.native
    inline def easeInQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInQuart")
    @js.native
    def easeInQuart: js.Array[Double] = js.native
    inline def easeInQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInQuint")
    @js.native
    def easeInQuint: js.Array[Double] = js.native
    inline def easeInQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeInSine")
    @js.native
    def easeInSine: js.Array[Double] = js.native
    inline def easeInSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeInSine")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutBack")
    @js.native
    def easeOutBack: js.Array[Double] = js.native
    inline def easeOutBack_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutBack")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutCirc")
    @js.native
    def easeOutCirc: js.Array[Double] = js.native
    inline def easeOutCirc_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCirc")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutCubic")
    @js.native
    def easeOutCubic: js.Array[Double] = js.native
    inline def easeOutCubic_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutCubic")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutExpo")
    @js.native
    def easeOutExpo: js.Array[Double] = js.native
    inline def easeOutExpo_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutExpo")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutQuad")
    @js.native
    def easeOutQuad: js.Array[Double] = js.native
    inline def easeOutQuad_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuad")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutQuart")
    @js.native
    def easeOutQuart: js.Array[Double] = js.native
    inline def easeOutQuart_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuart")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutQuint")
    @js.native
    def easeOutQuint: js.Array[Double] = js.native
    inline def easeOutQuint_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutQuint")(x.asInstanceOf[js.Any])
    
    @JSImport("chartist/dist/svg", "easings.easeOutSine")
    @js.native
    def easeOutSine: js.Array[Double] = js.native
    inline def easeOutSine_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easeOutSine")(x.asInstanceOf[js.Any])
  }
}
