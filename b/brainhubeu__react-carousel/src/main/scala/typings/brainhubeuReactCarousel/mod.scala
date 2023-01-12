package typings.brainhubeuReactCarousel

import org.scalablytyped.runtime.NumberDictionary
import typings.brainhubeuReactCarousel.anon.AfterCarouselItems
import typings.brainhubeuReactCarousel.anon.PickCarouselPropsExcludek
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.img
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.key
import typings.brainhubeuReactCarousel.brainhubeuReactCarouselStrings.ref
import typings.react.mod.Component
import typings.react.mod.ComponentProps
import typings.react.mod.ReactComponentElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@brainhubeu/react-carousel", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[CarouselProps, js.Object, Any] {
    def this(props: CarouselProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CarouselProps, context: Any) = this()
  }
  
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  open class Dots protected ()
    extends Component[DotsProps, js.Object, Any] {
    def this(props: DotsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DotsProps, context: Any) = this()
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
  
  type CarouselBreakpoints = NumberDictionary[PickCarouselPropsExcludek]
  
  type CarouselPluginFunc = js.Function1[
    /* param0 */ typings.brainhubeuReactCarousel.anon.CarouselProps, 
    AfterCarouselItems
  ]
  
  trait CarouselPluginTypes extends StObject {
    
    var options: js.UndefOr[Any] = js.undefined
    
    var resolve: CarouselPluginFunc
  }
  object CarouselPluginTypes {
    
    inline def apply(resolve: /* param0 */ typings.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems): CarouselPluginTypes = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[CarouselPluginTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselPluginTypes] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResolve(value: /* param0 */ typings.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait CarouselProps extends StObject {
    
    var animationSpeed: js.UndefOr[Double] = js.undefined
    
    var breakpoints: js.UndefOr[CarouselBreakpoints] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | CarouselPluginTypes]] = js.undefined
    
    var slides: js.UndefOr[js.Array[Element]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
      inline def setBreakpoints(value: CarouselBreakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlugins(value: js.Array[String | CarouselPluginTypes]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | CarouselPluginTypes)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSlides(value: js.Array[Element]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setSlidesVarargs(value: Element*): Self = StObject.set(x, "slides", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DotsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var thumbnails: js.UndefOr[js.Array[ImgProps]] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object DotsProps {
    
    inline def apply(): DotsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotsProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setThumbnails(value: js.Array[ImgProps]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      inline def setThumbnailsVarargs(value: ImgProps*): Self = StObject.set(x, "thumbnails", js.Array(value*))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
