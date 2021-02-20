package typings.brainhubeuReactCarousel

import typings.brainhubeuReactCarousel.anon.AfterCarouselItems
import typings.brainhubeuReactCarousel.anon.PickCarouselPropsExcludek
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.img
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.key
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.ref
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ReactComponentElement
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CarouselProps, js.Object, js.Any] {
    def this(props: CarouselProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CarouselProps, context: js.Any) = this()
  }
  
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  class Dots protected ()
    extends Component[DotsProps, js.Object, js.Any] {
    def this(props: DotsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DotsProps, context: js.Any) = this()
  }
  
  @JSImport("@brainhubeu/react-carousel", "arrowsPlugin")
  @js.native
  val arrowsPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "autoplayPlugin")
  @js.native
  val autoplayPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "centeredPlugin")
  @js.native
  val centeredPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "clickToChangePlugin")
  @js.native
  val clickToChangePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "fastSwipePlugin")
  @js.native
  val fastSwipePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "infinitePlugin")
  @js.native
  val infinitePlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "rtlPlugin")
  @js.native
  val rtlPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "slidesToScrollPlugin")
  @js.native
  val slidesToScrollPlugin: CarouselPluginFunc = js.native
  
  @JSImport("@brainhubeu/react-carousel", "slidesToShowPlugin")
  @js.native
  val slidesToShowPlugin: CarouselPluginFunc = js.native
  
  type CarouselPluginFunc = js.Function1[
    /* hasOptionsCarouselPropsRefs */ typings.brainhubeuReactCarousel.anon.CarouselProps, 
    AfterCarouselItems
  ]
  
  @js.native
  trait CarouselPluginTypes extends StObject {
    
    var options: js.UndefOr[js.Any] = js.native
    
    var resolve: CarouselPluginFunc = js.native
  }
  object CarouselPluginTypes {
    
    @scala.inline
    def apply(
      resolve: /* hasOptionsCarouselPropsRefs */ typings.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems
    ): CarouselPluginTypes = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[CarouselPluginTypes]
    }
    
    @scala.inline
    implicit class CarouselPluginTypesMutableBuilder[Self <: CarouselPluginTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setResolve(
        value: /* hasOptionsCarouselPropsRefs */ typings.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CarouselProps extends StObject {
    
    var animationSpeed: js.UndefOr[Double] = js.native
    
    var breakpoints: js.UndefOr[PickCarouselPropsExcludek] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var plugins: js.UndefOr[js.Array[String | CarouselPluginTypes]] = js.native
    
    var slides: js.UndefOr[js.Array[Element]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object CarouselProps {
    
    @scala.inline
    def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      @scala.inline
      def setBreakpoints(value: PickCarouselPropsExcludek): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[String | CarouselPluginTypes]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (String | CarouselPluginTypes)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setSlides(value: js.Array[Element]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      @scala.inline
      def setSlidesVarargs(value: Element*): Self = StObject.set(x, "slides", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait DotsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var thumbnails: js.UndefOr[js.Array[ImgProps]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object DotsProps {
    
    @scala.inline
    def apply(): DotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotsProps]
    }
    
    @scala.inline
    implicit class DotsPropsMutableBuilder[Self <: DotsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setThumbnails(value: js.Array[ImgProps]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      @scala.inline
      def setThumbnailsVarargs(value: ImgProps*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ImgProps = ReactComponentElement[
    img, 
    Pick[
      ComponentProps[img], 
      Exclude[/* keyof react.react.ComponentProps<'img'> */ String, key | ref]
    ]
  ]
  
  type PluginStrategy = js.Function2[/* originalValue */ Double, /* previousValue */ Double, Double]
}
