package typings.dadataApi.mod

import typings.dadataApi.anon.Actualitydate
import typings.dadataApi.anon.Code
import typings.dadataApi.anon.Debt
import typings.dadataApi.anon.Disqualified
import typings.dadataApi.anon.Full
import typings.dadataApi.anon.Liquidationdate
import typings.dadataApi.anon.Payment
import typings.dadataApi.anon.Short
import typings.dadataApi.dadataApiStrings.`0`
import typings.dadataApi.dadataApiStrings.`1`
import typings.dadataApi.dadataApiStrings.`2`
import typings.dadataApi.dadataApiStrings.`3`
import typings.dadataApi.dadataApiStrings.`4`
import typings.dadataApi.dadataApiStrings.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DaDataApi {
  
  trait Address extends StObject {
    
    var area: Nullable[String]
    
    var area_fias_id: Nullable[String]
    
    var area_kladr_id: Nullable[String]
    
    var area_type: Nullable[String]
    
    var area_type_full: Nullable[String]
    
    var area_with_type: Nullable[String]
    
    var beltway_distance: Nullable[String]
    
    var beltway_hit: Nullable[AddressBeltwayHit]
    
    var block: Nullable[String]
    
    var block_type: Nullable[String]
    
    var block_type_full: Nullable[String]
    
    var capital_marker: `0` | `1` | `2` | `3` | `4`
    
    var city: Nullable[String]
    
    var city_area: Nullable[String]
    
    var city_district: Nullable[String]
    
    var city_district_fias_id: Nullable[String]
    
    var city_district_kladr_id: Nullable[String]
    
    var city_district_type: Nullable[String]
    
    var city_district_type_full: Nullable[String]
    
    var city_district_with_type: Nullable[String]
    
    var city_fias_id: Nullable[String]
    
    var city_kladr_id: Nullable[String]
    
    var city_type: Nullable[String]
    
    var city_type_full: Nullable[String]
    
    var city_with_type: Nullable[String]
    
    var country: String
    
    var country_iso_code: String
    
    var divisions: js.UndefOr[Any] = js.undefined
    
    var entrance: js.UndefOr[Null] = js.undefined
    
    var federal_district: Nullable[String]
    
    var fias_actuality_state: String
    
    var fias_code: String
    
    var fias_id: String
    
    var fias_level: String
    
    var flat: Nullable[String]
    
    var flat_area: Nullable[String]
    
    var flat_cadnum: js.UndefOr[Null] = js.undefined
    
    var flat_fias_id: js.UndefOr[Nullable[String]] = js.undefined
    
    var flat_price: Null
    
    var flat_type: Nullable[String]
    
    var flat_type_full: Nullable[String]
    
    var floor: js.UndefOr[Null] = js.undefined
    
    var geo_lat: Nullable[String]
    
    var geo_lon: Nullable[String]
    
    var geoname_id: Nullable[String]
    
    var history_values: Nullable[js.Array[String]]
    
    var house: Nullable[String]
    
    var house_cadnum: js.UndefOr[Null] = js.undefined
    
    var house_fias_id: Nullable[String]
    
    var house_kladr_id: Nullable[String]
    
    var house_type: Nullable[String]
    
    var house_type_full: Nullable[String]
    
    var kladr_id: String
    
    var metro: Nullable[js.Array[AddressMetro]]
    
    var okato: Nullable[String]
    
    var oktmo: Nullable[String]
    
    var postal_box: Nullable[String]
    
    var postal_code: Nullable[String]
    
    var qc: Null
    
    var qc_complete: Null
    
    var qc_geo: Nullable[`0` | `1` | `2` | `3` | `4` | `5`]
    
    var qc_house: Null
    
    var region: String
    
    var region_fias_id: String
    
    var region_iso_code: String
    
    var region_kladr_id: String
    
    var region_type: String
    
    var region_type_full: String
    
    var region_with_type: String
    
    var settlement: Nullable[String]
    
    var settlement_fias_id: Nullable[String]
    
    var settlement_kladr_id: Nullable[String]
    
    var settlement_type: Nullable[String]
    
    var settlement_type_full: Nullable[String]
    
    var settlement_with_type: Nullable[String]
    
    var source: Nullable[String]
    
    var square_meter_price: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_cadnum: js.UndefOr[Null] = js.undefined
    
    var stead_fias_id: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_kladr_id: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_type: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_type_full: js.UndefOr[Nullable[String]] = js.undefined
    
    var street: Nullable[String]
    
    var street_fias_id: Nullable[String]
    
    var street_kladr_id: Nullable[String]
    
    var street_type: Nullable[String]
    
    var street_type_full: Nullable[String]
    
    var street_with_type: Nullable[String]
    
    var tax_office: Nullable[String]
    
    var tax_office_legal: Nullable[String]
    
    var timezone: Nullable[String]
    
    var unparsed_parts: Null
  }
  object Address {
    
    inline def apply(
      capital_marker: `0` | `1` | `2` | `3` | `4`,
      country: String,
      country_iso_code: String,
      fias_actuality_state: String,
      fias_code: String,
      fias_id: String,
      fias_level: String,
      flat_price: Null,
      kladr_id: String,
      qc: Null,
      qc_complete: Null,
      qc_house: Null,
      region: String,
      region_fias_id: String,
      region_iso_code: String,
      region_kladr_id: String,
      region_type: String,
      region_type_full: String,
      region_with_type: String,
      unparsed_parts: Null
    ): Address = {
      val __obj = js.Dynamic.literal(capital_marker = capital_marker.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_iso_code = country_iso_code.asInstanceOf[js.Any], fias_actuality_state = fias_actuality_state.asInstanceOf[js.Any], fias_code = fias_code.asInstanceOf[js.Any], fias_id = fias_id.asInstanceOf[js.Any], fias_level = fias_level.asInstanceOf[js.Any], flat_price = flat_price.asInstanceOf[js.Any], kladr_id = kladr_id.asInstanceOf[js.Any], qc = qc.asInstanceOf[js.Any], qc_complete = qc_complete.asInstanceOf[js.Any], qc_house = qc_house.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], region_fias_id = region_fias_id.asInstanceOf[js.Any], region_iso_code = region_iso_code.asInstanceOf[js.Any], region_kladr_id = region_kladr_id.asInstanceOf[js.Any], region_type = region_type.asInstanceOf[js.Any], region_type_full = region_type_full.asInstanceOf[js.Any], region_with_type = region_with_type.asInstanceOf[js.Any], unparsed_parts = unparsed_parts.asInstanceOf[js.Any], area = null, area_fias_id = null, area_kladr_id = null, area_type = null, area_type_full = null, area_with_type = null, beltway_distance = null, beltway_hit = null, block = null, block_type = null, block_type_full = null, city = null, city_area = null, city_district = null, city_district_fias_id = null, city_district_kladr_id = null, city_district_type = null, city_district_type_full = null, city_district_with_type = null, city_fias_id = null, city_kladr_id = null, city_type = null, city_type_full = null, city_with_type = null, federal_district = null, flat = null, flat_area = null, flat_type = null, flat_type_full = null, geo_lat = null, geo_lon = null, geoname_id = null, history_values = null, house = null, house_fias_id = null, house_kladr_id = null, house_type = null, house_type_full = null, metro = null, okato = null, oktmo = null, postal_box = null, postal_code = null, qc_geo = null, settlement = null, settlement_fias_id = null, settlement_kladr_id = null, settlement_type = null, settlement_type_full = null, settlement_with_type = null, source = null, street = null, street_fias_id = null, street_kladr_id = null, street_type = null, street_type_full = null, street_with_type = null, tax_office = null, tax_office_legal = null, timezone = null)
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setArea(value: Nullable[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaNull: Self = StObject.set(x, "area", null)
      
      inline def setArea_fias_id(value: Nullable[String]): Self = StObject.set(x, "area_fias_id", value.asInstanceOf[js.Any])
      
      inline def setArea_fias_idNull: Self = StObject.set(x, "area_fias_id", null)
      
      inline def setArea_kladr_id(value: Nullable[String]): Self = StObject.set(x, "area_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setArea_kladr_idNull: Self = StObject.set(x, "area_kladr_id", null)
      
      inline def setArea_type(value: Nullable[String]): Self = StObject.set(x, "area_type", value.asInstanceOf[js.Any])
      
      inline def setArea_typeNull: Self = StObject.set(x, "area_type", null)
      
      inline def setArea_type_full(value: Nullable[String]): Self = StObject.set(x, "area_type_full", value.asInstanceOf[js.Any])
      
      inline def setArea_type_fullNull: Self = StObject.set(x, "area_type_full", null)
      
      inline def setArea_with_type(value: Nullable[String]): Self = StObject.set(x, "area_with_type", value.asInstanceOf[js.Any])
      
      inline def setArea_with_typeNull: Self = StObject.set(x, "area_with_type", null)
      
      inline def setBeltway_distance(value: Nullable[String]): Self = StObject.set(x, "beltway_distance", value.asInstanceOf[js.Any])
      
      inline def setBeltway_distanceNull: Self = StObject.set(x, "beltway_distance", null)
      
      inline def setBeltway_hit(value: Nullable[AddressBeltwayHit]): Self = StObject.set(x, "beltway_hit", value.asInstanceOf[js.Any])
      
      inline def setBeltway_hitNull: Self = StObject.set(x, "beltway_hit", null)
      
      inline def setBlock(value: Nullable[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockNull: Self = StObject.set(x, "block", null)
      
      inline def setBlock_type(value: Nullable[String]): Self = StObject.set(x, "block_type", value.asInstanceOf[js.Any])
      
      inline def setBlock_typeNull: Self = StObject.set(x, "block_type", null)
      
      inline def setBlock_type_full(value: Nullable[String]): Self = StObject.set(x, "block_type_full", value.asInstanceOf[js.Any])
      
      inline def setBlock_type_fullNull: Self = StObject.set(x, "block_type_full", null)
      
      inline def setCapital_marker(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "capital_marker", value.asInstanceOf[js.Any])
      
      inline def setCity(value: Nullable[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityNull: Self = StObject.set(x, "city", null)
      
      inline def setCity_area(value: Nullable[String]): Self = StObject.set(x, "city_area", value.asInstanceOf[js.Any])
      
      inline def setCity_areaNull: Self = StObject.set(x, "city_area", null)
      
      inline def setCity_district(value: Nullable[String]): Self = StObject.set(x, "city_district", value.asInstanceOf[js.Any])
      
      inline def setCity_districtNull: Self = StObject.set(x, "city_district", null)
      
      inline def setCity_district_fias_id(value: Nullable[String]): Self = StObject.set(x, "city_district_fias_id", value.asInstanceOf[js.Any])
      
      inline def setCity_district_fias_idNull: Self = StObject.set(x, "city_district_fias_id", null)
      
      inline def setCity_district_kladr_id(value: Nullable[String]): Self = StObject.set(x, "city_district_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setCity_district_kladr_idNull: Self = StObject.set(x, "city_district_kladr_id", null)
      
      inline def setCity_district_type(value: Nullable[String]): Self = StObject.set(x, "city_district_type", value.asInstanceOf[js.Any])
      
      inline def setCity_district_typeNull: Self = StObject.set(x, "city_district_type", null)
      
      inline def setCity_district_type_full(value: Nullable[String]): Self = StObject.set(x, "city_district_type_full", value.asInstanceOf[js.Any])
      
      inline def setCity_district_type_fullNull: Self = StObject.set(x, "city_district_type_full", null)
      
      inline def setCity_district_with_type(value: Nullable[String]): Self = StObject.set(x, "city_district_with_type", value.asInstanceOf[js.Any])
      
      inline def setCity_district_with_typeNull: Self = StObject.set(x, "city_district_with_type", null)
      
      inline def setCity_fias_id(value: Nullable[String]): Self = StObject.set(x, "city_fias_id", value.asInstanceOf[js.Any])
      
      inline def setCity_fias_idNull: Self = StObject.set(x, "city_fias_id", null)
      
      inline def setCity_kladr_id(value: Nullable[String]): Self = StObject.set(x, "city_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setCity_kladr_idNull: Self = StObject.set(x, "city_kladr_id", null)
      
      inline def setCity_type(value: Nullable[String]): Self = StObject.set(x, "city_type", value.asInstanceOf[js.Any])
      
      inline def setCity_typeNull: Self = StObject.set(x, "city_type", null)
      
      inline def setCity_type_full(value: Nullable[String]): Self = StObject.set(x, "city_type_full", value.asInstanceOf[js.Any])
      
      inline def setCity_type_fullNull: Self = StObject.set(x, "city_type_full", null)
      
      inline def setCity_with_type(value: Nullable[String]): Self = StObject.set(x, "city_with_type", value.asInstanceOf[js.Any])
      
      inline def setCity_with_typeNull: Self = StObject.set(x, "city_with_type", null)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_iso_code(value: String): Self = StObject.set(x, "country_iso_code", value.asInstanceOf[js.Any])
      
      inline def setDivisions(value: Any): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
      
      inline def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
      
      inline def setFederal_district(value: Nullable[String]): Self = StObject.set(x, "federal_district", value.asInstanceOf[js.Any])
      
      inline def setFederal_districtNull: Self = StObject.set(x, "federal_district", null)
      
      inline def setFias_actuality_state(value: String): Self = StObject.set(x, "fias_actuality_state", value.asInstanceOf[js.Any])
      
      inline def setFias_code(value: String): Self = StObject.set(x, "fias_code", value.asInstanceOf[js.Any])
      
      inline def setFias_id(value: String): Self = StObject.set(x, "fias_id", value.asInstanceOf[js.Any])
      
      inline def setFias_level(value: String): Self = StObject.set(x, "fias_level", value.asInstanceOf[js.Any])
      
      inline def setFlat(value: Nullable[String]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatNull: Self = StObject.set(x, "flat", null)
      
      inline def setFlat_area(value: Nullable[String]): Self = StObject.set(x, "flat_area", value.asInstanceOf[js.Any])
      
      inline def setFlat_areaNull: Self = StObject.set(x, "flat_area", null)
      
      inline def setFlat_fias_id(value: Nullable[String]): Self = StObject.set(x, "flat_fias_id", value.asInstanceOf[js.Any])
      
      inline def setFlat_fias_idNull: Self = StObject.set(x, "flat_fias_id", null)
      
      inline def setFlat_fias_idUndefined: Self = StObject.set(x, "flat_fias_id", js.undefined)
      
      inline def setFlat_price(value: Null): Self = StObject.set(x, "flat_price", value.asInstanceOf[js.Any])
      
      inline def setFlat_type(value: Nullable[String]): Self = StObject.set(x, "flat_type", value.asInstanceOf[js.Any])
      
      inline def setFlat_typeNull: Self = StObject.set(x, "flat_type", null)
      
      inline def setFlat_type_full(value: Nullable[String]): Self = StObject.set(x, "flat_type_full", value.asInstanceOf[js.Any])
      
      inline def setFlat_type_fullNull: Self = StObject.set(x, "flat_type_full", null)
      
      inline def setGeo_lat(value: Nullable[String]): Self = StObject.set(x, "geo_lat", value.asInstanceOf[js.Any])
      
      inline def setGeo_latNull: Self = StObject.set(x, "geo_lat", null)
      
      inline def setGeo_lon(value: Nullable[String]): Self = StObject.set(x, "geo_lon", value.asInstanceOf[js.Any])
      
      inline def setGeo_lonNull: Self = StObject.set(x, "geo_lon", null)
      
      inline def setGeoname_id(value: Nullable[String]): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
      
      inline def setGeoname_idNull: Self = StObject.set(x, "geoname_id", null)
      
      inline def setHistory_values(value: Nullable[js.Array[String]]): Self = StObject.set(x, "history_values", value.asInstanceOf[js.Any])
      
      inline def setHistory_valuesNull: Self = StObject.set(x, "history_values", null)
      
      inline def setHistory_valuesVarargs(value: String*): Self = StObject.set(x, "history_values", js.Array(value*))
      
      inline def setHouse(value: Nullable[String]): Self = StObject.set(x, "house", value.asInstanceOf[js.Any])
      
      inline def setHouseNull: Self = StObject.set(x, "house", null)
      
      inline def setHouse_fias_id(value: Nullable[String]): Self = StObject.set(x, "house_fias_id", value.asInstanceOf[js.Any])
      
      inline def setHouse_fias_idNull: Self = StObject.set(x, "house_fias_id", null)
      
      inline def setHouse_kladr_id(value: Nullable[String]): Self = StObject.set(x, "house_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setHouse_kladr_idNull: Self = StObject.set(x, "house_kladr_id", null)
      
      inline def setHouse_type(value: Nullable[String]): Self = StObject.set(x, "house_type", value.asInstanceOf[js.Any])
      
      inline def setHouse_typeNull: Self = StObject.set(x, "house_type", null)
      
      inline def setHouse_type_full(value: Nullable[String]): Self = StObject.set(x, "house_type_full", value.asInstanceOf[js.Any])
      
      inline def setHouse_type_fullNull: Self = StObject.set(x, "house_type_full", null)
      
      inline def setKladr_id(value: String): Self = StObject.set(x, "kladr_id", value.asInstanceOf[js.Any])
      
      inline def setMetro(value: Nullable[js.Array[AddressMetro]]): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
      
      inline def setMetroNull: Self = StObject.set(x, "metro", null)
      
      inline def setMetroVarargs(value: AddressMetro*): Self = StObject.set(x, "metro", js.Array(value*))
      
      inline def setOkato(value: Nullable[String]): Self = StObject.set(x, "okato", value.asInstanceOf[js.Any])
      
      inline def setOkatoNull: Self = StObject.set(x, "okato", null)
      
      inline def setOktmo(value: Nullable[String]): Self = StObject.set(x, "oktmo", value.asInstanceOf[js.Any])
      
      inline def setOktmoNull: Self = StObject.set(x, "oktmo", null)
      
      inline def setPostal_box(value: Nullable[String]): Self = StObject.set(x, "postal_box", value.asInstanceOf[js.Any])
      
      inline def setPostal_boxNull: Self = StObject.set(x, "postal_box", null)
      
      inline def setPostal_code(value: Nullable[String]): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
      
      inline def setQc(value: Null): Self = StObject.set(x, "qc", value.asInstanceOf[js.Any])
      
      inline def setQc_complete(value: Null): Self = StObject.set(x, "qc_complete", value.asInstanceOf[js.Any])
      
      inline def setQc_geo(value: Nullable[`0` | `1` | `2` | `3` | `4` | `5`]): Self = StObject.set(x, "qc_geo", value.asInstanceOf[js.Any])
      
      inline def setQc_geoNull: Self = StObject.set(x, "qc_geo", null)
      
      inline def setQc_house(value: Null): Self = StObject.set(x, "qc_house", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegion_fias_id(value: String): Self = StObject.set(x, "region_fias_id", value.asInstanceOf[js.Any])
      
      inline def setRegion_iso_code(value: String): Self = StObject.set(x, "region_iso_code", value.asInstanceOf[js.Any])
      
      inline def setRegion_kladr_id(value: String): Self = StObject.set(x, "region_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setRegion_type(value: String): Self = StObject.set(x, "region_type", value.asInstanceOf[js.Any])
      
      inline def setRegion_type_full(value: String): Self = StObject.set(x, "region_type_full", value.asInstanceOf[js.Any])
      
      inline def setRegion_with_type(value: String): Self = StObject.set(x, "region_with_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement(value: Nullable[String]): Self = StObject.set(x, "settlement", value.asInstanceOf[js.Any])
      
      inline def setSettlementNull: Self = StObject.set(x, "settlement", null)
      
      inline def setSettlement_fias_id(value: Nullable[String]): Self = StObject.set(x, "settlement_fias_id", value.asInstanceOf[js.Any])
      
      inline def setSettlement_fias_idNull: Self = StObject.set(x, "settlement_fias_id", null)
      
      inline def setSettlement_kladr_id(value: Nullable[String]): Self = StObject.set(x, "settlement_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setSettlement_kladr_idNull: Self = StObject.set(x, "settlement_kladr_id", null)
      
      inline def setSettlement_type(value: Nullable[String]): Self = StObject.set(x, "settlement_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement_typeNull: Self = StObject.set(x, "settlement_type", null)
      
      inline def setSettlement_type_full(value: Nullable[String]): Self = StObject.set(x, "settlement_type_full", value.asInstanceOf[js.Any])
      
      inline def setSettlement_type_fullNull: Self = StObject.set(x, "settlement_type_full", null)
      
      inline def setSettlement_with_type(value: Nullable[String]): Self = StObject.set(x, "settlement_with_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement_with_typeNull: Self = StObject.set(x, "settlement_with_type", null)
      
      inline def setSource(value: Nullable[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSquare_meter_price(value: Nullable[String]): Self = StObject.set(x, "square_meter_price", value.asInstanceOf[js.Any])
      
      inline def setSquare_meter_priceNull: Self = StObject.set(x, "square_meter_price", null)
      
      inline def setSquare_meter_priceUndefined: Self = StObject.set(x, "square_meter_price", js.undefined)
      
      inline def setStead(value: Nullable[String]): Self = StObject.set(x, "stead", value.asInstanceOf[js.Any])
      
      inline def setSteadNull: Self = StObject.set(x, "stead", null)
      
      inline def setSteadUndefined: Self = StObject.set(x, "stead", js.undefined)
      
      inline def setStead_fias_id(value: Nullable[String]): Self = StObject.set(x, "stead_fias_id", value.asInstanceOf[js.Any])
      
      inline def setStead_fias_idNull: Self = StObject.set(x, "stead_fias_id", null)
      
      inline def setStead_fias_idUndefined: Self = StObject.set(x, "stead_fias_id", js.undefined)
      
      inline def setStead_kladr_id(value: Nullable[String]): Self = StObject.set(x, "stead_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setStead_kladr_idNull: Self = StObject.set(x, "stead_kladr_id", null)
      
      inline def setStead_kladr_idUndefined: Self = StObject.set(x, "stead_kladr_id", js.undefined)
      
      inline def setStead_type(value: Nullable[String]): Self = StObject.set(x, "stead_type", value.asInstanceOf[js.Any])
      
      inline def setStead_typeNull: Self = StObject.set(x, "stead_type", null)
      
      inline def setStead_typeUndefined: Self = StObject.set(x, "stead_type", js.undefined)
      
      inline def setStead_type_full(value: Nullable[String]): Self = StObject.set(x, "stead_type_full", value.asInstanceOf[js.Any])
      
      inline def setStead_type_fullNull: Self = StObject.set(x, "stead_type_full", null)
      
      inline def setStead_type_fullUndefined: Self = StObject.set(x, "stead_type_full", js.undefined)
      
      inline def setStreet(value: Nullable[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetNull: Self = StObject.set(x, "street", null)
      
      inline def setStreet_fias_id(value: Nullable[String]): Self = StObject.set(x, "street_fias_id", value.asInstanceOf[js.Any])
      
      inline def setStreet_fias_idNull: Self = StObject.set(x, "street_fias_id", null)
      
      inline def setStreet_kladr_id(value: Nullable[String]): Self = StObject.set(x, "street_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setStreet_kladr_idNull: Self = StObject.set(x, "street_kladr_id", null)
      
      inline def setStreet_type(value: Nullable[String]): Self = StObject.set(x, "street_type", value.asInstanceOf[js.Any])
      
      inline def setStreet_typeNull: Self = StObject.set(x, "street_type", null)
      
      inline def setStreet_type_full(value: Nullable[String]): Self = StObject.set(x, "street_type_full", value.asInstanceOf[js.Any])
      
      inline def setStreet_type_fullNull: Self = StObject.set(x, "street_type_full", null)
      
      inline def setStreet_with_type(value: Nullable[String]): Self = StObject.set(x, "street_with_type", value.asInstanceOf[js.Any])
      
      inline def setStreet_with_typeNull: Self = StObject.set(x, "street_with_type", null)
      
      inline def setTax_office(value: Nullable[String]): Self = StObject.set(x, "tax_office", value.asInstanceOf[js.Any])
      
      inline def setTax_officeNull: Self = StObject.set(x, "tax_office", null)
      
      inline def setTax_office_legal(value: Nullable[String]): Self = StObject.set(x, "tax_office_legal", value.asInstanceOf[js.Any])
      
      inline def setTax_office_legalNull: Self = StObject.set(x, "tax_office_legal", null)
      
      inline def setTimezone(value: Nullable[String]): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
      
      inline def setUnparsed_parts(value: Null): Self = StObject.set(x, "unparsed_parts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.IN_MKAD
    - typings.dadataApi.dadataApiStrings.OUT_MKAD
    - typings.dadataApi.dadataApiStrings.IN_KAD
    - typings.dadataApi.dadataApiStrings.OUT_KAD
  */
  trait AddressBeltwayHit extends StObject
  object AddressBeltwayHit {
    
    inline def IN_KAD: typings.dadataApi.dadataApiStrings.IN_KAD = "IN_KAD".asInstanceOf[typings.dadataApi.dadataApiStrings.IN_KAD]
    
    inline def IN_MKAD: typings.dadataApi.dadataApiStrings.IN_MKAD = "IN_MKAD".asInstanceOf[typings.dadataApi.dadataApiStrings.IN_MKAD]
    
    inline def OUT_KAD: typings.dadataApi.dadataApiStrings.OUT_KAD = "OUT_KAD".asInstanceOf[typings.dadataApi.dadataApiStrings.OUT_KAD]
    
    inline def OUT_MKAD: typings.dadataApi.dadataApiStrings.OUT_MKAD = "OUT_MKAD".asInstanceOf[typings.dadataApi.dadataApiStrings.OUT_MKAD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.country
    - typings.dadataApi.dadataApiStrings.region
    - typings.dadataApi.dadataApiStrings.area
    - typings.dadataApi.dadataApiStrings.city
    - typings.dadataApi.dadataApiStrings.settlement
    - typings.dadataApi.dadataApiStrings.street
    - typings.dadataApi.dadataApiStrings.houses
  */
  trait AddressBounds extends StObject
  object AddressBounds {
    
    inline def area: typings.dadataApi.dadataApiStrings.area = "area".asInstanceOf[typings.dadataApi.dadataApiStrings.area]
    
    inline def city: typings.dadataApi.dadataApiStrings.city = "city".asInstanceOf[typings.dadataApi.dadataApiStrings.city]
    
    inline def country: typings.dadataApi.dadataApiStrings.country = "country".asInstanceOf[typings.dadataApi.dadataApiStrings.country]
    
    inline def houses: typings.dadataApi.dadataApiStrings.houses = "houses".asInstanceOf[typings.dadataApi.dadataApiStrings.houses]
    
    inline def region: typings.dadataApi.dadataApiStrings.region = "region".asInstanceOf[typings.dadataApi.dadataApiStrings.region]
    
    inline def settlement: typings.dadataApi.dadataApiStrings.settlement = "settlement".asInstanceOf[typings.dadataApi.dadataApiStrings.settlement]
    
    inline def street: typings.dadataApi.dadataApiStrings.street = "street".asInstanceOf[typings.dadataApi.dadataApiStrings.street]
  }
  
  trait AddressMetro extends StObject {
    
    var distance: Double
    
    var line: String
    
    var name: String
  }
  object AddressMetro {
    
    inline def apply(distance: Double, line: String, name: String): AddressMetro = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressMetro]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressMetro] (val x: Self) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.ACTIVE
    - typings.dadataApi.dadataApiStrings.LIQUIDATING
    - typings.dadataApi.dadataApiStrings.LIQUIDATED
  */
  trait BankStatus extends StObject
  object BankStatus {
    
    inline def ACTIVE: typings.dadataApi.dadataApiStrings.ACTIVE = "ACTIVE".asInstanceOf[typings.dadataApi.dadataApiStrings.ACTIVE]
    
    inline def LIQUIDATED: typings.dadataApi.dadataApiStrings.LIQUIDATED = "LIQUIDATED".asInstanceOf[typings.dadataApi.dadataApiStrings.LIQUIDATED]
    
    inline def LIQUIDATING: typings.dadataApi.dadataApiStrings.LIQUIDATING = "LIQUIDATING".asInstanceOf[typings.dadataApi.dadataApiStrings.LIQUIDATING]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.BANK
    - typings.dadataApi.dadataApiStrings.BANK_BRANCH
    - typings.dadataApi.dadataApiStrings.NKO
    - typings.dadataApi.dadataApiStrings.NKO_BRANCH
    - typings.dadataApi.dadataApiStrings.RKC
    - typings.dadataApi.dadataApiStrings.OTHER
  */
  trait BankType extends StObject
  object BankType {
    
    inline def BANK: typings.dadataApi.dadataApiStrings.BANK = "BANK".asInstanceOf[typings.dadataApi.dadataApiStrings.BANK]
    
    inline def BANK_BRANCH: typings.dadataApi.dadataApiStrings.BANK_BRANCH = "BANK_BRANCH".asInstanceOf[typings.dadataApi.dadataApiStrings.BANK_BRANCH]
    
    inline def NKO: typings.dadataApi.dadataApiStrings.NKO = "NKO".asInstanceOf[typings.dadataApi.dadataApiStrings.NKO]
    
    inline def NKO_BRANCH: typings.dadataApi.dadataApiStrings.NKO_BRANCH = "NKO_BRANCH".asInstanceOf[typings.dadataApi.dadataApiStrings.NKO_BRANCH]
    
    inline def OTHER: typings.dadataApi.dadataApiStrings.OTHER = "OTHER".asInstanceOf[typings.dadataApi.dadataApiStrings.OTHER]
    
    inline def RKC: typings.dadataApi.dadataApiStrings.RKC = "RKC".asInstanceOf[typings.dadataApi.dadataApiStrings.RKC]
  }
  
  trait DaDataBank extends StObject {
    
    var address: Suggestion[Address]
    
    var bic: String
    
    var correspondent_account: String
    
    var inn: String
    
    var kpp: String
    
    var name: Payment
    
    var okpo: Null
    
    var opf: Short
    
    var payment_city: String
    
    var phone: Double
    
    var registration_number: String
    
    var rkc: Double
    
    var state: Liquidationdate
    
    var swift: String
  }
  object DaDataBank {
    
    inline def apply(
      address: Suggestion[Address],
      bic: String,
      correspondent_account: String,
      inn: String,
      kpp: String,
      name: Payment,
      okpo: Null,
      opf: Short,
      payment_city: String,
      phone: Double,
      registration_number: String,
      rkc: Double,
      state: Liquidationdate,
      swift: String
    ): DaDataBank = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bic = bic.asInstanceOf[js.Any], correspondent_account = correspondent_account.asInstanceOf[js.Any], inn = inn.asInstanceOf[js.Any], kpp = kpp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], okpo = okpo.asInstanceOf[js.Any], opf = opf.asInstanceOf[js.Any], payment_city = payment_city.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], registration_number = registration_number.asInstanceOf[js.Any], rkc = rkc.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swift = swift.asInstanceOf[js.Any])
      __obj.asInstanceOf[DaDataBank]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DaDataBank] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Suggestion[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBic(value: String): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
      
      inline def setCorrespondent_account(value: String): Self = StObject.set(x, "correspondent_account", value.asInstanceOf[js.Any])
      
      inline def setInn(value: String): Self = StObject.set(x, "inn", value.asInstanceOf[js.Any])
      
      inline def setKpp(value: String): Self = StObject.set(x, "kpp", value.asInstanceOf[js.Any])
      
      inline def setName(value: Payment): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOkpo(value: Null): Self = StObject.set(x, "okpo", value.asInstanceOf[js.Any])
      
      inline def setOpf(value: Short): Self = StObject.set(x, "opf", value.asInstanceOf[js.Any])
      
      inline def setPayment_city(value: String): Self = StObject.set(x, "payment_city", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Double): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setRegistration_number(value: String): Self = StObject.set(x, "registration_number", value.asInstanceOf[js.Any])
      
      inline def setRkc(value: Double): Self = StObject.set(x, "rkc", value.asInstanceOf[js.Any])
      
      inline def setState(value: Liquidationdate): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSwift(value: String): Self = StObject.set(x, "swift", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var domain: Nullable[String]
    
    var local: Nullable[String]
    
    var qc: Null
    
    var source: Null
    
    var `type`: Null
  }
  object Email {
    
    inline def apply(qc: Null, source: Null, `type`: Null): Email = {
      val __obj = js.Dynamic.literal(qc = qc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], domain = null, local = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: Nullable[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainNull: Self = StObject.set(x, "domain", null)
      
      inline def setLocal(value: Nullable[String]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalNull: Self = StObject.set(x, "local", null)
      
      inline def setQc(value: Null): Self = StObject.set(x, "qc", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: Null): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fio extends StObject {
    
    var gender: Gender
    
    var name: Nullable[String]
    
    var patronymic: Nullable[String]
    
    var qc: `0` | `1`
    
    var source: Null
    
    var surname: Nullable[String]
  }
  object Fio {
    
    inline def apply(gender: Gender, qc: `0` | `1`, source: Null): Fio = {
      val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], qc = qc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], name = null, patronymic = null, surname = null)
      __obj.asInstanceOf[Fio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fio] (val x: Self) extends AnyVal {
      
      inline def setGender(value: Gender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setName(value: Nullable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPatronymic(value: Nullable[String]): Self = StObject.set(x, "patronymic", value.asInstanceOf[js.Any])
      
      inline def setPatronymicNull: Self = StObject.set(x, "patronymic", null)
      
      inline def setQc(value: `0` | `1`): Self = StObject.set(x, "qc", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSurname(value: Nullable[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameNull: Self = StObject.set(x, "surname", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.MALE
    - typings.dadataApi.dadataApiStrings.FEMALE
    - typings.dadataApi.dadataApiStrings.UNKNOWN
  */
  trait Gender extends StObject
  object Gender {
    
    inline def FEMALE: typings.dadataApi.dadataApiStrings.FEMALE = "FEMALE".asInstanceOf[typings.dadataApi.dadataApiStrings.FEMALE]
    
    inline def MALE: typings.dadataApi.dadataApiStrings.MALE = "MALE".asInstanceOf[typings.dadataApi.dadataApiStrings.MALE]
    
    inline def UNKNOWN: typings.dadataApi.dadataApiStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.dadataApi.dadataApiStrings.UNKNOWN]
  }
  
  type Nullable[T] = T | Null
  
  trait Party extends StObject {
    
    var address: Suggestion[PartyAddress]
    
    var authorities: Null
    
    var branch_count: js.UndefOr[Double] = js.undefined
    
    var branch_type: js.UndefOr[PartyBranchType] = js.undefined
    
    var capital: Nullable[String]
    
    var documents: Null
    
    var emails: Null
    
    var employee_count: Nullable[String]
    
    var finance: Nullable[Debt]
    
    var founders: Nullable[js.Array[String]]
    
    var hid: String
    
    var inn: String
    
    var kpp: String
    
    var licenses: Null
    
    var management: js.UndefOr[Nullable[Disqualified]] = js.undefined
    
    var managers: Nullable[js.Array[String]]
    
    var name: Full
    
    var ogrn: String
    
    var ogrn_date: Double
    
    var okato: Nullable[String]
    
    var okfs: Nullable[String]
    
    var okogu: Nullable[String]
    
    var okpo: Nullable[String]
    
    var oktmo: Nullable[String]
    
    var okved: String
    
    var okved_type: String
    
    var okveds: Nullable[js.Array[String]]
    
    var opf: Code
    
    var phones: Null
    
    var predecessors: Nullable[js.Array[String]]
    
    var qc: Null
    
    var source: Null
    
    var state: Actualitydate
    
    var successors: Nullable[js.Array[String]]
    
    var `type`: PartyType
  }
  object Party {
    
    inline def apply(
      address: Suggestion[PartyAddress],
      authorities: Null,
      documents: Null,
      emails: Null,
      hid: String,
      inn: String,
      kpp: String,
      licenses: Null,
      name: Full,
      ogrn: String,
      ogrn_date: Double,
      okved: String,
      okved_type: String,
      opf: Code,
      phones: Null,
      qc: Null,
      source: Null,
      state: Actualitydate,
      `type`: PartyType
    ): Party = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], authorities = authorities.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], hid = hid.asInstanceOf[js.Any], inn = inn.asInstanceOf[js.Any], kpp = kpp.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ogrn = ogrn.asInstanceOf[js.Any], ogrn_date = ogrn_date.asInstanceOf[js.Any], okved = okved.asInstanceOf[js.Any], okved_type = okved_type.asInstanceOf[js.Any], opf = opf.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], qc = qc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], capital = null, employee_count = null, finance = null, founders = null, managers = null, okato = null, okfs = null, okogu = null, okpo = null, oktmo = null, okveds = null, predecessors = null, successors = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Party]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Party] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: Suggestion[PartyAddress]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAuthorities(value: Null): Self = StObject.set(x, "authorities", value.asInstanceOf[js.Any])
      
      inline def setBranch_count(value: Double): Self = StObject.set(x, "branch_count", value.asInstanceOf[js.Any])
      
      inline def setBranch_countUndefined: Self = StObject.set(x, "branch_count", js.undefined)
      
      inline def setBranch_type(value: PartyBranchType): Self = StObject.set(x, "branch_type", value.asInstanceOf[js.Any])
      
      inline def setBranch_typeUndefined: Self = StObject.set(x, "branch_type", js.undefined)
      
      inline def setCapital(value: Nullable[String]): Self = StObject.set(x, "capital", value.asInstanceOf[js.Any])
      
      inline def setCapitalNull: Self = StObject.set(x, "capital", null)
      
      inline def setDocuments(value: Null): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setEmails(value: Null): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmployee_count(value: Nullable[String]): Self = StObject.set(x, "employee_count", value.asInstanceOf[js.Any])
      
      inline def setEmployee_countNull: Self = StObject.set(x, "employee_count", null)
      
      inline def setFinance(value: Nullable[Debt]): Self = StObject.set(x, "finance", value.asInstanceOf[js.Any])
      
      inline def setFinanceNull: Self = StObject.set(x, "finance", null)
      
      inline def setFounders(value: Nullable[js.Array[String]]): Self = StObject.set(x, "founders", value.asInstanceOf[js.Any])
      
      inline def setFoundersNull: Self = StObject.set(x, "founders", null)
      
      inline def setFoundersVarargs(value: String*): Self = StObject.set(x, "founders", js.Array(value*))
      
      inline def setHid(value: String): Self = StObject.set(x, "hid", value.asInstanceOf[js.Any])
      
      inline def setInn(value: String): Self = StObject.set(x, "inn", value.asInstanceOf[js.Any])
      
      inline def setKpp(value: String): Self = StObject.set(x, "kpp", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: Null): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setManagement(value: Nullable[Disqualified]): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
      
      inline def setManagementNull: Self = StObject.set(x, "management", null)
      
      inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
      
      inline def setManagers(value: Nullable[js.Array[String]]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersNull: Self = StObject.set(x, "managers", null)
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value*))
      
      inline def setName(value: Full): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOgrn(value: String): Self = StObject.set(x, "ogrn", value.asInstanceOf[js.Any])
      
      inline def setOgrn_date(value: Double): Self = StObject.set(x, "ogrn_date", value.asInstanceOf[js.Any])
      
      inline def setOkato(value: Nullable[String]): Self = StObject.set(x, "okato", value.asInstanceOf[js.Any])
      
      inline def setOkatoNull: Self = StObject.set(x, "okato", null)
      
      inline def setOkfs(value: Nullable[String]): Self = StObject.set(x, "okfs", value.asInstanceOf[js.Any])
      
      inline def setOkfsNull: Self = StObject.set(x, "okfs", null)
      
      inline def setOkogu(value: Nullable[String]): Self = StObject.set(x, "okogu", value.asInstanceOf[js.Any])
      
      inline def setOkoguNull: Self = StObject.set(x, "okogu", null)
      
      inline def setOkpo(value: Nullable[String]): Self = StObject.set(x, "okpo", value.asInstanceOf[js.Any])
      
      inline def setOkpoNull: Self = StObject.set(x, "okpo", null)
      
      inline def setOktmo(value: Nullable[String]): Self = StObject.set(x, "oktmo", value.asInstanceOf[js.Any])
      
      inline def setOktmoNull: Self = StObject.set(x, "oktmo", null)
      
      inline def setOkved(value: String): Self = StObject.set(x, "okved", value.asInstanceOf[js.Any])
      
      inline def setOkved_type(value: String): Self = StObject.set(x, "okved_type", value.asInstanceOf[js.Any])
      
      inline def setOkveds(value: Nullable[js.Array[String]]): Self = StObject.set(x, "okveds", value.asInstanceOf[js.Any])
      
      inline def setOkvedsNull: Self = StObject.set(x, "okveds", null)
      
      inline def setOkvedsVarargs(value: String*): Self = StObject.set(x, "okveds", js.Array(value*))
      
      inline def setOpf(value: Code): Self = StObject.set(x, "opf", value.asInstanceOf[js.Any])
      
      inline def setPhones(value: Null): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      inline def setPredecessors(value: Nullable[js.Array[String]]): Self = StObject.set(x, "predecessors", value.asInstanceOf[js.Any])
      
      inline def setPredecessorsNull: Self = StObject.set(x, "predecessors", null)
      
      inline def setPredecessorsVarargs(value: String*): Self = StObject.set(x, "predecessors", js.Array(value*))
      
      inline def setQc(value: Null): Self = StObject.set(x, "qc", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setState(value: Actualitydate): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSuccessors(value: Nullable[js.Array[String]]): Self = StObject.set(x, "successors", value.asInstanceOf[js.Any])
      
      inline def setSuccessorsNull: Self = StObject.set(x, "successors", null)
      
      inline def setSuccessorsVarargs(value: String*): Self = StObject.set(x, "successors", js.Array(value*))
      
      inline def setType(value: PartyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<dadata-api.dadata-api.DaDataApi.Address, 'qc' | 'house_cadnum' | 'stead_kladr_id' | 'floor' | 'flat_price'> */
  trait PartyAddress extends StObject {
    
    var area: Nullable[String]
    
    var area_fias_id: Nullable[String]
    
    var area_kladr_id: Nullable[String]
    
    var area_type: Nullable[String]
    
    var area_type_full: Nullable[String]
    
    var area_with_type: Nullable[String]
    
    var beltway_distance: Nullable[String]
    
    var beltway_hit: Nullable[AddressBeltwayHit]
    
    var block: Nullable[String]
    
    var block_type: Nullable[String]
    
    var block_type_full: Nullable[String]
    
    var capital_marker: `0` | `1` | `2` | `3` | `4`
    
    var city: Nullable[String]
    
    var city_area: Nullable[String]
    
    var city_district: Nullable[String]
    
    var city_district_fias_id: Nullable[String]
    
    var city_district_kladr_id: Nullable[String]
    
    var city_district_type: Nullable[String]
    
    var city_district_type_full: Nullable[String]
    
    var city_district_with_type: Nullable[String]
    
    var city_fias_id: Nullable[String]
    
    var city_kladr_id: Nullable[String]
    
    var city_type: Nullable[String]
    
    var city_type_full: Nullable[String]
    
    var city_with_type: Nullable[String]
    
    var country: String
    
    var country_iso_code: String
    
    var divisions: js.UndefOr[Any] = js.undefined
    
    var entrance: js.UndefOr[Null] = js.undefined
    
    var federal_district: Nullable[String]
    
    var fias_actuality_state: String
    
    var fias_code: String
    
    var fias_id: String
    
    var fias_level: String
    
    var flat: Nullable[String]
    
    var flat_area: Nullable[String]
    
    var flat_cadnum: js.UndefOr[Null] = js.undefined
    
    var flat_fias_id: js.UndefOr[Nullable[String]] = js.undefined
    
    var flat_price: Nullable[String]
    
    var flat_type: Nullable[String]
    
    var flat_type_full: Nullable[String]
    
    var floor: Nullable[String]
    
    var geo_lat: Nullable[String]
    
    var geo_lon: Nullable[String]
    
    var geoname_id: Nullable[String]
    
    var history_values: Nullable[js.Array[String]]
    
    var house: Nullable[String]
    
    var house_cadnum: Nullable[String]
    
    var house_fias_id: Nullable[String]
    
    var house_kladr_id: Nullable[String]
    
    var house_type: Nullable[String]
    
    var house_type_full: Nullable[String]
    
    var kladr_id: String
    
    var metro: Nullable[js.Array[AddressMetro]]
    
    var okato: Nullable[String]
    
    var oktmo: Nullable[String]
    
    var postal_box: Nullable[String]
    
    var postal_code: Nullable[String]
    
    var qc: `0` | `1` | `3`
    
    var qc_complete: Null
    
    var qc_geo: Nullable[`0` | `1` | `2` | `3` | `4` | `5`]
    
    var qc_house: Null
    
    var region: String
    
    var region_fias_id: String
    
    var region_iso_code: String
    
    var region_kladr_id: String
    
    var region_type: String
    
    var region_type_full: String
    
    var region_with_type: String
    
    var settlement: Nullable[String]
    
    var settlement_fias_id: Nullable[String]
    
    var settlement_kladr_id: Nullable[String]
    
    var settlement_type: Nullable[String]
    
    var settlement_type_full: Nullable[String]
    
    var settlement_with_type: Nullable[String]
    
    var source: Nullable[String]
    
    var square_meter_price: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_cadnum: js.UndefOr[Null] = js.undefined
    
    var stead_fias_id: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_type: js.UndefOr[Nullable[String]] = js.undefined
    
    var stead_type_full: js.UndefOr[Nullable[String]] = js.undefined
    
    var street: Nullable[String]
    
    var street_fias_id: Nullable[String]
    
    var street_kladr_id: Nullable[String]
    
    var street_type: Nullable[String]
    
    var street_type_full: Nullable[String]
    
    var street_with_type: Nullable[String]
    
    var tax_office: Nullable[String]
    
    var tax_office_legal: Nullable[String]
    
    var timezone: Nullable[String]
    
    var unparsed_parts: Null
  }
  object PartyAddress {
    
    inline def apply(
      capital_marker: `0` | `1` | `2` | `3` | `4`,
      country: String,
      country_iso_code: String,
      fias_actuality_state: String,
      fias_code: String,
      fias_id: String,
      fias_level: String,
      kladr_id: String,
      qc: `0` | `1` | `3`,
      qc_complete: Null,
      qc_house: Null,
      region: String,
      region_fias_id: String,
      region_iso_code: String,
      region_kladr_id: String,
      region_type: String,
      region_type_full: String,
      region_with_type: String,
      unparsed_parts: Null
    ): PartyAddress = {
      val __obj = js.Dynamic.literal(capital_marker = capital_marker.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_iso_code = country_iso_code.asInstanceOf[js.Any], fias_actuality_state = fias_actuality_state.asInstanceOf[js.Any], fias_code = fias_code.asInstanceOf[js.Any], fias_id = fias_id.asInstanceOf[js.Any], fias_level = fias_level.asInstanceOf[js.Any], kladr_id = kladr_id.asInstanceOf[js.Any], qc = qc.asInstanceOf[js.Any], qc_complete = qc_complete.asInstanceOf[js.Any], qc_house = qc_house.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], region_fias_id = region_fias_id.asInstanceOf[js.Any], region_iso_code = region_iso_code.asInstanceOf[js.Any], region_kladr_id = region_kladr_id.asInstanceOf[js.Any], region_type = region_type.asInstanceOf[js.Any], region_type_full = region_type_full.asInstanceOf[js.Any], region_with_type = region_with_type.asInstanceOf[js.Any], unparsed_parts = unparsed_parts.asInstanceOf[js.Any], area = null, area_fias_id = null, area_kladr_id = null, area_type = null, area_type_full = null, area_with_type = null, beltway_distance = null, beltway_hit = null, block = null, block_type = null, block_type_full = null, city = null, city_area = null, city_district = null, city_district_fias_id = null, city_district_kladr_id = null, city_district_type = null, city_district_type_full = null, city_district_with_type = null, city_fias_id = null, city_kladr_id = null, city_type = null, city_type_full = null, city_with_type = null, federal_district = null, flat = null, flat_area = null, flat_price = null, flat_type = null, flat_type_full = null, floor = null, geo_lat = null, geo_lon = null, geoname_id = null, history_values = null, house = null, house_cadnum = null, house_fias_id = null, house_kladr_id = null, house_type = null, house_type_full = null, metro = null, okato = null, oktmo = null, postal_box = null, postal_code = null, qc_geo = null, settlement = null, settlement_fias_id = null, settlement_kladr_id = null, settlement_type = null, settlement_type_full = null, settlement_with_type = null, source = null, street = null, street_fias_id = null, street_kladr_id = null, street_type = null, street_type_full = null, street_with_type = null, tax_office = null, tax_office_legal = null, timezone = null)
      __obj.asInstanceOf[PartyAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartyAddress] (val x: Self) extends AnyVal {
      
      inline def setArea(value: Nullable[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaNull: Self = StObject.set(x, "area", null)
      
      inline def setArea_fias_id(value: Nullable[String]): Self = StObject.set(x, "area_fias_id", value.asInstanceOf[js.Any])
      
      inline def setArea_fias_idNull: Self = StObject.set(x, "area_fias_id", null)
      
      inline def setArea_kladr_id(value: Nullable[String]): Self = StObject.set(x, "area_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setArea_kladr_idNull: Self = StObject.set(x, "area_kladr_id", null)
      
      inline def setArea_type(value: Nullable[String]): Self = StObject.set(x, "area_type", value.asInstanceOf[js.Any])
      
      inline def setArea_typeNull: Self = StObject.set(x, "area_type", null)
      
      inline def setArea_type_full(value: Nullable[String]): Self = StObject.set(x, "area_type_full", value.asInstanceOf[js.Any])
      
      inline def setArea_type_fullNull: Self = StObject.set(x, "area_type_full", null)
      
      inline def setArea_with_type(value: Nullable[String]): Self = StObject.set(x, "area_with_type", value.asInstanceOf[js.Any])
      
      inline def setArea_with_typeNull: Self = StObject.set(x, "area_with_type", null)
      
      inline def setBeltway_distance(value: Nullable[String]): Self = StObject.set(x, "beltway_distance", value.asInstanceOf[js.Any])
      
      inline def setBeltway_distanceNull: Self = StObject.set(x, "beltway_distance", null)
      
      inline def setBeltway_hit(value: Nullable[AddressBeltwayHit]): Self = StObject.set(x, "beltway_hit", value.asInstanceOf[js.Any])
      
      inline def setBeltway_hitNull: Self = StObject.set(x, "beltway_hit", null)
      
      inline def setBlock(value: Nullable[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockNull: Self = StObject.set(x, "block", null)
      
      inline def setBlock_type(value: Nullable[String]): Self = StObject.set(x, "block_type", value.asInstanceOf[js.Any])
      
      inline def setBlock_typeNull: Self = StObject.set(x, "block_type", null)
      
      inline def setBlock_type_full(value: Nullable[String]): Self = StObject.set(x, "block_type_full", value.asInstanceOf[js.Any])
      
      inline def setBlock_type_fullNull: Self = StObject.set(x, "block_type_full", null)
      
      inline def setCapital_marker(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "capital_marker", value.asInstanceOf[js.Any])
      
      inline def setCity(value: Nullable[String]): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityNull: Self = StObject.set(x, "city", null)
      
      inline def setCity_area(value: Nullable[String]): Self = StObject.set(x, "city_area", value.asInstanceOf[js.Any])
      
      inline def setCity_areaNull: Self = StObject.set(x, "city_area", null)
      
      inline def setCity_district(value: Nullable[String]): Self = StObject.set(x, "city_district", value.asInstanceOf[js.Any])
      
      inline def setCity_districtNull: Self = StObject.set(x, "city_district", null)
      
      inline def setCity_district_fias_id(value: Nullable[String]): Self = StObject.set(x, "city_district_fias_id", value.asInstanceOf[js.Any])
      
      inline def setCity_district_fias_idNull: Self = StObject.set(x, "city_district_fias_id", null)
      
      inline def setCity_district_kladr_id(value: Nullable[String]): Self = StObject.set(x, "city_district_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setCity_district_kladr_idNull: Self = StObject.set(x, "city_district_kladr_id", null)
      
      inline def setCity_district_type(value: Nullable[String]): Self = StObject.set(x, "city_district_type", value.asInstanceOf[js.Any])
      
      inline def setCity_district_typeNull: Self = StObject.set(x, "city_district_type", null)
      
      inline def setCity_district_type_full(value: Nullable[String]): Self = StObject.set(x, "city_district_type_full", value.asInstanceOf[js.Any])
      
      inline def setCity_district_type_fullNull: Self = StObject.set(x, "city_district_type_full", null)
      
      inline def setCity_district_with_type(value: Nullable[String]): Self = StObject.set(x, "city_district_with_type", value.asInstanceOf[js.Any])
      
      inline def setCity_district_with_typeNull: Self = StObject.set(x, "city_district_with_type", null)
      
      inline def setCity_fias_id(value: Nullable[String]): Self = StObject.set(x, "city_fias_id", value.asInstanceOf[js.Any])
      
      inline def setCity_fias_idNull: Self = StObject.set(x, "city_fias_id", null)
      
      inline def setCity_kladr_id(value: Nullable[String]): Self = StObject.set(x, "city_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setCity_kladr_idNull: Self = StObject.set(x, "city_kladr_id", null)
      
      inline def setCity_type(value: Nullable[String]): Self = StObject.set(x, "city_type", value.asInstanceOf[js.Any])
      
      inline def setCity_typeNull: Self = StObject.set(x, "city_type", null)
      
      inline def setCity_type_full(value: Nullable[String]): Self = StObject.set(x, "city_type_full", value.asInstanceOf[js.Any])
      
      inline def setCity_type_fullNull: Self = StObject.set(x, "city_type_full", null)
      
      inline def setCity_with_type(value: Nullable[String]): Self = StObject.set(x, "city_with_type", value.asInstanceOf[js.Any])
      
      inline def setCity_with_typeNull: Self = StObject.set(x, "city_with_type", null)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountry_iso_code(value: String): Self = StObject.set(x, "country_iso_code", value.asInstanceOf[js.Any])
      
      inline def setDivisions(value: Any): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
      
      inline def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
      
      inline def setFederal_district(value: Nullable[String]): Self = StObject.set(x, "federal_district", value.asInstanceOf[js.Any])
      
      inline def setFederal_districtNull: Self = StObject.set(x, "federal_district", null)
      
      inline def setFias_actuality_state(value: String): Self = StObject.set(x, "fias_actuality_state", value.asInstanceOf[js.Any])
      
      inline def setFias_code(value: String): Self = StObject.set(x, "fias_code", value.asInstanceOf[js.Any])
      
      inline def setFias_id(value: String): Self = StObject.set(x, "fias_id", value.asInstanceOf[js.Any])
      
      inline def setFias_level(value: String): Self = StObject.set(x, "fias_level", value.asInstanceOf[js.Any])
      
      inline def setFlat(value: Nullable[String]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatNull: Self = StObject.set(x, "flat", null)
      
      inline def setFlat_area(value: Nullable[String]): Self = StObject.set(x, "flat_area", value.asInstanceOf[js.Any])
      
      inline def setFlat_areaNull: Self = StObject.set(x, "flat_area", null)
      
      inline def setFlat_fias_id(value: Nullable[String]): Self = StObject.set(x, "flat_fias_id", value.asInstanceOf[js.Any])
      
      inline def setFlat_fias_idNull: Self = StObject.set(x, "flat_fias_id", null)
      
      inline def setFlat_fias_idUndefined: Self = StObject.set(x, "flat_fias_id", js.undefined)
      
      inline def setFlat_price(value: Nullable[String]): Self = StObject.set(x, "flat_price", value.asInstanceOf[js.Any])
      
      inline def setFlat_priceNull: Self = StObject.set(x, "flat_price", null)
      
      inline def setFlat_type(value: Nullable[String]): Self = StObject.set(x, "flat_type", value.asInstanceOf[js.Any])
      
      inline def setFlat_typeNull: Self = StObject.set(x, "flat_type", null)
      
      inline def setFlat_type_full(value: Nullable[String]): Self = StObject.set(x, "flat_type_full", value.asInstanceOf[js.Any])
      
      inline def setFlat_type_fullNull: Self = StObject.set(x, "flat_type_full", null)
      
      inline def setFloor(value: Nullable[String]): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorNull: Self = StObject.set(x, "floor", null)
      
      inline def setGeo_lat(value: Nullable[String]): Self = StObject.set(x, "geo_lat", value.asInstanceOf[js.Any])
      
      inline def setGeo_latNull: Self = StObject.set(x, "geo_lat", null)
      
      inline def setGeo_lon(value: Nullable[String]): Self = StObject.set(x, "geo_lon", value.asInstanceOf[js.Any])
      
      inline def setGeo_lonNull: Self = StObject.set(x, "geo_lon", null)
      
      inline def setGeoname_id(value: Nullable[String]): Self = StObject.set(x, "geoname_id", value.asInstanceOf[js.Any])
      
      inline def setGeoname_idNull: Self = StObject.set(x, "geoname_id", null)
      
      inline def setHistory_values(value: Nullable[js.Array[String]]): Self = StObject.set(x, "history_values", value.asInstanceOf[js.Any])
      
      inline def setHistory_valuesNull: Self = StObject.set(x, "history_values", null)
      
      inline def setHistory_valuesVarargs(value: String*): Self = StObject.set(x, "history_values", js.Array(value*))
      
      inline def setHouse(value: Nullable[String]): Self = StObject.set(x, "house", value.asInstanceOf[js.Any])
      
      inline def setHouseNull: Self = StObject.set(x, "house", null)
      
      inline def setHouse_cadnum(value: Nullable[String]): Self = StObject.set(x, "house_cadnum", value.asInstanceOf[js.Any])
      
      inline def setHouse_cadnumNull: Self = StObject.set(x, "house_cadnum", null)
      
      inline def setHouse_fias_id(value: Nullable[String]): Self = StObject.set(x, "house_fias_id", value.asInstanceOf[js.Any])
      
      inline def setHouse_fias_idNull: Self = StObject.set(x, "house_fias_id", null)
      
      inline def setHouse_kladr_id(value: Nullable[String]): Self = StObject.set(x, "house_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setHouse_kladr_idNull: Self = StObject.set(x, "house_kladr_id", null)
      
      inline def setHouse_type(value: Nullable[String]): Self = StObject.set(x, "house_type", value.asInstanceOf[js.Any])
      
      inline def setHouse_typeNull: Self = StObject.set(x, "house_type", null)
      
      inline def setHouse_type_full(value: Nullable[String]): Self = StObject.set(x, "house_type_full", value.asInstanceOf[js.Any])
      
      inline def setHouse_type_fullNull: Self = StObject.set(x, "house_type_full", null)
      
      inline def setKladr_id(value: String): Self = StObject.set(x, "kladr_id", value.asInstanceOf[js.Any])
      
      inline def setMetro(value: Nullable[js.Array[AddressMetro]]): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
      
      inline def setMetroNull: Self = StObject.set(x, "metro", null)
      
      inline def setMetroVarargs(value: AddressMetro*): Self = StObject.set(x, "metro", js.Array(value*))
      
      inline def setOkato(value: Nullable[String]): Self = StObject.set(x, "okato", value.asInstanceOf[js.Any])
      
      inline def setOkatoNull: Self = StObject.set(x, "okato", null)
      
      inline def setOktmo(value: Nullable[String]): Self = StObject.set(x, "oktmo", value.asInstanceOf[js.Any])
      
      inline def setOktmoNull: Self = StObject.set(x, "oktmo", null)
      
      inline def setPostal_box(value: Nullable[String]): Self = StObject.set(x, "postal_box", value.asInstanceOf[js.Any])
      
      inline def setPostal_boxNull: Self = StObject.set(x, "postal_box", null)
      
      inline def setPostal_code(value: Nullable[String]): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
      
      inline def setQc(value: `0` | `1` | `3`): Self = StObject.set(x, "qc", value.asInstanceOf[js.Any])
      
      inline def setQc_complete(value: Null): Self = StObject.set(x, "qc_complete", value.asInstanceOf[js.Any])
      
      inline def setQc_geo(value: Nullable[`0` | `1` | `2` | `3` | `4` | `5`]): Self = StObject.set(x, "qc_geo", value.asInstanceOf[js.Any])
      
      inline def setQc_geoNull: Self = StObject.set(x, "qc_geo", null)
      
      inline def setQc_house(value: Null): Self = StObject.set(x, "qc_house", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegion_fias_id(value: String): Self = StObject.set(x, "region_fias_id", value.asInstanceOf[js.Any])
      
      inline def setRegion_iso_code(value: String): Self = StObject.set(x, "region_iso_code", value.asInstanceOf[js.Any])
      
      inline def setRegion_kladr_id(value: String): Self = StObject.set(x, "region_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setRegion_type(value: String): Self = StObject.set(x, "region_type", value.asInstanceOf[js.Any])
      
      inline def setRegion_type_full(value: String): Self = StObject.set(x, "region_type_full", value.asInstanceOf[js.Any])
      
      inline def setRegion_with_type(value: String): Self = StObject.set(x, "region_with_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement(value: Nullable[String]): Self = StObject.set(x, "settlement", value.asInstanceOf[js.Any])
      
      inline def setSettlementNull: Self = StObject.set(x, "settlement", null)
      
      inline def setSettlement_fias_id(value: Nullable[String]): Self = StObject.set(x, "settlement_fias_id", value.asInstanceOf[js.Any])
      
      inline def setSettlement_fias_idNull: Self = StObject.set(x, "settlement_fias_id", null)
      
      inline def setSettlement_kladr_id(value: Nullable[String]): Self = StObject.set(x, "settlement_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setSettlement_kladr_idNull: Self = StObject.set(x, "settlement_kladr_id", null)
      
      inline def setSettlement_type(value: Nullable[String]): Self = StObject.set(x, "settlement_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement_typeNull: Self = StObject.set(x, "settlement_type", null)
      
      inline def setSettlement_type_full(value: Nullable[String]): Self = StObject.set(x, "settlement_type_full", value.asInstanceOf[js.Any])
      
      inline def setSettlement_type_fullNull: Self = StObject.set(x, "settlement_type_full", null)
      
      inline def setSettlement_with_type(value: Nullable[String]): Self = StObject.set(x, "settlement_with_type", value.asInstanceOf[js.Any])
      
      inline def setSettlement_with_typeNull: Self = StObject.set(x, "settlement_with_type", null)
      
      inline def setSource(value: Nullable[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSquare_meter_price(value: Nullable[String]): Self = StObject.set(x, "square_meter_price", value.asInstanceOf[js.Any])
      
      inline def setSquare_meter_priceNull: Self = StObject.set(x, "square_meter_price", null)
      
      inline def setSquare_meter_priceUndefined: Self = StObject.set(x, "square_meter_price", js.undefined)
      
      inline def setStead(value: Nullable[String]): Self = StObject.set(x, "stead", value.asInstanceOf[js.Any])
      
      inline def setSteadNull: Self = StObject.set(x, "stead", null)
      
      inline def setSteadUndefined: Self = StObject.set(x, "stead", js.undefined)
      
      inline def setStead_fias_id(value: Nullable[String]): Self = StObject.set(x, "stead_fias_id", value.asInstanceOf[js.Any])
      
      inline def setStead_fias_idNull: Self = StObject.set(x, "stead_fias_id", null)
      
      inline def setStead_fias_idUndefined: Self = StObject.set(x, "stead_fias_id", js.undefined)
      
      inline def setStead_type(value: Nullable[String]): Self = StObject.set(x, "stead_type", value.asInstanceOf[js.Any])
      
      inline def setStead_typeNull: Self = StObject.set(x, "stead_type", null)
      
      inline def setStead_typeUndefined: Self = StObject.set(x, "stead_type", js.undefined)
      
      inline def setStead_type_full(value: Nullable[String]): Self = StObject.set(x, "stead_type_full", value.asInstanceOf[js.Any])
      
      inline def setStead_type_fullNull: Self = StObject.set(x, "stead_type_full", null)
      
      inline def setStead_type_fullUndefined: Self = StObject.set(x, "stead_type_full", js.undefined)
      
      inline def setStreet(value: Nullable[String]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetNull: Self = StObject.set(x, "street", null)
      
      inline def setStreet_fias_id(value: Nullable[String]): Self = StObject.set(x, "street_fias_id", value.asInstanceOf[js.Any])
      
      inline def setStreet_fias_idNull: Self = StObject.set(x, "street_fias_id", null)
      
      inline def setStreet_kladr_id(value: Nullable[String]): Self = StObject.set(x, "street_kladr_id", value.asInstanceOf[js.Any])
      
      inline def setStreet_kladr_idNull: Self = StObject.set(x, "street_kladr_id", null)
      
      inline def setStreet_type(value: Nullable[String]): Self = StObject.set(x, "street_type", value.asInstanceOf[js.Any])
      
      inline def setStreet_typeNull: Self = StObject.set(x, "street_type", null)
      
      inline def setStreet_type_full(value: Nullable[String]): Self = StObject.set(x, "street_type_full", value.asInstanceOf[js.Any])
      
      inline def setStreet_type_fullNull: Self = StObject.set(x, "street_type_full", null)
      
      inline def setStreet_with_type(value: Nullable[String]): Self = StObject.set(x, "street_with_type", value.asInstanceOf[js.Any])
      
      inline def setStreet_with_typeNull: Self = StObject.set(x, "street_with_type", null)
      
      inline def setTax_office(value: Nullable[String]): Self = StObject.set(x, "tax_office", value.asInstanceOf[js.Any])
      
      inline def setTax_officeNull: Self = StObject.set(x, "tax_office", null)
      
      inline def setTax_office_legal(value: Nullable[String]): Self = StObject.set(x, "tax_office_legal", value.asInstanceOf[js.Any])
      
      inline def setTax_office_legalNull: Self = StObject.set(x, "tax_office_legal", null)
      
      inline def setTimezone(value: Nullable[String]): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
      
      inline def setUnparsed_parts(value: Null): Self = StObject.set(x, "unparsed_parts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.MAIN
    - typings.dadataApi.dadataApiStrings.BRANCH
  */
  trait PartyBranchType extends StObject
  object PartyBranchType {
    
    inline def BRANCH: typings.dadataApi.dadataApiStrings.BRANCH = "BRANCH".asInstanceOf[typings.dadataApi.dadataApiStrings.BRANCH]
    
    inline def MAIN: typings.dadataApi.dadataApiStrings.MAIN = "MAIN".asInstanceOf[typings.dadataApi.dadataApiStrings.MAIN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.ACTIVE
    - typings.dadataApi.dadataApiStrings.LIQUIDATING
    - typings.dadataApi.dadataApiStrings.LIQUIDATED
    - typings.dadataApi.dadataApiStrings.REORGANIZING
    - typings.dadataApi.dadataApiStrings.BANKRUPT
  */
  trait PartyStatus extends StObject
  object PartyStatus {
    
    inline def ACTIVE: typings.dadataApi.dadataApiStrings.ACTIVE = "ACTIVE".asInstanceOf[typings.dadataApi.dadataApiStrings.ACTIVE]
    
    inline def BANKRUPT: typings.dadataApi.dadataApiStrings.BANKRUPT = "BANKRUPT".asInstanceOf[typings.dadataApi.dadataApiStrings.BANKRUPT]
    
    inline def LIQUIDATED: typings.dadataApi.dadataApiStrings.LIQUIDATED = "LIQUIDATED".asInstanceOf[typings.dadataApi.dadataApiStrings.LIQUIDATED]
    
    inline def LIQUIDATING: typings.dadataApi.dadataApiStrings.LIQUIDATING = "LIQUIDATING".asInstanceOf[typings.dadataApi.dadataApiStrings.LIQUIDATING]
    
    inline def REORGANIZING: typings.dadataApi.dadataApiStrings.REORGANIZING = "REORGANIZING".asInstanceOf[typings.dadataApi.dadataApiStrings.REORGANIZING]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dadataApi.dadataApiStrings.LEGAL
    - typings.dadataApi.dadataApiStrings.INDIVIDUAL
  */
  trait PartyType extends StObject
  object PartyType {
    
    inline def INDIVIDUAL: typings.dadataApi.dadataApiStrings.INDIVIDUAL = "INDIVIDUAL".asInstanceOf[typings.dadataApi.dadataApiStrings.INDIVIDUAL]
    
    inline def LEGAL: typings.dadataApi.dadataApiStrings.LEGAL = "LEGAL".asInstanceOf[typings.dadataApi.dadataApiStrings.LEGAL]
  }
  
  trait Suggestion[T] extends StObject {
    
    var data: T
    
    var unrestricted_value: String
    
    var value: String
  }
  object Suggestion {
    
    inline def apply[T](data: T, unrestricted_value: String, value: String): Suggestion[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], unrestricted_value = unrestricted_value.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggestion[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Suggestion[?], T] (val x: Self & Suggestion[T]) extends AnyVal {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUnrestricted_value(value: String): Self = StObject.set(x, "unrestricted_value", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
