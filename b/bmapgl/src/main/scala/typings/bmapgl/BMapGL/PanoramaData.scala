package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaData extends StObject {
  
  var description: String
  
  var id: String
  
  var links: js.Array[PanoramaLink]
  
  var position: Point
  
  var tiles: PanoramaTileData
}
object PanoramaData {
  
  inline def apply(
    description: String,
    id: String,
    links: js.Array[PanoramaLink],
    position: Point,
    tiles: PanoramaTileData
  ): PanoramaData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaData]
  }
  
  extension [Self <: PanoramaData](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: js.Array[PanoramaLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: PanoramaLink*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTiles(value: PanoramaTileData): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
  }
}
