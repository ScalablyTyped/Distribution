package typings.cathoQuantum

import typings.cathoQuantum.anon.`7`
import typings.cathoQuantum.contentMod.Content
import typings.cathoQuantum.descriptionMod.Description
import typings.cathoQuantum.footerMod.Footer
import typings.cathoQuantum.headerMod.Header
import typings.cathoQuantum.headerTextMod.HeaderText
import typings.cathoQuantum.mediaMod.Media
import typings.cathoQuantum.thumbnailMod.Thumbnail
import typings.cathoQuantum.titleMod.Title
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@catho/quantum/Card", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Card", "default.Content")
    @js.native
    def Content: typings.cathoQuantum.contentMod.Content = js.native
    @scala.inline
    def Content_=(x: Content): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Description")
    @js.native
    def Description: typings.cathoQuantum.descriptionMod.Description = js.native
    @scala.inline
    def Description_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Footer")
    @js.native
    def Footer: typings.cathoQuantum.footerMod.Footer = js.native
    @scala.inline
    def Footer_=(x: Footer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Header")
    @js.native
    def Header: typings.cathoQuantum.headerMod.Header = js.native
    
    @JSImport("@catho/quantum/Card", "default.HeaderText")
    @js.native
    def HeaderText: typings.cathoQuantum.headerTextMod.HeaderText = js.native
    @scala.inline
    def HeaderText_=(x: HeaderText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderText")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Header_=(x: Header): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Media")
    @js.native
    def Media: typings.cathoQuantum.mediaMod.Media = js.native
    @scala.inline
    def Media_=(x: Media): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Media")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Thumbnail")
    @js.native
    def Thumbnail: typings.cathoQuantum.thumbnailMod.Thumbnail = js.native
    @scala.inline
    def Thumbnail_=(x: Thumbnail): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thumbnail")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Card", "default.Title")
    @js.native
    def Title: typings.cathoQuantum.titleMod.Title = js.native
    @scala.inline
    def Title_=(x: Title): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  }
  
  type Card = Component[Props, js.Object, js.Any]
  
  @js.native
  trait Props extends StObject {
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    var theme: js.UndefOr[`7`] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTheme(value: `7`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
