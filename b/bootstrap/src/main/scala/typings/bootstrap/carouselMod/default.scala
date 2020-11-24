package typings.bootstrap.carouselMod

import typings.bootstrap.anon.PartialOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/carousel", JSImport.Default)
@js.native
class default protected () extends Carousel {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptions) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/carousel", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the carousel instance associated
    * with a DOM element.
    */
  def getInstance(element: Element): Carousel = js.native
  def getInstance(element: Element, options: PartialOptions): Carousel = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.carouselMod.Carousel.Events with String] = js.native
    
    /* "slid.bs.carousel" */ val slid: typings.bootstrap.carouselMod.Carousel.Events.slid with String = js.native
    
    /* "slide.bs.carousel" */ val slide: typings.bootstrap.carouselMod.Carousel.Events.slide with String = js.native
  }
}
