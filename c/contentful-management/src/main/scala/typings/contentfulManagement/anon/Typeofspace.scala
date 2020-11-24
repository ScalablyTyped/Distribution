package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMod.Space
import typings.contentfulManagement.spaceMod.SpaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofspace extends js.Object {
  
  def wrapSpace(http: AxiosInstance, data: SpaceProps): Space = js.native
  
  def wrapSpaceCollection(http: AxiosInstance, data: CollectionProp[SpaceProps]): Collection[Space, SpaceProps] = js.native
}
object Typeofspace {
  
  @scala.inline
  def apply(
    wrapSpace: (AxiosInstance, SpaceProps) => Space,
    wrapSpaceCollection: (AxiosInstance, CollectionProp[SpaceProps]) => Collection[Space, SpaceProps]
  ): Typeofspace = {
    val __obj = js.Dynamic.literal(wrapSpace = js.Any.fromFunction2(wrapSpace), wrapSpaceCollection = js.Any.fromFunction2(wrapSpaceCollection))
    __obj.asInstanceOf[Typeofspace]
  }
  
  @scala.inline
  implicit class TypeofspaceOps[Self <: Typeofspace] (val x: Self) extends AnyVal {
    
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
    def setWrapSpace(value: (AxiosInstance, SpaceProps) => Space): Self = this.set("wrapSpace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceCollection(value: (AxiosInstance, CollectionProp[SpaceProps]) => Collection[Space, SpaceProps]): Self = this.set("wrapSpaceCollection", js.Any.fromFunction2(value))
  }
}
