package typings.dbHafasStations

import typings.dbHafasStations.dbHafasStationsStrings.data
import typings.dbHafasStations.dbHafasStationsStrings.location
import typings.dbHafasStations.dbHafasStationsStrings.station
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * All [*Deutsche Bahn* (DB)](https://en.wikipedia.org/wiki/Deutsche_Bahn) stations returned by
    * [their HAFAS API](https://github.com/public-transport/hafas-client/tree/2ec079adfc8a3d988190491b7e07dc03826b719e/p/db),
    * currently about 299k.
    *
    * @return A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) in
    * [object mode](https://nodejs.org/api/stream.html#stream_object_mode), emitting
    * [*Friendly Public Transport Format*](https://github.com/public-transport/friendly-public-transport-format)
    * `station` objects read from `db-hafas-stations/data.ndjson` (~13mb).
    *
    * @example
    * import stations = require('db-hafas-stations')
    *
    * stations()
    *   .on('data', console.log)
    *   .on('error', console.error)
    * // =>
    * // {
    * //   type: 'station',
    * //   id: '8000007',
    * //   name: 'Alzey',
    * //   weight: 73.1
    * // }
    */
  inline def apply(): ReadableStations[Station] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadableStations[Station]]
  
  @JSImport("db-hafas-stations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) in
    * [object mode](https://nodejs.org/api/stream.html#stream_object_mode), emitting
    * [*Friendly Public Transport Format*](https://github.com/public-transport/friendly-public-transport-format)
    * `station` objects read from `db-hafas-stations/full.ndjson` (~120mb).
    *
    * @example
    * import stations = require('db-hafas-stations')
    *
    * stations.full()
    *   .on('data', console.log)
    *   .on('error', console.error)
    * // =>
    * // {
    * //   type: 'station',
    * //   id: '8702510',
    * //   name: 'Franois',
    * //   location: {
    * //     type: 'location',
    * //     id: '8702510',
    * //     latitude: 47.22741,
    * //     longitude: 5.937384
    * //   },
    * //   products: {
    * //     nationalExpress: false,
    * //     national: false,
    * //     regionalExp: false,
    * //     regional: true,
    * //     suburban: false,
    * //     bus: true,
    * //     ferry: false,
    * //     subway: false,
    * //     tram: false,
    * //     taxi: false
    * //   },
    * //   distance: 3334,
    * //   weight: 1.2
    * // }
    */
  inline def full(): ReadableStations[StationFull] = ^.asInstanceOf[js.Dynamic].applyDynamic("full")().asInstanceOf[ReadableStations[StationFull]]
  
  trait Location extends StObject {
    
    var id: String
    
    var latitude: Double
    
    var longitude: Double
    
    var `type`: location
  }
  object Location {
    
    inline def apply(id: String, latitude: Double, longitude: Double): Location = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("location")
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setType(value: location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Products extends StObject {
    
    var bus: Boolean
    
    var ferry: Boolean
    
    var national: Boolean
    
    var nationalExpress: Boolean
    
    var regional: Boolean
    
    var regionalExp: Boolean
    
    var suburban: Boolean
    
    var subway: Boolean
    
    var taxi: Boolean
    
    var tram: Boolean
  }
  object Products {
    
    inline def apply(
      bus: Boolean,
      ferry: Boolean,
      national: Boolean,
      nationalExpress: Boolean,
      regional: Boolean,
      regionalExp: Boolean,
      suburban: Boolean,
      subway: Boolean,
      taxi: Boolean,
      tram: Boolean
    ): Products = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], ferry = ferry.asInstanceOf[js.Any], national = national.asInstanceOf[js.Any], nationalExpress = nationalExpress.asInstanceOf[js.Any], regional = regional.asInstanceOf[js.Any], regionalExp = regionalExp.asInstanceOf[js.Any], suburban = suburban.asInstanceOf[js.Any], subway = subway.asInstanceOf[js.Any], taxi = taxi.asInstanceOf[js.Any], tram = tram.asInstanceOf[js.Any])
      __obj.asInstanceOf[Products]
    }
    
    extension [Self <: Products](x: Self) {
      
      inline def setBus(value: Boolean): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      inline def setFerry(value: Boolean): Self = StObject.set(x, "ferry", value.asInstanceOf[js.Any])
      
      inline def setNational(value: Boolean): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
      
      inline def setNationalExpress(value: Boolean): Self = StObject.set(x, "nationalExpress", value.asInstanceOf[js.Any])
      
      inline def setRegional(value: Boolean): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
      
      inline def setRegionalExp(value: Boolean): Self = StObject.set(x, "regionalExp", value.asInstanceOf[js.Any])
      
      inline def setSuburban(value: Boolean): Self = StObject.set(x, "suburban", value.asInstanceOf[js.Any])
      
      inline def setSubway(value: Boolean): Self = StObject.set(x, "subway", value.asInstanceOf[js.Any])
      
      inline def setTaxi(value: Boolean): Self = StObject.set(x, "taxi", value.asInstanceOf[js.Any])
      
      inline def setTram(value: Boolean): Self = StObject.set(x, "tram", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadableStations[TStation /* <: Station */] extends Readable {
    
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_data(event: data, station: TStation): Boolean = js.native
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
    
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* station */ TStation, Unit]): this.type = js.native
  }
  
  trait Station extends StObject {
    
    var id: String
    
    var name: String
    
    var `type`: station
    
    var weight: Double
  }
  object Station {
    
    inline def apply(id: String, name: String, weight: Double): Station = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("station")
      __obj.asInstanceOf[Station]
    }
    
    extension [Self <: Station](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: station): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait StationFull
    extends StObject
       with Station {
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var location: Location
    
    var products: Products
  }
  object StationFull {
    
    inline def apply(id: String, location: Location, name: String, products: Products, weight: Double): StationFull = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("station")
      __obj.asInstanceOf[StationFull]
    }
    
    extension [Self <: StationFull](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    }
  }
}
