package typings.countriesAndTimezones

import typings.countriesAndTimezones.anon.RecordCountryCodeCountry
import typings.countriesAndTimezones.anon.RecordTimezoneNameTimezon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("countries-and-timezones", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllCountries(): RecordCountryCodeCountry = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCountries")().asInstanceOf[RecordCountryCodeCountry]
  inline def getAllCountries(options: Options): RecordCountryCodeCountry = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllCountries")(options.asInstanceOf[js.Any]).asInstanceOf[RecordCountryCodeCountry]
  
  inline def getAllTimezones(): RecordTimezoneNameTimezon = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTimezones")().asInstanceOf[RecordTimezoneNameTimezon]
  inline def getAllTimezones(options: Options): RecordTimezoneNameTimezon = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTimezones")(options.asInstanceOf[js.Any]).asInstanceOf[RecordTimezoneNameTimezon]
  
  inline def getCountriesForTimezone(name: String): js.Array[Country] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country] | Null]
  inline def getCountriesForTimezone(name: String, options: Options): js.Array[Country] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country] | Null]
  inline def getCountriesForTimezone(name: TimezoneName): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  inline def getCountriesForTimezone(name: TimezoneName, options: Options): js.Array[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country]]
  
  inline def getCountriesForTimezone_Array(name: String): js.Array[Country] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Country]]
  inline def getCountriesForTimezone_Array(name: String, options: Options): js.Array[Country] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountriesForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Country]]
  
  inline def getCountry(id: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  inline def getCountry(id: String, options: Options): Country | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country | Null]
  inline def getCountry(id: CountryCode): Country = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any]).asInstanceOf[Country]
  inline def getCountry(id: CountryCode, options: Options): Country = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country]
  
  inline def getCountryForTimezone(name: String): Country | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Country | Null]
  inline def getCountryForTimezone(name: String, options: Options): Country | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country | Null]
  inline def getCountryForTimezone(name: TimezoneName): Country = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Country]
  inline def getCountryForTimezone(name: TimezoneName, options: Options): Country = (^.asInstanceOf[js.Dynamic].applyDynamic("getCountryForTimezone")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Country]
  
  inline def getTimezone(name: String): Timezone | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Timezone | Null]
  inline def getTimezone(name: TimezoneName): Timezone = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")(name.asInstanceOf[js.Any]).asInstanceOf[Timezone]
  
  inline def getTimezonesForCountry(id: String): js.Array[Timezone] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Timezone] | Null]
  inline def getTimezonesForCountry(id: String, options: Options): js.Array[Timezone] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Timezone] | Null]
  inline def getTimezonesForCountry(id: CountryCode): js.Array[Timezone] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[Timezone]]
  inline def getTimezonesForCountry(id: CountryCode, options: Options): js.Array[Timezone] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezonesForCountry")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Timezone]]
  
  trait Country extends StObject {
    
    var id: CountryCode
    
    var name: String
    
    var timezones: js.Array[TimezoneName]
  }
  object Country {
    
    extension [Self <: Country](x: Self) {
      
      inline def setId(value: CountryCode): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimezones(value: js.Array[TimezoneName]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
      
      inline def setTimezonesVarargs(value: TimezoneName*): Self = StObject.set(x, "timezones", js.Array(value*))
    }
  }
  
  /* keyof countries-and-timezones.anon.AD */ /* Rewritten from type alias, can be one of: 
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AQ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AX
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BB
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BJ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BQ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CX
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DJ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.DZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ER
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ES
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ET
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FJ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.FR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GB
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GP
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GQ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ID
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IQ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.JE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.JM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.JO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.JP
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KP
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.KZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LB
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.LY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ME
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ML
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MP
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MQ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MX
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NP
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.OM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.QA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.RE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.RO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.RS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.RU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.RW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SB
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SJ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ST
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SX
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.SZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TD
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TH
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TJ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TL
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TO
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TR
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TV
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.TZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.US
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UY
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VG
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.VU
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.WF
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.WS
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.YE
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.YT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ZA
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ZM
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ZW
  */
  trait CountryCode extends StObject
  
  trait Options extends StObject {
    
    var deprecated: Boolean
  }
  object Options {
    
    inline def apply(deprecated: Boolean): Options = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timezone extends StObject {
    
    var aliasOf: String | Null
    
    var countries: js.Array[CountryCode]
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var dstOffset: Double
    
    var dstOffsetStr: String
    
    var name: String
    
    var utcOffset: Double
    
    var utcOffsetStr: String
  }
  object Timezone {
    
    inline def apply(
      countries: js.Array[CountryCode],
      dstOffset: Double,
      dstOffsetStr: String,
      name: String,
      utcOffset: Double,
      utcOffsetStr: String
    ): Timezone = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], dstOffset = dstOffset.asInstanceOf[js.Any], dstOffsetStr = dstOffsetStr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], utcOffsetStr = utcOffsetStr.asInstanceOf[js.Any], aliasOf = null)
      __obj.asInstanceOf[Timezone]
    }
    
    extension [Self <: Timezone](x: Self) {
      
      inline def setAliasOf(value: String): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      inline def setAliasOfNull: Self = StObject.set(x, "aliasOf", null)
      
      inline def setCountries(value: js.Array[CountryCode]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: CountryCode*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDstOffset(value: Double): Self = StObject.set(x, "dstOffset", value.asInstanceOf[js.Any])
      
      inline def setDstOffsetStr(value: String): Self = StObject.set(x, "dstOffsetStr", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
      
      inline def setUtcOffsetStr(value: String): Self = StObject.set(x, "utcOffsetStr", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof countries-and-timezones.anon.AfricaAbidjan */ /* Rewritten from type alias, can be one of: 
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAbidjan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAccra
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAddis_Ababa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAlgiers
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAsmara
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAsmera
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBamako
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBangui
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBanjul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBissau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBlantyre
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBrazzaville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashBujumbura
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCairo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCasablanca
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashCeuta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashConakry
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDakar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDar_es_Salaam
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDjibouti
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashDouala
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashEl_Aaiun
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashFreetown
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashGaborone
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashHarare
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJohannesburg
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashJuba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKampala
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKhartoum
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKigali
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashKinshasa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLagos
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLibreville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLome
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLuanda
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLubumbashi
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLusaka
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMalabo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaputo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaseru
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMbabane
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMogadishu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMonrovia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNdjamena
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNiamey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNouakchott
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashOuagadougou
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`AfricaSlashPorto-Novo`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashSao_Tome
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTimbuktu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTripoli
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashTunis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashWindhoek
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAdak
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnchorage
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAnguilla
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAntigua
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAraguaina
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashBuenos_Aires
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCatamarca
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashComodRivadavia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashCordoba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashJujuy
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashLa_Rioja
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashMendoza
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashRio_Gallegos
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSalta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSan_Juan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashSan_Luis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashTucuman
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashArgentinaSlashUshuaia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAruba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAsuncion
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAtikokan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashAtka
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBahia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBahia_Banderas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBarbados
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBelem
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBelize
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`AmericaSlashBlanc-Sablon`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBoa_Vista
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBogota
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBoise
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashBuenos_Aires
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCambridge_Bay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCampo_Grande
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCancun
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCaracas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCatamarca
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCayenne
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCayman
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashChicago
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashChihuahua
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCoral_Harbour
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCordoba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCosta_Rica
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCreston
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCuiaba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashCuracao
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDanmarkshavn
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDawson
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDawson_Creek
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDenver
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDetroit
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashDominica
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEdmonton
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEirunepe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEl_Salvador
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashEnsenada
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFort_Nelson
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFort_Wayne
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashFortaleza
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGlace_Bay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGodthab
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGoose_Bay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGrand_Turk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGrenada
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuadeloupe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuatemala
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuayaquil
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashGuyana
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHalifax
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHavana
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashHermosillo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashIndianapolis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashKnox
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashMarengo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashPetersburg
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashTell_City
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashVevay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashVincennes
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianaSlashWinamac
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIndianapolis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashInuvik
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashIqaluit
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJamaica
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJujuy
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashJuneau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKentuckySlashLouisville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKentuckySlashMonticello
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKnox_IN
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashKralendijk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLa_Paz
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLima
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLos_Angeles
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLouisville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashLower_Princes
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMaceio
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManagua
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashManaus
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMarigot
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMartinique
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMatamoros
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMazatlan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMendoza
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMenominee
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMerida
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMetlakatla
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMexico_City
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMiquelon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMoncton
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMonterrey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontevideo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontreal
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashMontserrat
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNassau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNew_York
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNipigon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNome
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNoronha
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashBeulah
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashCenter
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNorth_DakotaSlashNew_Salem
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashNuuk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashOjinaga
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPanama
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPangnirtung
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashParamaribo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPhoenix
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`AmericaSlashPort-au-Prince`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPort_of_Spain
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPorto_Acre
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPorto_Velho
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPuerto_Rico
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPunta_Arenas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRainy_River
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRankin_Inlet
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRecife
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRegina
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashResolute
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRio_Branco
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashRosario
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSanta_Isabel
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantarem
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSantiago
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSanto_Domingo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSao_Paulo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashScoresbysund
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashShiprock
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSitka
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Barthelemy
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Johns
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Kitts
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Lucia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Thomas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSt_Vincent
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashSwift_Current
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTegucigalpa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashThule
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashThunder_Bay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTijuana
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashToronto
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashTortola
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVancouver
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashVirgin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWhitehorse
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashWinnipeg
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashYakutat
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashYellowknife
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashCasey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashDavis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashDumontDUrville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMacquarie
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMawson
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashMcMurdo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashPalmer
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashRothera
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashSouth_Pole
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashSyowa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashTroll
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AntarcticaSlashVostok
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ArcticSlashLongyearbyen
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAden
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAlmaty
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAmman
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAnadyr
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAqtau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAqtobe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAshgabat
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAshkhabad
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashAtyrau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBaghdad
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBahrain
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBaku
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBangkok
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBarnaul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBeirut
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBishkek
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBrunei
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashCalcutta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChita
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChoibalsan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChongqing
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashChungking
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashColombo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDacca
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDamascus
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDhaka
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDili
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDubai
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDushanbe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashFamagusta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashGaza
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHarbin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHebron
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHo_Chi_Minh
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHong_Kong
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashHovd
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashIrkutsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashIstanbul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJakarta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJayapura
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashJerusalem
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKabul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKamchatka
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKarachi
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKashgar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKathmandu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKatmandu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKhandyga
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKolkata
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKrasnoyarsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuala_Lumpur
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuching
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashKuwait
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMacao
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMacau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMagadan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMakassar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashManila
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashMuscat
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNicosia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNovokuznetsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashNovosibirsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashOmsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashOral
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPhnom_Penh
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPontianak
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashPyongyang
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQatar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQostanay
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashQyzylorda
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashRangoon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashRiyadh
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSaigon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSakhalin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSamarkand
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSeoul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashShanghai
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSingapore
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashSrednekolymsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTaipei
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTashkent
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTbilisi
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTehran
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTel_Aviv
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimbu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashThimphu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTokyo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashTomsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUjung_Pandang
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUlaanbaatar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUlan_Bator
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashUrumqi
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`AsiaSlashUst-Nera`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashVientiane
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashVladivostok
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYakutsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYangon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYekaterinburg
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashYerevan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashAzores
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashBermuda
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashCanary
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashCape_Verde
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashFaeroe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashFaroe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashJan_Mayen
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashMadeira
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashReykjavik
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashSouth_Georgia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashSt_Helena
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AtlanticSlashStanley
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashACT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashAdelaide
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashBrisbane
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashBroken_Hill
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashCanberra
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashCurrie
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashDarwin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashEucla
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashHobart
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLHI
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLindeman
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashLord_Howe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashMelbourne
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashNSW
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashNorth
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashPerth
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashQueensland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashSouth
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashSydney
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashTasmania
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashVictoria
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashWest
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.AustraliaSlashYancowinna
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashAcre
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashDeNoronha
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashEast
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.BrazilSlashWest
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CET
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CST6CDT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashAtlantic
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashCentral
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashEastern
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashMountain
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashNewfoundland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashPacific
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashSaskatchewan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.CanadaSlashYukon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ChileSlashContinental
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ChileSlashEasterIsland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Cuba
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EET
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EST
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EST5EDT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Egypt
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Eire
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign0
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign1
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign10
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign11
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign12
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign2
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign3
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign4
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign5
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign6
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign7
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign8
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMTPlussign9
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-0`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-1`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-10`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-11`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-12`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-13`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-14`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-2`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-3`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-4`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-5`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-6`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-7`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-8`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`EtcSlashGMT-9`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGMT0
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashGreenwich
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUCT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUTC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashUniversal
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EtcSlashZulu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAmsterdam
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAndorra
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAstrakhan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashAthens
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelfast
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBerlin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBratislava
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBrussels
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBucharest
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBudapest
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBusingen
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashChisinau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashCopenhagen
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashDublin
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashGibraltar
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashGuernsey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashHelsinki
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashIsle_of_Man
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashIstanbul
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashJersey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKaliningrad
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKiev
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashKirov
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLisbon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLjubljana
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLondon
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLuxembourg
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMadrid
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMalta
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMariehamn
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMinsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMonaco
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashMoscow
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashNicosia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashOslo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashParis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashPodgorica
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashPrague
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRiga
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashRome
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSamara
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSan_Marino
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSarajevo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSaratov
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSimferopol
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSkopje
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashSofia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashStockholm
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTallinn
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTirane
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashTiraspol
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashUlyanovsk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashUzhgorod
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVaduz
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVatican
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVienna
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVilnius
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashVolgograd
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashWarsaw
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZagreb
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZaporozhye
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashZurich
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Factory
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GB
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`GB-Eire`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GMT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GMTPlussign0
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`GMT-0`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.GMT0
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Greenwich
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.HST
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Hongkong
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Iceland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashAntananarivo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashChagos
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashChristmas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashCocos
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashComoro
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashKerguelen
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMahe
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMaldives
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMauritius
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashMayotte
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.IndianSlashReunion
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Iran
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Israel
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Jamaica
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Japan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Kwajalein
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Libya
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MET
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MST
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MST7MDT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashBajaNorte
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashBajaSur
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.MexicoSlashGeneral
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.NZ
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`NZ-CHAT`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Navajo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PRC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PST8PDT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashApia
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashAuckland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashBougainville
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashChatham
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashChuuk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEaster
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEfate
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashEnderbury
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFakaofo
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFiji
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashFunafuti
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGalapagos
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGambier
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuadalcanal
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashGuam
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashHonolulu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashJohnston
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKanton
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKiritimati
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKosrae
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashKwajalein
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMajuro
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMarquesas
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashMidway
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNauru
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNiue
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNorfolk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashNoumea
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPago_Pago
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPalau
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPitcairn
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPohnpei
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPonape
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPort_Moresby
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashRarotonga
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashSaipan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashSamoa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTahiti
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTarawa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTongatapu
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashTruk
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashWake
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashWallis
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashYap
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Poland
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Portugal
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ROC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.ROK
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Singapore
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Turkey
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UCT
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashAlaska
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashAleutian
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashArizona
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashCentral
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`USSlashEast-Indiana`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashEastern
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashHawaii
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`USSlashIndiana-Starke`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashMichigan
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashMountain
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashPacific
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.USSlashSamoa
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.UTC
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Universal
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.`W-SU`
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.WET
    - typings.countriesAndTimezones.countriesAndTimezonesStrings.Zulu
  */
  trait TimezoneName extends StObject
}
