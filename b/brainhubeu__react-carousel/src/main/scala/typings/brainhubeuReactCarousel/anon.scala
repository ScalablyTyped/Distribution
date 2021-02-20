package typings.brainhubeuReactCarousel

import typings.brainhubeuReactCarousel.mod.PluginStrategy
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AfterCarouselItems extends StObject {
    
    var afterCarouselItems: js.UndefOr[js.Function0[Element]] = js.native
    
    var beforeCarouselItems: js.UndefOr[js.Function0[Element]] = js.native
    
    var carouselClassNames: js.UndefOr[js.Function0[js.Array[String]]] = js.native
    
    var carouselCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[_]]]] = js.native
    
    var itemClassNames: js.UndefOr[js.Function0[js.Array[String]]] = js.native
    
    var plugin: js.UndefOr[js.Function0[Unit]] = js.native
    
    var slideCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[_]]]] = js.native
    
    var strategies: js.UndefOr[js.Function0[Record[String, PluginStrategy]]] = js.native
    
    var trackCustomProps: js.UndefOr[js.Function0[Record[String, js.Function0[_]]]] = js.native
  }
  object AfterCarouselItems {
    
    @scala.inline
    def apply(): AfterCarouselItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterCarouselItems]
    }
    
    @scala.inline
    implicit class AfterCarouselItemsMutableBuilder[Self <: AfterCarouselItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCarouselItems(value: () => Element): Self = StObject.set(x, "afterCarouselItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCarouselItemsUndefined: Self = StObject.set(x, "afterCarouselItems", js.undefined)
      
      @scala.inline
      def setBeforeCarouselItems(value: () => Element): Self = StObject.set(x, "beforeCarouselItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeCarouselItemsUndefined: Self = StObject.set(x, "beforeCarouselItems", js.undefined)
      
      @scala.inline
      def setCarouselClassNames(value: () => js.Array[String]): Self = StObject.set(x, "carouselClassNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCarouselClassNamesUndefined: Self = StObject.set(x, "carouselClassNames", js.undefined)
      
      @scala.inline
      def setCarouselCustomProps(value: () => Record[String, js.Function0[_]]): Self = StObject.set(x, "carouselCustomProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCarouselCustomPropsUndefined: Self = StObject.set(x, "carouselCustomProps", js.undefined)
      
      @scala.inline
      def setItemClassNames(value: () => js.Array[String]): Self = StObject.set(x, "itemClassNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setItemClassNamesUndefined: Self = StObject.set(x, "itemClassNames", js.undefined)
      
      @scala.inline
      def setPlugin(value: () => Unit): Self = StObject.set(x, "plugin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setSlideCustomProps(value: () => Record[String, js.Function0[_]]): Self = StObject.set(x, "slideCustomProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSlideCustomPropsUndefined: Self = StObject.set(x, "slideCustomProps", js.undefined)
      
      @scala.inline
      def setStrategies(value: () => Record[String, PluginStrategy]): Self = StObject.set(x, "strategies", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStrategiesUndefined: Self = StObject.set(x, "strategies", js.undefined)
      
      @scala.inline
      def setTrackCustomProps(value: () => Record[String, js.Function0[_]]): Self = StObject.set(x, "trackCustomProps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrackCustomPropsUndefined: Self = StObject.set(x, "trackCustomProps", js.undefined)
    }
  }
  
  @js.native
  trait CarouselProps extends StObject {
    
    var carouselProps: typings.brainhubeuReactCarousel.mod.CarouselProps = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    var refs: Record[String, RefObject[HTMLElement]] = js.native
  }
  object CarouselProps {
    
    @scala.inline
    def apply(
      carouselProps: typings.brainhubeuReactCarousel.mod.CarouselProps,
      refs: Record[String, RefObject[HTMLElement]]
    ): CarouselProps = {
      val __obj = js.Dynamic.literal(carouselProps = carouselProps.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarouselProps(value: typings.brainhubeuReactCarousel.mod.CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRefs(value: Record[String, RefObject[HTMLElement]]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, std.Exclude<keyof @brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, 'breakpoints' | 'plugins'>> */
  @js.native
  trait PickCarouselPropsExcludek extends StObject {
    
    var animationSpeed: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Boolean] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var slides: js.UndefOr[js.Array[Element]] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object PickCarouselPropsExcludek {
    
    @scala.inline
    def apply(): PickCarouselPropsExcludek = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickCarouselPropsExcludek]
    }
    
    @scala.inline
    implicit class PickCarouselPropsExcludekMutableBuilder[Self <: PickCarouselPropsExcludek] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationSpeedUndefined: Self = StObject.set(x, "animationSpeed", js.undefined)
      
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
}
