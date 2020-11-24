package typings.brainhubeuReactCarousel.anon

import typings.brainhubeuReactCarousel.mod.PluginStrategy
import typings.react.mod.global.JSX.Element
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterCarouselItems extends js.Object {
  
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
  implicit class AfterCarouselItemsOps[Self <: AfterCarouselItems] (val x: Self) extends AnyVal {
    
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
    def setAfterCarouselItems(value: () => Element): Self = this.set("afterCarouselItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterCarouselItems: Self = this.set("afterCarouselItems", js.undefined)
    
    @scala.inline
    def setBeforeCarouselItems(value: () => Element): Self = this.set("beforeCarouselItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeCarouselItems: Self = this.set("beforeCarouselItems", js.undefined)
    
    @scala.inline
    def setCarouselClassNames(value: () => js.Array[String]): Self = this.set("carouselClassNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCarouselClassNames: Self = this.set("carouselClassNames", js.undefined)
    
    @scala.inline
    def setCarouselCustomProps(value: () => Record[String, js.Function0[_]]): Self = this.set("carouselCustomProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCarouselCustomProps: Self = this.set("carouselCustomProps", js.undefined)
    
    @scala.inline
    def setItemClassNames(value: () => js.Array[String]): Self = this.set("itemClassNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteItemClassNames: Self = this.set("itemClassNames", js.undefined)
    
    @scala.inline
    def setPlugin(value: () => Unit): Self = this.set("plugin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePlugin: Self = this.set("plugin", js.undefined)
    
    @scala.inline
    def setSlideCustomProps(value: () => Record[String, js.Function0[_]]): Self = this.set("slideCustomProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSlideCustomProps: Self = this.set("slideCustomProps", js.undefined)
    
    @scala.inline
    def setStrategies(value: () => Record[String, PluginStrategy]): Self = this.set("strategies", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStrategies: Self = this.set("strategies", js.undefined)
    
    @scala.inline
    def setTrackCustomProps(value: () => Record[String, js.Function0[_]]): Self = this.set("trackCustomProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTrackCustomProps: Self = this.set("trackCustomProps", js.undefined)
  }
}
