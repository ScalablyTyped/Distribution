package typings.cesium

import typings.cesium.anon.ClampToGround
import typings.cesium.mod.GpxDataSource
import typings.std.Blob
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gpxDataSourceMod {
  
  @JSImport("cesium/Source/DataSources/GpxDataSource", JSImport.Default)
  @js.native
  open class default () extends GpxDataSource
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/GpxDataSource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Promise to a new instance loaded with the provided GPX data.
      * @param data - A url, parsed GPX document, or Blob containing binary GPX data.
      * @param [options] - An object with the following properties:
      * @param [options.clampToGround] - True if the symbols should be rendered at the same height as the terrain
      * @param [options.waypointImage] - Image to use for waypoint billboards.
      * @param [options.trackImage] - Image to use for track billboards.
      * @param [options.trackColor] - Color to use for track lines.
      * @param [options.routeColor] - Color to use for route lines.
      * @returns A promise that will resolve to a new GpxDataSource instance once the gpx is loaded.
      */
    inline def load(data: String): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
    inline def load(data: String, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
    inline def load(data: Blob): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
    inline def load(data: Blob, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
    inline def load(data: Document): js.Promise[GpxDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GpxDataSource]]
    inline def load(data: Document, options: ClampToGround): js.Promise[GpxDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GpxDataSource]]
  }
}
