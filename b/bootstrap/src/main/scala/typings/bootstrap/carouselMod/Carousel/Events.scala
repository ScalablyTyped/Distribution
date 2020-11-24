package typings.bootstrap.carouselMod.Carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/carousel", "Carousel.Events")
@js.native
object Events extends js.Object {
  
  /**
    * Fired when the carousel has completed its slide transition.
    */
  @js.native
  sealed trait slid extends Events
  
  /**
    * Fires immediately when the slide instance method is invoked.
    */
  @js.native
  sealed trait slide extends Events
}
