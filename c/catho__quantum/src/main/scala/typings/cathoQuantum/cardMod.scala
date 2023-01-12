package typings.cathoQuantum

import typings.cathoQuantum.anon.`8`
import typings.cathoQuantum.cardContentMod.Content
import typings.cathoQuantum.cardDescriptionMod.Description
import typings.cathoQuantum.cardFooterMod.Footer
import typings.cathoQuantum.cardHeaderMod.Header
import typings.cathoQuantum.cardHeaderTextMod.HeaderText
import typings.cathoQuantum.cardMediaMod.Media
import typings.cathoQuantum.cardThumbnailMod.Thumbnail
import typings.cathoQuantum.cardTitleMod.Title
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    def Content: typings.cathoQuantum.cardContentMod.Content = js.native
    inline def Content_=(x: Content): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    def Description: typings.cathoQuantum.cardDescriptionMod.Description = js.native
    inline def Description_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    def Footer: typings.cathoQuantum.cardFooterMod.Footer = js.native
    inline def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    def Header: typings.cathoQuantum.cardHeaderMod.Header = js.native
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    def HeaderText: typings.cathoQuantum.cardHeaderTextMod.HeaderText = js.native
    inline def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    inline def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    def Media: typings.cathoQuantum.cardMediaMod.Media = js.native
    inline def Media_=(x: Media): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    def Thumbnail: typings.cathoQuantum.cardThumbnailMod.Thumbnail = js.native
    inline def Thumbnail_=(x: Thumbnail): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thumbnail")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    def Title: typings.cathoQuantum.cardTitleMod.Title = js.native
    inline def Title_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Card = Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var theme: js.UndefOr[`8`] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTheme(value: `8`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
