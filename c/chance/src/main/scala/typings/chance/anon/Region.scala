package typings.chance.anon

import typings.chance.chanceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends StObject {
  
  var region: `true` = js.native
}
object Region {
  
  @scala.inline
  def apply(region: `true`): Region = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegion(value: `true`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
