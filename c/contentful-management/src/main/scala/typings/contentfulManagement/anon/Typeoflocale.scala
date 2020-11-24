package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.localeMod.Locale
import typings.contentfulManagement.localeMod.LocaleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflocale extends js.Object {
  
  def wrapLocale(http: AxiosInstance, data: LocaleProps): Locale = js.native
  
  def wrapLocaleCollection(http: AxiosInstance, data: CollectionProp[LocaleProps]): Collection[Locale, LocaleProps] = js.native
}
object Typeoflocale {
  
  @scala.inline
  def apply(
    wrapLocale: (AxiosInstance, LocaleProps) => Locale,
    wrapLocaleCollection: (AxiosInstance, CollectionProp[LocaleProps]) => Collection[Locale, LocaleProps]
  ): Typeoflocale = {
    val __obj = js.Dynamic.literal(wrapLocale = js.Any.fromFunction2(wrapLocale), wrapLocaleCollection = js.Any.fromFunction2(wrapLocaleCollection))
    __obj.asInstanceOf[Typeoflocale]
  }
  
  @scala.inline
  implicit class TypeoflocaleOps[Self <: Typeoflocale] (val x: Self) extends AnyVal {
    
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
    def setWrapLocale(value: (AxiosInstance, LocaleProps) => Locale): Self = this.set("wrapLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapLocaleCollection(value: (AxiosInstance, CollectionProp[LocaleProps]) => Collection[Locale, LocaleProps]): Self = this.set("wrapLocaleCollection", js.Any.fromFunction2(value))
  }
}
