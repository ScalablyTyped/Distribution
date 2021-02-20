package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaInfo extends StObject {
  
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[String] = js.native
}
object IPanoramaInfo {
  
  @scala.inline
  def apply(): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaInfo]
  }
  
  @scala.inline
  implicit class IPanoramaInfoMutableBuilder[Self <: IPanoramaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCd(value: String): Self = StObject.set(x, "cd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdUndefined: Self = StObject.set(x, "cd", js.undefined)
  }
}
