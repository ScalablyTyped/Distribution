package typings.cesium

import typings.cesium.mod.CzmlDataSource
import typings.cesium.mod.CzmlDataSource.LoadOptions
import typings.cesium.mod.CzmlDataSource.UpdaterFunction
import typings.cesium.mod.EntityCollection
import typings.cesium.mod.Resource
import typings.cesium.mod.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object czmlDataSourceMod {
  
  @JSImport("cesium/Source/DataSources/CzmlDataSource", JSImport.Default)
  @js.native
  open class default () extends CzmlDataSource {
    def this(name: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/CzmlDataSource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(czml: String): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
    inline def load(czml: String, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
    inline def load(czml: Any): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
    inline def load(czml: Any, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
    /**
      * Creates a Promise to a new instance loaded with the provided CZML data.
      * @param czml - A url or CZML object to be processed.
      * @param [options] - An object specifying configuration options
      * @returns A promise that resolves to the new instance once the data is processed.
      */
    inline def load(czml: Resource): js.Promise[CzmlDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CzmlDataSource]]
    inline def load(czml: Resource, options: LoadOptions): js.Promise[CzmlDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(czml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CzmlDataSource]]
    
    /**
      * A helper function used by custom CZML updater functions
      * which creates or updates a {@link MaterialProperty} from a CZML packet.
      * @param object - The object on which the property will be added or updated.
      * @param propertyName - The name of the property on the object.
      * @param packetData - The CZML packet being processed.
      * @param interval - A constraining interval for which the data is valid.
      * @param sourceUri - The originating uri of the data being processed.
      * @param entityCollection - The collection being processsed.
      */
    inline def processMaterialPacketData(
      `object`: Any,
      propertyName: String,
      packetData: Any,
      interval: TimeInterval,
      sourceUri: String,
      entityCollection: EntityCollection
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processMaterialPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A helper function used by custom CZML updater functions
      * which creates or updates a {@link Property} from a CZML packet.
      * @param type - The constructor function for the property being processed.
      * @param object - The object on which the property will be added or updated.
      * @param propertyName - The name of the property on the object.
      * @param packetData - The CZML packet being processed.
      * @param interval - A constraining interval for which the data is valid.
      * @param sourceUri - The originating uri of the data being processed.
      * @param entityCollection - The collection being processsed.
      */
    inline def processPacketData(
      `type`: js.Function1[/* repeated */ Any, Any],
      `object`: Any,
      propertyName: String,
      packetData: Any,
      interval: TimeInterval,
      sourceUri: String,
      entityCollection: EntityCollection
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPacketData")(`type`.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A helper function used by custom CZML updater functions
      * which creates or updates a {@link PositionProperty} from a CZML packet.
      * @param object - The object on which the property will be added or updated.
      * @param propertyName - The name of the property on the object.
      * @param packetData - The CZML packet being processed.
      * @param interval - A constraining interval for which the data is valid.
      * @param sourceUri - The originating uri of the data being processed.
      * @param entityCollection - The collection being processsed.
      */
    inline def processPositionPacketData(
      `object`: Any,
      propertyName: String,
      packetData: Any,
      interval: TimeInterval,
      sourceUri: String,
      entityCollection: EntityCollection
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("processPositionPacketData")(`object`.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], packetData.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], sourceUri.asInstanceOf[js.Any], entityCollection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Gets the array of CZML processing functions.
      */
    @JSImport("cesium/Source/DataSources/CzmlDataSource", "default.updaters")
    @js.native
    def updaters: js.Array[UpdaterFunction] = js.native
    inline def updaters_=(x: js.Array[UpdaterFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updaters")(x.asInstanceOf[js.Any])
  }
}
