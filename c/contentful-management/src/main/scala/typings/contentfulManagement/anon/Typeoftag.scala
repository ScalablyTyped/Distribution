package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.tagMod.Tag
import typings.contentfulManagement.tagMod.TagApi
import typings.contentfulManagement.tagMod.TagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoftag extends js.Object {
  
  def createDeleteTag(http: AxiosInstance): js.Function0[js.Promise[Unit]] = js.native
  
  def createUpdateTag(http: AxiosInstance): js.Function0[js.Promise[Tag]] = js.native
  
  def default(http: AxiosInstance): TagApi = js.native
  
  def wrapTag(http: AxiosInstance, data: TagProps): Tag = js.native
  
  def wrapTagCollection(http: AxiosInstance, data: CollectionProp[TagProps]): Collection[Tag, TagProps] = js.native
}
object Typeoftag {
  
  @scala.inline
  def apply(
    createDeleteTag: AxiosInstance => js.Function0[js.Promise[Unit]],
    createUpdateTag: AxiosInstance => js.Function0[js.Promise[Tag]],
    default: AxiosInstance => TagApi,
    wrapTag: (AxiosInstance, TagProps) => Tag,
    wrapTagCollection: (AxiosInstance, CollectionProp[TagProps]) => Collection[Tag, TagProps]
  ): Typeoftag = {
    val __obj = js.Dynamic.literal(createDeleteTag = js.Any.fromFunction1(createDeleteTag), createUpdateTag = js.Any.fromFunction1(createUpdateTag), default = js.Any.fromFunction1(default), wrapTag = js.Any.fromFunction2(wrapTag), wrapTagCollection = js.Any.fromFunction2(wrapTagCollection))
    __obj.asInstanceOf[Typeoftag]
  }
  
  @scala.inline
  implicit class TypeoftagOps[Self <: Typeoftag] (val x: Self) extends AnyVal {
    
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
    def setCreateDeleteTag(value: AxiosInstance => js.Function0[js.Promise[Unit]]): Self = this.set("createDeleteTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateUpdateTag(value: AxiosInstance => js.Function0[js.Promise[Tag]]): Self = this.set("createUpdateTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefault(value: AxiosInstance => TagApi): Self = this.set("default", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrapTag(value: (AxiosInstance, TagProps) => Tag): Self = this.set("wrapTag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapTagCollection(value: (AxiosInstance, CollectionProp[TagProps]) => Collection[Tag, TagProps]): Self = this.set("wrapTagCollection", js.Any.fromFunction2(value))
  }
}
