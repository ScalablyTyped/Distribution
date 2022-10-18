package typings.cesium

import typings.cesium.mod.KmlDataSource
import typings.cesium.mod.KmlDataSource.ConstructorOptions
import typings.cesium.mod.Resource
import typings.std.Blob
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesKmlDataSourceMod {
  
  @JSImport("cesium/Source/DataSources/KmlDataSource", JSImport.Default)
  @js.native
  open class default () extends KmlDataSource {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/KmlDataSource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(data: String): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: String, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
    /**
      * Creates a Promise to a new instance loaded with the provided KML data.
      * @param data - A url, parsed KML document, or Blob containing binary KMZ data or a parsed KML document.
      * @param [options] - An object specifying configuration options
      * @returns A promise that will resolve to a new KmlDataSource instance once the KML is loaded.
      */
    inline def load(data: Resource): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: Resource, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: Blob): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: Blob, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: Document): js.Promise[KmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KmlDataSource]]
    inline def load(data: Document, options: ConstructorOptions): js.Promise[KmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KmlDataSource]]
  }
}
