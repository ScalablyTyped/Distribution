package typings.daumPostcode

import typings.daumPostcode.daum.PostcodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
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
    @JSGlobal("daum.Postcode")
    @js.native
    open class Postcode protected ()
      extends StObject
         with typings.daumPostcode.daum.Postcode {
      def this(options: PostcodeOptions) = this()
    }
  }
}
