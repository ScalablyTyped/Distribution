package typings.brainhubeuReactCarousel.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, std.Exclude<keyof @brainhubeu/react-carousel.@brainhubeu/react-carousel.CarouselProps, 'breakpoints' | 'plugins'>> */
@js.native
trait PickCarouselPropsExcludek extends js.Object {
  
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
  implicit class PickCarouselPropsExcludekOps[Self <: PickCarouselPropsExcludek] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setSlidesVarargs(value: Element*): Self = this.set("slides", js.Array(value :_*))
    
    @scala.inline
    def setSlides(value: js.Array[Element]): Self = this.set("slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
