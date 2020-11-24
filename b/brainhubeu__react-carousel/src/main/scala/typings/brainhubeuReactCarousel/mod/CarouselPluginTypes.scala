package typings.brainhubeuReactCarousel.mod

import typings.brainhubeuReactCarousel.anon.AfterCarouselItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselPluginTypes extends js.Object {
  
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
  implicit class CarouselPluginTypesOps[Self <: CarouselPluginTypes] (val x: Self) extends AnyVal {
    
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
    def setResolve(
      value: /* hasOptionsCarouselPropsRefs */ typings.brainhubeuReactCarousel.anon.CarouselProps => AfterCarouselItems
    ): Self = this.set("resolve", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
