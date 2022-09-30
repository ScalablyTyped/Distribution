package typings.dbStations

import typings.dbStations.dbStationsInts.`1`
import typings.dbStations.dbStationsInts.`2`
import typings.dbStations.dbStationsInts.`3`
import typings.dbStations.dbStationsInts.`4`
import typings.dbStations.dbStationsInts.`5`
import typings.dbStations.dbStationsInts.`6`
import typings.dbStations.dbStationsInts.`7`
import typings.dbStations.dbStationsStrings.data
import typings.dbStations.dbStationsStrings.location
import typings.dbStations.dbStationsStrings.no
import typings.dbStations.dbStationsStrings.operator
import typings.dbStations.dbStationsStrings.partial
import typings.dbStations.dbStationsStrings.station
import typings.dbStations.dbStationsStrings.yes
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A collection of all stations of [Deutsche Bahn](http://db.de/), computed from
    * [open data](https://developer.deutschebahn.com/store/apis/info?name=StaDa-Station_Data&version=v2&provider=DBOpenData).
    *
    * @returns A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) in
    * [object mode](https://nodejs.org/api/stream.html#stream_object_mode), emitting
    * [*Friendly Public Transport Format*](https://github.com/public-transport/friendly-public-transport-format)
    * `station` objects.
    *
    * @example
    * import stations = require('db-stations')
    *
    * stations()
    *   .on('data', console.log)
    *   .on('error', console.error)
    * // =>
    * // {
    * //   type: 'station',
    * //   id: '8000007', // EVA number
    * //   ril100: 'FALZ', // RIL100/RL100/DS100 code
    * //   nr: 133, // DB internal
    * //   name: 'Alzey',
    * //   weight: 73.1,
    * //   location: {
    * //     type: 'location',
    * //     latitude: 49.7502,
    * //     longitude: 8.109749
    * //   },
    * //   operator: {
    * //     type: 'operator',
    * //     id: 'zweckverband-schienenpersonennahverkehr-rheinland-pfalz-sud',
    * //     name: 'ZPNV Süd'
    * //   },
    * //   address: {
    * //     city: 'Alzey',
    * //     zipcode: '55232',
    * //     street: 'Bahnhofstr. 30'
    * //   }
    * // }
    */
  inline def apply(): ReadableStations[Station] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReadableStations[Station]]
  
  @JSImport("db-stations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @returns A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) in
    * [object mode](https://nodejs.org/api/stream.html#stream_object_mode), emitting
    * [*Friendly Public Transport Format*](https://github.com/public-transport/friendly-public-transport-format)
    * `station` objects with more information.
    *
    * @example
    * import stations = require('db-stations')
    *
    * stations.full()
    *   .on('data', console.log)
    *   .on('error', console.error)
    * // =>
    * // {
    * //   type: 'station',
    * //   id: '8000007',
    * //   additionalIds: [],
    * //   ril100: 'FALZ',
    * //   nr: 133,
    * //   name: 'Alzey',
    * //   weight: 73.1,
    * //   location: {
    * //     type: 'location',
    * //     latitude: 49.7502,
    * //     longitude: 8.109749
    * //   },
    * //   operator: {
    * //     type: 'operator',
    * //     id: 'zweckverband-schienenpersonennahverkehr-rheinland-pfalz-sud',
    * //     name: 'ZPNV Süd'
    * //   },
    * //   address: {
    * //     city: 'Alzey',
    * //     zipcode: '55232',
    * //     street: 'Bahnhofstr. 30'
    * //   },
    * //   category: 3,
    * //   priceCategory: 3,
    * //   hasParking: true,
    * //   hasBicycleParking: true,
    * //   hasLocalPublicTransport: true,
    * //   hasPublicFacilities: false,
    * //   hasLockerSystem: false,
    * //   hasTaxiRank: true,
    * //   hasTravelNecessities: false,
    * //   hasSteplessAccess: 'partial',
    * //   hasMobilityService: 'no',
    * //   hasWiFi: false,
    * //   hasTravelCenter: false,
    * //   hasRailwayMission: false,
    * //   hasDBLounge: false,
    * //   hasLostAndFound: false,
    * //   hasCarRental: false,
    * //   federalState: 'Rheinland-Pfalz',
    * //   regionalbereich: {
    * //     number: 5,
    * //     name: 'RB Mitte',
    * //     shortName: 'RB M'
    * //   },
    * //   timeTableOffice: {
    * //     email: 'DBS.Fahrplan.RhldPfalzSaarland@deutschebahn.com',
    * //     name: 'Bahnhofsmanagement Mainz'
    * //   },
    * //   szentrale: {
    * //     number: 24,
    * //     publicPhoneNumber: '06131/151055',
    * //     name: 'Mainz Hbf'
    * //   },
    * //   stationManagement: {
    * //     number: 184,
    * //     name: 'Mainz'
    * //   },
    * //   ril100Identifiers: [ {
    * //     rilIdentifier: 'FALZ',
    * //     isMain: true,
    * //     hasSteamPermission: true,
    * //     geographicCoordinates: {
    * //       type: 'Point',
    * //       coordinates: [
    * //         8.109684725,
    * //         49.750267695
    * //       ]
    * //     }
    * //   } ]
    * // }
    */
  inline def full(): ReadableStations[StationFull] = ^.asInstanceOf[js.Dynamic].applyDynamic("full")().asInstanceOf[ReadableStations[StationFull]]
  
  trait Address extends StObject {
    
    var city: String
    
    var street: String
    
    var zipcode: String
  }
  object Address {
    
    inline def apply(city: String, street: String, zipcode: String): Address = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dbStations.dbStationsStrings.`Baden-Württemberg`
    - typings.dbStations.dbStationsStrings.Bayern
    - typings.dbStations.dbStationsStrings.Berlin
    - typings.dbStations.dbStationsStrings.Brandenburg
    - typings.dbStations.dbStationsStrings.Bremen
    - typings.dbStations.dbStationsStrings.Hamburg
    - typings.dbStations.dbStationsStrings.Hessen
    - typings.dbStations.dbStationsStrings.`Mecklenburg-Vorpommern`
    - typings.dbStations.dbStationsStrings.Niedersachsen
    - typings.dbStations.dbStationsStrings.`Nordrhein-Westfalen`
    - typings.dbStations.dbStationsStrings.`Rheinland-Pfalz`
    - typings.dbStations.dbStationsStrings.Saarland
    - typings.dbStations.dbStationsStrings.Sachsen
    - typings.dbStations.dbStationsStrings.`Sachsen-Anhalt`
    - typings.dbStations.dbStationsStrings.`Schleswig-Holstein`
    - typings.dbStations.dbStationsStrings.Thüringen
  */
  trait FederalState extends StObject
  object FederalState {
    
    inline def `Baden-Württemberg`: typings.dbStations.dbStationsStrings.`Baden-Württemberg` = "Baden-W\u00FCrttemberg".asInstanceOf[typings.dbStations.dbStationsStrings.`Baden-Württemberg`]
    
    inline def Bayern: typings.dbStations.dbStationsStrings.Bayern = "Bayern".asInstanceOf[typings.dbStations.dbStationsStrings.Bayern]
    
    inline def Berlin: typings.dbStations.dbStationsStrings.Berlin = "Berlin".asInstanceOf[typings.dbStations.dbStationsStrings.Berlin]
    
    inline def Brandenburg: typings.dbStations.dbStationsStrings.Brandenburg = "Brandenburg".asInstanceOf[typings.dbStations.dbStationsStrings.Brandenburg]
    
    inline def Bremen: typings.dbStations.dbStationsStrings.Bremen = "Bremen".asInstanceOf[typings.dbStations.dbStationsStrings.Bremen]
    
    inline def Hamburg: typings.dbStations.dbStationsStrings.Hamburg = "Hamburg".asInstanceOf[typings.dbStations.dbStationsStrings.Hamburg]
    
    inline def Hessen: typings.dbStations.dbStationsStrings.Hessen = "Hessen".asInstanceOf[typings.dbStations.dbStationsStrings.Hessen]
    
    inline def `Mecklenburg-Vorpommern`: typings.dbStations.dbStationsStrings.`Mecklenburg-Vorpommern` = "Mecklenburg-Vorpommern".asInstanceOf[typings.dbStations.dbStationsStrings.`Mecklenburg-Vorpommern`]
    
    inline def Niedersachsen: typings.dbStations.dbStationsStrings.Niedersachsen = "Niedersachsen".asInstanceOf[typings.dbStations.dbStationsStrings.Niedersachsen]
    
    inline def `Nordrhein-Westfalen`: typings.dbStations.dbStationsStrings.`Nordrhein-Westfalen` = "Nordrhein-Westfalen".asInstanceOf[typings.dbStations.dbStationsStrings.`Nordrhein-Westfalen`]
    
    inline def `Rheinland-Pfalz`: typings.dbStations.dbStationsStrings.`Rheinland-Pfalz` = "Rheinland-Pfalz".asInstanceOf[typings.dbStations.dbStationsStrings.`Rheinland-Pfalz`]
    
    inline def Saarland: typings.dbStations.dbStationsStrings.Saarland = "Saarland".asInstanceOf[typings.dbStations.dbStationsStrings.Saarland]
    
    inline def Sachsen: typings.dbStations.dbStationsStrings.Sachsen = "Sachsen".asInstanceOf[typings.dbStations.dbStationsStrings.Sachsen]
    
    inline def `Sachsen-Anhalt`: typings.dbStations.dbStationsStrings.`Sachsen-Anhalt` = "Sachsen-Anhalt".asInstanceOf[typings.dbStations.dbStationsStrings.`Sachsen-Anhalt`]
    
    inline def `Schleswig-Holstein`: typings.dbStations.dbStationsStrings.`Schleswig-Holstein` = "Schleswig-Holstein".asInstanceOf[typings.dbStations.dbStationsStrings.`Schleswig-Holstein`]
    
    inline def Thüringen: typings.dbStations.dbStationsStrings.Thüringen = "Th\u00FCringen".asInstanceOf[typings.dbStations.dbStationsStrings.Thüringen]
  }
  
  trait Location extends StObject {
    
    var latitude: Double
    
    var longitude: Double
    
    var `type`: location
  }
  object Location {
    
    inline def apply(latitude: Double, longitude: Double): Location = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("location")
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setType(value: location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Operator extends StObject {
    
    var id: String
    
    var name: String
    
    var `type`: operator
  }
  object Operator {
    
    inline def apply(id: String, name: String): Operator = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("operator")
      __obj.asInstanceOf[Operator]
    }
    
    extension [Self <: Operator](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var coordinates: js.Tuple2[Double, Double]
    
    var `type`: typings.dbStations.dbStationsStrings.Point
  }
  object Point {
    
    inline def apply(coordinates: js.Tuple2[Double, Double]): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setType(value: typings.dbStations.dbStationsStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.dbStations.anon.Name
    - typings.dbStations.anon.Number
    - typings.dbStations.anon.ShortName
    - typings.dbStations.anon.NameNumber
    - typings.dbStations.anon.NumberShortName
    - typings.dbStations.anon.NameNumberShortName
    - typings.dbStations.anon.`0`
  */
  trait Regionalbereich extends StObject
  object Regionalbereich {
    
    inline def `0`(): typings.dbStations.anon.`0` = {
      val __obj = js.Dynamic.literal(name = "RB S\u00FCd", number = 7, shortName = "RB S\u00FCd")
      __obj.asInstanceOf[typings.dbStations.anon.`0`]
    }
    
    inline def Name(): typings.dbStations.anon.Name = {
      val __obj = js.Dynamic.literal(name = "RB Ost", number = 1, shortName = "RB Ost")
      __obj.asInstanceOf[typings.dbStations.anon.Name]
    }
    
    inline def NameNumber(): typings.dbStations.anon.NameNumber = {
      val __obj = js.Dynamic.literal(name = "RB West", number = 4, shortName = "RB West")
      __obj.asInstanceOf[typings.dbStations.anon.NameNumber]
    }
    
    inline def NameNumberShortName(): typings.dbStations.anon.NameNumberShortName = {
      val __obj = js.Dynamic.literal(name = "RB S\u00FCdwest", number = 6, shortName = "RB S\u00FCdwest")
      __obj.asInstanceOf[typings.dbStations.anon.NameNumberShortName]
    }
    
    inline def Number(): typings.dbStations.anon.Number = {
      val __obj = js.Dynamic.literal(name = "RB S\u00FCdost", number = 2, shortName = "RB S\u00FCdost")
      __obj.asInstanceOf[typings.dbStations.anon.Number]
    }
    
    inline def NumberShortName(): typings.dbStations.anon.NumberShortName = {
      val __obj = js.Dynamic.literal(name = "RB Mitte", number = 5, shortName = "RB Mitte")
      __obj.asInstanceOf[typings.dbStations.anon.NumberShortName]
    }
    
    inline def ShortName(): typings.dbStations.anon.ShortName = {
      val __obj = js.Dynamic.literal(name = "RB Nord", number = 3, shortName = "RB Nord")
      __obj.asInstanceOf[typings.dbStations.anon.ShortName]
    }
  }
  
  trait Ril100Identifier extends StObject {
    
    var geographicCoordinates: Point
    
    var hasSteamPermission: Boolean
    
    var isMain: Boolean
    
    var rilIdentifier: String
  }
  object Ril100Identifier {
    
    inline def apply(geographicCoordinates: Point, hasSteamPermission: Boolean, isMain: Boolean, rilIdentifier: String): Ril100Identifier = {
      val __obj = js.Dynamic.literal(geographicCoordinates = geographicCoordinates.asInstanceOf[js.Any], hasSteamPermission = hasSteamPermission.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], rilIdentifier = rilIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ril100Identifier]
    }
    
    extension [Self <: Ril100Identifier](x: Self) {
      
      inline def setGeographicCoordinates(value: Point): Self = StObject.set(x, "geographicCoordinates", value.asInstanceOf[js.Any])
      
      inline def setHasSteamPermission(value: Boolean): Self = StObject.set(x, "hasSteamPermission", value.asInstanceOf[js.Any])
      
      inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
      
      inline def setRilIdentifier(value: String): Self = StObject.set(x, "rilIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait SZentrale extends StObject {
    
    var name: String
    
    var number: Double
    
    var publicPhoneNumber: String
  }
  object SZentrale {
    
    inline def apply(name: String, number: Double, publicPhoneNumber: String): SZentrale = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], publicPhoneNumber = publicPhoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[SZentrale]
    }
    
    extension [Self <: SZentrale](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPublicPhoneNumber(value: String): Self = StObject.set(x, "publicPhoneNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait Station extends StObject {
    
    var address: Address
    
    var id: String
    
    var location: Location
    
    var name: String
    
    var nr: Double
    
    var operator: Operator
    
    var ril100: String
    
    var `type`: station
    
    var weight: Double
  }
  object Station {
    
    inline def apply(
      address: Address,
      id: String,
      location: Location,
      name: String,
      nr: Double,
      operator: Operator,
      ril100: String,
      weight: Double
    ): Station = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nr = nr.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], ril100 = ril100.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("station")
      __obj.asInstanceOf[Station]
    }
    
    extension [Self <: Station](x: Self) {
      
      inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNr(value: Double): Self = StObject.set(x, "nr", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: Operator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setRil100(value: String): Self = StObject.set(x, "ril100", value.asInstanceOf[js.Any])
      
      inline def setType(value: station): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait StationFull
    extends StObject
       with Station {
    
    var additionalIds: js.Array[String]
    
    var category: `1` | `2` | `3` | `4` | `5` | `6` | `7`
    
    var federalState: FederalState
    
    var hasBicycleParking: Boolean
    
    var hasCarRental: Boolean
    
    var hasDBLounge: Boolean
    
    var hasLocalPublicTransport: Boolean
    
    var hasLockerSystem: Boolean
    
    var hasLostAndFound: Boolean
    
    var hasMobilityService: no | String
    
    var hasParking: Boolean
    
    var hasPublicFacilities: Boolean
    
    var hasRailwayMission: Boolean
    
    var hasSteplessAccess: no | yes | partial
    
    var hasTaxiRank: Boolean
    
    var hasTravelCenter: Boolean
    
    var hasTravelNecessities: Boolean
    
    var hasWiFi: Boolean
    
    var priceCategory: `1` | `2` | `3` | `4` | `5` | `6` | `7`
    
    var regionalbereich: Regionalbereich
    
    var ril100Identifiers: js.Array[Ril100Identifier]
    
    var stationManagement: StationManagement
    
    var szentrale: SZentrale
    
    var timeTableOffice: TimeTableOffice
  }
  object StationFull {
    
    inline def apply(
      additionalIds: js.Array[String],
      address: Address,
      category: `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      federalState: FederalState,
      hasBicycleParking: Boolean,
      hasCarRental: Boolean,
      hasDBLounge: Boolean,
      hasLocalPublicTransport: Boolean,
      hasLockerSystem: Boolean,
      hasLostAndFound: Boolean,
      hasMobilityService: no | String,
      hasParking: Boolean,
      hasPublicFacilities: Boolean,
      hasRailwayMission: Boolean,
      hasSteplessAccess: no | yes | partial,
      hasTaxiRank: Boolean,
      hasTravelCenter: Boolean,
      hasTravelNecessities: Boolean,
      hasWiFi: Boolean,
      id: String,
      location: Location,
      name: String,
      nr: Double,
      operator: Operator,
      priceCategory: `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      regionalbereich: Regionalbereich,
      ril100: String,
      ril100Identifiers: js.Array[Ril100Identifier],
      stationManagement: StationManagement,
      szentrale: SZentrale,
      timeTableOffice: TimeTableOffice,
      weight: Double
    ): StationFull = {
      val __obj = js.Dynamic.literal(additionalIds = additionalIds.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], federalState = federalState.asInstanceOf[js.Any], hasBicycleParking = hasBicycleParking.asInstanceOf[js.Any], hasCarRental = hasCarRental.asInstanceOf[js.Any], hasDBLounge = hasDBLounge.asInstanceOf[js.Any], hasLocalPublicTransport = hasLocalPublicTransport.asInstanceOf[js.Any], hasLockerSystem = hasLockerSystem.asInstanceOf[js.Any], hasLostAndFound = hasLostAndFound.asInstanceOf[js.Any], hasMobilityService = hasMobilityService.asInstanceOf[js.Any], hasParking = hasParking.asInstanceOf[js.Any], hasPublicFacilities = hasPublicFacilities.asInstanceOf[js.Any], hasRailwayMission = hasRailwayMission.asInstanceOf[js.Any], hasSteplessAccess = hasSteplessAccess.asInstanceOf[js.Any], hasTaxiRank = hasTaxiRank.asInstanceOf[js.Any], hasTravelCenter = hasTravelCenter.asInstanceOf[js.Any], hasTravelNecessities = hasTravelNecessities.asInstanceOf[js.Any], hasWiFi = hasWiFi.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nr = nr.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], priceCategory = priceCategory.asInstanceOf[js.Any], regionalbereich = regionalbereich.asInstanceOf[js.Any], ril100 = ril100.asInstanceOf[js.Any], ril100Identifiers = ril100Identifiers.asInstanceOf[js.Any], stationManagement = stationManagement.asInstanceOf[js.Any], szentrale = szentrale.asInstanceOf[js.Any], timeTableOffice = timeTableOffice.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("station")
      __obj.asInstanceOf[StationFull]
    }
    
    extension [Self <: StationFull](x: Self) {
      
      inline def setAdditionalIds(value: js.Array[String]): Self = StObject.set(x, "additionalIds", value.asInstanceOf[js.Any])
      
      inline def setAdditionalIdsVarargs(value: String*): Self = StObject.set(x, "additionalIds", js.Array(value*))
      
      inline def setCategory(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setFederalState(value: FederalState): Self = StObject.set(x, "federalState", value.asInstanceOf[js.Any])
      
      inline def setHasBicycleParking(value: Boolean): Self = StObject.set(x, "hasBicycleParking", value.asInstanceOf[js.Any])
      
      inline def setHasCarRental(value: Boolean): Self = StObject.set(x, "hasCarRental", value.asInstanceOf[js.Any])
      
      inline def setHasDBLounge(value: Boolean): Self = StObject.set(x, "hasDBLounge", value.asInstanceOf[js.Any])
      
      inline def setHasLocalPublicTransport(value: Boolean): Self = StObject.set(x, "hasLocalPublicTransport", value.asInstanceOf[js.Any])
      
      inline def setHasLockerSystem(value: Boolean): Self = StObject.set(x, "hasLockerSystem", value.asInstanceOf[js.Any])
      
      inline def setHasLostAndFound(value: Boolean): Self = StObject.set(x, "hasLostAndFound", value.asInstanceOf[js.Any])
      
      inline def setHasMobilityService(value: no | String): Self = StObject.set(x, "hasMobilityService", value.asInstanceOf[js.Any])
      
      inline def setHasParking(value: Boolean): Self = StObject.set(x, "hasParking", value.asInstanceOf[js.Any])
      
      inline def setHasPublicFacilities(value: Boolean): Self = StObject.set(x, "hasPublicFacilities", value.asInstanceOf[js.Any])
      
      inline def setHasRailwayMission(value: Boolean): Self = StObject.set(x, "hasRailwayMission", value.asInstanceOf[js.Any])
      
      inline def setHasSteplessAccess(value: no | yes | partial): Self = StObject.set(x, "hasSteplessAccess", value.asInstanceOf[js.Any])
      
      inline def setHasTaxiRank(value: Boolean): Self = StObject.set(x, "hasTaxiRank", value.asInstanceOf[js.Any])
      
      inline def setHasTravelCenter(value: Boolean): Self = StObject.set(x, "hasTravelCenter", value.asInstanceOf[js.Any])
      
      inline def setHasTravelNecessities(value: Boolean): Self = StObject.set(x, "hasTravelNecessities", value.asInstanceOf[js.Any])
      
      inline def setHasWiFi(value: Boolean): Self = StObject.set(x, "hasWiFi", value.asInstanceOf[js.Any])
      
      inline def setPriceCategory(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "priceCategory", value.asInstanceOf[js.Any])
      
      inline def setRegionalbereich(value: Regionalbereich): Self = StObject.set(x, "regionalbereich", value.asInstanceOf[js.Any])
      
      inline def setRil100Identifiers(value: js.Array[Ril100Identifier]): Self = StObject.set(x, "ril100Identifiers", value.asInstanceOf[js.Any])
      
      inline def setRil100IdentifiersVarargs(value: Ril100Identifier*): Self = StObject.set(x, "ril100Identifiers", js.Array(value*))
      
      inline def setStationManagement(value: StationManagement): Self = StObject.set(x, "stationManagement", value.asInstanceOf[js.Any])
      
      inline def setSzentrale(value: SZentrale): Self = StObject.set(x, "szentrale", value.asInstanceOf[js.Any])
      
      inline def setTimeTableOffice(value: TimeTableOffice): Self = StObject.set(x, "timeTableOffice", value.asInstanceOf[js.Any])
    }
  }
  
  trait StationManagement extends StObject {
    
    var name: String
    
    var number: Double
  }
  object StationManagement {
    
    inline def apply(name: String, number: Double): StationManagement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[StationManagement]
    }
    
    extension [Self <: StationManagement](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTableOffice extends StObject {
    
    var email: String
    
    var name: String
  }
  object TimeTableOffice {
    
    inline def apply(email: String, name: String): TimeTableOffice = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableOffice]
    }
    
    extension [Self <: TimeTableOffice](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
