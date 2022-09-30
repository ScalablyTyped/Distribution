package typings.daumPostcode

import typings.daumPostcode.daumPostcodeInts.`0`
import typings.daumPostcode.daumPostcodeInts.`10`
import typings.daumPostcode.daumPostcodeInts.`11`
import typings.daumPostcode.daumPostcodeInts.`12`
import typings.daumPostcode.daumPostcodeInts.`13`
import typings.daumPostcode.daumPostcodeInts.`14`
import typings.daumPostcode.daumPostcodeInts.`15`
import typings.daumPostcode.daumPostcodeInts.`16`
import typings.daumPostcode.daumPostcodeInts.`17`
import typings.daumPostcode.daumPostcodeInts.`18`
import typings.daumPostcode.daumPostcodeInts.`19`
import typings.daumPostcode.daumPostcodeInts.`1`
import typings.daumPostcode.daumPostcodeInts.`20`
import typings.daumPostcode.daumPostcodeInts.`2`
import typings.daumPostcode.daumPostcodeInts.`3`
import typings.daumPostcode.daumPostcodeInts.`4`
import typings.daumPostcode.daumPostcodeInts.`5`
import typings.daumPostcode.daumPostcodeInts.`6`
import typings.daumPostcode.daumPostcodeInts.`7`
import typings.daumPostcode.daumPostcodeInts.`8`
import typings.daumPostcode.daumPostcodeInts.`9`
import typings.daumPostcode.daumPostcodeStrings.E
import typings.daumPostcode.daumPostcodeStrings.J
import typings.daumPostcode.daumPostcodeStrings.K
import typings.daumPostcode.daumPostcodeStrings.N
import typings.daumPostcode.daumPostcodeStrings.R
import typings.daumPostcode.daumPostcodeStrings.Y
import typings.daumPostcode.daumPostcodeStrings._empty
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daum {
  
  /**
    * 우편번호 서비스
    * @see [예제](https://postcode.map.daum.net/guide#sample)
    * @example
    * ```html
    * <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    * <script>
    *   new daum.Postcode({
    *     oncomplete: function (data) {
    *       // 팝업에서 검색결과 항목을 클릭했을 때 실행할 코드를 작성하는 부분입니다.
    *       // 예제를 참고하여 다양한 활용법을 확인해 보세요.
    *     }
    *   }).open();
    * </script>
    * ```
    */
  @js.native
  trait Postcode extends StObject {
    
    /**
      * 우편번호 찾기 화면을 iframe으로 삽입합니다.
      * @see [함수](https://postcode.map.daum.net/guide#methods)
      */
    def embed(): Unit = js.native
    def embed(element: Unit, options: PostcodeEmbedOptions): Unit = js.native
    def embed(element: HTMLElement): Unit = js.native
    def embed(element: HTMLElement, options: PostcodeEmbedOptions): Unit = js.native
    
    /**
      * 우편번호 찾기 화면을 팝업으로 띄웁니다.
      * @see [함수](https://postcode.map.daum.net/guide#methods)
      */
    def open(): Unit = js.native
    def open(options: PostcodeOpenOptions): Unit = js.native
  }
  
  type PostcodeCloseHandler = js.Function1[/* state */ PostcodeState, Unit]
  
  type PostcodeCompleteHandler = js.Function1[/* data */ PostcodeData, Unit]
  
  trait PostcodeData extends StObject {
    
    /**
      * 기본 주소
      * @example '경기 성남시 분당구 판교역로 235'
      */
    var address: String
    
    /**
      * 기본 영문 주소
      * @example '235 Pangyoyeok-ro, Bundang-gu, Seongnam-si, Gyeonggi-do, korea'
      */
    var addressEnglish: String
    
    /** 검색된 기본 주소 타입 */
    var addressType: J | R
    
    /** 공동주택 여부 */
    var apartment: N | Y
    
    /**
      * 도로명주소에 매핑된 지번주소가 여러 개인 경우, 사용자가 선택안함 또는 도로명주소를 클릭했을 때 연관된 지번주소 중 임의로 첫 번째 매핑 주소를 넣어서 반환합니다.
      * @example '경기 성남시 분당구 삼평동 681'
      */
    var autoJibunAddress: String
    
    /**
      * autoJibunAddress의 영문 지번 주소
      * @example '681, Sampyeong-dong, Bundang-gu, Seongnam-si, Gyeonggi-do, Korea'
      */
    var autoJibunAddressEnglish: String
    
    /**
      * 지번주소에 매핑된 도로명주소가 여러 개인 경우, 사용자가 선택안함 또는 지번주소를 클릭했을 때 연관된 도로명주소 중 임의로 첫 번째 매핑 주소를 넣어서 반환합니다.
      * @example '경기 성남시 분당구 판교역로 235'
      */
    var autoRoadAddress: String
    
    /**
      * autoRoadAddress의 영문 도로명 주소
      * @example '235, Pangyoyeok-ro, Bundang-gu, Seongnam-si, Gyeonggi-do, Korea'
      */
    var autoRoadAddressEnglish: String
    
    /**
      * 법정동/법정리 코드
      * @example '4113510900'
      */
    var bcode: String
    
    /**
      * 법정동/법정리 이름
      * @example '삼평동'
      */
    var bname: String
    
    /** 법정리의 읍/면 이름 */
    var bname1: String
    
    /** 법정리의 읍/면 이름의 영문 */
    var bname1English: String
    
    /**
      * 법정동/법정리 이름
      * @example '삼평동'
      */
    var bname2: String
    
    /**
      * 법정동/법정리 이름의 영문
      * @example 'Sampyeong-dong'
      */
    var bname2English: String
    
    /**
      * 법정동/법정리 이름의 영문
      * @example 'Sampyeong-dong'
      */
    var bnameEnglish: String
    
    /**
      * 건물관리번호
      * @example '4113510900106810000000001'
      */
    var buildingCode: String
    
    /**
      * 건물명
      * @example '에이치스퀘어 엔동'
      */
    var buildingName: String
    
    /**
      * 행정동 이름, 검색어를 행정동으로 검색하고, 검색결과의 법정동과 검색어에 입력한 행정동과 다른 경우에 표시하고, 데이터를 내립니다.
      */
    var hname: String
    
    /**
      * 지번주소
      * @example '경기 성남시 분당구 삼평동 681'
      */
    var jibunAddress: String
    
    /**
      * 영문 지번주소
      * @example '681, Sampyeong-dong, Bundang-gu, Seongnam-si, Gyeonggi-do, Korea'
      */
    var jibunAddressEnglish: String
    
    /** 연관 주소에서 선택안함 부분을 선택했을 때를 구분할 수 있는 상태 변수 */
    var noSelected: N | Y
    
    /** @deprecated 구 우편번호 */
    var postcode: _empty
    
    /** @deprecated 구 우편번호 앞 3자리 */
    var postcode1: _empty
    
    /** @deprecated 구 우편번호 뒤 3자리 */
    var postcode2: _empty
    
    /** @deprecated 구 우편번호 일련번호 */
    var postcodeSeq: _empty
    
    /**
      * 사용자가 입력한 검색어
      * @example '판교역로 235'
      */
    var query: String
    
    /**
      * 도로명주소
      * @example '경기 성남시 분당구 판교역로 235'
      */
    var roadAddress: String
    
    /**
      * 영문 도로명주소
      * @example '235, Pangyoyeok-ro, Bundang-gu, Seongnam-si, Gyeonggi-do, Korea'
      */
    var roadAddressEnglish: String
    
    /**
      * 도로명 값, 검색 결과 중 선택한 도로명주소의 도로명 값이 들어갑니다(건물번호 제외).
      * @example '판교역로'
      */
    var roadname: String
    
    /**
      * 도로명 코드, 7자리로 구성된 도로명 코드입니다. 추후 7자리 이상으로 늘어날 수 있습니다.
      * @example '3179025'
      */
    var roadnameCode: String
    
    /**
      * 도로명 값, 검색 결과 중 선택한 도로명주소의 도로명의 영문 값이 들어갑니다(건물번호 제외).
      * @example 'Pangyoyeok-ro'
      */
    var roadnameEnglish: String
    
    /**
      * 도/시 이름
      * @example '경기'
      */
    var sido: String
    
    /**
      * 도/시 이름의 영문
      * @example 'Gyeonggi-do'
      */
    var sidoEnglish: String
    
    /**
      * 시/군/구 이름
      * @example '성남시 분당구'
      */
    var sigungu: String
    
    /**
      * 시/군/구 코드
      * @example '41135'
      */
    var sigunguCode: String
    
    /**
      * 시/군/구 이름의 영문
      * @example 'Bundang-gu Seongnam-si'
      */
    var sigunguEnglish: String
    
    /** 검색 결과에서 사용자가 선택한 주소의 언어 타입 */
    var userLanguageType: E | K
    
    /** 검색 결과에서 사용자가 선택한 주소의 타입 */
    var userSelectedType: J | R
    
    /**
      * 국가기초구역번호. 2015년 8월 1일부터 시행된 새 우편번호.
      * @example '13494'
      */
    var zonecode: String
  }
  object PostcodeData {
    
    inline def apply(
      address: String,
      addressEnglish: String,
      addressType: J | R,
      apartment: N | Y,
      autoJibunAddress: String,
      autoJibunAddressEnglish: String,
      autoRoadAddress: String,
      autoRoadAddressEnglish: String,
      bcode: String,
      bname: String,
      bname1: String,
      bname1English: String,
      bname2: String,
      bname2English: String,
      bnameEnglish: String,
      buildingCode: String,
      buildingName: String,
      hname: String,
      jibunAddress: String,
      jibunAddressEnglish: String,
      noSelected: N | Y,
      query: String,
      roadAddress: String,
      roadAddressEnglish: String,
      roadname: String,
      roadnameCode: String,
      roadnameEnglish: String,
      sido: String,
      sidoEnglish: String,
      sigungu: String,
      sigunguCode: String,
      sigunguEnglish: String,
      userLanguageType: E | K,
      userSelectedType: J | R,
      zonecode: String
    ): PostcodeData = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressEnglish = addressEnglish.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], apartment = apartment.asInstanceOf[js.Any], autoJibunAddress = autoJibunAddress.asInstanceOf[js.Any], autoJibunAddressEnglish = autoJibunAddressEnglish.asInstanceOf[js.Any], autoRoadAddress = autoRoadAddress.asInstanceOf[js.Any], autoRoadAddressEnglish = autoRoadAddressEnglish.asInstanceOf[js.Any], bcode = bcode.asInstanceOf[js.Any], bname = bname.asInstanceOf[js.Any], bname1 = bname1.asInstanceOf[js.Any], bname1English = bname1English.asInstanceOf[js.Any], bname2 = bname2.asInstanceOf[js.Any], bname2English = bname2English.asInstanceOf[js.Any], bnameEnglish = bnameEnglish.asInstanceOf[js.Any], buildingCode = buildingCode.asInstanceOf[js.Any], buildingName = buildingName.asInstanceOf[js.Any], hname = hname.asInstanceOf[js.Any], jibunAddress = jibunAddress.asInstanceOf[js.Any], jibunAddressEnglish = jibunAddressEnglish.asInstanceOf[js.Any], noSelected = noSelected.asInstanceOf[js.Any], postcode = "", postcode1 = "", postcode2 = "", postcodeSeq = "", query = query.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any], roadAddressEnglish = roadAddressEnglish.asInstanceOf[js.Any], roadname = roadname.asInstanceOf[js.Any], roadnameCode = roadnameCode.asInstanceOf[js.Any], roadnameEnglish = roadnameEnglish.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sidoEnglish = sidoEnglish.asInstanceOf[js.Any], sigungu = sigungu.asInstanceOf[js.Any], sigunguCode = sigunguCode.asInstanceOf[js.Any], sigunguEnglish = sigunguEnglish.asInstanceOf[js.Any], userLanguageType = userLanguageType.asInstanceOf[js.Any], userSelectedType = userSelectedType.asInstanceOf[js.Any], zonecode = zonecode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostcodeData]
    }
    
    extension [Self <: PostcodeData](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressEnglish(value: String): Self = StObject.set(x, "addressEnglish", value.asInstanceOf[js.Any])
      
      inline def setAddressType(value: J | R): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
      
      inline def setApartment(value: N | Y): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      inline def setAutoJibunAddress(value: String): Self = StObject.set(x, "autoJibunAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoJibunAddressEnglish(value: String): Self = StObject.set(x, "autoJibunAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setAutoRoadAddress(value: String): Self = StObject.set(x, "autoRoadAddress", value.asInstanceOf[js.Any])
      
      inline def setAutoRoadAddressEnglish(value: String): Self = StObject.set(x, "autoRoadAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setBcode(value: String): Self = StObject.set(x, "bcode", value.asInstanceOf[js.Any])
      
      inline def setBname(value: String): Self = StObject.set(x, "bname", value.asInstanceOf[js.Any])
      
      inline def setBname1(value: String): Self = StObject.set(x, "bname1", value.asInstanceOf[js.Any])
      
      inline def setBname1English(value: String): Self = StObject.set(x, "bname1English", value.asInstanceOf[js.Any])
      
      inline def setBname2(value: String): Self = StObject.set(x, "bname2", value.asInstanceOf[js.Any])
      
      inline def setBname2English(value: String): Self = StObject.set(x, "bname2English", value.asInstanceOf[js.Any])
      
      inline def setBnameEnglish(value: String): Self = StObject.set(x, "bnameEnglish", value.asInstanceOf[js.Any])
      
      inline def setBuildingCode(value: String): Self = StObject.set(x, "buildingCode", value.asInstanceOf[js.Any])
      
      inline def setBuildingName(value: String): Self = StObject.set(x, "buildingName", value.asInstanceOf[js.Any])
      
      inline def setHname(value: String): Self = StObject.set(x, "hname", value.asInstanceOf[js.Any])
      
      inline def setJibunAddress(value: String): Self = StObject.set(x, "jibunAddress", value.asInstanceOf[js.Any])
      
      inline def setJibunAddressEnglish(value: String): Self = StObject.set(x, "jibunAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setNoSelected(value: N | Y): Self = StObject.set(x, "noSelected", value.asInstanceOf[js.Any])
      
      inline def setPostcode(value: _empty): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
      
      inline def setPostcode1(value: _empty): Self = StObject.set(x, "postcode1", value.asInstanceOf[js.Any])
      
      inline def setPostcode2(value: _empty): Self = StObject.set(x, "postcode2", value.asInstanceOf[js.Any])
      
      inline def setPostcodeSeq(value: _empty): Self = StObject.set(x, "postcodeSeq", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRoadAddress(value: String): Self = StObject.set(x, "roadAddress", value.asInstanceOf[js.Any])
      
      inline def setRoadAddressEnglish(value: String): Self = StObject.set(x, "roadAddressEnglish", value.asInstanceOf[js.Any])
      
      inline def setRoadname(value: String): Self = StObject.set(x, "roadname", value.asInstanceOf[js.Any])
      
      inline def setRoadnameCode(value: String): Self = StObject.set(x, "roadnameCode", value.asInstanceOf[js.Any])
      
      inline def setRoadnameEnglish(value: String): Self = StObject.set(x, "roadnameEnglish", value.asInstanceOf[js.Any])
      
      inline def setSido(value: String): Self = StObject.set(x, "sido", value.asInstanceOf[js.Any])
      
      inline def setSidoEnglish(value: String): Self = StObject.set(x, "sidoEnglish", value.asInstanceOf[js.Any])
      
      inline def setSigungu(value: String): Self = StObject.set(x, "sigungu", value.asInstanceOf[js.Any])
      
      inline def setSigunguCode(value: String): Self = StObject.set(x, "sigunguCode", value.asInstanceOf[js.Any])
      
      inline def setSigunguEnglish(value: String): Self = StObject.set(x, "sigunguEnglish", value.asInstanceOf[js.Any])
      
      inline def setUserLanguageType(value: E | K): Self = StObject.set(x, "userLanguageType", value.asInstanceOf[js.Any])
      
      inline def setUserSelectedType(value: J | R): Self = StObject.set(x, "userSelectedType", value.asInstanceOf[js.Any])
      
      inline def setZonecode(value: String): Self = StObject.set(x, "zonecode", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostcodeEmbedOptions extends StObject {
    
    /**
      * 자동 닫힘 유무
      * @default true
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /** 검색어 */
    var q: js.UndefOr[String] = js.undefined
  }
  object PostcodeEmbedOptions {
    
    inline def apply(): PostcodeEmbedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostcodeEmbedOptions]
    }
    
    extension [Self <: PostcodeEmbedOptions](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    }
  }
  
  trait PostcodeOpenOptions extends StObject {
    
    /**
      * 자동 닫힘 유무
      * @default true
      */
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    /** 팝업 위치 x값 */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * 팝업창 구분값
      * @default '_blank'
      */
    var popupKey: js.UndefOr[String] = js.undefined
    
    /**
      * 팝업창의 타이틀
      * @default 'Daum Postcode Service'
      */
    var popupTitle: js.UndefOr[String] = js.undefined
    
    /** 검색어 */
    var q: js.UndefOr[String] = js.undefined
    
    /** 팝업 위치 y값 */
    var top: js.UndefOr[Double] = js.undefined
  }
  object PostcodeOpenOptions {
    
    inline def apply(): PostcodeOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostcodeOpenOptions]
    }
    
    extension [Self <: PostcodeOpenOptions](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setPopupKey(value: String): Self = StObject.set(x, "popupKey", value.asInstanceOf[js.Any])
      
      inline def setPopupKeyUndefined: Self = StObject.set(x, "popupKey", js.undefined)
      
      inline def setPopupTitle(value: String): Self = StObject.set(x, "popupTitle", value.asInstanceOf[js.Any])
      
      inline def setPopupTitleUndefined: Self = StObject.set(x, "popupTitle", js.undefined)
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait PostcodeOptions extends StObject {
    
    /**
      * 검색 결과의 한글과 영문 주소를 동시에 볼 수 있게 해주는 기능입니다.\
      * 해당 기능 활성화시 영문보기 버튼은 감춰집니다(hideEngBtn 속성의 설정 값보다 우선시 됩니다).
      * @default false
      */
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 우편번호 찾기 화면에서 애니메이션 효과를 줍니다.
      * @default false
      */
    var animation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var autoMappingJibun: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var autoMappingRoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 우편번호 찾기가 실행된 후 검색어 입력박스에 focus를 줍니다.\
      * 단, PC 플랫폼에서만 동작하며 Mobile 플랫폼은 지원하지 않습니다.
      * @default true
      */
    var focusInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 우편번호 찾기 팝업 또는 iframe의 고정 높이를 지정합니다. iframe으로 띄울 경우 비율(%)로도 입력이 가능합니다.\
      * 최소값은 400이며 이보다 작은 값을 넣으면 무시됩니다.
      * @default 500
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * 검색 결과의 영문보기 버튼을 가릴 수 있는 옵션입니다.\
      * 다만, 해당 기능은 자신의 주소에 익숙하지 못한 사용자들에 도움을 주는 기능으로, app에 임베딩을 해야되는 상황이거나 버튼이 눌러지면 안되는 상황일때 선택적으로 이용하시는 것을 권장합니다.
      * @default false
      */
    var hideEngBtn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 검색 결과의 지도 버튼을 가릴 수 있는 옵션입니다.\
      * 다만, 해당 기능은 자신의 주소에 익숙하지 못한 사용자들에 도움을 주는 기능으로, app에 임베딩을 해야되는 상황이거나 버튼이 눌러지면 안되는 상황일때 선택적으로 이용하시는 것을 권장합니다.
      * @default false
      */
    var hideMapBtn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 검색어 입력시 검색바 아래에 뜨는 서제스트의 최대 검색 개수를 조절할 수 있는 옵션입니다.\
      * 입력하지 않거나 1~10을 벗어나는 수를 입력시 기본값으로 셋팅됩니다.
      * @default 10
      */
    var maxSuggestItems: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
    
    /**
      * 우편번호 찾기 화면을 팝업으로 띄운 후, 검색 결과를 선택하거나 브라우저의 닫기버튼을 통해 닫았을 때 실행되는 콜백 함수를 정의하는 부분입니다.
      */
    var onclose: js.UndefOr[PostcodeCloseHandler] = js.undefined
    
    /**
      * 우편번호 검색 결과 목록에서 특정 항목을 클릭한 경우, 해당 정보를 받아서 처리할 콜백 함수를 정의하는 부분입니다.
      */
    var oncomplete: js.UndefOr[PostcodeCompleteHandler] = js.undefined
    
    /**
      * 검색 결과로 인해 우편번호 서비스의 화면 크기가 변한 경우, 화면 크기 정보를 받아서 처리할 콜백 함수를 정의하는 부분입니다.
      */
    var onresize: js.UndefOr[PostcodeResizeHandler] = js.undefined
    
    /**
      * 주소를 검색할 경우에 실행되는 콜백함수입니다.
      */
    var onsearch: js.UndefOr[PostcodeSearchHandler] = js.undefined
    
    /**
      * 검색결과가 많을시 검색바 아래의 가이드 영역을 강조시켜 주는 기능입니다.\
      * 가이드 문구는 첫화면의 가이드 문구와 동일하며, 조합방식과 예시를 설명하여 사용자에게 재검색을 유도할 수 있도록 하는 기능입니다.
      * @default 0
      */
    var pleaseReadGuide: js.UndefOr[
        `0` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
      ] = js.undefined
    
    /**
      * pleaseReadGuide 옵션과 같이 사용되는 옵션으로 선택사항입니다.\
      * 입력값 설정 단위는 '초'단위로 설정할 수 있으며, 0.1~60까지 입력 가능합니다.
      * @default 1.5
      */
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
    
    /**
      * 검색된 주소와 내려가는 데이터의 '시', '도' 부분을 축약 표시합니다(한글 주소만 해당).
      * - 서울특별시 -> 서울
      * - 광주광역시 -> 광주
      * - 전라북도 -> 전북
      *
      * 단, '세종특별자치시' '제주특별자치도'는 지자체의 요청에 의해 제외
      * @default true
      */
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 기존보다 행정동 정보를 좀 더 많이 보여주게 하는 옵션입니다.
      * @default false
      */
    var showMoreHName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * form submit 방식을 사용합니다. false로 설정 시 location replace 방식을 사용하게 됩니다.\
      * 우편번호 서비스로 인해 history 관련 제어가 어려우실 경우 false로 설정하여 이용하시기 바랍니다.
      * @default true
      */
    var submitMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 우편번호 찾기 화면의 색상 테마를 변경할 수 있습니다.
      * @default null
      */
    var theme: js.UndefOr[PostcodeTheme | Null] = js.undefined
    
    /**
      * 하단 배너에 가이드페이지로 이동하는 링크를 활성화 시킵니다.
      * @default true
      */
    var useBannerLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 우편번호 찾기 팝업 또는 iframe의 고정 넓이를 지정합니다. iframe으로 띄울 경우 비율(%)로도 입력이 가능합니다.\
      * 최소값은 300이며 이보다 작은 값을 넣으면 무시됩니다.
      * @default 500
      */
    var width: js.UndefOr[Double | String] = js.undefined
    
    /** @deprecated */
    var zonecodeOnly: js.UndefOr[Boolean] = js.undefined
  }
  object PostcodeOptions {
    
    inline def apply(): PostcodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostcodeOptions]
    }
    
    extension [Self <: PostcodeOptions](x: Self) {
      
      inline def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoMappingJibun(value: Boolean): Self = StObject.set(x, "autoMappingJibun", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibunUndefined: Self = StObject.set(x, "autoMappingJibun", js.undefined)
      
      inline def setAutoMappingRoad(value: Boolean): Self = StObject.set(x, "autoMappingRoad", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingRoadUndefined: Self = StObject.set(x, "autoMappingRoad", js.undefined)
      
      inline def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
      
      inline def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideEngBtn(value: Boolean): Self = StObject.set(x, "hideEngBtn", value.asInstanceOf[js.Any])
      
      inline def setHideEngBtnUndefined: Self = StObject.set(x, "hideEngBtn", js.undefined)
      
      inline def setHideMapBtn(value: Boolean): Self = StObject.set(x, "hideMapBtn", value.asInstanceOf[js.Any])
      
      inline def setHideMapBtnUndefined: Self = StObject.set(x, "hideMapBtn", js.undefined)
      
      inline def setMaxSuggestItems(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      inline def setOnclose(value: /* state */ PostcodeState => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction1(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setOncomplete(value: /* data */ PostcodeData => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
      
      inline def setOnresize(value: /* size */ PostcodeSize => Unit): Self = StObject.set(x, "onresize", js.Any.fromFunction1(value))
      
      inline def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
      
      inline def setOnsearch(value: /* data */ PostcodeSearchData => Unit): Self = StObject.set(x, "onsearch", js.Any.fromFunction1(value))
      
      inline def setOnsearchUndefined: Self = StObject.set(x, "onsearch", js.undefined)
      
      inline def setPleaseReadGuide(
        value: `0` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `19` | `20`
      ): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      inline def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      inline def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      inline def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      inline def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      inline def setTheme(value: PostcodeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeNull: Self = StObject.set(x, "theme", null)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseBannerLink(value: Boolean): Self = StObject.set(x, "useBannerLink", value.asInstanceOf[js.Any])
      
      inline def setUseBannerLinkUndefined: Self = StObject.set(x, "useBannerLink", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZonecodeOnly(value: Boolean): Self = StObject.set(x, "zonecodeOnly", value.asInstanceOf[js.Any])
      
      inline def setZonecodeOnlyUndefined: Self = StObject.set(x, "zonecodeOnly", js.undefined)
    }
  }
  
  type PostcodeResizeHandler = js.Function1[/* size */ PostcodeSize, Unit]
  
  trait PostcodeSearchData extends StObject {
    
    /**
      * 검색결과의 총 개수
      * @example 1
      */
    var count: Double
    
    /**
      * 검색창에 입력된 검색어
      * @example '판교역로 235'
      */
    var q: String
  }
  object PostcodeSearchData {
    
    inline def apply(count: Double, q: String): PostcodeSearchData = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostcodeSearchData]
    }
    
    extension [Self <: PostcodeSearchData](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
  
  type PostcodeSearchHandler = js.Function1[/* data */ PostcodeSearchData, Unit]
  
  trait PostcodeSize extends StObject {
    
    /**
      * 검색 결과 화면 높이
      * @example 500
      */
    var height: Double
    
    /**
      * 검색 결과 화면 넓이
      * @example 772
      */
    var width: Double
  }
  object PostcodeSize {
    
    inline def apply(height: Double, width: Double): PostcodeSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostcodeSize]
    }
    
    extension [Self <: PostcodeSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.daumPostcode.daumPostcodeStrings.COMPLETE_CLOSE
    - typings.daumPostcode.daumPostcodeStrings.FORCE_CLOSE
  */
  trait PostcodeState extends StObject
  object PostcodeState {
    
    inline def COMPLETE_CLOSE: typings.daumPostcode.daumPostcodeStrings.COMPLETE_CLOSE = "COMPLETE_CLOSE".asInstanceOf[typings.daumPostcode.daumPostcodeStrings.COMPLETE_CLOSE]
    
    inline def FORCE_CLOSE: typings.daumPostcode.daumPostcodeStrings.FORCE_CLOSE = "FORCE_CLOSE".asInstanceOf[typings.daumPostcode.daumPostcodeStrings.FORCE_CLOSE]
  }
  
  /**
    * @see [테마](https://postcode.map.daum.net/guide#themeWizard)
    */
  trait PostcodeTheme extends StObject {
    
    /** 바탕 배경색 */
    var bgColor: js.UndefOr[String] = js.undefined
    
    /** 본문 배경색(검색결과, 결과없음, 첫화면, 검색서제스트) */
    var contentBgColor: js.UndefOr[String] = js.undefined
    
    /** 강조 글자색 */
    var emphTextColor: js.UndefOr[String] = js.undefined
    
    /** 테두리 */
    var outlineColor: js.UndefOr[String] = js.undefined
    
    /** 페이지 배경색 */
    var pageBgColor: js.UndefOr[String] = js.undefined
    
    /** 우편번호 글자색 */
    var postcodeTextColor: js.UndefOr[String] = js.undefined
    
    /** 검색창 글자색 */
    var queryTextColor: js.UndefOr[String] = js.undefined
    
    /** 검색창 배경색 */
    var searchBgColor: js.UndefOr[String] = js.undefined
    
    /** 기본 글자색 */
    var textColor: js.UndefOr[String] = js.undefined
  }
  object PostcodeTheme {
    
    inline def apply(): PostcodeTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostcodeTheme]
    }
    
    extension [Self <: PostcodeTheme](x: Self) {
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setContentBgColor(value: String): Self = StObject.set(x, "contentBgColor", value.asInstanceOf[js.Any])
      
      inline def setContentBgColorUndefined: Self = StObject.set(x, "contentBgColor", js.undefined)
      
      inline def setEmphTextColor(value: String): Self = StObject.set(x, "emphTextColor", value.asInstanceOf[js.Any])
      
      inline def setEmphTextColorUndefined: Self = StObject.set(x, "emphTextColor", js.undefined)
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setPageBgColor(value: String): Self = StObject.set(x, "pageBgColor", value.asInstanceOf[js.Any])
      
      inline def setPageBgColorUndefined: Self = StObject.set(x, "pageBgColor", js.undefined)
      
      inline def setPostcodeTextColor(value: String): Self = StObject.set(x, "postcodeTextColor", value.asInstanceOf[js.Any])
      
      inline def setPostcodeTextColorUndefined: Self = StObject.set(x, "postcodeTextColor", js.undefined)
      
      inline def setQueryTextColor(value: String): Self = StObject.set(x, "queryTextColor", value.asInstanceOf[js.Any])
      
      inline def setQueryTextColorUndefined: Self = StObject.set(x, "queryTextColor", js.undefined)
      
      inline def setSearchBgColor(value: String): Self = StObject.set(x, "searchBgColor", value.asInstanceOf[js.Any])
      
      inline def setSearchBgColorUndefined: Self = StObject.set(x, "searchBgColor", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
