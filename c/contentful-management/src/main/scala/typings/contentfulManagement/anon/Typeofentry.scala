package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.entryMod.Entry
import typings.contentfulManagement.entryMod.EntryProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofentry extends StObject {
  
  def wrapEntry(http: AxiosInstance, data: EntryProp): Entry
  
  def wrapEntryCollection(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp]
}
object Typeofentry {
  
  inline def apply(
    wrapEntry: (AxiosInstance, EntryProp) => Entry,
    wrapEntryCollection: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]
  ): Typeofentry = {
    val __obj = js.Dynamic.literal(wrapEntry = js.Any.fromFunction2(wrapEntry), wrapEntryCollection = js.Any.fromFunction2(wrapEntryCollection))
    __obj.asInstanceOf[Typeofentry]
  }
  
  extension [Self <: Typeofentry](x: Self) {
    
    inline def setWrapEntry(value: (AxiosInstance, EntryProp) => Entry): Self = StObject.set(x, "wrapEntry", js.Any.fromFunction2(value))
    
    inline def setWrapEntryCollection(value: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]): Self = StObject.set(x, "wrapEntryCollection", js.Any.fromFunction2(value))
  }
}
