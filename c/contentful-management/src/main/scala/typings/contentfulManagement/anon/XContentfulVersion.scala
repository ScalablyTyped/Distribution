package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XContentfulVersion extends StObject {
  
  var `X-Contentful-Version`: js.UndefOr[Double] = js.native
}
object XContentfulVersion {
  
  @scala.inline
  def apply(): XContentfulVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XContentfulVersion]
  }
  
  @scala.inline
  implicit class XContentfulVersionMutableBuilder[Self <: XContentfulVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-Contentful-Version`(value: Double): Self = StObject.set(x, "X-Contentful-Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-Contentful-VersionUndefined`: Self = StObject.set(x, "X-Contentful-Version", js.undefined)
  }
}
