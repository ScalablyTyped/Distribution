package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.entryMod.Entry
import typings.contentfulManagement.entryMod.EntryProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofentry extends js.Object {
  
  def wrapEntry(http: AxiosInstance, data: EntryProp): Entry = js.native
  
  def wrapEntryCollection(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp] = js.native
}
object Typeofentry {
  
  @scala.inline
  def apply(
    wrapEntry: (AxiosInstance, EntryProp) => Entry,
    wrapEntryCollection: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]
  ): Typeofentry = {
    val __obj = js.Dynamic.literal(wrapEntry = js.Any.fromFunction2(wrapEntry), wrapEntryCollection = js.Any.fromFunction2(wrapEntryCollection))
    __obj.asInstanceOf[Typeofentry]
  }
  
  @scala.inline
  implicit class TypeofentryOps[Self <: Typeofentry] (val x: Self) extends AnyVal {
    
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
    def setWrapEntry(value: (AxiosInstance, EntryProp) => Entry): Self = this.set("wrapEntry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEntryCollection(value: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]): Self = this.set("wrapEntryCollection", js.Any.fromFunction2(value))
  }
}
