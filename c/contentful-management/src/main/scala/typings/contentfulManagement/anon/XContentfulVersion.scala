package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XContentfulVersion extends js.Object {
  
  var `X-Contentful-Version`: js.UndefOr[Double] = js.native
}
object XContentfulVersion {
  
  @scala.inline
  def apply(): XContentfulVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XContentfulVersion]
  }
  
  @scala.inline
  implicit class XContentfulVersionOps[Self <: XContentfulVersion] (val x: Self) extends AnyVal {
    
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
    def `setX-Contentful-Version`(value: Double): Self = this.set("X-Contentful-Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-Contentful-Version`: Self = this.set("X-Contentful-Version", js.undefined)
  }
}
