package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.appInstallationMod.AppInstallation
import typings.contentfulManagement.appInstallationMod.AppInstallationProps
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappInstallation extends js.Object {
  
  def wrapAppInstallation(http: AxiosInstance, data: AppInstallationProps): AppInstallation = js.native
  
  def wrapAppInstallationCollection(http: AxiosInstance, data: CollectionProp[AppInstallationProps]): Collection[AppInstallation, AppInstallationProps] = js.native
}
object TypeofappInstallation {
  
  @scala.inline
  def apply(
    wrapAppInstallation: (AxiosInstance, AppInstallationProps) => AppInstallation,
    wrapAppInstallationCollection: (AxiosInstance, CollectionProp[AppInstallationProps]) => Collection[AppInstallation, AppInstallationProps]
  ): TypeofappInstallation = {
    val __obj = js.Dynamic.literal(wrapAppInstallation = js.Any.fromFunction2(wrapAppInstallation), wrapAppInstallationCollection = js.Any.fromFunction2(wrapAppInstallationCollection))
    __obj.asInstanceOf[TypeofappInstallation]
  }
  
  @scala.inline
  implicit class TypeofappInstallationOps[Self <: TypeofappInstallation] (val x: Self) extends AnyVal {
    
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
    def setWrapAppInstallation(value: (AxiosInstance, AppInstallationProps) => AppInstallation): Self = this.set("wrapAppInstallation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapAppInstallationCollection(
      value: (AxiosInstance, CollectionProp[AppInstallationProps]) => Collection[AppInstallation, AppInstallationProps]
    ): Self = this.set("wrapAppInstallationCollection", js.Any.fromFunction2(value))
  }
}
