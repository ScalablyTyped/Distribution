package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapElements extends js.Object {
  /** Admin1, state, province, etc. */
  var adminDistrict: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing the capital of a state/province. */
  var adminDistrictCapital: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land encompassing an airport. */
  var airport: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land use, not to be confused with Structure */
  var area: js.UndefOr[IMapElementStyle] = js.native
  /** An arterial road is a high-capacity urban road. Its primary function is to deliver traffic from collector roads to freeways or expressways, and between urban centers efficiently. */
  var arterialRoad: js.UndefOr[IMapElementStyle] = js.native
  /** A structure such as a house, store, factory. */
  var building: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, hospital, school, etc. */
  var business: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the capital populated place. */
  var capital: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a cemetery */
  var cemetery: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a whole continent */
  var continent: js.UndefOr[IMapElementStyle] = js.native
  /** A controlled-access highway is a type of road which has been designed for high-speed vehicular traffic, with all traffic flow and ingress/egress regulated. Also known as a highway, freeway, motorway, expressway, interstate, parkway. */
  var controlledAccessHighway: js.UndefOr[IMapElementStyle] = js.native
  /** A country or independent sovereign state. */
  var countryRegion: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing the capital of a country/region. */
  var countryRegionCapital: js.UndefOr[IMapElementStyle] = js.native
  /** Admin2, county, etc. */
  var district: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** An area of land used for educational purposes such as a school campus. */
  var education: js.UndefOr[IMapElementStyle] = js.native
  /** A school or other educational building. */
  var educationBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, caf�, etc. */
  var foodPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Area of forest land. */
  var forest: js.UndefOr[IMapElementStyle] = js.native
  /** An area of land where the game of golf is played. */
  var golfCourse: js.UndefOr[IMapElementStyle] = js.native
  /** Lines representing ramps typically alongside ControlledAccessHighways */
  var highSpeedRamp: js.UndefOr[IMapElementStyle] = js.native
  /** A highway. */
  var highway: js.UndefOr[IMapElementStyle] = js.native
  /** An area of land reserved for Indigenous people. */
  var indigenousPeoplesReserve: js.UndefOr[IMapElementStyle] = js.native
  /** Labeling of area of an island.  */
  var island: js.UndefOr[IMapElementStyle] = js.native
  /** Major roads. */
  var majorRoad: js.UndefOr[IMapElementStyle] = js.native
  /** The base map element in which all other map elements inherit from. */
  var mapElement: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land used for medical purposes. Generally, hospital campuses. */
  var medical: js.UndefOr[IMapElementStyle] = js.native
  /** A building which provides medical services. */
  var medicalBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** A military area. */
  var military: js.UndefOr[IMapElementStyle] = js.native
  /** A natural point of interest. */
  var naturalPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land used for nautical purposes. */
  var nautical: js.UndefOr[IMapElementStyle] = js.native
  /** Area defined as a neighborhood. Labels only. */
  var neighborhood: js.UndefOr[IMapElementStyle] = js.native
  /** Area of any kind of park. */
  var park: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the peak of a mountain. */
  var peak: js.UndefOr[IMapElementStyle] = js.native
  /** Extracted pitches such as a baseball field or tennis court. */
  var playingField: js.UndefOr[IMapElementStyle] = js.native
  /** All point features that are rendered with an icon of some sort */
  var point: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, hospital, school, marina, ski area, etc. */
  var pointOfInterest: js.UndefOr[IMapElementStyle] = js.native
  /** A political border. */
  var political: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing size of populated place (city, town, etc). */
  var populatedPlace: js.UndefOr[IMapElementStyle] = js.native
  /** Railway lines */
  var railway: js.UndefOr[IMapElementStyle] = js.native
  /** Line representing the connecting entrance/exit to a highway. */
  var ramp: js.UndefOr[IMapElementStyle] = js.native
  /** Area of nature reserve. */
  var reserve: js.UndefOr[IMapElementStyle] = js.native
  /** River, stream, or other passage. Note that this may be a line or polygon and may connect to non-river water bodies. */
  var river: js.UndefOr[IMapElementStyle] = js.native
  /** Lines that represent all roads */
  var road: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the exit, typically from a controlled access highway. */
  var roadExit: js.UndefOr[IMapElementStyle] = js.native
  /** Sign representing a compact name for a road. For example, I-5. */
  //roadShield?: IMapElementStyle;
  /** Land area covered by a runway. See also Airport for the land area of the whole airport. */
  var runway: js.UndefOr[IMapElementStyle] = js.native
  /** Area generally used for beaches, but could be used for sandy areas/golf bunkers in the future. */
  var sand: js.UndefOr[IMapElementStyle] = js.native
  /** A shopping center or mall. */
  var shoppingCenter: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a stadium. */
  var stadium: js.UndefOr[IMapElementStyle] = js.native
  /** A street. */
  var street: js.UndefOr[IMapElementStyle] = js.native
  /** Buildings and other building-like structures */
  var structure: js.UndefOr[IMapElementStyle] = js.native
  /** A toll road. */
  var tollRoad: js.UndefOr[IMapElementStyle] = js.native
  /** Walking trail, either through park or hiking trail */
  var trail: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing a bus stop, train stop, airport, etc. */
  var transit: js.UndefOr[IMapElementStyle] = js.native
  /** A transit building. */
  var transitBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** Lines that are part of the transportation network (roads, trains, ferries, etc) */
  var transportation: js.UndefOr[IMapElementStyle] = js.native
  /** An unpaved street. */
  var unpavedStreet: js.UndefOr[IMapElementStyle] = js.native
  /** Forests, grassy areas, etc. */
  var vegetation: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the peak of a volcano. */
  var volcanicPeak: js.UndefOr[IMapElementStyle] = js.native
  /** Anything that looks like water */
  var water: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing a water feature location such as a waterfall. */
  var waterPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Ferry route lines */
  var waterRoute: js.UndefOr[IMapElementStyle] = js.native
}

object IMapElements {
  @scala.inline
  def apply(): IMapElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapElements]
  }
  @scala.inline
  implicit class IMapElementsOps[Self <: IMapElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminDistrict(value: IBorderedMapElementStyle): Self = this.set("adminDistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminDistrict: Self = this.set("adminDistrict", js.undefined)
    @scala.inline
    def setAdminDistrictCapital(value: IMapElementStyle): Self = this.set("adminDistrictCapital", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminDistrictCapital: Self = this.set("adminDistrictCapital", js.undefined)
    @scala.inline
    def setAirport(value: IMapElementStyle): Self = this.set("airport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAirport: Self = this.set("airport", js.undefined)
    @scala.inline
    def setArea(value: IMapElementStyle): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setArterialRoad(value: IMapElementStyle): Self = this.set("arterialRoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArterialRoad: Self = this.set("arterialRoad", js.undefined)
    @scala.inline
    def setBuilding(value: IMapElementStyle): Self = this.set("building", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilding: Self = this.set("building", js.undefined)
    @scala.inline
    def setBusiness(value: IMapElementStyle): Self = this.set("business", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusiness: Self = this.set("business", js.undefined)
    @scala.inline
    def setCapital(value: IMapElementStyle): Self = this.set("capital", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapital: Self = this.set("capital", js.undefined)
    @scala.inline
    def setCemetery(value: IMapElementStyle): Self = this.set("cemetery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCemetery: Self = this.set("cemetery", js.undefined)
    @scala.inline
    def setContinent(value: IMapElementStyle): Self = this.set("continent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinent: Self = this.set("continent", js.undefined)
    @scala.inline
    def setControlledAccessHighway(value: IMapElementStyle): Self = this.set("controlledAccessHighway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlledAccessHighway: Self = this.set("controlledAccessHighway", js.undefined)
    @scala.inline
    def setCountryRegion(value: IBorderedMapElementStyle): Self = this.set("countryRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryRegion: Self = this.set("countryRegion", js.undefined)
    @scala.inline
    def setCountryRegionCapital(value: IMapElementStyle): Self = this.set("countryRegionCapital", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryRegionCapital: Self = this.set("countryRegionCapital", js.undefined)
    @scala.inline
    def setDistrict(value: IBorderedMapElementStyle): Self = this.set("district", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistrict: Self = this.set("district", js.undefined)
    @scala.inline
    def setEducation(value: IMapElementStyle): Self = this.set("education", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEducation: Self = this.set("education", js.undefined)
    @scala.inline
    def setEducationBuilding(value: IMapElementStyle): Self = this.set("educationBuilding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEducationBuilding: Self = this.set("educationBuilding", js.undefined)
    @scala.inline
    def setFoodPoint(value: IMapElementStyle): Self = this.set("foodPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoodPoint: Self = this.set("foodPoint", js.undefined)
    @scala.inline
    def setForest(value: IMapElementStyle): Self = this.set("forest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForest: Self = this.set("forest", js.undefined)
    @scala.inline
    def setGolfCourse(value: IMapElementStyle): Self = this.set("golfCourse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGolfCourse: Self = this.set("golfCourse", js.undefined)
    @scala.inline
    def setHighSpeedRamp(value: IMapElementStyle): Self = this.set("highSpeedRamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighSpeedRamp: Self = this.set("highSpeedRamp", js.undefined)
    @scala.inline
    def setHighway(value: IMapElementStyle): Self = this.set("highway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighway: Self = this.set("highway", js.undefined)
    @scala.inline
    def setIndigenousPeoplesReserve(value: IMapElementStyle): Self = this.set("indigenousPeoplesReserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndigenousPeoplesReserve: Self = this.set("indigenousPeoplesReserve", js.undefined)
    @scala.inline
    def setIsland(value: IMapElementStyle): Self = this.set("island", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsland: Self = this.set("island", js.undefined)
    @scala.inline
    def setMajorRoad(value: IMapElementStyle): Self = this.set("majorRoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorRoad: Self = this.set("majorRoad", js.undefined)
    @scala.inline
    def setMapElement(value: IMapElementStyle): Self = this.set("mapElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapElement: Self = this.set("mapElement", js.undefined)
    @scala.inline
    def setMedical(value: IMapElementStyle): Self = this.set("medical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedical: Self = this.set("medical", js.undefined)
    @scala.inline
    def setMedicalBuilding(value: IMapElementStyle): Self = this.set("medicalBuilding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedicalBuilding: Self = this.set("medicalBuilding", js.undefined)
    @scala.inline
    def setMilitary(value: IMapElementStyle): Self = this.set("military", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilitary: Self = this.set("military", js.undefined)
    @scala.inline
    def setNaturalPoint(value: IMapElementStyle): Self = this.set("naturalPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalPoint: Self = this.set("naturalPoint", js.undefined)
    @scala.inline
    def setNautical(value: IMapElementStyle): Self = this.set("nautical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNautical: Self = this.set("nautical", js.undefined)
    @scala.inline
    def setNeighborhood(value: IMapElementStyle): Self = this.set("neighborhood", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeighborhood: Self = this.set("neighborhood", js.undefined)
    @scala.inline
    def setPark(value: IMapElementStyle): Self = this.set("park", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePark: Self = this.set("park", js.undefined)
    @scala.inline
    def setPeak(value: IMapElementStyle): Self = this.set("peak", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeak: Self = this.set("peak", js.undefined)
    @scala.inline
    def setPlayingField(value: IMapElementStyle): Self = this.set("playingField", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayingField: Self = this.set("playingField", js.undefined)
    @scala.inline
    def setPoint(value: IMapElementStyle): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPointOfInterest(value: IMapElementStyle): Self = this.set("pointOfInterest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointOfInterest: Self = this.set("pointOfInterest", js.undefined)
    @scala.inline
    def setPolitical(value: IBorderedMapElementStyle): Self = this.set("political", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolitical: Self = this.set("political", js.undefined)
    @scala.inline
    def setPopulatedPlace(value: IMapElementStyle): Self = this.set("populatedPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulatedPlace: Self = this.set("populatedPlace", js.undefined)
    @scala.inline
    def setRailway(value: IMapElementStyle): Self = this.set("railway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRailway: Self = this.set("railway", js.undefined)
    @scala.inline
    def setRamp(value: IMapElementStyle): Self = this.set("ramp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamp: Self = this.set("ramp", js.undefined)
    @scala.inline
    def setReserve(value: IMapElementStyle): Self = this.set("reserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserve: Self = this.set("reserve", js.undefined)
    @scala.inline
    def setRiver(value: IMapElementStyle): Self = this.set("river", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiver: Self = this.set("river", js.undefined)
    @scala.inline
    def setRoad(value: IMapElementStyle): Self = this.set("road", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoad: Self = this.set("road", js.undefined)
    @scala.inline
    def setRoadExit(value: IMapElementStyle): Self = this.set("roadExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoadExit: Self = this.set("roadExit", js.undefined)
    @scala.inline
    def setRunway(value: IMapElementStyle): Self = this.set("runway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunway: Self = this.set("runway", js.undefined)
    @scala.inline
    def setSand(value: IMapElementStyle): Self = this.set("sand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSand: Self = this.set("sand", js.undefined)
    @scala.inline
    def setShoppingCenter(value: IMapElementStyle): Self = this.set("shoppingCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShoppingCenter: Self = this.set("shoppingCenter", js.undefined)
    @scala.inline
    def setStadium(value: IMapElementStyle): Self = this.set("stadium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStadium: Self = this.set("stadium", js.undefined)
    @scala.inline
    def setStreet(value: IMapElementStyle): Self = this.set("street", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreet: Self = this.set("street", js.undefined)
    @scala.inline
    def setStructure(value: IMapElementStyle): Self = this.set("structure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructure: Self = this.set("structure", js.undefined)
    @scala.inline
    def setTollRoad(value: IMapElementStyle): Self = this.set("tollRoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTollRoad: Self = this.set("tollRoad", js.undefined)
    @scala.inline
    def setTrail(value: IMapElementStyle): Self = this.set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
    @scala.inline
    def setTransit(value: IMapElementStyle): Self = this.set("transit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransit: Self = this.set("transit", js.undefined)
    @scala.inline
    def setTransitBuilding(value: IMapElementStyle): Self = this.set("transitBuilding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitBuilding: Self = this.set("transitBuilding", js.undefined)
    @scala.inline
    def setTransportation(value: IMapElementStyle): Self = this.set("transportation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportation: Self = this.set("transportation", js.undefined)
    @scala.inline
    def setUnpavedStreet(value: IMapElementStyle): Self = this.set("unpavedStreet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpavedStreet: Self = this.set("unpavedStreet", js.undefined)
    @scala.inline
    def setVegetation(value: IMapElementStyle): Self = this.set("vegetation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVegetation: Self = this.set("vegetation", js.undefined)
    @scala.inline
    def setVolcanicPeak(value: IMapElementStyle): Self = this.set("volcanicPeak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolcanicPeak: Self = this.set("volcanicPeak", js.undefined)
    @scala.inline
    def setWater(value: IMapElementStyle): Self = this.set("water", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWater: Self = this.set("water", js.undefined)
    @scala.inline
    def setWaterPoint(value: IMapElementStyle): Self = this.set("waterPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaterPoint: Self = this.set("waterPoint", js.undefined)
    @scala.inline
    def setWaterRoute(value: IMapElementStyle): Self = this.set("waterRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaterRoute: Self = this.set("waterRoute", js.undefined)
  }
  
}

