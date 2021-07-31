package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.localeMod.Locale
import typings.contentfulManagement.localeMod.LocaleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoflocale extends StObject {
  
  def wrapLocale(http: AxiosInstance, data: LocaleProps): Locale
  
  def wrapLocaleCollection(http: AxiosInstance, data: CollectionProp[LocaleProps]): Collection[Locale, LocaleProps]
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
  implicit class TypeoflocaleMutableBuilder[Self <: Typeoflocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapLocale(value: (AxiosInstance, LocaleProps) => Locale): Self = StObject.set(x, "wrapLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapLocaleCollection(value: (AxiosInstance, CollectionProp[LocaleProps]) => Collection[Locale, LocaleProps]): Self = StObject.set(x, "wrapLocaleCollection", js.Any.fromFunction2(value))
  }
}
