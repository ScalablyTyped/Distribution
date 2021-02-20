package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaData extends StObject {
  
  var description: String = js.native
  
  var id: String = js.native
  
  var links: js.Array[PanoramaLink] = js.native
  
  var position: Point = js.native
  
  var tiles: PanoramaTileData = js.native
}
object PanoramaData {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    links: js.Array[PanoramaLink],
    position: Point,
    tiles: PanoramaTileData
  ): PanoramaData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaData]
  }
  
  @scala.inline
  implicit class PanoramaDataMutableBuilder[Self <: PanoramaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Array[PanoramaLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksVarargs(value: PanoramaLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiles(value: PanoramaTileData): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
  }
}
