package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XContentfulVersion extends StObject {
  
  var `X-Contentful-Version`: js.UndefOr[Double] = js.undefined
}
object XContentfulVersion {
  
  inline def apply(): XContentfulVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XContentfulVersion]
  }
  
  extension [Self <: XContentfulVersion](x: Self) {
    
    inline def `setX-Contentful-Version`(value: Double): Self = StObject.set(x, "X-Contentful-Version", value.asInstanceOf[js.Any])
    
    inline def `setX-Contentful-VersionUndefined`: Self = StObject.set(x, "X-Contentful-Version", js.undefined)
  }
}
