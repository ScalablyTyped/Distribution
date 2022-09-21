package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.PartialLocale
import typings.baseui.localeTypesMod.Locale
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseuiLocaleMod extends Shortcut {
  
  @JSImport("baseui/locale", JSImport.Default)
  @js.native
  val default: FC[LocaleProviderProps] = js.native
  
  @JSImport("baseui/locale", "LocaleContext")
  @js.native
  val LocaleContext: Context[Locale] = js.native
  
  type AccordionLocale = typings.baseui.localeMod.AccordionLocale
  
  type BreadcrumbLocale = typings.baseui.breadcrumbsLocaleMod.BreadcrumbLocale
  
  type ButtonGroupLocale = typings.baseui.buttonGroupLocaleMod.ButtonGroupLocale
  
  type DataTableLocale = typings.baseui.dataTableLocaleMod.DataTableLocale
  
  type DatepickerLocale = typings.baseui.datepickerLocaleMod.DatepickerLocale
  
  type DrawerLocale = typings.baseui.drawerLocaleMod.DrawerLocale
  
  type FileUploaderLocale = typings.baseui.fileUploaderLocaleMod.FileUploaderLocale
  
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode | Null] = js.undefined
    
    var locale: PartialLocale
  }
  object LocaleProviderProps {
    
    inline def apply(locale: PartialLocale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuLocale = typings.baseui.menuLocaleMod.MenuLocale
  
  type ModalLocale = typings.baseui.modalLocaleMod.ModalLocale
  
  type PaginationLocale = typings.baseui.paginationLocaleMod.PaginationLocale
  
  type SelectLocale = typings.baseui.selectLocaleMod.SelectLocale
  
  type ToastLocale = typings.baseui.toastLocaleMod.ToastLocale
  
  type _To = FC[LocaleProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `baseuiLocaleMod.foo` */
  override def _to: FC[LocaleProviderProps] = default
}
