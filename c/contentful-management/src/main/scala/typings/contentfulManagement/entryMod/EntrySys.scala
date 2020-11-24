package typings.contentfulManagement.entryMod

import typings.contentfulManagement.anon.Sys
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntrySys extends MetaSysProps {
  
  var contentType: Sys = js.native
  
  var environment: Sys = js.native
  
  var firstPublishedAt: js.UndefOr[String] = js.native
  
  var publishedAt: js.UndefOr[String] = js.native
  
  var publishedBy: js.UndefOr[Sys] = js.native
  
  var publishedCounter: js.UndefOr[Double] = js.native
}
object EntrySys {
  
  @scala.inline
  def apply(
    contentType: Sys,
    createdAt: String,
    environment: Sys,
    id: String,
    `type`: String,
    updatedAt: String,
    version: Double
  ): EntrySys = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntrySys]
  }
  
  @scala.inline
  implicit class EntrySysOps[Self <: EntrySys] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: Sys): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Sys): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPublishedAt(value: String): Self = this.set("firstPublishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstPublishedAt: Self = this.set("firstPublishedAt", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setPublishedBy(value: Sys): Self = this.set("publishedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedBy: Self = this.set("publishedBy", js.undefined)
    
    @scala.inline
    def setPublishedCounter(value: Double): Self = this.set("publishedCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedCounter: Self = this.set("publishedCounter", js.undefined)
  }
}
