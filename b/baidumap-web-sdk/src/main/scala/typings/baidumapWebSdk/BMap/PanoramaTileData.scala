package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaTileData extends StObject {
  
  var centerHeading: Double = js.native
  
  var tileSize: Size = js.native
  
  var worldSize: Size = js.native
}
object PanoramaTileData {
  
  @scala.inline
  def apply(centerHeading: Double, tileSize: Size, worldSize: Size): PanoramaTileData = {
    val __obj = js.Dynamic.literal(centerHeading = centerHeading.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], worldSize = worldSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaTileData]
  }
  
  @scala.inline
  implicit class PanoramaTileDataMutableBuilder[Self <: PanoramaTileData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterHeading(value: Double): Self = StObject.set(x, "centerHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileSize(value: Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldSize(value: Size): Self = StObject.set(x, "worldSize", value.asInstanceOf[js.Any])
  }
}
