package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOptions
import typings.bootstrap.baseComponentMod.GetInstanceFactory
import typings.bootstrap.baseComponentMod.GetOrCreateInstanceFactory
import typings.bootstrap.carouselMod.Carousel.Options
import typings.bootstrap.carouselMod.Carousel.jQueryInterface
import typings.bootstrap.carouselMod.default
import typings.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Carousel")
@js.native
open class Carousel protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptions) = this()
  def this(element: Element, options: PartialOptions) = this()
}
object Carousel {
  
  @JSImport("bootstrap", "Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Carousel.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Carousel.Events")
  @js.native
  object Events extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.bootstrap.carouselMod.Carousel.Events & String] = js.native
    
    /* "slid.bs.carousel" */ val slid: typings.bootstrap.carouselMod.Carousel.Events.slid & String = js.native
    
    /* "slide.bs.carousel" */ val slide: typings.bootstrap.carouselMod.Carousel.Events.slide & String = js.native
  }
  
  /* static member */
  /* was `typeof Carousel.getOrCreateInstance` */
  @JSImport("bootstrap", "Carousel.carouselInstance")
  @js.native
  def carouselInstance: GetOrCreateInstanceFactory[typings.bootstrap.carouselMod.Carousel, PartialOptions] = js.native
  inline def carouselInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.carouselMod.Carousel, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carouselInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the carousel instance associated
    * with a DOM element.
    */
  /* static member */
  @JSImport("bootstrap", "Carousel.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typings.bootstrap.carouselMod.Carousel] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typings.bootstrap.carouselMod.Carousel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Carousel.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typings.bootstrap.carouselMod.Carousel, PartialOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typings.bootstrap.carouselMod.Carousel, PartialOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Carousel.jQueryInterface")
  @js.native
  def jQueryInterface: typings.bootstrap.carouselMod.Carousel.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
