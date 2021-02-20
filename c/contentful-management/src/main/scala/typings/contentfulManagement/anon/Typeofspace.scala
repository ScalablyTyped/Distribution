package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMod.Space
import typings.contentfulManagement.spaceMod.SpaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofspace extends StObject {
  
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
  implicit class TypeofspaceMutableBuilder[Self <: Typeofspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapSpace(value: (AxiosInstance, SpaceProps) => Space): Self = StObject.set(x, "wrapSpace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceCollection(value: (AxiosInstance, CollectionProp[SpaceProps]) => Collection[Space, SpaceProps]): Self = StObject.set(x, "wrapSpaceCollection", js.Any.fromFunction2(value))
  }
}
