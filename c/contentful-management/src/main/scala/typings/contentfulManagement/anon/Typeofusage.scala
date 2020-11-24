package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.usageMod.Usage
import typings.contentfulManagement.usageMod.UsageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofusage extends js.Object {
  
  def wrapUsage(http: AxiosInstance, data: UsageProps): Usage = js.native
  
  def wrapUsageCollection(http: AxiosInstance, data: CollectionProp[UsageProps]): Collection[Usage, UsageProps] = js.native
}
object Typeofusage {
  
  @scala.inline
  def apply(
    wrapUsage: (AxiosInstance, UsageProps) => Usage,
    wrapUsageCollection: (AxiosInstance, CollectionProp[UsageProps]) => Collection[Usage, UsageProps]
  ): Typeofusage = {
    val __obj = js.Dynamic.literal(wrapUsage = js.Any.fromFunction2(wrapUsage), wrapUsageCollection = js.Any.fromFunction2(wrapUsageCollection))
    __obj.asInstanceOf[Typeofusage]
  }
  
  @scala.inline
  implicit class TypeofusageOps[Self <: Typeofusage] (val x: Self) extends AnyVal {
    
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
    def setWrapUsage(value: (AxiosInstance, UsageProps) => Usage): Self = this.set("wrapUsage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapUsageCollection(value: (AxiosInstance, CollectionProp[UsageProps]) => Collection[Usage, UsageProps]): Self = this.set("wrapUsageCollection", js.Any.fromFunction2(value))
  }
}
