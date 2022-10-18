package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.CountrySelect
import typings.baseui.anon.CountrySelectContainer
import typings.baseui.anon.PartialState
import typings.baseui.helpersOverridesMod.Override
import typings.baseui.selectTypesMod.OnChangeParams
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputTypesMod {
  
  /* Inlined std.Readonly<baseui.baseui/phone-input/types.Country> */
  trait Countries extends StObject {
    
    val dialCode: String
    
    val id: CountryIso
    
    val label: String
  }
  object Countries {
    
    inline def apply(dialCode: String, id: CountryIso, label: String): Countries = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countries]
    }
    
    extension [Self <: Countries](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setId(value: CountryIso): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  dialCode :string,   id :baseui.baseui/phone-input/types.CountryIso,   label :string}> */
  trait Country extends StObject {
    
    val dialCode: String
    
    val id: CountryIso
    
    val label: String
  }
  object Country {
    
    inline def apply(dialCode: String, id: CountryIso, label: String): Country = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setId(value: CountryIso): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.AD */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.AF
    - typings.baseui.baseuiStrings.AL
    - typings.baseui.baseuiStrings.DZ
    - typings.baseui.baseuiStrings.AS
    - typings.baseui.baseuiStrings.AD
    - typings.baseui.baseuiStrings.AO
    - typings.baseui.baseuiStrings.AI
    - typings.baseui.baseuiStrings.AG
    - typings.baseui.baseuiStrings.AR
    - typings.baseui.baseuiStrings.AM
    - typings.baseui.baseuiStrings.AW
    - typings.baseui.baseuiStrings.AU
    - typings.baseui.baseuiStrings.AT
    - typings.baseui.baseuiStrings.AZ
    - typings.baseui.baseuiStrings.BS
    - typings.baseui.baseuiStrings.BH
    - typings.baseui.baseuiStrings.BD
    - typings.baseui.baseuiStrings.BB
    - typings.baseui.baseuiStrings.BY
    - typings.baseui.baseuiStrings.BE
    - typings.baseui.baseuiStrings.BZ
    - typings.baseui.baseuiStrings.BJ
    - typings.baseui.baseuiStrings.BM
    - typings.baseui.baseuiStrings.BT
    - typings.baseui.baseuiStrings.BO
    - typings.baseui.baseuiStrings.BA
    - typings.baseui.baseuiStrings.BW
    - typings.baseui.baseuiStrings.BR
    - typings.baseui.baseuiStrings.IO
    - typings.baseui.baseuiStrings.VG
    - typings.baseui.baseuiStrings.BN
    - typings.baseui.baseuiStrings.BG
    - typings.baseui.baseuiStrings.BF
    - typings.baseui.baseuiStrings.BI
    - typings.baseui.baseuiStrings.KH
    - typings.baseui.baseuiStrings.CM
    - typings.baseui.baseuiStrings.CA
    - typings.baseui.baseuiStrings.CV
    - typings.baseui.baseuiStrings.KY
    - typings.baseui.baseuiStrings.CF
    - typings.baseui.baseuiStrings.TD
    - typings.baseui.baseuiStrings.CL
    - typings.baseui.baseuiStrings.CN
    - typings.baseui.baseuiStrings.CX
    - typings.baseui.baseuiStrings.CC
    - typings.baseui.baseuiStrings.CO
    - typings.baseui.baseuiStrings.KM
    - typings.baseui.baseuiStrings.CD
    - typings.baseui.baseuiStrings.CG
    - typings.baseui.baseuiStrings.CK
    - typings.baseui.baseuiStrings.CR
    - typings.baseui.baseuiStrings.CI
    - typings.baseui.baseuiStrings.HR
    - typings.baseui.baseuiStrings.CU
    - typings.baseui.baseuiStrings.CW
    - typings.baseui.baseuiStrings.CY
    - typings.baseui.baseuiStrings.CZ
    - typings.baseui.baseuiStrings.DK
    - typings.baseui.baseuiStrings.DJ
    - typings.baseui.baseuiStrings.DM
    - typings.baseui.baseuiStrings.DO
    - typings.baseui.baseuiStrings.EC
    - typings.baseui.baseuiStrings.EG
    - typings.baseui.baseuiStrings.SV
    - typings.baseui.baseuiStrings.GQ
    - typings.baseui.baseuiStrings.ER
    - typings.baseui.baseuiStrings.EE
    - typings.baseui.baseuiStrings.ET
    - typings.baseui.baseuiStrings.FK
    - typings.baseui.baseuiStrings.FO
    - typings.baseui.baseuiStrings.FJ
    - typings.baseui.baseuiStrings.FI
    - typings.baseui.baseuiStrings.FR
    - typings.baseui.baseuiStrings.GF
    - typings.baseui.baseuiStrings.PF
    - typings.baseui.baseuiStrings.GA
    - typings.baseui.baseuiStrings.GM
    - typings.baseui.baseuiStrings.GE
    - typings.baseui.baseuiStrings.DE
    - typings.baseui.baseuiStrings.GH
    - typings.baseui.baseuiStrings.GI
    - typings.baseui.baseuiStrings.GR
    - typings.baseui.baseuiStrings.GL
    - typings.baseui.baseuiStrings.GD
    - typings.baseui.baseuiStrings.GP
    - typings.baseui.baseuiStrings.GU
    - typings.baseui.baseuiStrings.GT
    - typings.baseui.baseuiStrings.GG
    - typings.baseui.baseuiStrings.GN
    - typings.baseui.baseuiStrings.GW
    - typings.baseui.baseuiStrings.GY
    - typings.baseui.baseuiStrings.HT
    - typings.baseui.baseuiStrings.HN
    - typings.baseui.baseuiStrings.HK
    - typings.baseui.baseuiStrings.HU
    - typings.baseui.baseuiStrings.IS
    - typings.baseui.baseuiStrings.IN
    - typings.baseui.baseuiStrings.ID
    - typings.baseui.baseuiStrings.IR
    - typings.baseui.baseuiStrings.IQ
    - typings.baseui.baseuiStrings.IE
    - typings.baseui.baseuiStrings.IM
    - typings.baseui.baseuiStrings.IL
    - typings.baseui.baseuiStrings.IT
    - typings.baseui.baseuiStrings.JM
    - typings.baseui.baseuiStrings.JP
    - typings.baseui.baseuiStrings.JE
    - typings.baseui.baseuiStrings.JO
    - typings.baseui.baseuiStrings.KZ
    - typings.baseui.baseuiStrings.KE
    - typings.baseui.baseuiStrings.KI
    - typings.baseui.baseuiStrings.XK
    - typings.baseui.baseuiStrings.KW
    - typings.baseui.baseuiStrings.KG
    - typings.baseui.baseuiStrings.LA
    - typings.baseui.baseuiStrings.LV
    - typings.baseui.baseuiStrings.LB
    - typings.baseui.baseuiStrings.LS
    - typings.baseui.baseuiStrings.LR
    - typings.baseui.baseuiStrings.LY
    - typings.baseui.baseuiStrings.LI
    - typings.baseui.baseuiStrings.LT
    - typings.baseui.baseuiStrings.LU
    - typings.baseui.baseuiStrings.MO
    - typings.baseui.baseuiStrings.MK
    - typings.baseui.baseuiStrings.MG
    - typings.baseui.baseuiStrings.MW
    - typings.baseui.baseuiStrings.MY
    - typings.baseui.baseuiStrings.MV
    - typings.baseui.baseuiStrings.ML
    - typings.baseui.baseuiStrings.MT
    - typings.baseui.baseuiStrings.MH
    - typings.baseui.baseuiStrings.MQ
    - typings.baseui.baseuiStrings.MR
    - typings.baseui.baseuiStrings.MU
    - typings.baseui.baseuiStrings.YT
    - typings.baseui.baseuiStrings.MX
    - typings.baseui.baseuiStrings.FM
    - typings.baseui.baseuiStrings.MD
    - typings.baseui.baseuiStrings.MC
    - typings.baseui.baseuiStrings.MN
    - typings.baseui.baseuiStrings.ME
    - typings.baseui.baseuiStrings.MS
    - typings.baseui.baseuiStrings.MA
    - typings.baseui.baseuiStrings.MZ
    - typings.baseui.baseuiStrings.MM
    - typings.baseui.baseuiStrings.NA
    - typings.baseui.baseuiStrings.NR
    - typings.baseui.baseuiStrings.NP
    - typings.baseui.baseuiStrings.NL
    - typings.baseui.baseuiStrings.NC
    - typings.baseui.baseuiStrings.NZ
    - typings.baseui.baseuiStrings.NI
    - typings.baseui.baseuiStrings.NE
    - typings.baseui.baseuiStrings.NG
    - typings.baseui.baseuiStrings.NU
    - typings.baseui.baseuiStrings.NF
    - typings.baseui.baseuiStrings.KP
    - typings.baseui.baseuiStrings.MP
    - typings.baseui.baseuiStrings.NO
    - typings.baseui.baseuiStrings.OM
    - typings.baseui.baseuiStrings.PK
    - typings.baseui.baseuiStrings.PW
    - typings.baseui.baseuiStrings.PS
    - typings.baseui.baseuiStrings.PA
    - typings.baseui.baseuiStrings.PG
    - typings.baseui.baseuiStrings.PY
    - typings.baseui.baseuiStrings.PE
    - typings.baseui.baseuiStrings.PH
    - typings.baseui.baseuiStrings.PL
    - typings.baseui.baseuiStrings.PT
    - typings.baseui.baseuiStrings.PR
    - typings.baseui.baseuiStrings.QA
    - typings.baseui.baseuiStrings.RE
    - typings.baseui.baseuiStrings.RO
    - typings.baseui.baseuiStrings.RU
    - typings.baseui.baseuiStrings.RW
    - typings.baseui.baseuiStrings.BL
    - typings.baseui.baseuiStrings.SH
    - typings.baseui.baseuiStrings.KN
    - typings.baseui.baseuiStrings.LC
    - typings.baseui.baseuiStrings.MF
    - typings.baseui.baseuiStrings.PM
    - typings.baseui.baseuiStrings.VC
    - typings.baseui.baseuiStrings.WS
    - typings.baseui.baseuiStrings.SM
    - typings.baseui.baseuiStrings.ST
    - typings.baseui.baseuiStrings.SA
    - typings.baseui.baseuiStrings.SN
    - typings.baseui.baseuiStrings.RS
    - typings.baseui.baseuiStrings.SC
    - typings.baseui.baseuiStrings.SL
    - typings.baseui.baseuiStrings.SG
    - typings.baseui.baseuiStrings.SX
    - typings.baseui.baseuiStrings.SK
    - typings.baseui.baseuiStrings.SI
    - typings.baseui.baseuiStrings.SB
    - typings.baseui.baseuiStrings.SO
    - typings.baseui.baseuiStrings.ZA
    - typings.baseui.baseuiStrings.KR
    - typings.baseui.baseuiStrings.SS
    - typings.baseui.baseuiStrings.ES
    - typings.baseui.baseuiStrings.LK
    - typings.baseui.baseuiStrings.SD
    - typings.baseui.baseuiStrings.SR
    - typings.baseui.baseuiStrings.SJ
    - typings.baseui.baseuiStrings.SZ
    - typings.baseui.baseuiStrings.SE
    - typings.baseui.baseuiStrings.CH
    - typings.baseui.baseuiStrings.SY
    - typings.baseui.baseuiStrings.TW
    - typings.baseui.baseuiStrings.TJ
    - typings.baseui.baseuiStrings.TZ
    - typings.baseui.baseuiStrings.TH
    - typings.baseui.baseuiStrings.TL
    - typings.baseui.baseuiStrings.TG
    - typings.baseui.baseuiStrings.TK
    - typings.baseui.baseuiStrings.TO
    - typings.baseui.baseuiStrings.TT
    - typings.baseui.baseuiStrings.TN
    - typings.baseui.baseuiStrings.TR
    - typings.baseui.baseuiStrings.TM
    - typings.baseui.baseuiStrings.TC
    - typings.baseui.baseuiStrings.TV
    - typings.baseui.baseuiStrings.VI
    - typings.baseui.baseuiStrings.UG
    - typings.baseui.baseuiStrings.UA
    - typings.baseui.baseuiStrings.AE
    - typings.baseui.baseuiStrings.GB
    - typings.baseui.baseuiStrings.US
    - typings.baseui.baseuiStrings.UY
    - typings.baseui.baseuiStrings.UZ
    - typings.baseui.baseuiStrings.VU
    - typings.baseui.baseuiStrings.VA
    - typings.baseui.baseuiStrings.VE
    - typings.baseui.baseuiStrings.VN
    - typings.baseui.baseuiStrings.WF
    - typings.baseui.baseuiStrings.YE
    - typings.baseui.baseuiStrings.ZM
    - typings.baseui.baseuiStrings.ZW
    - typings.baseui.baseuiStrings.AX
  */
  trait CountryIso extends StObject
  
  trait CountrySelectDropdownProps extends StObject {
    
    @JSName("$country")
    var $country: Country
    
    @JSName("$mapIsoToLabel")
    var $mapIsoToLabel: js.UndefOr[mapIsoToLabel] = js.undefined
    
    @JSName("$maxDropdownHeight")
    var $maxDropdownHeight: String
    
    @JSName("$noResultsMsg")
    var $noResultsMsg: String
    
    @JSName("$overrides")
    var $overrides: CountrySelectContainer
    
    var children: js.Array[ReactElement]
  }
  object CountrySelectDropdownProps {
    
    inline def apply(
      $country: Country,
      $maxDropdownHeight: String,
      $noResultsMsg: String,
      $overrides: CountrySelectContainer,
      children: js.Array[ReactElement]
    ): CountrySelectDropdownProps = {
      val __obj = js.Dynamic.literal($country = $country.asInstanceOf[js.Any], $maxDropdownHeight = $maxDropdownHeight.asInstanceOf[js.Any], $noResultsMsg = $noResultsMsg.asInstanceOf[js.Any], $overrides = $overrides.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountrySelectDropdownProps]
    }
    
    extension [Self <: CountrySelectDropdownProps](x: Self) {
      
      inline def set$country(value: Country): Self = StObject.set(x, "$country", value.asInstanceOf[js.Any])
      
      inline def set$mapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "$mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def set$mapIsoToLabelUndefined: Self = StObject.set(x, "$mapIsoToLabel", js.undefined)
      
      inline def set$maxDropdownHeight(value: String): Self = StObject.set(x, "$maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def set$noResultsMsg(value: String): Self = StObject.set(x, "$noResultsMsg", value.asInstanceOf[js.Any])
      
      inline def set$overrides(value: CountrySelectContainer): Self = StObject.set(x, "$overrides", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait CountrySelectProps extends StObject {
    
    var countries: StringDictionary[Country]
    
    var country: Country
    
    var disabled: Boolean
    
    var error: Boolean
    
    var inputRef: RefObject[HTMLInputElement]
    
    var mapIsoToLabel: js.UndefOr[typings.baseui.phoneInputTypesMod.mapIsoToLabel] = js.undefined
    
    var maxDropdownHeight: String
    
    var maxDropdownWidth: String
    
    def onCountryChange(event: OnChangeParams): Any
    
    var overrides: CountrySelect
    
    var positive: Boolean
    
    var required: Boolean
    
    var size: Size
  }
  object CountrySelectProps {
    
    inline def apply(
      countries: StringDictionary[Country],
      country: Country,
      disabled: Boolean,
      error: Boolean,
      inputRef: RefObject[HTMLInputElement],
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      overrides: CountrySelect,
      positive: Boolean,
      required: Boolean,
      size: Size
    ): CountrySelectProps = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountrySelectProps]
    }
    
    extension [Self <: CountrySelectProps](x: Self) {
      
      inline def setCountries(value: StringDictionary[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInputRef(value: RefObject[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setMapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def setMapIsoToLabelUndefined: Self = StObject.set(x, "mapIsoToLabel", js.undefined)
      
      inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxDropdownWidth(value: String): Self = StObject.set(x, "maxDropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setOnCountryChange(value: OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: CountrySelect): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneInputLiteProps
    extends StObject
       with PhoneInputProps {
    
    var countries: StringDictionary[Country]
  }
  object PhoneInputLiteProps {
    
    inline def apply(
      countries: StringDictionary[Country],
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ChangeEvent[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): PhoneInputLiteProps = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneInputLiteProps]
    }
    
    extension [Self <: PhoneInputLiteProps](x: Self) {
      
      inline def setCountries(value: StringDictionary[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneInputOverrides extends StObject {
    
    var CountrySelect: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdown: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownDialcodeColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownFlagColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownListItem: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownNameColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var DialCode: js.UndefOr[Override[Any]] = js.undefined
    
    var FlagContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object PhoneInputOverrides {
    
    inline def apply(): PhoneInputOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneInputOverrides]
    }
    
    extension [Self <: PhoneInputOverrides](x: Self) {
      
      inline def setCountrySelect(value: Override[Any]): Self = StObject.set(x, "CountrySelect", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectContainer(value: Override[Any]): Self = StObject.set(x, "CountrySelectContainer", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectContainerUndefined: Self = StObject.set(x, "CountrySelectContainer", js.undefined)
      
      inline def setCountrySelectDropdown(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdown", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownDialcodeColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownDialcodeColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownDialcodeColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownDialcodeColumn", js.undefined)
      
      inline def setCountrySelectDropdownFlagColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownFlagColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownFlagColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownFlagColumn", js.undefined)
      
      inline def setCountrySelectDropdownListItem(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownListItem", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownListItemUndefined: Self = StObject.set(x, "CountrySelectDropdownListItem", js.undefined)
      
      inline def setCountrySelectDropdownNameColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownNameColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownNameColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownNameColumn", js.undefined)
      
      inline def setCountrySelectDropdownUndefined: Self = StObject.set(x, "CountrySelectDropdown", js.undefined)
      
      inline def setCountrySelectUndefined: Self = StObject.set(x, "CountrySelect", js.undefined)
      
      inline def setDialCode(value: Override[Any]): Self = StObject.set(x, "DialCode", value.asInstanceOf[js.Any])
      
      inline def setDialCodeUndefined: Self = StObject.set(x, "DialCode", js.undefined)
      
      inline def setFlagContainer(value: Override[Any]): Self = StObject.set(x, "FlagContainer", value.asInstanceOf[js.Any])
      
      inline def setFlagContainerUndefined: Self = StObject.set(x, "FlagContainer", js.undefined)
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait PhoneInputProps extends StObject {
    
    /** Sets aria-describedby attribute of the input element. */
    var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-label attribute of the input element. */
    var `aria-label`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-labelledby attribute of the input element. */
    var `aria-labelledby`: js.UndefOr[String | Null] = js.undefined
    
    /** Defines if the input value is clearable. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the value of the country select. */
    var country: Country
    
    /** Defines if the component is disabled. */
    var disabled: Boolean
    
    /** Renders component in 'error' state. */
    var error: Boolean
    
    /** Sets the id attribute of the input element. */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** Function for mapping ISO codes to country names. Useful for localization of the country select dropdown. */
    var mapIsoToLabel: js.UndefOr[typings.baseui.phoneInputTypesMod.mapIsoToLabel] = js.undefined
    
    /** Sets the max height of the country select dropdown. */
    var maxDropdownHeight: String
    
    /** Sets the max width of the country select dropdown. */
    var maxDropdownWidth: String
    
    /** Sets the name attribute of the input element. */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** A handler for the country select's change events. */
    def onCountryChange(event: OnChangeParams): Any
    
    /** A handler for the input element's change events. */
    def onTextChange(event: ChangeEvent[HTMLInputElement]): Any
    
    var overrides: PhoneInputOverrides
    
    /** Sets the placeholder text for the input element.  */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'positive' state. */
    var positive: Boolean
    
    /** Sets the 'required' attribute of the input element. The country select will always have a value so does has no need for 'require'. */
    var required: Boolean
    
    /** Sets the size of the component. */
    var size: Size
    
    /** Defines the value of the input element. */
    var text: String
  }
  object PhoneInputProps {
    
    inline def apply(
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ChangeEvent[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): PhoneInputProps = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneInputProps]
    }
    
    extension [Self <: PhoneInputProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelNull`: Self = StObject.set(x, "aria-label", null)
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def setMapIsoToLabelUndefined: Self = StObject.set(x, "mapIsoToLabel", js.undefined)
      
      inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxDropdownWidth(value: String): Self = StObject.set(x, "maxDropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnCountryChange(value: OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChange(value: ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: PhoneInputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Compact */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.mini
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.compact
    - typings.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  trait State extends StObject {
    
    var country: Country
    
    var text: String
  }
  object State {
    
    inline def apply(country: Country, text: String): State = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.CountryChange */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.textChange
    - typings.baseui.baseuiStrings.countryChange
  */
  trait StateChange extends StObject
  
  type StateReducer = js.Function3[/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State, State]
  
  trait StatefulPhoneInputContainerProps
    extends StObject
       with PhoneInputProps {
    
    def children(a: PhoneInputProps): ReactNode
    
    var initialState: State
    
    var stateReducer: StateReducer
  }
  object StatefulPhoneInputContainerProps {
    
    inline def apply(
      children: PhoneInputProps => ReactNode,
      country: Country,
      disabled: Boolean,
      error: Boolean,
      initialState: State,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ChangeEvent[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      stateReducer: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State,
      text: String
    ): StatefulPhoneInputContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPhoneInputContainerProps]
    }
    
    extension [Self <: StatefulPhoneInputContainerProps](x: Self) {
      
      inline def setChildren(value: PhoneInputProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    }
  }
  
  trait StatefulPhoneInputProps
    extends StObject
       with PhoneInputProps {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, Any]] = js.undefined
    
    var onTextChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulPhoneInputProps {
    
    inline def apply(
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): StatefulPhoneInputProps = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPhoneInputProps]
    }
    
    extension [Self <: StatefulPhoneInputProps](x: Self) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnCountryChange(value: /* event */ OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOnCountryChangeUndefined: Self = StObject.set(x, "onCountryChange", js.undefined)
      
      inline def setOnTextChange(value: /* event */ ChangeEvent[HTMLInputElement] => Any): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
      
      inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type mapIsoToLabel = js.Function1[/* iso */ String, String]
}
